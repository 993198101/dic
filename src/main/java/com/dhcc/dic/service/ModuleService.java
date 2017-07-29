package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.SysSelect;
import com.dhcc.dic.entity.TModule;

public interface ModuleService {
	public List<TModule> getPage(int pageNum,int pageSize,TModule tModule) throws Exception;
	public void addModule(String parentMenuId,TModule tModule) throws Exception;
	public void deleteModuleById(String dId) throws Exception;
	public TModule getModuleById(String datasourceId) throws Exception;
	public void editModule(TModule datasource) throws Exception;
}
