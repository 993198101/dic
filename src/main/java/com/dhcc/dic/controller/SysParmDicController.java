package com.dhcc.dic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TSysParmDic;
import com.dhcc.dic.service.SysParmDicService;
@Controller
@RequestMapping("/sysParmDic")
public class SysParmDicController {
	@Autowired
	private SysParmDicService sysParmDicService;
	@RequestMapping("/getOptionList")
	@ResponseBody
	public List<SysOption> getOptionList(String keyName) throws Exception{
		return this.sysParmDicService.getOptionList(keyName);
	}
	@RequestMapping("/insertOptionList")
	@ResponseBody
	public String insertOptionList(@RequestBody List<TSysParmDic> tSysParmDicList) throws Exception{
		this.sysParmDicService.insertOptionList(tSysParmDicList);
		return "";
	}
}
