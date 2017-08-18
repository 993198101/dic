package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TModuleDao;
import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TModule;
import com.dhcc.dic.entity.TModuleExample;
import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.entity.TModuleExample.Criteria;
import com.dhcc.dic.service.ModuleService;
import com.dhcc.dic.util.MenuTreeUtil;
import com.github.pagehelper.PageHelper;

@Service
public class ModuleServiceImpl  implements ModuleService{
	@Autowired
	private TModuleDao tModuleDao;
	@Autowired
	private MenuTreeUtil menuTreeUtil;
	@Override
	public List<TModule> getPage(int pageNum,int pageSize,TModule tModule) throws Exception  {
		PageHelper.startPage(pageNum, pageSize);
		List<TModule> tModules=null;
		TModuleExample example=new TModuleExample();
		Criteria criteria=example.createCriteria();
		if(tModule.getmId()!=null){
			criteria.andMIdEqualTo(tModule.getmId());
		}
		if(tModule.getmName()!=null){
			criteria.andMNameLike("%"+tModule.getmName()+"%");
		}
		if(tModule.getmDesc()!=null){
			criteria.andMDescLike("%"+tModule.getmDesc()+"%");
		}
		if(tModule.getmDate()!=null){
			criteria.andMDateEqualTo(tModule.getmDate());
		}
		if(tModule.getmOfDatasource()!=null){
			criteria.andMOfDatasourceEqualTo(tModule.getmOfDatasource());
		}
		if(tModule.getmOfProject()!=null){
			criteria.andMOfProjectEqualTo(tModule.getmOfProject());
		}
		PageHelper.startPage(pageNum, pageSize);
		try{
			tModules=this.tModuleDao.selectByExample(example);
		}catch(Exception e){
			e.printStackTrace();
		}
		return tModules;
	}
	/**
	 *  增加模块
	 */
	@Override
	@Transactional
	public void addModule(String parentMenuId,TModule tModule) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		tModule.setmDate(mDate);
		this.tModuleDao.insert(tModule);
		this.menuTreeUtil.addModuleTree(tModule, parentMenuId, mDate);
		
	}
	/**
	 * 删除某个模块
	 * 
	 */
	@Override
	@Transactional
	public void deleteModuleById(String moduleId) throws Exception  {
		this.tModuleDao.deleteByPrimaryKey(moduleId);
		this.menuTreeUtil.deleteModuleTree(moduleId);
	}
	@Override
	public TModule getModuleById(String datasourceId) throws Exception  {
		return this.tModuleDao.selectByPrimaryKey(datasourceId);
	}
	/**
	 * 修改模块：返回1成功
	 * 出现异常事务回滚
	 * 
	 */
	@Override
	@Transactional
	public void editModule(TModule tModule) throws Exception  {
		this.tModuleDao.updateByPrimaryKeySelective(tModule);
		if(tModule.getmName()!=null){
			TMenuTree tMenuTree=this.menuTreeUtil.getModuleTree(tModule.getmId());
			tMenuTree.setmText(tModule.getmName());
			this.menuTreeUtil.editMenuTree(tMenuTree);
		}
	}
	@Override
	public List<TModule> getModuleList(String projectId) throws Exception {
		TModuleExample example=new TModuleExample();
		example.createCriteria().andMOfProjectEqualTo(projectId);
		return this.tModuleDao.selectByExample(example);
	}

}
