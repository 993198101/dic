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

import com.dhcc.dic.entity.DifTableDTO;
import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TCtrlType;
import com.dhcc.dic.entity.TFuncType;
import com.dhcc.dic.entity.TModule;
import com.dhcc.dic.entity.TTable;
import com.dhcc.dic.entity.TTableField;
import com.dhcc.dic.entity.TTablespace;
import com.dhcc.dic.entity.TableCustom;
import com.dhcc.dic.service.ModuleService;
import com.dhcc.dic.service.SysParmDicService;
import com.dhcc.dic.service.TableService;
import com.dhcc.dic.service.TablespaceService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/table")
public class TableController {
	@Autowired
	private TableService tableService;
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private SysParmDicService sysParmDicService;
	@Autowired
	private TablespaceService tablespaceService;
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
	@RequestMapping("/removeTable")
	@ResponseBody
	public Map<String,Object> removeTable(String id) throws Exception{
		int result=this.tableService.deleteTableById(id);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "success");//无异常
		map.put("result", result);  //删除记录数
	    return map;
	}
	@RequestMapping("/getTableCustom")
	@ResponseBody
	public Map<String,Object> getTableCustom(String tableId) throws Exception{
		TableCustom tableCustom=null;
		tableCustom=this.tableService.getTableCustom(tableId);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "success");
		map.put("tableCustom", tableCustom);
	    return map;
	}
	@RequestMapping("/getDifTableCustom")
	@ResponseBody
	public Map<String,Object> getDifTableCustom(String tableName,String datasourceId) throws Exception{
		DifTableDTO difTableDTO=null;
		difTableDTO=this.tableService.getDifTableDTO(tableName,datasourceId);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", "success");
		map.put("tableCustom", difTableDTO);
	    return map;
	}
	@RequestMapping("/saveTable")
	@ResponseBody
	public Map<String,Object> saveTable(@RequestBody TTable tTable,HttpSession session) throws Exception{
		int result = 1;
		try{
			//this.tableService.editTable(tTable);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/getTableList")
	@ResponseBody
	public List<TTable> getTableList() throws Exception{
		return this.tableService.getTableList();
	}
	@RequestMapping("/getTableFieldList")
	@ResponseBody
	public List<TTableField> getTableFieldList(String tableId) throws Exception{
		return this.tableService.getTableFieldList(tableId);
	}
	
	@RequestMapping("/addOrEditTable")
	@ResponseBody
	public Map<String,Object> addOrEditTable(@RequestBody TableCustom tableCustom) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		String tableId=tableCustom.getTableInfo().gettId();
		if("-1".equals(tableId)){
			this.tableService.insertTable(tableCustom);
		}else{
			this.tableService.updateTable(tableCustom);
		}
		map.put("status", "success");
	    return map;
	}
	
	@RequestMapping("/getModuleOptionList")
	@ResponseBody
	public List<TModule> getModuleListOption(String projectId) throws Exception{
		return this.moduleService.getModuleList(projectId);
	}
	@RequestMapping("/getStableOptionList")
	@ResponseBody
	public Map<String,Object> getAllOptionList(String projectId,String datasourceId) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		List<TModule> moduleList=this.moduleService.getModuleList(projectId);
		moduleList.add(this.moduleService.getModuleById("0"));
		map.put("moduleList", moduleList);
		map.put("yesOrNo", this.sysParmDicService.getOptionList("YES_OR_NO"));
		List<TTablespace> tablespaceList=this.tablespaceService.getOptionList(projectId, datasourceId);
		tablespaceList.add(this.tablespaceService.getTablespaceById("0"));
		map.put("tablespaceList", tablespaceList);
		map.put("colTypeList", this.sysParmDicService.getOptionList("COL_TYPE"));
		return map;
	}
	@RequestMapping("/saveFuncType")
	@ResponseBody
	public Map<String,Object> saveFuncType(@RequestBody TFuncType tFuncType) throws Exception{
		int result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		result=this.tableService.saveFuncType(tFuncType);
		map.put("result", result);
		return map;
	}
	@RequestMapping("/getFuncTypesByPage")
	@ResponseBody
	public PageInfo<TFuncType> getFuncTypesByPage(int page,int rows,TFuncType funcType){
		PageInfo<TFuncType> list=null;
		try{
			list=new PageInfo<TFuncType>( this.tableService.getFuncTypesByPage(page, rows, funcType));
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/listFuncType")
	@ResponseBody
	public List<TFuncType> listFuncType() throws Exception{
		return this.tableService.listFuncType();
	}
	@RequestMapping("/getFuncType")
	@ResponseBody
	public TFuncType getFuncType(String id) throws Exception{
		return this.tableService.getFuncType(id);
	}
	@RequestMapping("/updateFuncType")
	@ResponseBody
	public Map<String,Object> updateFuncType(@RequestBody TFuncType tFuncType) throws Exception{
		int result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		result=this.tableService.updateFuncType(tFuncType);
		map.put("result", result);
		return map;
	}
	@RequestMapping("/removeFuncType")
	@ResponseBody
	public Map<String,Object> removeFuncTypeById(String id) throws Exception{
		int result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		result=this.tableService.removeFuncTypeById(id);
		map.put("result", result);
		return map;
	}
	@RequestMapping("/saveCtrlType")
	@ResponseBody
	public Map<String,Object> saveCtrlType(@RequestBody TCtrlType tCtrlType) throws Exception{
		int result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		result=this.tableService.saveCtrlType(tCtrlType);
		map.put("result", result);
		return map;
	}
	@RequestMapping("/getCtrlTypesByPage")
	@ResponseBody
	public PageInfo<TCtrlType> getCtrlTypesByPage(int page,int rows,TCtrlType ctrlType){
		PageInfo<TCtrlType> list=null;
		try{
			list=new PageInfo<TCtrlType>( this.tableService.getCtrlTypesByPage(page, rows, ctrlType));
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/listCtrlType")
	@ResponseBody
	public List<TCtrlType> listCtrlType() throws Exception{
		return this.tableService.listCtrlType();
	}
	@RequestMapping("/getCtrlType")
	@ResponseBody
	public TCtrlType getCtrlType(String id) throws Exception{
		return this.tableService.getCtrlType(id);
	}
	@RequestMapping("/updateCtrlType")
	@ResponseBody
	public Map<String,Object> updateCtrlType(@RequestBody TCtrlType tCtrlType) throws Exception{
		int result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		result=this.tableService.updateCtrlType(tCtrlType);
		map.put("result", result);
		return map;
	}
	@RequestMapping("/removeCtrlType")
	@ResponseBody
	public Map<String,Object> removeCtrlTypeById(String id) throws Exception{
		int result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		result=this.tableService.removeCtrlTypeById(id);
		map.put("result", result);
		return map;
	}
}
