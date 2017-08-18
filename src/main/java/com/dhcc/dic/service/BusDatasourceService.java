package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TDatasource;

public interface BusDatasourceService {
	public List<TDatasource> getPage(int pageNum,int pageSize,TDatasource tDatasource) throws Exception;
	public void addBusDataSource(String parentMenuId,TDatasource tDatasource) throws Exception;
	public List<SysOption> getSysDatabaseTypeSelect() throws Exception;
	public void deleteBusDatasourceById(String dId) throws Exception;
	public TDatasource getBusDatasourceById(String datasourceId) throws Exception;
	public void editBusDatasource(TDatasource datasource) throws Exception;
}
