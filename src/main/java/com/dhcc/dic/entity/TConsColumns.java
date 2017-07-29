package com.dhcc.dic.entity;

public class TConsColumns {
    private String ccId;

    private String ccConsId;

    private String ccTableId;

    private String ccTableFieldId;

    public String getCcId() {
        return ccId;
    }

    public void setCcId(String ccId) {
        this.ccId = ccId == null ? null : ccId.trim();
    }

    public String getCcConsId() {
        return ccConsId;
    }

    public void setCcConsId(String ccConsId) {
        this.ccConsId = ccConsId == null ? null : ccConsId.trim();
    }

    public String getCcTableId() {
        return ccTableId;
    }

    public void setCcTableId(String ccTableId) {
        this.ccTableId = ccTableId == null ? null : ccTableId.trim();
    }

    public String getCcTableFieldId() {
        return ccTableFieldId;
    }

    public void setCcTableFieldId(String ccTableFieldId) {
        this.ccTableFieldId = ccTableFieldId == null ? null : ccTableFieldId.trim();
    }
}