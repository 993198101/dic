package com.dhcc.dic.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TDatasourceDao;
import com.dhcc.dic.dao.TSeqDAO;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TSeq;
import com.dhcc.dic.entity.TSeqExample;
import com.dhcc.dic.entity.TSeqExample.Criteria;
import com.dhcc.dic.exception.NotExistException;
import com.dhcc.dic.exception.OperationDbFailedException;
import com.dhcc.dic.service.SeqService;
import com.dhcc.dic.util.DbUtil;
import com.github.pagehelper.PageHelper;

@Service
public class SepServiceImpl implements SeqService{
	@Autowired
	private TSeqDAO tSeqDAO;
	@Autowired
	private TDatasourceDao tDatasourceDao;

	@Override
	public List<TSeq> getPage(int pageNum, int pageSize, TSeq tSeq) throws Exception {
		PageHelper.startPage(pageNum, pageSize);
		TSeqExample example = new TSeqExample();
		Criteria criteria = example.createCriteria();
		
		return tSeqDAO.selectByExample(example);
	}

	@Override
	@Transactional
	public void saveSeq(TSeq tSeq) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		tSeq.setsDate(date);
		tSeq.setsSyncState("3");// 已同步
		this.tSeqDAO.insert(tSeq);
//		TDatasource datasource = this.tDatasourceDao.selectByPrimaryKey(tSeq.getvOfDatasource());
//		String url = "jdbc:oracle:thin:@" + datasource.getdIp() + ":" + datasource.getdPort() + ":"
//				+ datasource.getdService();
//		String sql = tSeq.getvSql();
//		try {
//			DbUtil dbUtil = new DbUtil(url, datasource.getdUsername(), datasource.getdPassword());
//			Connection con = dbUtil.getConnection();
//			PreparedStatement getSeqsSQLPS = con.prepareStatement(sql);
//			ResultSet getSeqsRS = getSeqsSQLPS.executeQuery();
//		} catch (Exception e) {
//			throw new OperationDbFailedException("新增序列检查数据库失败：url-\t"+url+"\n \tsql-\t"+sql+"\n");
//		}
	}

	@Override
	public void removeSeq(String id) throws Exception {
		int result=this.tSeqDAO.deleteByPrimaryKey(id);
		if(result!=1){
			throw new NotExistException("要删除的序列在数据字典中不存在：seqId="+id);
		}
	}

	@Override
	public TSeq getTSeqDTO(String id) throws Exception {
		TSeq tSeq = this.tSeqDAO.selectByPrimaryKey(id);
		return tSeq;
	}

	@Override
	@Transactional
	public void updateSeq(TSeq seq) throws Exception {
		int result = this.tSeqDAO.updateByPrimaryKeySelective(seq);
		if (result < 1) {
			throw new NotExistException("更新的序列不存在,传入参数seqId:"+seq.getsId());
		}
	}
}
