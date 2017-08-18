package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.TTablespace;

public interface TablespaceService {
	public List<TTablespace> getOptionList(String projectId,String datasourceId) throws Exception;
}
