package com.dhcc.dic.entity;

public class TTable {
    private String tId;

    private String tName;

    private String tCnName;

    private String tIsOnUse;

    private String tOfTablespace;

    private String tDesc;

    private String tSync;

    private String tDate;

    private String tOfDatasource;

    private String tOfProject;

    private String tOfModule;

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

    public String gettIsOnUse() {
        return tIsOnUse;
    }

    public void settIsOnUse(String tIsOnUse) {
        this.tIsOnUse = tIsOnUse == null ? null : tIsOnUse.trim();
    }

    public String gettOfTablespace() {
        return tOfTablespace;
    }

    public void settOfTablespace(String tOfTablespace) {
        this.tOfTablespace = tOfTablespace == null ? null : tOfTablespace.trim();
    }

    public String gettDesc() {
        return tDesc;
    }

    public void settDesc(String tDesc) {
        this.tDesc = tDesc == null ? null : tDesc.trim();
    }

    public String gettSync() {
        return tSync;
    }

    public void settSync(String tSync) {
        this.tSync = tSync == null ? null : tSync.trim();
    }

    public String gettDate() {
        return tDate;
    }

    public void settDate(String tDate) {
        this.tDate = tDate == null ? null : tDate.trim();
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

    public String gettOfModule() {
        return tOfModule;
    }

    public void settOfModule(String tOfModule) {
        this.tOfModule = tOfModule == null ? null : tOfModule.trim();
    }
}