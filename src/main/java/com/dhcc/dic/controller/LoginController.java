package com.dhcc.dic.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/login")
@Controller
public class LoginController extends BaseController{
	private static Logger log = Logger.getLogger(LoginController.class);
	@RequestMapping("/userLogin")
	@ResponseBody
	public Map<String,Object> login(String username,String password) throws Exception{
		log.info(username+"+"+password);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("username", username);
		return map;
	}
	@RequestMapping("/dicMain")
	public String gotoDicMain(){
		return "dic/dicMain";
	}
}
