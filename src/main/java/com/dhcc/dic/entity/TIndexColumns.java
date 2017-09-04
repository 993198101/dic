package com.dhcc.dic.entity;

public class TIndexColumns extends TIndexColumnsKey {
    private String sort;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }
    
    
}