package com.dhcc.dic.entity;

public class TView {
    private String vId;

    private String vName;

    private String vSql;

    private String vCnName;

    private String vDesc;

    private String vDate;

    private String vSyncState;

    private String vOfModule;

    private String vOfDatasource;

    private String vOfProject;

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId == null ? null : vId.trim();
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public String getvSql() {
        return vSql;
    }

    public void setvSql(String vSql) {
        this.vSql = vSql == null ? null : vSql.trim();
    }

    public String getvCnName() {
        return vCnName;
    }

    public void setvCnName(String vCnName) {
        this.vCnName = vCnName == null ? null : vCnName.trim();
    }

    public String getvDesc() {
        return vDesc;
    }

    public void setvDesc(String vDesc) {
        this.vDesc = vDesc == null ? null : vDesc.trim();
    }

    public String getvDate() {
        return vDate;
    }

    public void setvDate(String vDate) {
        this.vDate = vDate == null ? null : vDate.trim();
    }

    public String getvSyncState() {
        return vSyncState;
    }

    public void setvSyncState(String vSyncState) {
        this.vSyncState = vSyncState == null ? null : vSyncState.trim();
    }

    public String getvOfModule() {
        return vOfModule;
    }

    public void setvOfModule(String vOfModule) {
        this.vOfModule = vOfModule == null ? null : vOfModule.trim();
    }

    public String getvOfDatasource() {
        return vOfDatasource;
    }

    public void setvOfDatasource(String vOfDatasource) {
        this.vOfDatasource = vOfDatasource == null ? null : vOfDatasource.trim();
    }

    public String getvOfProject() {
        return vOfProject;
    }

    public void setvOfProject(String vOfProject) {
        this.vOfProject = vOfProject == null ? null : vOfProject.trim();
    }
    
    
}