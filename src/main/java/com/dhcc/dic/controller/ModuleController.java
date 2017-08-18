package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TModule;
import com.dhcc.dic.service.ModuleService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/module")
public class ModuleController {
	@Autowired
	private ModuleService moduleService;
	@RequestMapping("/getModulesByPage")
	@ResponseBody
	public PageInfo<TModule> getPage(int page,int rows,TModule tModule) throws Exception{
		PageInfo<TModule> list=null;
		try{
			list=new PageInfo<TModule>( this.moduleService.getPage(page, rows, tModule));
		}catch(Exception e){
			e.printStackTrace();
		}
	    return list;
	}
	@RequestMapping("/addModule")
	@ResponseBody
	public Map<String,Object> addSysDatabase(String parentMenuId,@RequestBody TModule tModule) throws Exception{
	    Map<String,Object> map=new HashMap<String,Object>();
	    int result=1;
	    try{
	    	this.moduleService.addModule(parentMenuId, tModule);
	    }catch(Exception e){
	    	e.printStackTrace();
	    	result=0;
	    }
	    map.put("result", result);
	    return map;
	}
	@RequestMapping("/deleteModule")
	@ResponseBody
	public Map<String,Object> deleteModule(String moduleId) throws Exception{
		int result=1;
		try{
			this.moduleService.deleteModuleById(moduleId);
		}catch(Exception e){
			e.printStackTrace();
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/getModuleById")
	@ResponseBody
	public Map<String,Object> getModuleById(String moduleId) throws Exception{
		TModule module=null;
		int result=1;
		try{
			module=this.moduleService.getModuleById(moduleId);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(module!=null)
			result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
		map.put("module", module);
	    return map;
	}
	@RequestMapping("/saveModule")
	@ResponseBody
	public Map<String,Object> saveModule(@RequestBody TModule tModule) throws Exception{
		int result=1;
		try{
			this.moduleService.editModule(tModule);
		}catch(Exception e){
			e.printStackTrace();
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
}
