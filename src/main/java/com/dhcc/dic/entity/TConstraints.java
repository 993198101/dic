package com.dhcc.dic.entity;

public class TConstraints {
    private String consId;

    private String consName;

    private String consType;

    private String consTableId;

    private String consRefConsId;

    private String consRefTableId;

    private String consIsReal;

    public String getConsId() {
        return consId;
    }

    public void setConsId(String consId) {
        this.consId = consId == null ? null : consId.trim();
    }

    public String getConsName() {
        return consName;
    }

    public void setConsName(String consName) {
        this.consName = consName == null ? null : consName.trim();
    }

    public String getConsType() {
        return consType;
    }

    public void setConsType(String consType) {
        this.consType = consType == null ? null : consType.trim();
    }

    public String getConsTableId() {
        return consTableId;
    }

    public void setConsTableId(String consTableId) {
        this.consTableId = consTableId == null ? null : consTableId.trim();
    }

    public String getConsRefConsId() {
        return consRefConsId;
    }

    public void setConsRefConsId(String consRefConsId) {
        this.consRefConsId = consRefConsId == null ? null : consRefConsId.trim();
    }

    public String getConsRefTableId() {
        return consRefTableId;
    }

    public void setConsRefTableId(String consRefTableId) {
        this.consRefTableId = consRefTableId == null ? null : consRefTableId.trim();
    }

    public String getConsIsReal() {
        return consIsReal;
    }

    public void setConsIsReal(String consIsReal) {
        this.consIsReal = consIsReal == null ? null : consIsReal.trim();
    }
}