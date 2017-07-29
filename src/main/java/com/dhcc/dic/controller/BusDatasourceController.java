package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.SysSelect;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.service.BusDatasourceService;
import com.github.pagehelper.PageInfo;
@RequestMapping("/busDatasource")
@Controller
public class BusDatasourceController {
	@Autowired
	private BusDatasourceService busDatasourceService;
	@RequestMapping("/getBusDatasourcesByPage")
	@ResponseBody
	public PageInfo<TDatasource> getPage(int page,int rows,TDatasource tDatasource){
		PageInfo<TDatasource> list=null;
		try{
			list=new PageInfo<TDatasource>( this.busDatasourceService.getPage(page, rows, tDatasource));
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/getBusDatabaseTypeSelect")
	@ResponseBody
	public List<SysSelect> getBusDatabaseTypeSelect(){
		List<SysSelect> options=null;
		try{
			options=this.busDatasourceService.getSysDatabaseTypeSelect();
		}catch(Exception e){
			e.printStackTrace();
		}
	    return options;
	}
	/**
	 * 返回1 成功  0失败
	 * @param parentMenuId
	 * @param tDatasource
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addBusDatasource")
	@ResponseBody
	public Map<String,Object> addBusDatasource(String parentMenuId,@RequestBody TDatasource tDatasource) throws Exception{
	    Map<String,Object> map=new HashMap<String,Object>();
	    int result=1;
	    try{
	    	this.busDatasourceService.addBusDataSource(parentMenuId, tDatasource);
	    }catch(Exception e){
	    	result=0;
	    }
	    map.put("result", result);
	    return map;
	}
	@RequestMapping("/deleteBusDatasource")
	@ResponseBody
	public Map<String,Object> deleteBusDatasource(String dId) throws Exception{
		int result=1;
		try{
			this.busDatasourceService.deleteBusDatasourceById(dId);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/getBusdatasourceById")
	@ResponseBody
	public Map<String,Object> getBusdatasourceById(String datasourceId) throws Exception{
		TDatasource datasource=null;
		int result=1;
		try{
		 datasource=this.busDatasourceService.getBusDatasourceById(datasourceId);
		}catch(Exception e){
			result=0;
		}
		
		if(datasource!=null)
			result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
		map.put("datasource", datasource);
	    return map;
	}
	@RequestMapping("/saveBusdatasource")
	@ResponseBody
	public Map<String,Object> saveBusdatasource(@RequestBody TDatasource tDatasource,HttpSession session) throws Exception{
		int result = 1;
		try{
			this.busDatasourceService.editBusDatasource(tDatasource);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
}
