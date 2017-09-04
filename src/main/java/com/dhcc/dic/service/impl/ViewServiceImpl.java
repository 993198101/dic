package com.dhcc.dic.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TDatasourceDao;
import com.dhcc.dic.dao.TViewDAO;
import com.dhcc.dic.entity.ViewDTO;
import com.dhcc.dic.exception.NotExistException;
import com.dhcc.dic.exception.OperationDbFailedException;
import com.dhcc.dic.service.ViewService;
import com.dhcc.dic.util.DbUtil;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TView;

import com.dhcc.dic.entity.TViewExample;
import com.dhcc.dic.entity.TViewExample.Criteria;
import com.github.pagehelper.PageHelper;

@Service
public class ViewServiceImpl implements ViewService {
	@Autowired
	private TViewDAO tViewDAO;
	@Autowired
	private TDatasourceDao tDatasourceDao;

	@Override
	public List<TView> getPage(int pageNum, int pageSize, TView tView) throws Exception {
		PageHelper.startPage(pageNum, pageSize);
		TViewExample example = new TViewExample();
		Criteria criteria = example.createCriteria();
		if (tView.getvId() != null) {
			criteria.andVIdEqualTo(tView.getvId());
		}
		if (tView.getvName() != null) {
			criteria.andVNameLike("%" + tView.getvName() + "%");
		}
		if (tView.getvDesc() != null) {
			criteria.andVDescLike("%" + tView.getvDesc() + "%");
		}
		if (tView.getvSyncState() != null) {
			criteria.andVSyncStateEqualTo(tView.getvSyncState());
		}
		if (tView.getvOfModule() != null) {
			criteria.andVOfModuleEqualTo(tView.getvOfModule());
		}
		if (tView.getvOfDatasource() != null) {
			criteria.andVOfDatasourceEqualTo(tView.getvOfDatasource());
		}
		if (tView.getvOfProject() != null) {
			criteria.andVOfProjectEqualTo(tView.getvOfProject());
		}
		return tViewDAO.selectByExample(example);
	}

	@Override
	@Transactional
	public void saveView(TView tView) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		tView.setvDate(date);
		tView.setvSyncState("3");// 已同步
		this.tViewDAO.insert(tView);
		TDatasource datasource = this.tDatasourceDao.selectByPrimaryKey(tView.getvOfDatasource());
		String url = "jdbc:oracle:thin:@" + datasource.getdIp() + ":" + datasource.getdPort() + ":"
				+ datasource.getdService();
		String sql = tView.getvSql();
		try {
			DbUtil dbUtil = new DbUtil(url, datasource.getdUsername(), datasource.getdPassword());
			Connection con = dbUtil.getConnection();
			PreparedStatement getViewsSQLPS = con.prepareStatement(sql);
			ResultSet getViewsRS = getViewsSQLPS.executeQuery();
		} catch (Exception e) {
			throw new OperationDbFailedException("新增视图检查数据库失败：url-\t"+url+"\n \tsql-\t"+sql+"\n");
		}
	}

	@Override
	public void removeView(String id) throws Exception {
		int result=this.tViewDAO.deleteByPrimaryKey(id);
		if(result!=1){
			throw new NotExistException("要删除的视图在数据字典中不存在：viewId="+id);
		}
	}

	@Override
	public ViewDTO getTViewDTO(String id) throws Exception {
		ViewDTO viewDTO = new ViewDTO();
		TView tView = this.tViewDAO.selectByPrimaryKey(id);
		viewDTO.settView(tView);
		TDatasource datasource = this.tDatasourceDao.selectByPrimaryKey(tView.getvOfDatasource());
		String url = "jdbc:oracle:thin:@" + datasource.getdIp() + ":" + datasource.getdPort() + ":"
				+ datasource.getdService();
		String sql = tView.getvSql();
		ResultSet getViewsRS;
		try {
			DbUtil dbUtil = new DbUtil(url, datasource.getdUsername(), datasource.getdPassword());
			Connection con = dbUtil.getConnection();
			PreparedStatement getViewsSQLPS = con.prepareStatement(sql);
			getViewsRS = getViewsSQLPS.executeQuery();
		} catch (Exception e) {
			throw new OperationDbFailedException("获取视图检查数据库失败：url-\t"+url+"\n \tsql-\t"+sql+"\n");
		}
		ResultSetMetaData metaData = getViewsRS.getMetaData();
		List<String> colName = new ArrayList<String>();
		viewDTO.setColName(colName);
		List<List> colList = new ArrayList<List>();
		viewDTO.setColList(colList);
		for (int i = 1; i <= metaData.getColumnCount(); i++) {
			colName.add(metaData.getColumnName(i));
		}
		while (getViewsRS.next()) {
			List col = new ArrayList();
			colList.add(col);
			for (int j = 1; j <= metaData.getColumnCount(); j++) {
				switch (metaData.getColumnType(j)) {
				case Types.VARCHAR:
					col.add(getViewsRS.getString(metaData.getColumnName(j)));
					break;
				case Types.INTEGER:
					col.add(getViewsRS.getInt(metaData.getColumnName(j)));
					break;
				case Types.TIMESTAMP:
					col.add(getViewsRS.getDate(metaData.getColumnName(j)));
					break;
				case Types.DOUBLE:
					col.add(getViewsRS.getDouble(metaData.getColumnName(j)));
					break;
				case Types.FLOAT:
					col.add(getViewsRS.getFloat(metaData.getColumnName(j)));
					break;
				case Types.CLOB:
					col.add(getViewsRS.getBlob(metaData.getColumnName(j)));
					break;
				case Types.NUMERIC:
					col.add(getViewsRS.getString(metaData.getColumnName(j)));
					break;
				default:
					col.add(getViewsRS.getString(metaData.getColumnName(j)));
				}
			}
		}
		return viewDTO;
	}

	@Override
	@Transactional
	public void updateView(TView view) throws Exception {
		int result = this.tViewDAO.updateByPrimaryKeySelective(view);
		if (result < 1) {
			throw new NotExistException("更新的视图不存在,传入参数viewId:"+view.getvId());
		}
		TDatasource datasource = this.tDatasourceDao.selectByPrimaryKey(view.getvOfDatasource());
		String url = "jdbc:oracle:thin:@" + datasource.getdIp() + ":" + datasource.getdPort() + ":"
				+ datasource.getdService();
		String sql = view.getvSql();
		try {
			DbUtil dbUtil = new DbUtil(url, datasource.getdUsername(), datasource.getdPassword());
			Connection con = dbUtil.getConnection();
			PreparedStatement getViewsSQLPS = con.prepareStatement(sql);
			ResultSet getViewsRS = getViewsSQLPS.executeQuery();
		} catch (Exception e) {
			throw new OperationDbFailedException("更新视图检查数据库失败：url-\t"+url+"\n \tsql-\t"+sql+"\n");
		}

	}
}
