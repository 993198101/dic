package com.dhcc.dic.entity;

import java.util.List;

public class TMenuTree {
    private String mId;

    private String mText;

    private String mParentId;

    private String mDesc;

    private String mDate;

    private String mEnable;

    private String mUrl;

    private String mIcon;

    private String mState;

    private List<TMenuTree> children;
    
    public List<TMenuTree> getChildren() {
		return children;
	}

	public void setChildren(List<TMenuTree> children) {
		this.children = children;
	}

	public TMenuTree() {
		super();
	}

	public TMenuTree(String mId, String mText, String mParentId, String mDesc, String mDate, String mEnable,
			String mUrl, String mIcon, String mState) {
		super();
		this.mId = mId;
		this.mText = mText;
		this.mParentId = mParentId;
		this.mDesc = mDesc;
		this.mDate = mDate;
		this.mEnable = mEnable;
		this.mUrl = mUrl;
		this.mIcon = mIcon;
		this.mState = mState;
	}

	public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText == null ? null : mText.trim();
    }

    public String getmParentId() {
        return mParentId;
    }

    public void setmParentId(String mParentId) {
        this.mParentId = mParentId == null ? null : mParentId.trim();
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc == null ? null : mDesc.trim();
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate == null ? null : mDate.trim();
    }

    public String getmEnable() {
        return mEnable;
    }

    public void setmEnable(String mEnable) {
        this.mEnable = mEnable == null ? null : mEnable.trim();
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl == null ? null : mUrl.trim();
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon == null ? null : mIcon.trim();
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState == null ? null : mState.trim();
    }
}