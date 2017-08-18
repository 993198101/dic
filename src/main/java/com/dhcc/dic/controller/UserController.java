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

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TUser;
import com.dhcc.dic.service.UserService;
import com.github.pagehelper.PageInfo;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/getUsersByPage")
	@ResponseBody
	public PageInfo<TUser> getPage(int page,int rows,TUser tUser){
		PageInfo<TUser> list=null;
		try{
			list=new PageInfo<TUser>( this.userService.getPage(page, rows, tUser));
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 返回1 成功  0失败
	 * @param parentMenuId
	 * @param tDatasource
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addUser")
	@ResponseBody
	public Map<String,Object> addUser(String parentMenuId,@RequestBody TUser tDatasource) throws Exception{
	    Map<String,Object> map=new HashMap<String,Object>();
	    int result=1;
	    try{
	    	this.userService.addUser(parentMenuId, tDatasource);
	    }catch(Exception e){
	    	result=0;
	    }
	    map.put("result", result);
	    return map;
	}
	@RequestMapping("/deleteUser")
	@ResponseBody
	public Map<String,Object> deleteUser(String dId) throws Exception{
		int result=1;
		try{
			this.userService.deleteUserById(dId);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
	@RequestMapping("/getUserById")
	@ResponseBody
	public Map<String,Object> getUserById(String userId) throws Exception{
		TUser user=null;
		int result=1;
		try{
		 user=this.userService.getUserById(userId);
		}catch(Exception e){
			result=0;
		}
		
		if(user!=null)
			result=0;
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
		map.put("user", user);
	    return map;
	}
	@RequestMapping("/saveUser")
	@ResponseBody
	public Map<String,Object> saveUser(@RequestBody TUser tDatasource,HttpSession session) throws Exception{
		int result = 1;
		try{
			this.userService.editUser(tDatasource);
		}catch(Exception e){
			result=0;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("result", result);
	    return map;
	}
}
