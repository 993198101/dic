package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.TUser;

public interface UserService {
	public List<TUser> getPage(int pageNum,int pageSize,TUser tUser) throws Exception;
	public void addUser(String parentMenuId,TUser tUser) throws Exception;
	public void deleteUserById(String dId) throws Exception;
	public TUser getUserById(String userId) throws Exception;
	public void editUser(TUser user) throws Exception;
}
