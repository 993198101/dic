package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class ConstraintsDTO {

	private String consName;

	private String consType;

	private String consTableName;

	private String consRefConsName;

	private String consRefTableName;

	private List<TTableField> consField;

	private List<TTableField> refConsField;

	public List<TTableField> getConsField() {
		return this.consField=this.consField==null?new ArrayList<TTableField>():consField;
	}

	public void setConsField(List<TTableField> consField) {
		this.consField = consField;
	}

	public List<TTableField> getRefConsField() {
		return this.refConsField=this.refConsField==null?new ArrayList<TTableField>():refConsField;
	}

	public void setRefConsField(List<TTableField> refConsField) {
		this.refConsField = refConsField;
	}

	public String getConsName() {
		return consName;
	}

	public void setConsName(String consName) {
		this.consName = consName;
	}

	public String getConsType() {
		return consType;
	}

	public void setConsType(String consType) {
		this.consType = consType;
	}

	public String getConsTableName() {
		return consTableName;
	}

	public void setConsTableName(String consTableName) {
		this.consTableName = consTableName;
	}

	public String getConsRefConsName() {
		return consRefConsName;
	}

	public void setConsRefConsName(String consRefConsName) {
		this.consRefConsName = consRefConsName;
	}

	public String getConsRefTableName() {
		return consRefTableName;
	}

	public void setConsRefTableName(String consRefTableName) {
		this.consRefTableName = consRefTableName;
	}

}
