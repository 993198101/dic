package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.dhcc.dic.dao.MenuTreeDao;
import com.dhcc.dic.dao.TDatasourceDao;
import com.dhcc.dic.dao.TMenuTreeDao;
import com.dhcc.dic.entity.SysSelect;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TDatasourceExample;
import com.dhcc.dic.entity.TProjectExample;
import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.entity.TMenuTreeExample;
import com.dhcc.dic.service.SysDatasourceService;
import com.dhcc.dic.util.MenuTreeUtil;
import com.dhcc.dic.entity.TDatasourceExample.Criteria;

import com.github.pagehelper.PageHelper;
@Service
public class SysDatasourceServiceImpl implements SysDatasourceService{
	@Autowired
	private TDatasourceDao tDatasourceDao;
	@Autowired
	private MenuTreeUtil menuTreeUtil;
	
	@Override
	public List<TDatasource> getPage(int pageNum,int pageSize,TDatasource tDatasource) throws Exception  {
		List<TDatasource> tDatasources=null;
		TDatasourceExample example=new TDatasourceExample();
		Criteria criteria=example.createCriteria();
		if(tDatasource.getdId()!=null)
		criteria.andDIdEqualTo(tDatasource.getdId());
		if(tDatasource.getdName()!=null)
		criteria.andDNameLike("%"+tDatasource.getdName()+"%");
		if(tDatasource.getdDesc()!=null)
		criteria.andDDescLike("%"+tDatasource.getdDesc()+"%");
		criteria.andDTypeEqualTo("system");
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
		try{
			tDatasources=this.tDatasourceDao.selectByExample(example);
		}catch(Exception e){
			e.printStackTrace();
		}
		return tDatasources;
	}
	/**
	 *  增加系统数据源
	 */
	@Override
	@Transactional
	public void addSysDataSource(String parentMenuId,TDatasource tDatasource) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		tDatasource.setdDate(mDate);
		tDatasource.setdType("system");
		this.tDatasourceDao.insert(tDatasource);
		this.menuTreeUtil.addSysDatasourceTree(tDatasource, parentMenuId, mDate);
		
	}
	@Override
	public List<SysSelect> getSysDatabaseTypeSelect() throws Exception {
		List<SysSelect> sysSelects=this.tDatasourceDao.getSysDatabaseTypeSelect();
		return sysSelects;
	}
	/**
	 * 删除某个系统数据源
	 * 
	 */
	@Override
	@Transactional
	public void deleteSysDatasourceById(String dId) throws Exception  {
		this.tDatasourceDao.deleteByPrimaryKey(dId);
		this.menuTreeUtil.deleteSysdatasourceByIdTree(dId);
	}
	@Override
	public TDatasource getSysDatasourceById(String datasourceId) throws Exception  {
		return this.tDatasourceDao.selectByPrimaryKey(datasourceId);
	}
	/**
	 * 修改系统数据源：返回1成功
	 * 出现异常事务回滚
	 * 
	 */
	@Override
	@Transactional
	public void editSysDatasource(TDatasource datasource) throws Exception  {
		this.tDatasourceDao.updateByPrimaryKeySelective(datasource);
		if(datasource.getdName()!=null){
			TMenuTree tMenuTree=this.menuTreeUtil.getSysDatasourceTree(datasource.getdId());
			tMenuTree.setmText(datasource.getdName());
			this.menuTreeUtil.editMenuTree(tMenuTree);
		}
	}

}
