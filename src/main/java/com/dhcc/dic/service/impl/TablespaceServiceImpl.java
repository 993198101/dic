package com.dhcc.dic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.dic.dao.TTablespaceDao;
import com.dhcc.dic.entity.TTablespace;
import com.dhcc.dic.entity.TTablespaceExample;
import com.dhcc.dic.service.TablespaceService;

@Service
public class TablespaceServiceImpl implements TablespaceService{
	@Autowired
	private TTablespaceDao tTablespaceDao;
	@Override
	public List<TTablespace> getOptionList(String projectId, String datasourceId) throws Exception {
		TTablespaceExample example=new TTablespaceExample();
		example.createCriteria().andTOfProjectEqualTo(projectId).andTOfDatasourceEqualTo(datasourceId);
		return this.tTablespaceDao.selectByExample(example);
	}

}
