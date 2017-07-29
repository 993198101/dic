package com.dhcc.dic.entity;

public class TUser {
    private String uId;

    private String uCnName;

    private String uUserName;

    private String uPassword;

    private String uTablespace;

    private String uDesc;

    private String uDate;

    private String uSyncState;

    private String uAccess;

    private String uOfDatasource;

    private String uOfProject;

    private String uTempTablespace;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuCnName() {
        return uCnName;
    }

    public void setuCnName(String uCnName) {
        this.uCnName = uCnName == null ? null : uCnName.trim();
    }

    public String getuUserName() {
        return uUserName;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName == null ? null : uUserName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuTablespace() {
        return uTablespace;
    }

    public void setuTablespace(String uTablespace) {
        this.uTablespace = uTablespace == null ? null : uTablespace.trim();
    }

    public String getuDesc() {
        return uDesc;
    }

    public void setuDesc(String uDesc) {
        this.uDesc = uDesc == null ? null : uDesc.trim();
    }

    public String getuDate() {
        return uDate;
    }

    public void setuDate(String uDate) {
        this.uDate = uDate == null ? null : uDate.trim();
    }

    public String getuSyncState() {
        return uSyncState;
    }

    public void setuSyncState(String uSyncState) {
        this.uSyncState = uSyncState == null ? null : uSyncState.trim();
    }

    public String getuAccess() {
        return uAccess;
    }

    public void setuAccess(String uAccess) {
        this.uAccess = uAccess == null ? null : uAccess.trim();
    }

    public String getuOfDatasource() {
        return uOfDatasource;
    }

    public void setuOfDatasource(String uOfDatasource) {
        this.uOfDatasource = uOfDatasource == null ? null : uOfDatasource.trim();
    }

    public String getuOfProject() {
        return uOfProject;
    }

    public void setuOfProject(String uOfProject) {
        this.uOfProject = uOfProject == null ? null : uOfProject.trim();
    }

    public String getuTempTablespace() {
        return uTempTablespace;
    }

    public void setuTempTablespace(String uTempTablespace) {
        this.uTempTablespace = uTempTablespace == null ? null : uTempTablespace.trim();
    }
}