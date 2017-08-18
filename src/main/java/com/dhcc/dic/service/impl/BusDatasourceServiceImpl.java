package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TDatasourceDao;
import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TDatasourceExample;
import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.entity.TDatasourceExample.Criteria;
import com.dhcc.dic.service.BusDatasourceService;
import com.dhcc.dic.util.MenuTreeUtil;
import com.github.pagehelper.PageHelper;
@Service
public class BusDatasourceServiceImpl implements BusDatasourceService{
	@Autowired
	private TDatasourceDao tDatasourceDao;
	@Autowired
	private MenuTreeUtil menuTreeUtil;
	@Override
	public List<TDatasource> getPage(int pageNum,int pageSize,TDatasource tDatasource) throws Exception  {
		PageHelper.startPage(pageNum, pageSize);
		List<TDatasource> tDatasources=null;
		TDatasourceExample example=new TDatasourceExample();
		Criteria criteria=example.createCriteria();
		if(tDatasource.getdId()!=null)
		criteria.andDIdEqualTo(tDatasource.getdId());
		if(tDatasource.getdName()!=null)
		criteria.andDNameLike("%"+tDatasource.getdName()+"%");
		if(tDatasource.getdDesc()!=null)
		criteria.andDDescLike("%"+tDatasource.getdDesc()+"%");
		criteria.andDTypeEqualTo("business");
		if(tDatasource.getdUsername()!=null)
		criteria.andDUsernameEqualTo(tDatasource.getdUsername());
		if(tDatasource.getdPassword()!=null)
		criteria.andDPasswordEqualTo(tDatasource.getdPassword());
		if(tDatasource.getdIp()!=null)
		criteria.andDIpEqualTo(tDatasource.getdIp());
		if(tDatasource.getdPort()!=null)
		criteria.andDPortEqualTo(tDatasource.getdPort());
		if(tDatasource.getdDate()!=null)
		criteria.andDDateEqualTo(tDatasource.getdDate());
		if(tDatasource.getdOfProject()!=null)
		criteria.andDOfProjectEqualTo(tDatasource.getdOfProject());
		if(tDatasource.getdDatabaseType()!=null)
		criteria.andDDatabaseTypeEqualTo(tDatasource.getdDatabaseType());
		PageHelper.startPage(pageNum, pageSize);
		tDatasources=this.tDatasourceDao.selectByExample(example);
		return tDatasources;
	}
	/**
	 *  增加业务数据源  返回1成功，出现异常事务回滚
	 */
	@Override
	@Transactional
	public void addBusDataSource(String parentMenuId,TDatasource tDatasource) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		tDatasource.setdDate(mDate);
		tDatasource.setdType("business");
		this.tDatasourceDao.insert(tDatasource);
		this.menuTreeUtil.addBusDatasourceTree(tDatasource, parentMenuId, mDate);
		
	}
	@Override
	public List<SysOption> getSysDatabaseTypeSelect() throws Exception {
		List<SysOption> sysOptions=this.tDatasourceDao.getSysDatabaseTypeSelect();
		return sysOptions;
	}
	/**
	 * 删除某个业务数据源
	 * 1为成功，异常事务回滚
	 */
	@Override
	@Transactional
	public void deleteBusDatasourceById(String dId) throws Exception  {
		this.tDatasourceDao.deleteByPrimaryKey(dId);
		this.menuTreeUtil.deleteBusdatasourceByIdTree(dId);
	}
	@Override
	public TDatasource getBusDatasourceById(String datasourceId) throws Exception  {
		return this.tDatasourceDao.selectByPrimaryKey(datasourceId);
	}
	/**
	 * 修改系统数据源：返回1成功
	 * 出现异常事务回滚
	 * 
	 */
	@Override
	@Transactional
	public void editBusDatasource(TDatasource datasource) throws Exception  {
		this.tDatasourceDao.updateByPrimaryKeySelective(datasource);
		if(datasource.getdName()!=null){
			TMenuTree tMenuTree=this.menuTreeUtil.getBusDatasourceTree(datasource.getdId());
			tMenuTree.setmText(datasource.getdName());
			this.menuTreeUtil.editMenuTree(tMenuTree);
		}
	}
	

}
