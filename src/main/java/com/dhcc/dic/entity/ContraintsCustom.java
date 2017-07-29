package com.dhcc.dic.entity;

import java.util.List;

public class ContraintsCustom extends TConstraints{
	
	List<TTableField> consField;
	
	List<TTableField> RefConsField;
	
	public List<TTableField> getConsField() {
		return consField;
	}
	public void setConsField(List<TTableField> consField) {
		this.consField = consField;
	}
	public List<TTableField> getRefConsField() {
		return RefConsField;
	}
	public void setRefConsField(List<TTableField> refConsField) {
		RefConsField = refConsField;
	}
	
}
