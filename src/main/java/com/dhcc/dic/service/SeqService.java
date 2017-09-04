package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.TSeq;

public interface SeqService {
	List<TSeq> getPage(int pageNum,int pageSize,TSeq tSeq) throws Exception;
	void saveSeq(TSeq tSeq) throws Exception;
	void removeSeq(String id) throws Exception;
	TSeq getTSeqDTO(String id) throws Exception;
	void updateSeq(TSeq tSeq) throws Exception;
}
