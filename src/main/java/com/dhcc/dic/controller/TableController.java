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

import com.dhcc.dic.entity.TTable;
import com.dhcc.dic.entity.TableCustom;
import com.dhcc.dic.service.TableService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/table")
public class TableController {
	@Autowired
	private TableService tableService;
	@RequestMapping("/getTablesByPage")
	@ResponseBody
	public PageInfo<TTable> getPage(int page,int rows,TTable tTable){
		PageInfo<TTable> list=null;
		try{
			list=new PageInfo<TTable>( this.tableService.getPage(page, rows, tTable));
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 返回1 成功  0失败
	 * @param parentMenuId
	 * @param tTable
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addTable")
	@ResponseBody
	public Map<String,Object> addTable(String parentMenuId,@RequestBody TableCustom tTable) throws Exception{
	    Map<String,Object> map=new HashMap<String,Object>();
	    int result=1;
	    try{
	    	//this.tableService.addTable(parentMenuId, tTable);
	    }catch(Exception e){
	    	result=0;
	    }
	    map.put("result", result);
	    return map;
	}
	@RequestMapping("/deleteTable")
	@ResponseBody
	public Map<String,Object> deleteTable(String dId) throws Exception{
		int result=1;
		try{
			this.tableService.deleteTableById(dId);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/getTableById")
	@ResponseBody
	public Map<String,Object> getTableById(String datasourceId) throws Exception{
		TTable datasource=null;
		int result=1;
		try{
		 datasource=this.tableService.getTableById(datasourceId);
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
	@RequestMapping("/saveTable")
	@ResponseBody
	public Map<String,Object> saveTable(@RequestBody TTable tTable,HttpSession session) throws Exception{
		int result = 1;
		try{
			this.tableService.editTable(tTable);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/addOrEditTable")
	@ResponseBody
	public Map<String,Object> addOrEditTable(@RequestBody TableCustom tableCustom){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", 1);
	    return map;
	}
	
}
