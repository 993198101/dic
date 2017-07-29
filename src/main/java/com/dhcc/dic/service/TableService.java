package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.TTable;

public interface TableService {
	public List<TTable> getPage(int pageNum,int pageSize,TTable tTable) throws Exception;
	public void addTable(String parentMenuId,TTable tTable) throws Exception;
	public void deleteTableById(String dId) throws Exception;
	public TTable getTableById(String datasourceId) throws Exception;
	public void editTable(TTable datasource) throws Exception;
}
