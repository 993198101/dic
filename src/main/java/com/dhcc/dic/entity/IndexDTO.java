package com.dhcc.dic.entity;

import java.util.List;

public class IndexDTO extends TIndex{
	
	List<IndexColumnsCustom> indexColCustomList;

	public List<IndexColumnsCustom> getIndexColCustomList() {
		return indexColCustomList;
	}

	public void setIndexColCustomList(List<IndexColumnsCustom> indexColCustomList) {
		this.indexColCustomList = indexColCustomList;
	}

}
