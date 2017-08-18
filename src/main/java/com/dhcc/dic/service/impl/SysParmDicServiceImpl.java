package com.dhcc.dic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TSysParmDicDao;
import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TSysParmDic;
import com.dhcc.dic.service.SysParmDicService;
@Service
public class SysParmDicServiceImpl implements SysParmDicService{
	@Autowired
	private TSysParmDicDao tSysParmDicDao;

	@Override
	public List<SysOption> getOptionList(String keyName) throws Exception {
		return this.tSysParmDicDao.getOptionList(keyName);
	}

	@Override
	@Transactional
	public void insertOptionList(List<TSysParmDic> tSysParmDic) throws Exception {
		for(int i=0;i<tSysParmDic.size();i++){
			this.tSysParmDicDao.insert(tSysParmDic.get(i));
		}
		
	}
	
	
}
