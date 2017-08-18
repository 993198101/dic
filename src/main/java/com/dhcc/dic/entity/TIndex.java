package com.dhcc.dic.entity;

public class TIndex {
    private String iId;

    private String iOfTable;

    private String iName;

    private String iCnName;

    private String iDesc;

    private String iDate;

    private String iType;

    private String iSyncState;

    private String iOfModule;

    private String iOfDatasource;

    private String iOfProject;

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId == null ? null : iId.trim();
    }

    public String getiOfTable() {
        return iOfTable;
    }

    public void setiOfTable(String iOfTable) {
        this.iOfTable = iOfTable == null ? null : iOfTable.trim();
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName == null ? null : iName.trim();
    }

    public String getiCnName() {
        return iCnName;
    }

    public void setiCnName(String iCnName) {
        this.iCnName = iCnName == null ? null : iCnName.trim();
    }

    public String getiDesc() {
        return iDesc;
    }

    public void setiDesc(String iDesc) {
        this.iDesc = iDesc == null ? null : iDesc.trim();
    }

    public String getiDate() {
        return iDate;
    }

    public void setiDate(String iDate) {
        this.iDate = iDate == null ? null : iDate.trim();
    }

    public String getiType() {
        return iType;
    }

    public void setiType(String iType) {
        this.iType = iType == null ? null : iType.trim();
    }

    public String getiSyncState() {
        return iSyncState;
    }

    public void setiSyncState(String iSyncState) {
        this.iSyncState = iSyncState == null ? null : iSyncState.trim();
    }

    public String getiOfModule() {
        return iOfModule;
    }

    public void setiOfModule(String iOfModule) {
        this.iOfModule = iOfModule == null ? null : iOfModule.trim();
    }

    public String getiOfDatasource() {
        return iOfDatasource;
    }

    public void setiOfDatasource(String iOfDatasource) {
        this.iOfDatasource = iOfDatasource == null ? null : iOfDatasource.trim();
    }

    public String getiOfProject() {
        return iOfProject;
    }

    public void setiOfProject(String iOfProject) {
        this.iOfProject = iOfProject == null ? null : iOfProject.trim();
    }
}