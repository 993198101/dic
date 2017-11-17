package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TTablespaceDao;
import com.dhcc.dic.entity.TTablespace;

import com.dhcc.dic.entity.TTablespaceExample;
import com.dhcc.dic.entity.TTablespace;
import com.dhcc.dic.entity.TTablespaceExample;
import com.dhcc.dic.entity.TTablespaceExample.Criteria;
import com.dhcc.dic.service.TablespaceService;
import com.github.pagehelper.PageHelper;

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
	@Override
	public TTablespace getTablespaceById(String id) throws Exception {
		TTablespaceExample example=new TTablespaceExample();
		example.createCriteria().andTIdEqualTo(id);
		List<TTablespace> tablespaceList=this.tTablespaceDao.selectByExample(example);
		if(tablespaceList!=null&&tablespaceList.size()==1){
			return tablespaceList.get(0);
		}
		return null;
	}
	
	@Override
	public List<TTablespace> getPage(int pageNum, int pageSize, TTablespace tTablespace) throws Exception {
		PageHelper.startPage(pageNum, pageSize);
		TTablespaceExample example=new TTablespaceExample();
		Criteria criteria=example.createCriteria();
		if(tTablespace.gettId()!=null){
			criteria.andTIdEqualTo(tTablespace.gettId());
		}
		if(tTablespace.gettName()!=null){
			criteria.andTNameLike("%"+tTablespace.gettName()+"%");
		}
		if(tTablespace.gettCnName()!=null){
			criteria.andTCnNameLike("%"+tTablespace.gettCnName()+"%");
		}
		if(tTablespace.gettSyncState()!=null){
			criteria.andTSyncStateEqualTo(tTablespace.gettSyncState());
		}
		if(tTablespace.gettOfProject()!=null){
			criteria.andTOfProjectEqualTo(tTablespace.gettOfProject());
		}
		if(tTablespace.gettOfDatasource()!=null){
			criteria.andTOfDatasourceEqualTo(tTablespace.gettOfDatasource());
		}
		return tTablespaceDao.selectByExample(example);
	}

	@Override
	@Transactional
	public void saveTTablespace(TTablespace tablespace) throws Exception {
		tablespace.settSyncState("3");//已同步
		this.tTablespaceDao.insert(tablespace);
	}

	@Override
	public void removeTTablespace(String id) throws Exception {
		this.tTablespaceDao.deleteByPrimaryKey(id);
	}

	@Override
	public TTablespace getTTablespace(String id) throws Exception {
		TTablespace tablespace=this.tTablespaceDao.selectByPrimaryKey(id);
		return tablespace;
	}

	@Override
	public void upadetTablespace(TTablespace tablespace) throws Exception {
		this.tTablespaceDao.updateByPrimaryKeySelective(tablespace);
	}
}
