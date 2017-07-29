package com.dhcc.dic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dhcc.dic.entity.MenuTree;



public interface MenuTreeDao {
	
	List<MenuTree> getChildren(@Param(value="parentId") String parentId);
    
	MenuTree getRoot();
}
