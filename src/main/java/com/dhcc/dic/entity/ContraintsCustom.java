package com.dhcc.dic.entity;



public class ContraintsCustom extends TConstraints{
	
	private TTableField[] consFieldName;
	
	private String[] refConsFieldId;
	
	public TTableField[] getConsFieldName() {
		return consFieldName;
	}

	public void setConsFieldName(TTableField[] consFieldName) {
		this.consFieldName = consFieldName;
	}

	public String[] getRefConsFieldId() {
		return refConsFieldId;
	}

	public void setRefConsFieldId(String[] refConsFieldId) {
		this.refConsFieldId = refConsFieldId;
	}
	
}
