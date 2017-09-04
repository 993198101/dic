package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.ViewDTO;
import com.dhcc.dic.entity.TView;
import com.dhcc.dic.service.ViewService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/view")
public class ViewController {
	@Autowired
	private ViewService viewService;
	
	@RequestMapping("/getViewsByPage")
	@ResponseBody
	public PageInfo<TView> getViewsByPage(int page,int rows,TView tView) throws Exception{
		return new PageInfo<TView> (this.viewService.getPage(page, rows, tView));
	}
	@RequestMapping("/saveView")
	@ResponseBody
	public Map<String,Object> saveView(@RequestBody TView tView) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.viewService.saveView(tView);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/removeView")
	@ResponseBody
	public Map<String,Object> removeView(String id) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.viewService.removeView(id);
		map.put("status", "success");
		return map;
	}
	@RequestMapping("/getViewDTO")
	@ResponseBody
	public ViewDTO getViewDTO(String viewId) throws Exception{
		return this.viewService.getTViewDTO(viewId);
	}
	@RequestMapping("/updateView")
	@ResponseBody
	public Map<String,Object> updateView(@RequestBody TView tView) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		this.viewService.updateView(tView);
		map.put("status", "success");
		return map;
	}
}
