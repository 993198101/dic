package com.dhcc.dic.entity;

import java.math.BigDecimal;

public class TSysParmDic {
    private String pId;

    private String pKeyName;

    private String pOptCode;

    private String pOptName;

    private BigDecimal seqn;

    private String sts;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getpKeyName() {
        return pKeyName;
    }

    public void setpKeyName(String pKeyName) {
        this.pKeyName = pKeyName == null ? null : pKeyName.trim();
    }

    public String getpOptCode() {
        return pOptCode;
    }

    public void setpOptCode(String pOptCode) {
        this.pOptCode = pOptCode == null ? null : pOptCode.trim();
    }

    public String getpOptName() {
        return pOptName;
    }

    public void setpOptName(String pOptName) {
        this.pOptName = pOptName == null ? null : pOptName.trim();
    }

    public BigDecimal getSeqn() {
        return seqn;
    }

    public void setSeqn(BigDecimal seqn) {
        this.seqn = seqn;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }
}