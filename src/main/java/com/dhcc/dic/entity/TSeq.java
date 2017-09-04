package com.dhcc.dic.entity;

import java.math.BigDecimal;

public class TSeq {
    private String sId;

    private String sName;

    private String sCnName;

    private BigDecimal sIncreaseSize;

    private BigDecimal sStart;

    private String sHasMax;

    private BigDecimal sMaxValue;

    private BigDecimal sCacheNumber;

    private String sSyncState;

    private String sDate;

    private String sRefTable;

    private String sRefField;

    private String sOfModule;

    private String sOfDatasource;

    private String sOfProject;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsCnName() {
        return sCnName;
    }

    public void setsCnName(String sCnName) {
        this.sCnName = sCnName == null ? null : sCnName.trim();
    }

    public BigDecimal getsIncreaseSize() {
        return sIncreaseSize;
    }

    public void setsIncreaseSize(BigDecimal sIncreaseSize) {
        this.sIncreaseSize = sIncreaseSize;
    }

    public BigDecimal getsStart() {
        return sStart;
    }

    public void setsStart(BigDecimal sStart) {
        this.sStart = sStart;
    }

    public String getsHasMax() {
        return sHasMax;
    }

    public void setsHasMax(String sHasMax) {
        this.sHasMax = sHasMax == null ? null : sHasMax.trim();
    }

    public BigDecimal getsMaxValue() {
        return sMaxValue;
    }

    public void setsMaxValue(BigDecimal sMaxValue) {
        this.sMaxValue = sMaxValue;
    }

    public BigDecimal getsCacheNumber() {
        return sCacheNumber;
    }

    public void setsCacheNumber(BigDecimal sCacheNumber) {
        this.sCacheNumber = sCacheNumber;
    }

    public String getsSyncState() {
        return sSyncState;
    }

    public void setsSyncState(String sSyncState) {
        this.sSyncState = sSyncState == null ? null : sSyncState.trim();
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate == null ? null : sDate.trim();
    }

    public String getsRefTable() {
        return sRefTable;
    }

    public void setsRefTable(String sRefTable) {
        this.sRefTable = sRefTable == null ? null : sRefTable.trim();
    }

    public String getsRefField() {
        return sRefField;
    }

    public void setsRefField(String sRefField) {
        this.sRefField = sRefField == null ? null : sRefField.trim();
    }

    public String getsOfModule() {
        return sOfModule;
    }

    public void setsOfModule(String sOfModule) {
        this.sOfModule = sOfModule == null ? null : sOfModule.trim();
    }

    public String getsOfDatasource() {
        return sOfDatasource;
    }

    public void setsOfDatasource(String sOfDatasource) {
        this.sOfDatasource = sOfDatasource == null ? null : sOfDatasource.trim();
    }

    public String getsOfProject() {
        return sOfProject;
    }

    public void setsOfProject(String sOfProject) {
        this.sOfProject = sOfProject == null ? null : sOfProject.trim();
    }
}