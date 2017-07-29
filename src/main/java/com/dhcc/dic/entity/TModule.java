package com.dhcc.dic.entity;

public class TModule {
    private String mId;

    private String mName;

    private String mDate;

    private String mDesc;

    private String mOfDatasource;

    private String mOfProject;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate == null ? null : mDate.trim();
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc == null ? null : mDesc.trim();
    }

    public String getmOfDatasource() {
        return mOfDatasource;
    }

    public void setmOfDatasource(String mOfDatasource) {
        this.mOfDatasource = mOfDatasource == null ? null : mOfDatasource.trim();
    }

    public String getmOfProject() {
        return mOfProject;
    }

    public void setmOfProject(String mOfProject) {
        this.mOfProject = mOfProject == null ? null : mOfProject.trim();
    }
}