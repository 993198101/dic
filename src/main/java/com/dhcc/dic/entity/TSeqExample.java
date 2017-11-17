package com.dhcc.dic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSeqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSeqExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("S_ID =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("S_ID <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("S_ID >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("S_ID >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("S_ID <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("S_ID <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("S_ID like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("S_ID not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("S_ID in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("S_ID not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("S_ID between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("S_ID not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_NAME =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_NAME <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_NAME >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_NAME >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_NAME <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_NAME <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_NAME like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_NAME not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_NAME in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_NAME not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_NAME between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_NAME not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSCnNameIsNull() {
            addCriterion("S_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSCnNameIsNotNull() {
            addCriterion("S_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSCnNameEqualTo(String value) {
            addCriterion("S_CN_NAME =", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameNotEqualTo(String value) {
            addCriterion("S_CN_NAME <>", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameGreaterThan(String value) {
            addCriterion("S_CN_NAME >", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_CN_NAME >=", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameLessThan(String value) {
            addCriterion("S_CN_NAME <", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameLessThanOrEqualTo(String value) {
            addCriterion("S_CN_NAME <=", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameLike(String value) {
            addCriterion("S_CN_NAME like", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameNotLike(String value) {
            addCriterion("S_CN_NAME not like", value, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameIn(List<String> values) {
            addCriterion("S_CN_NAME in", values, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameNotIn(List<String> values) {
            addCriterion("S_CN_NAME not in", values, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameBetween(String value1, String value2) {
            addCriterion("S_CN_NAME between", value1, value2, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSCnNameNotBetween(String value1, String value2) {
            addCriterion("S_CN_NAME not between", value1, value2, "sCnName");
            return (Criteria) this;
        }

        public Criteria andSDescIsNull() {
            addCriterion("S_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSDescIsNotNull() {
            addCriterion("S_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSDescEqualTo(String value) {
            addCriterion("S_DESC =", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotEqualTo(String value) {
            addCriterion("S_DESC <>", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThan(String value) {
            addCriterion("S_DESC >", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThanOrEqualTo(String value) {
            addCriterion("S_DESC >=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThan(String value) {
            addCriterion("S_DESC <", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThanOrEqualTo(String value) {
            addCriterion("S_DESC <=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLike(String value) {
            addCriterion("S_DESC like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotLike(String value) {
            addCriterion("S_DESC not like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescIn(List<String> values) {
            addCriterion("S_DESC in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotIn(List<String> values) {
            addCriterion("S_DESC not in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescBetween(String value1, String value2) {
            addCriterion("S_DESC between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotBetween(String value1, String value2) {
            addCriterion("S_DESC not between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeIsNull() {
            addCriterion("S_INCREASE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeIsNotNull() {
            addCriterion("S_INCREASE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeEqualTo(BigDecimal value) {
            addCriterion("S_INCREASE_SIZE =", value, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeNotEqualTo(BigDecimal value) {
            addCriterion("S_INCREASE_SIZE <>", value, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeGreaterThan(BigDecimal value) {
            addCriterion("S_INCREASE_SIZE >", value, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_INCREASE_SIZE >=", value, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeLessThan(BigDecimal value) {
            addCriterion("S_INCREASE_SIZE <", value, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_INCREASE_SIZE <=", value, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeIn(List<BigDecimal> values) {
            addCriterion("S_INCREASE_SIZE in", values, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeNotIn(List<BigDecimal> values) {
            addCriterion("S_INCREASE_SIZE not in", values, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_INCREASE_SIZE between", value1, value2, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSIncreaseSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_INCREASE_SIZE not between", value1, value2, "sIncreaseSize");
            return (Criteria) this;
        }

        public Criteria andSStartIsNull() {
            addCriterion("S_START is null");
            return (Criteria) this;
        }

        public Criteria andSStartIsNotNull() {
            addCriterion("S_START is not null");
            return (Criteria) this;
        }

        public Criteria andSStartEqualTo(BigDecimal value) {
            addCriterion("S_START =", value, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartNotEqualTo(BigDecimal value) {
            addCriterion("S_START <>", value, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartGreaterThan(BigDecimal value) {
            addCriterion("S_START >", value, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_START >=", value, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartLessThan(BigDecimal value) {
            addCriterion("S_START <", value, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_START <=", value, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartIn(List<BigDecimal> values) {
            addCriterion("S_START in", values, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartNotIn(List<BigDecimal> values) {
            addCriterion("S_START not in", values, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_START between", value1, value2, "sStart");
            return (Criteria) this;
        }

        public Criteria andSStartNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_START not between", value1, value2, "sStart");
            return (Criteria) this;
        }

        public Criteria andSHasMaxIsNull() {
            addCriterion("S_HAS_MAX is null");
            return (Criteria) this;
        }

        public Criteria andSHasMaxIsNotNull() {
            addCriterion("S_HAS_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andSHasMaxEqualTo(String value) {
            addCriterion("S_HAS_MAX =", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxNotEqualTo(String value) {
            addCriterion("S_HAS_MAX <>", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxGreaterThan(String value) {
            addCriterion("S_HAS_MAX >", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxGreaterThanOrEqualTo(String value) {
            addCriterion("S_HAS_MAX >=", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxLessThan(String value) {
            addCriterion("S_HAS_MAX <", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxLessThanOrEqualTo(String value) {
            addCriterion("S_HAS_MAX <=", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxLike(String value) {
            addCriterion("S_HAS_MAX like", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxNotLike(String value) {
            addCriterion("S_HAS_MAX not like", value, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxIn(List<String> values) {
            addCriterion("S_HAS_MAX in", values, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxNotIn(List<String> values) {
            addCriterion("S_HAS_MAX not in", values, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxBetween(String value1, String value2) {
            addCriterion("S_HAS_MAX between", value1, value2, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSHasMaxNotBetween(String value1, String value2) {
            addCriterion("S_HAS_MAX not between", value1, value2, "sHasMax");
            return (Criteria) this;
        }

        public Criteria andSMaxValueIsNull() {
            addCriterion("S_MAX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSMaxValueIsNotNull() {
            addCriterion("S_MAX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSMaxValueEqualTo(BigDecimal value) {
            addCriterion("S_MAX_VALUE =", value, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueNotEqualTo(BigDecimal value) {
            addCriterion("S_MAX_VALUE <>", value, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueGreaterThan(BigDecimal value) {
            addCriterion("S_MAX_VALUE >", value, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_MAX_VALUE >=", value, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueLessThan(BigDecimal value) {
            addCriterion("S_MAX_VALUE <", value, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_MAX_VALUE <=", value, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueIn(List<BigDecimal> values) {
            addCriterion("S_MAX_VALUE in", values, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueNotIn(List<BigDecimal> values) {
            addCriterion("S_MAX_VALUE not in", values, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_MAX_VALUE between", value1, value2, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSMaxValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_MAX_VALUE not between", value1, value2, "sMaxValue");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberIsNull() {
            addCriterion("S_CACHE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberIsNotNull() {
            addCriterion("S_CACHE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberEqualTo(BigDecimal value) {
            addCriterion("S_CACHE_NUMBER =", value, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberNotEqualTo(BigDecimal value) {
            addCriterion("S_CACHE_NUMBER <>", value, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberGreaterThan(BigDecimal value) {
            addCriterion("S_CACHE_NUMBER >", value, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_CACHE_NUMBER >=", value, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberLessThan(BigDecimal value) {
            addCriterion("S_CACHE_NUMBER <", value, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_CACHE_NUMBER <=", value, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberIn(List<BigDecimal> values) {
            addCriterion("S_CACHE_NUMBER in", values, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberNotIn(List<BigDecimal> values) {
            addCriterion("S_CACHE_NUMBER not in", values, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_CACHE_NUMBER between", value1, value2, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSCacheNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_CACHE_NUMBER not between", value1, value2, "sCacheNumber");
            return (Criteria) this;
        }

        public Criteria andSSyncStateIsNull() {
            addCriterion("S_SYNC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSSyncStateIsNotNull() {
            addCriterion("S_SYNC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSSyncStateEqualTo(String value) {
            addCriterion("S_SYNC_STATE =", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateNotEqualTo(String value) {
            addCriterion("S_SYNC_STATE <>", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateGreaterThan(String value) {
            addCriterion("S_SYNC_STATE >", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateGreaterThanOrEqualTo(String value) {
            addCriterion("S_SYNC_STATE >=", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateLessThan(String value) {
            addCriterion("S_SYNC_STATE <", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateLessThanOrEqualTo(String value) {
            addCriterion("S_SYNC_STATE <=", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateLike(String value) {
            addCriterion("S_SYNC_STATE like", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateNotLike(String value) {
            addCriterion("S_SYNC_STATE not like", value, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateIn(List<String> values) {
            addCriterion("S_SYNC_STATE in", values, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateNotIn(List<String> values) {
            addCriterion("S_SYNC_STATE not in", values, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateBetween(String value1, String value2) {
            addCriterion("S_SYNC_STATE between", value1, value2, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSSyncStateNotBetween(String value1, String value2) {
            addCriterion("S_SYNC_STATE not between", value1, value2, "sSyncState");
            return (Criteria) this;
        }

        public Criteria andSDateIsNull() {
            addCriterion("S_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSDateIsNotNull() {
            addCriterion("S_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSDateEqualTo(String value) {
            addCriterion("S_DATE =", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotEqualTo(String value) {
            addCriterion("S_DATE <>", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateGreaterThan(String value) {
            addCriterion("S_DATE >", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateGreaterThanOrEqualTo(String value) {
            addCriterion("S_DATE >=", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateLessThan(String value) {
            addCriterion("S_DATE <", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateLessThanOrEqualTo(String value) {
            addCriterion("S_DATE <=", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateLike(String value) {
            addCriterion("S_DATE like", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotLike(String value) {
            addCriterion("S_DATE not like", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateIn(List<String> values) {
            addCriterion("S_DATE in", values, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotIn(List<String> values) {
            addCriterion("S_DATE not in", values, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateBetween(String value1, String value2) {
            addCriterion("S_DATE between", value1, value2, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotBetween(String value1, String value2) {
            addCriterion("S_DATE not between", value1, value2, "sDate");
            return (Criteria) this;
        }

        public Criteria andSRefTableIsNull() {
            addCriterion("S_REF_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andSRefTableIsNotNull() {
            addCriterion("S_REF_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSRefTableEqualTo(String value) {
            addCriterion("S_REF_TABLE =", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableNotEqualTo(String value) {
            addCriterion("S_REF_TABLE <>", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableGreaterThan(String value) {
            addCriterion("S_REF_TABLE >", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableGreaterThanOrEqualTo(String value) {
            addCriterion("S_REF_TABLE >=", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableLessThan(String value) {
            addCriterion("S_REF_TABLE <", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableLessThanOrEqualTo(String value) {
            addCriterion("S_REF_TABLE <=", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableLike(String value) {
            addCriterion("S_REF_TABLE like", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableNotLike(String value) {
            addCriterion("S_REF_TABLE not like", value, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableIn(List<String> values) {
            addCriterion("S_REF_TABLE in", values, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableNotIn(List<String> values) {
            addCriterion("S_REF_TABLE not in", values, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableBetween(String value1, String value2) {
            addCriterion("S_REF_TABLE between", value1, value2, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefTableNotBetween(String value1, String value2) {
            addCriterion("S_REF_TABLE not between", value1, value2, "sRefTable");
            return (Criteria) this;
        }

        public Criteria andSRefFieldIsNull() {
            addCriterion("S_REF_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andSRefFieldIsNotNull() {
            addCriterion("S_REF_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andSRefFieldEqualTo(String value) {
            addCriterion("S_REF_FIELD =", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldNotEqualTo(String value) {
            addCriterion("S_REF_FIELD <>", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldGreaterThan(String value) {
            addCriterion("S_REF_FIELD >", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldGreaterThanOrEqualTo(String value) {
            addCriterion("S_REF_FIELD >=", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldLessThan(String value) {
            addCriterion("S_REF_FIELD <", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldLessThanOrEqualTo(String value) {
            addCriterion("S_REF_FIELD <=", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldLike(String value) {
            addCriterion("S_REF_FIELD like", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldNotLike(String value) {
            addCriterion("S_REF_FIELD not like", value, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldIn(List<String> values) {
            addCriterion("S_REF_FIELD in", values, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldNotIn(List<String> values) {
            addCriterion("S_REF_FIELD not in", values, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldBetween(String value1, String value2) {
            addCriterion("S_REF_FIELD between", value1, value2, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSRefFieldNotBetween(String value1, String value2) {
            addCriterion("S_REF_FIELD not between", value1, value2, "sRefField");
            return (Criteria) this;
        }

        public Criteria andSOfModuleIsNull() {
            addCriterion("S_OF_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andSOfModuleIsNotNull() {
            addCriterion("S_OF_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andSOfModuleEqualTo(String value) {
            addCriterion("S_OF_MODULE =", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleNotEqualTo(String value) {
            addCriterion("S_OF_MODULE <>", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleGreaterThan(String value) {
            addCriterion("S_OF_MODULE >", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleGreaterThanOrEqualTo(String value) {
            addCriterion("S_OF_MODULE >=", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleLessThan(String value) {
            addCriterion("S_OF_MODULE <", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleLessThanOrEqualTo(String value) {
            addCriterion("S_OF_MODULE <=", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleLike(String value) {
            addCriterion("S_OF_MODULE like", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleNotLike(String value) {
            addCriterion("S_OF_MODULE not like", value, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleIn(List<String> values) {
            addCriterion("S_OF_MODULE in", values, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleNotIn(List<String> values) {
            addCriterion("S_OF_MODULE not in", values, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleBetween(String value1, String value2) {
            addCriterion("S_OF_MODULE between", value1, value2, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfModuleNotBetween(String value1, String value2) {
            addCriterion("S_OF_MODULE not between", value1, value2, "sOfModule");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceIsNull() {
            addCriterion("S_OF_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceIsNotNull() {
            addCriterion("S_OF_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceEqualTo(String value) {
            addCriterion("S_OF_DATASOURCE =", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceNotEqualTo(String value) {
            addCriterion("S_OF_DATASOURCE <>", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceGreaterThan(String value) {
            addCriterion("S_OF_DATASOURCE >", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("S_OF_DATASOURCE >=", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceLessThan(String value) {
            addCriterion("S_OF_DATASOURCE <", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceLessThanOrEqualTo(String value) {
            addCriterion("S_OF_DATASOURCE <=", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceLike(String value) {
            addCriterion("S_OF_DATASOURCE like", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceNotLike(String value) {
            addCriterion("S_OF_DATASOURCE not like", value, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceIn(List<String> values) {
            addCriterion("S_OF_DATASOURCE in", values, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceNotIn(List<String> values) {
            addCriterion("S_OF_DATASOURCE not in", values, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceBetween(String value1, String value2) {
            addCriterion("S_OF_DATASOURCE between", value1, value2, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfDatasourceNotBetween(String value1, String value2) {
            addCriterion("S_OF_DATASOURCE not between", value1, value2, "sOfDatasource");
            return (Criteria) this;
        }

        public Criteria andSOfProjectIsNull() {
            addCriterion("S_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andSOfProjectIsNotNull() {
            addCriterion("S_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSOfProjectEqualTo(String value) {
            addCriterion("S_OF_PROJECT =", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectNotEqualTo(String value) {
            addCriterion("S_OF_PROJECT <>", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectGreaterThan(String value) {
            addCriterion("S_OF_PROJECT >", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("S_OF_PROJECT >=", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectLessThan(String value) {
            addCriterion("S_OF_PROJECT <", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectLessThanOrEqualTo(String value) {
            addCriterion("S_OF_PROJECT <=", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectLike(String value) {
            addCriterion("S_OF_PROJECT like", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectNotLike(String value) {
            addCriterion("S_OF_PROJECT not like", value, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectIn(List<String> values) {
            addCriterion("S_OF_PROJECT in", values, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectNotIn(List<String> values) {
            addCriterion("S_OF_PROJECT not in", values, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectBetween(String value1, String value2) {
            addCriterion("S_OF_PROJECT between", value1, value2, "sOfProject");
            return (Criteria) this;
        }

        public Criteria andSOfProjectNotBetween(String value1, String value2) {
            addCriterion("S_OF_PROJECT not between", value1, value2, "sOfProject");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}