package com.dhcc.dic.entity;

import java.util.List;

public class TableCustom {
	
	private TTable tableInfo;
	
	private List<TTableField> tableFields;
	
	private List<ContraintsCustom> tableConstraints;
	
	private List<IndexDTO> tableIndexs;
	
	public List<IndexDTO> getTableIndexs() {
		return tableIndexs;
	}
	public void setTableIndexs(List<IndexDTO> tableIndexs) {
		this.tableIndexs = tableIndexs;
	}
	public List<TTableField> getTableFields() {
		return tableFields;
	}
	public void setTableFields(List<TTableField> tableFields) {
		this.tableFields = tableFields;
	}
	public List<ContraintsCustom> getTableConstraints() {
		return tableConstraints;
	}
	public void setTableConstraints(List<ContraintsCustom> tableConstraints) {
		this.tableConstraints = tableConstraints;
	}
	public TTable getTableInfo() {
		return tableInfo;
	}
	public void setTableInfo(TTable tableInfo) {
		this.tableInfo = tableInfo;
	}
	
	
}
