package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.IndexDTO;
import com.dhcc.dic.entity.TIndex;

public interface IndexService {
	List<TIndex> getPage(int pageNum,int pageSize,TIndex tIndex) throws Exception;
	void saveIndex(IndexDTO indexDTO) throws Exception;
	void removeIndex(String id) throws Exception;
	IndexDTO getTIndexDTO(String id) throws Exception;
	void upadetIndex(IndexDTO indexDTO) throws Exception;
}
