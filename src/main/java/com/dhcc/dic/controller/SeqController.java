package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.TSeq;
import com.dhcc.dic.service.ModuleService;
import com.dhcc.dic.service.SeqService;
import com.dhcc.dic.service.SysParmDicService;
import com.dhcc.dic.service.TableService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/seq")
public class SeqController {
	@Autowired
	private SeqService seqService;
	@Autowired
	private SysParmDicService sysParmDicService;
	@Autowired
	private TableService tableService;
	@Autowired
	private ModuleService moduleService;
	
	@RequestMapping("/getSeqsByPage")
	@ResponseBody
	public PageInfo<TSeq> getSeqsByPage(int page,int rows,TSeq tSeq) throws Exception{
		return new PageInfo<TSeq> (this.seqService.getPage(page, rows, tSeq));
	}
	@RequestMapping("/saveSeq")
	@ResponseBody
	public Map<String,Object> saveSeq(@RequestBody TSeq tSeq) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.seqService.saveSeq(tSeq);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/removeSeq")
	@ResponseBody
	public Map<String,Object> removeSeq(String id) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.seqService.removeSeq(id);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/getSeq")
	@ResponseBody
	public TSeq getSeqDTO(String seqId) throws Exception{
		return this.seqService.getTSeqDTO(seqId);
	}
	@RequestMapping("/updateSeq")
	@ResponseBody
	public Map<String,Object> updateSeq(@RequestBody TSeq tSeq) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.seqService.updateSeq(tSeq);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/getOptionList")
	@ResponseBody
	public Map<String,Object> getOptionList(String projectId) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("yesOrNoList", this.sysParmDicService.getOptionList("YES_OR_NO"));
		map.put("tableList", this.tableService.getTableList());
		map.put("moduleList", this.moduleService.getModuleList(projectId));
		return map;
	}
}
