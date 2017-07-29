package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.SysSelect;
import com.dhcc.dic.entity.TDatasource;

public interface SysDatasourceService {
	public List<TDatasource> getPage(int pageNum,int pageSize,TDatasource tDatasource) throws Exception;
	public void addSysDataSource(String parentMenuId,TDatasource tDatasource) throws Exception;
	public List<SysSelect> getSysDatabaseTypeSelect() throws Exception;
	public void deleteSysDatasourceById(String dId) throws Exception;
	public TDatasource getSysDatasourceById(String datasourceId) throws Exception;
	public void editSysDatasource(TDatasource datasource) throws Exception;
}
