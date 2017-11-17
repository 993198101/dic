package com.dhcc.dic.entity;

public class TTablespace {
    private String tId;

    private String tName;

    private String tCnName;

    private String tDesc;

    private String tType;

    private String tSyncState;

    private String tOfDatasource;

    private String tOfProject;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettCnName() {
        return tCnName;
    }

    public void settCnName(String tCnName) {
        this.tCnName = tCnName == null ? null : tCnName.trim();
    }

    public String gettDesc() {
        return tDesc;
    }

    public void settDesc(String tDesc) {
        this.tDesc = tDesc == null ? null : tDesc.trim();
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType == null ? null : tType.trim();
    }

    public String gettSyncState() {
        return tSyncState;
    }

    public void settSyncState(String tSyncState) {
        this.tSyncState = tSyncState == null ? null : tSyncState.trim();
    }

    public String gettOfDatasource() {
        return tOfDatasource;
    }

    public void settOfDatasource(String tOfDatasource) {
        this.tOfDatasource = tOfDatasource == null ? null : tOfDatasource.trim();
    }

    public String gettOfProject() {
        return tOfProject;
    }

    public void settOfProject(String tOfProject) {
        this.tOfProject = tOfProject == null ? null : tOfProject.trim();
    }
}