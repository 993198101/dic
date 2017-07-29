package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.dic.dao.TTableDao;
import com.dhcc.dic.entity.TTable;
import com.dhcc.dic.entity.TTableExample;
import com.dhcc.dic.entity.TTableExample.Criteria;
import com.dhcc.dic.service.TableService;
import com.dhcc.dic.util.MenuTreeUtil;
@Service
public class TableServiceImpl implements TableService{
    @Autowired
    private TTableDao tTableDao;
    @Autowired
	private MenuTreeUtil menuTreeUtil;
	@Override
	public List<TTable> getPage(int pageNum, int pageSize, TTable tTable) throws Exception {
		List<TTable> tables=null;
		TTableExample example=new TTableExample();
		Criteria criteria=example.createCriteria();
		if(tTable.gettId()!=null){
			criteria.andTIdEqualTo(tTable.gettId());
		}
		if(tTable.gettName()!=null){
			criteria.andTNameLike(tTable.gettName());
		}
		if(tTable.gettCnName()!=null){
			criteria.andTCnNameLike(tTable.gettName());
		}
		if(tTable.gettIsOnUse()!=null){
			criteria.andTIsOnUseEqualTo(tTable.gettIsOnUse());
		}
		if(tTable.gettOfTablespace()!=null){
			criteria.andTOfTablespaceEqualTo(tTable.gettOfTablespace());
		}
		if(tTable.gettDesc()!=null){
			criteria.andTDescLike(tTable.gettDesc());
		}
		if(tTable.gettSync()!=null){
			criteria.andTSyncEqualTo(tTable.gettSync());
		}
		if(tTable.gettDate()!=null){
			criteria.andTDateEqualTo(tTable.gettDate());
		}
		if(tTable.gettOfDatasource()!=null){
			criteria.andTOfDatasourceEqualTo(tTable.gettOfDatasource());
		}
		if(tTable.gettOfProject()!=null){
			criteria.andTOfProjectEqualTo(tTable.gettOfProject());
		}
		if(tTable.gettOfModule()!=null){
			criteria.andTOfModuleEqualTo(tTable.gettOfModule());
		}
		tables=this.tTableDao.selectByExample(example);
		return tables;
	}

	@Override
	public void addTable(String parentMenuId, TTable tTable) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		tTable.settDate(mDate);
		this.tTableDao.insert(tTable);
		//this
	}

	@Override
	public void deleteTableById(String id) throws Exception {
		// TODO Auto-generated method stub
		this.tTableDao.deleteByPrimaryKey(id);
		//
	}

	@Override
	public TTable getTableById(String id) throws Exception {
		// TODO Auto-generated method stub
		
		return this.tTableDao.selectByPrimaryKey(id);
	}

	@Override
	public void editTable(TTable tTable) throws Exception {
		// TODO Auto-generated method stub
		this.tTableDao.updateByPrimaryKeySelective(tTable);
		
	}
	
	
}
