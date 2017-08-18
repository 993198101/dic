package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.IndexDTO;
import com.dhcc.dic.entity.TIndex;
import com.dhcc.dic.service.IndexService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/getIndexsByPage")
	@ResponseBody
	public PageInfo<TIndex> getIndexsByPage(int page,int rows,TIndex tIndex) throws Exception{
		return new PageInfo<TIndex> (this.indexService.getPage(page, rows, tIndex));
	}
	@RequestMapping("/saveIndex")
	@ResponseBody
	public Map<String,Object> saveIndex(@RequestBody IndexDTO indexDTO) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.indexService.saveIndex(indexDTO);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/removeIndex")
	@ResponseBody
	public Map<String,Object> removeIndex(String id) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.indexService.removeIndex(id);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/getIndexDTO")
	@ResponseBody
	public IndexDTO getIndexDTO(String indexId) throws Exception{
		return this.indexService.getTIndexDTO(indexId);
	}
	@RequestMapping("/updateIndex")
	@ResponseBody
	public Map<String,Object> updateIndex(@RequestBody IndexDTO indexDTO) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.indexService.upadetIndex(indexDTO);
		map.put("status", "success");
		return map;
	}
}
