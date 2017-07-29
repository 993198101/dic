package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.TProject;
import com.dhcc.dic.service.ProjectService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/project")
@Controller
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@RequestMapping("/getAllProjects")
	@ResponseBody
	public PageInfo<TProject> getPage(int page,int rows,TProject tProject){
		PageInfo<TProject> list=null;
		try{
			list=new PageInfo<TProject>( this.projectService.getPage(page, rows, tProject));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	    return list;
	}
	@RequestMapping(value="/addProject")
	@ResponseBody
	public Map<String,Object> addProject(TProject tProject){
		int result=1;
		try{
			this.projectService.addProject(tProject);
		}catch(Exception e){
			e.printStackTrace();
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	/**
	 * 1成功 0失败
	 * @param pId
	 * @return
	 */
	@RequestMapping("/deleteProject")
	@ResponseBody
	public Map<String,Object> deleteProject(String pId){
		int result=1;
		try{
			this.projectService.deleteProject(pId);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/getProjectById")
	@ResponseBody
	public TProject getProjectById(String pId){
		TProject tProject=null;
		try{
			tProject=this.projectService.getById(pId);
		}catch(Exception e){
			e.printStackTrace();
		}
	    return tProject;
	}
	/**
	 * 返回值大于0即修改成功
	 * @param tProject
	 * @return
	 */
	@RequestMapping("/saveProject")
	@ResponseBody
	public Map<String,Object> saveProject(@RequestBody TProject tProject){
		int result=1;
		try{
			this.projectService.editProject(tProject);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
		return map;
	}
	
}
