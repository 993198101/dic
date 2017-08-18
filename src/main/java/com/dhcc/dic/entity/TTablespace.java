package com.dhcc.dic.entity;

public class TTablespace {
    private String tId;

    private String tName;

    private String tCnName;

    private String tDesc;

    private String tType;

    private String tMinExtent;

    private String tBlocksize;

    private String tPartitionGroup;

    private String tLoggingClause;

    private String tForceLogging;

    private String tDefStorageClause;

    private String tAttribute;

    private String tExtentManagementClause;

    private String tState;

    private String tSaveObjState;

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

    public String gettMinExtent() {
        return tMinExtent;
    }

    public void settMinExtent(String tMinExtent) {
        this.tMinExtent = tMinExtent == null ? null : tMinExtent.trim();
    }

    public String gettBlocksize() {
        return tBlocksize;
    }

    public void settBlocksize(String tBlocksize) {
        this.tBlocksize = tBlocksize == null ? null : tBlocksize.trim();
    }

    public String gettPartitionGroup() {
        return tPartitionGroup;
    }

    public void settPartitionGroup(String tPartitionGroup) {
        this.tPartitionGroup = tPartitionGroup == null ? null : tPartitionGroup.trim();
    }

    public String gettLoggingClause() {
        return tLoggingClause;
    }

    public void settLoggingClause(String tLoggingClause) {
        this.tLoggingClause = tLoggingClause == null ? null : tLoggingClause.trim();
    }

    public String gettForceLogging() {
        return tForceLogging;
    }

    public void settForceLogging(String tForceLogging) {
        this.tForceLogging = tForceLogging == null ? null : tForceLogging.trim();
    }

    public String gettDefStorageClause() {
        return tDefStorageClause;
    }

    public void settDefStorageClause(String tDefStorageClause) {
        this.tDefStorageClause = tDefStorageClause == null ? null : tDefStorageClause.trim();
    }

    public String gettAttribute() {
        return tAttribute;
    }

    public void settAttribute(String tAttribute) {
        this.tAttribute = tAttribute == null ? null : tAttribute.trim();
    }

    public String gettExtentManagementClause() {
        return tExtentManagementClause;
    }

    public void settExtentManagementClause(String tExtentManagementClause) {
        this.tExtentManagementClause = tExtentManagementClause == null ? null : tExtentManagementClause.trim();
    }

    public String gettState() {
        return tState;
    }

    public void settState(String tState) {
        this.tState = tState == null ? null : tState.trim();
    }

    public String gettSaveObjState() {
        return tSaveObjState;
    }

    public void settSaveObjState(String tSaveObjState) {
        this.tSaveObjState = tSaveObjState == null ? null : tSaveObjState.trim();
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