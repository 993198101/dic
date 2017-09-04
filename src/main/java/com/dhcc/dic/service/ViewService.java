package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.ViewDTO;
import com.dhcc.dic.entity.TView;

public interface ViewService {
	List<TView> getPage(int pageNum,int pageSize,TView tView) throws Exception;
	void saveView(TView tView) throws Exception;
	void removeView(String id) throws Exception;
	ViewDTO getTViewDTO(String id) throws Exception;
	void updateView(TView tView) throws Exception;
}
