package com.dhcc.dic.entity;

import java.util.List;

public class ViewDTO {
	
	private TView tView;
	
	private List<String> colName;
	
	private List<List> colList;

	public TView gettView() {
		return tView;
	}

	public void settView(TView tView) {
		this.tView = tView;
	}

	public List<String> getColName() {
		return colName;
	}

	public void setColName(List<String> colName) {
		this.colName = colName;
	}

	public List<List> getColList() {
		return colList;
	}

	public void setColList(List<List> colList) {
		this.colList = colList;
	}

}
