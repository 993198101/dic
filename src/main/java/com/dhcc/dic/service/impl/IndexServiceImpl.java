package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TIndexColumnsDAO;
import com.dhcc.dic.dao.TIndexDao;
import com.dhcc.dic.entity.IndexDTO;
import com.dhcc.dic.entity.TIndex;
import com.dhcc.dic.entity.TIndexColumnsExample;
import com.dhcc.dic.entity.TIndexColumnsKey;
import com.dhcc.dic.entity.TIndexExample;
import com.dhcc.dic.entity.TIndexExample.Criteria;
import com.dhcc.dic.service.IndexService;
import com.github.pagehelper.PageHelper;
@Service
public class IndexServiceImpl implements IndexService{
	@Autowired
	private TIndexDao tIndexDao;
	@Autowired
	private TIndexColumnsDAO tIndexColumnsDAO;
	@Override
	public List<TIndex> getPage(int pageNum, int pageSize, TIndex tIndex) throws Exception {
		PageHelper.startPage(pageNum, pageSize);
		TIndexExample example=new TIndexExample();
		Criteria criteria=example.createCriteria();
		if(tIndex.getiId()!=null){
			criteria.andIIdEqualTo(tIndex.getiId());
		}
		if(tIndex.getiName()!=null){
			criteria.andINameLike("%"+tIndex.getiName()+"%");
		}
		if(tIndex.getiOfTable()!=null){
			criteria.andIOfTableEqualTo(tIndex.getiOfTable());
		}
		if(tIndex.getiCnName()!=null){
			criteria.andICnNameLike("%"+tIndex.getiCnName()+"%");
		}
		if(tIndex.getiDate()!=null){
			criteria.andIDateEqualTo(tIndex.getiDate());
		}
		if(tIndex.getiType()!=null){
			criteria.andITypeEqualTo(tIndex.getiType());
		}
		if(tIndex.getiSyncState()!=null){
			criteria.andISyncStateEqualTo(tIndex.getiSyncState());
		}
		if(tIndex.getiOfModule()!=null){
			criteria.andIOfModuleEqualTo(tIndex.getiOfModule());
		}
		if(tIndex.getiOfProject()!=null){
			criteria.andIOfProjectEqualTo(tIndex.getiOfProject());
		}
		if(tIndex.getiOfDatasource()!=null){
			criteria.andIOfDatasourceEqualTo(tIndex.getiOfDatasource());
		}
		return tIndexDao.selectByExample(example);
	}

	@Override
	@Transactional
	public void saveIndex(IndexDTO indexDTO) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		indexDTO.setiDate(date);
		indexDTO.setiSyncState("3");//已同步
		this.tIndexDao.insert(indexDTO);
		for(String colId:indexDTO.getRefColumns()){
			 TIndexColumnsKey col=new TIndexColumnsKey(indexDTO.getiId(),colId);
			 this.tIndexColumnsDAO.insert(col);
		}
	}

	@Override
	public void removeIndex(String id) throws Exception {
		this.tIndexDao.deleteByPrimaryKey(id);
	}

	@Override
	public IndexDTO getTIndexDTO(String id) throws Exception {
		IndexDTO indexDTO=this.tIndexDao.getIndexDTO(id);
		return indexDTO;
	}

	@Override
	public void upadetIndex(IndexDTO indexDTO) throws Exception {
		this.tIndexDao.updateByPrimaryKey(indexDTO);
		TIndexColumnsExample example=new TIndexColumnsExample();
		example.createCriteria().andIndexIdEqualTo(indexDTO.getiId());
		this.tIndexColumnsDAO.deleteByExample(example);
		for(String columnId:indexDTO.getRefColumns()){
			TIndexColumnsKey record=new TIndexColumnsKey(indexDTO.getiId(),columnId);
			this.tIndexColumnsDAO.insert(record);
		}
	}

}
