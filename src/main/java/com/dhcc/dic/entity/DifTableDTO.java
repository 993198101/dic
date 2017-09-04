package com.dhcc.dic.entity;

import java.util.List;

public class DifTableDTO {

	private TTable tableInfo;
	
	private List<TTableField> tableFields;
	
	private List<ConstraintsDTO> tableConstraints;
	
	private List<IndexDTO> tableIndexs;

	public TTable getTableInfo() {
		return tableInfo;
	}

	public void setTableInfo(TTable tableInfo) {
		this.tableInfo = tableInfo;
	}

	public List<TTableField> getTableFields() {
		return tableFields;
	}

	public void setTableFields(List<TTableField> tableFields) {
		this.tableFields = tableFields;
	}

	public List<ConstraintsDTO> getTableConstraints() {
		return tableConstraints;
	}

	public void setTableConstraints(List<ConstraintsDTO> tableConstraints) {
		this.tableConstraints = tableConstraints;
	}

	public List<IndexDTO> getTableIndexs() {
		return tableIndexs;
	}

	public void setTableIndexs(List<IndexDTO> tableIndexs) {
		this.tableIndexs = tableIndexs;
	}
	
}
