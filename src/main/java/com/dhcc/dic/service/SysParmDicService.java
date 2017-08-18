package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TSysParmDic;

public interface SysParmDicService {
	
	List<SysOption> getOptionList(String keyName) throws Exception;
	void insertOptionList(List<TSysParmDic> tSysParmDicList) throws Exception;
}
