package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.TTablespace;

public interface TablespaceService {
	
	TTablespace getTablespaceById(String id) throws Exception;
	
	List<TTablespace> getOptionList(String projectId,String datasourceId) throws Exception;


	List<TTablespace> getPage(int pageNum,int pageSize,TTablespace tTablespace) throws Exception;
	void saveTTablespace(TTablespace tablespace) throws Exception;
	void removeTTablespace(String id) throws Exception;
	TTablespace getTTablespace(String id) throws Exception;
	void upadetTablespace(TTablespace tTablespace) throws Exception;

}
