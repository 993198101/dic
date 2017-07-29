package com.dhcc.dic.entity;

public class TDatasource {
    private String dId;

    private String dName;

    private String dDesc;

    private String dType;

    private String dUsername;

    private String dPassword;

    private String dIp;

    private String dPort;

    private String dService;

    private String dDate;

    private String dOfProject;

    private String dDatabaseType;

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdDesc() {
        return dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc == null ? null : dDesc.trim();
    }

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType == null ? null : dType.trim();
    }

    public String getdUsername() {
        return dUsername;
    }

    public void setdUsername(String dUsername) {
        this.dUsername = dUsername == null ? null : dUsername.trim();
    }

    public String getdPassword() {
        return dPassword;
    }

    public void setdPassword(String dPassword) {
        this.dPassword = dPassword == null ? null : dPassword.trim();
    }

    public String getdIp() {
        return dIp;
    }

    public void setdIp(String dIp) {
        this.dIp = dIp == null ? null : dIp.trim();
    }

    public String getdPort() {
        return dPort;
    }

    public void setdPort(String dPort) {
        this.dPort = dPort == null ? null : dPort.trim();
    }

    public String getdService() {
        return dService;
    }

    public void setdService(String dService) {
        this.dService = dService == null ? null : dService.trim();
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate == null ? null : dDate.trim();
    }

    public String getdOfProject() {
        return dOfProject;
    }

    public void setdOfProject(String dOfProject) {
        this.dOfProject = dOfProject == null ? null : dOfProject.trim();
    }

    public String getdDatabaseType() {
        return dDatabaseType;
    }

    public void setdDatabaseType(String dDatabaseType) {
        this.dDatabaseType = dDatabaseType == null ? null : dDatabaseType.trim();
    }
}