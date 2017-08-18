package com.dhcc.dic.entity;

import java.util.List;

public class IndexDTO extends TIndex{
	List<String> refColumns;

	public List<String> getRefColumns() {
		return refColumns;
	}

	public void setRefColumns(List<String> refColumns) {
		this.refColumns = refColumns;
	}
	
}
