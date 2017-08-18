package com.dhcc.dic.entity;

public class TIndexColumnsKey {
    private String indexId;

    private String columnId;

    
    /**
     * 
     * @param indexId
     * @param columnId
     */
	public TIndexColumnsKey(String indexId, String columnId) {
		super();
		this.indexId = indexId;
		this.columnId = columnId;
	}

	public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId == null ? null : indexId.trim();
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId == null ? null : columnId.trim();
    }
}