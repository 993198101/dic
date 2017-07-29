package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.TProject;



public interface ProjectService {
	public List<TProject> getPage(int pageNum,int pageSize,TProject tProject) throws Exception;
	public void addProject (TProject tProject) throws Exception;
	public void deleteProject(String pId) throws Exception;
	public TProject getById(String pId) throws Exception;
	public void editProject(TProject tProject) throws Exception;
}
