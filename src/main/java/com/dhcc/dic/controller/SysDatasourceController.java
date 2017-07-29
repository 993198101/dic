package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.SysSelect;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TProject;
import com.dhcc.dic.service.SysDatasourceService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/sysDatasource")
@Controller
public class SysDatasourceController {
	@Autowired
	private SysDatasourceService sysDatasourceService;
	@RequestMapping("/getSysDatasourcesByPage")
	@ResponseBody
	public PageInfo<TDatasource> getPage(int page,int rows,TDatasource tDatasource) throws Exception{
		PageInfo<TDatasource> list=null;
		try{
			list=new PageInfo<TDatasource>( this.sysDatasourceService.getPage(page, rows, tDatasource));
		}catch(Exception e){
			e.printStackTrace();
		}
	    return list;
	}
	@RequestMapping("/getSysDatabaseTypeSelect")
	@ResponseBody
	public List<SysSelect> getSysDatabaseTypeSelect() throws Exception{
		List<SysSelect> options=null;
		try{
			options=this.sysDatasourceService.getSysDatabaseTypeSelect();
		}catch(Exception e){
			e.printStackTrace();
		}
	    return options;
	}
	@RequestMapping("/addSysDatasource")
	@ResponseBody
	public Map<String,Object> addSysDatabase(String parentMenuId,@RequestBody TDatasource tDatasource) throws Exception{
	    Map<String,Object> map=new HashMap<String,Object>();
	    int result=1;
	    try{
	    	this.sysDatasourceService.addSysDataSource(parentMenuId, tDatasource);
	    }catch(Exception e){
	    	e.printStackTrace();
	    	result=0;
	    }
	    map.put("result", result);
	    return map;
	}
	@RequestMapping("/deleteSysDatasource")
	@ResponseBody
	public Map<String,Object> deleteSysDatasource(String dId) throws Exception{
		int result=1;
		try{
			this.sysDatasourceService.deleteSysDatasourceById(dId);
		}catch(Exception e){
			e.printStackTrace();
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/getSysdatasourceById")
	@ResponseBody
	public Map<String,Object> getSysdatasourceById(String datasourceId) throws Exception{
		TDatasource datasource=null;
		int result=1;
		try{
			datasource=this.sysDatasourceService.getSysDatasourceById(datasourceId);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(datasource!=null)
			result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
		map.put("datasource", datasource);
	    return map;
	}
	@RequestMapping("/saveSysdatasource")
	@ResponseBody
	public Map<String,Object> saveSysdatasource(@RequestBody TDatasource tDatasource) throws Exception{
		int result=1;
		try{
			this.sysDatasourceService.editSysDatasource(tDatasource);
		}catch(Exception e){
			e.printStackTrace();
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
}
