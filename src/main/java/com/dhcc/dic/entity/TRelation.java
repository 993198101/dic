package com.dhcc.dic.entity;

public class TRelation {
    private String rId;

    private String rMenuId;

    private String rMenuType;

    private String rTable;

    private String rPkId;

    private String rDesc;
    
    

    public TRelation(String rId, String rMenuId, String rMenuType, String rTable, String rPkId, String rDesc) {
		super();
		this.rId = rId;
		this.rMenuId = rMenuId;
		this.rMenuType = rMenuType;
		this.rTable = rTable;
		this.rPkId = rPkId;
		this.rDesc = rDesc;
	}

	public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId == null ? null : rId.trim();
    }

    public String getrMenuId() {
        return rMenuId;
    }

    public void setrMenuId(String rMenuId) {
        this.rMenuId = rMenuId == null ? null : rMenuId.trim();
    }

    public String getrMenuType() {
        return rMenuType;
    }

    public void setrMenuType(String rMenuType) {
        this.rMenuType = rMenuType == null ? null : rMenuType.trim();
    }

    public String getrTable() {
        return rTable;
    }

    public void setrTable(String rTable) {
        this.rTable = rTable == null ? null : rTable.trim();
    }

    public String getrPkId() {
        return rPkId;
    }

    public void setrPkId(String rPkId) {
        this.rPkId = rPkId == null ? null : rPkId.trim();
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc == null ? null : rDesc.trim();
    }
}