package com.dhcc.dic.entity;

import java.io.Serializable;

public class SysOption implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3432080704554149027L;
	private String id;
	private String text;
	private boolean selected;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
