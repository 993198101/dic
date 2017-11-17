package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.TTablespace;
import com.dhcc.dic.service.TablespaceService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/tablespace")
public class TablespaceController {
	@Autowired
	private TablespaceService tablespaceService;
	
	@RequestMapping("/getOptionList")
	@ResponseBody
	public List<TTablespace> getOptionList(String projectId,String datasourceId) throws Exception{
		return this.tablespaceService.getOptionList(projectId, datasourceId);
	}
	
	@RequestMapping("/getTablespacesByPage")
	@ResponseBody
	public PageInfo<TTablespace> getTablespacesByPage(int page,int rows,TTablespace tTablespace) throws Exception{
		return new PageInfo<TTablespace> (this.tablespaceService.getPage(page, rows, tTablespace));
	}
	@RequestMapping("/saveTablespace")
	@ResponseBody
	public Map<String,Object> saveSeq(@RequestBody TTablespace tTablespace) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.tablespaceService.saveTTablespace(tTablespace);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/removeTablespace")
	@ResponseBody
	public Map<String,Object> removeTablespace(String id) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.tablespaceService.removeTTablespace(id);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/getTablespace")
	@ResponseBody
	public TTablespace getTablespace(String tablespaceId) throws Exception{
		return this.tablespaceService.getTablespaceById(tablespaceId);
	}
	@RequestMapping("/updateTablespaceId")
	@ResponseBody
	public Map<String,Object> updatetablespaceId(@RequestBody TTablespace tTablespace) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.tablespaceService.upadetTablespace(tTablespace);
		map.put("status", "success");
		return map;
	}
	
}
