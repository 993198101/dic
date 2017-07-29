package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.MenuTreeDao;
import com.dhcc.dic.dao.TProjectDao;
import com.dhcc.dic.dao.TMenuTreeDao;
import com.dhcc.dic.entity.TProject;
import com.dhcc.dic.entity.TProjectExample;
import com.dhcc.dic.entity.TProjectExample.Criteria;
import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.entity.TMenuTreeExample;
import com.dhcc.dic.service.ProjectService;
import com.dhcc.dic.util.MenuTreeUtil;
import com.github.pagehelper.PageHelper;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private TProjectDao tProjectDao;
	
	@Autowired
	private MenuTreeUtil menuTreeUtil;
	public List<TProject> getPage(int pageNum, int pageSize, TProject tProject) throws Exception{
		PageHelper.startPage(pageNum, pageSize);
		TProjectExample example = new TProjectExample();
		Criteria criteria = example.createCriteria();
		if (tProject.getpDate() != null)
			criteria.andPDateEqualTo(tProject.getpDate());
		if (tProject.getpDesc() != null)
			criteria.andPDescLike("%"+tProject.getpDesc()+"%");
		if (tProject.getpId() != null)
			criteria.andPIdEqualTo(tProject.getpId());
		if (tProject.getpName() != null)
			criteria.andPNameLike("%"+tProject.getpName()+"%");
		List<TProject> list = this.tProjectDao.selectByExample(example);
		return list;
	}

	/**
	 * 增加项目 返回1成功，异常失败
	 * 
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void addProject(TProject tProject) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		tProject.setpDate(mDate);
		this.tProjectDao.insert(tProject);
		menuTreeUtil.addProjectTree(tProject, mDate);
	}

	@Override
	@Transactional
	public void deleteProject(String pId) {
		try{
			this.tProjectDao.deleteByPrimaryKey(pId);
			this.menuTreeUtil.deleteProjectTree(pId);
		
		
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
			
		
	}

	@Override
	public TProject getById(String pId) throws Exception {
		TProject project=this.tProjectDao.selectByPrimaryKey(pId);
		return project;
	}

	@Override
	@Transactional
	public void editProject(TProject tProject) throws Exception {
		this.tProjectDao.updateByPrimaryKey(tProject);
		if(tProject.getpName()!=null){
			TMenuTree tMenuTree=this.menuTreeUtil.getProjectTree(tProject.getpId());
			tMenuTree.setmText(tProject.getpName());
			this.menuTreeUtil.editMenuTree(tMenuTree);
		}
	}
}
