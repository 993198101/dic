package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTableExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("T_ID like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("T_ID not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("T_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("T_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("T_NAME =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("T_NAME <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("T_NAME >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_NAME >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("T_NAME <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("T_NAME <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("T_NAME like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("T_NAME not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("T_NAME in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("T_NAME not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("T_NAME between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("T_NAME not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTCnNameIsNull() {
            addCriterion("T_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTCnNameIsNotNull() {
            addCriterion("T_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTCnNameEqualTo(String value) {
            addCriterion("T_CN_NAME =", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotEqualTo(String value) {
            addCriterion("T_CN_NAME <>", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameGreaterThan(String value) {
            addCriterion("T_CN_NAME >", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_CN_NAME >=", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameLessThan(String value) {
            addCriterion("T_CN_NAME <", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameLessThanOrEqualTo(String value) {
            addCriterion("T_CN_NAME <=", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameLike(String value) {
            addCriterion("T_CN_NAME like", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotLike(String value) {
            addCriterion("T_CN_NAME not like", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameIn(List<String> values) {
            addCriterion("T_CN_NAME in", values, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotIn(List<String> values) {
            addCriterion("T_CN_NAME not in", values, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameBetween(String value1, String value2) {
            addCriterion("T_CN_NAME between", value1, value2, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotBetween(String value1, String value2) {
            addCriterion("T_CN_NAME not between", value1, value2, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseIsNull() {
            addCriterion("T_IS_ON_USE is null");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseIsNotNull() {
            addCriterion("T_IS_ON_USE is not null");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseEqualTo(String value) {
            addCriterion("T_IS_ON_USE =", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseNotEqualTo(String value) {
            addCriterion("T_IS_ON_USE <>", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseGreaterThan(String value) {
            addCriterion("T_IS_ON_USE >", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseGreaterThanOrEqualTo(String value) {
            addCriterion("T_IS_ON_USE >=", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseLessThan(String value) {
            addCriterion("T_IS_ON_USE <", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseLessThanOrEqualTo(String value) {
            addCriterion("T_IS_ON_USE <=", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseLike(String value) {
            addCriterion("T_IS_ON_USE like", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseNotLike(String value) {
            addCriterion("T_IS_ON_USE not like", value, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseIn(List<String> values) {
            addCriterion("T_IS_ON_USE in", values, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseNotIn(List<String> values) {
            addCriterion("T_IS_ON_USE not in", values, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseBetween(String value1, String value2) {
            addCriterion("T_IS_ON_USE between", value1, value2, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTIsOnUseNotBetween(String value1, String value2) {
            addCriterion("T_IS_ON_USE not between", value1, value2, "tIsOnUse");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceIsNull() {
            addCriterion("T_OF_TABLESPACE is null");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceIsNotNull() {
            addCriterion("T_OF_TABLESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceEqualTo(String value) {
            addCriterion("T_OF_TABLESPACE =", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceNotEqualTo(String value) {
            addCriterion("T_OF_TABLESPACE <>", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceGreaterThan(String value) {
            addCriterion("T_OF_TABLESPACE >", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceGreaterThanOrEqualTo(String value) {
            addCriterion("T_OF_TABLESPACE >=", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceLessThan(String value) {
            addCriterion("T_OF_TABLESPACE <", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceLessThanOrEqualTo(String value) {
            addCriterion("T_OF_TABLESPACE <=", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceLike(String value) {
            addCriterion("T_OF_TABLESPACE like", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceNotLike(String value) {
            addCriterion("T_OF_TABLESPACE not like", value, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceIn(List<String> values) {
            addCriterion("T_OF_TABLESPACE in", values, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceNotIn(List<String> values) {
            addCriterion("T_OF_TABLESPACE not in", values, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceBetween(String value1, String value2) {
            addCriterion("T_OF_TABLESPACE between", value1, value2, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTOfTablespaceNotBetween(String value1, String value2) {
            addCriterion("T_OF_TABLESPACE not between", value1, value2, "tOfTablespace");
            return (Criteria) this;
        }

        public Criteria andTDescIsNull() {
            addCriterion("T_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTDescIsNotNull() {
            addCriterion("T_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTDescEqualTo(String value) {
            addCriterion("T_DESC =", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotEqualTo(String value) {
            addCriterion("T_DESC <>", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescGreaterThan(String value) {
            addCriterion("T_DESC >", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescGreaterThanOrEqualTo(String value) {
            addCriterion("T_DESC >=", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescLessThan(String value) {
            addCriterion("T_DESC <", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescLessThanOrEqualTo(String value) {
            addCriterion("T_DESC <=", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescLike(String value) {
            addCriterion("T_DESC like", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotLike(String value) {
            addCriterion("T_DESC not like", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescIn(List<String> values) {
            addCriterion("T_DESC in", values, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotIn(List<String> values) {
            addCriterion("T_DESC not in", values, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescBetween(String value1, String value2) {
            addCriterion("T_DESC between", value1, value2, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotBetween(String value1, String value2) {
            addCriterion("T_DESC not between", value1, value2, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTSyncIsNull() {
            addCriterion("T_SYNC is null");
            return (Criteria) this;
        }

        public Criteria andTSyncIsNotNull() {
            addCriterion("T_SYNC is not null");
            return (Criteria) this;
        }

        public Criteria andTSyncEqualTo(String value) {
            addCriterion("T_SYNC =", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncNotEqualTo(String value) {
            addCriterion("T_SYNC <>", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncGreaterThan(String value) {
            addCriterion("T_SYNC >", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncGreaterThanOrEqualTo(String value) {
            addCriterion("T_SYNC >=", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncLessThan(String value) {
            addCriterion("T_SYNC <", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncLessThanOrEqualTo(String value) {
            addCriterion("T_SYNC <=", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncLike(String value) {
            addCriterion("T_SYNC like", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncNotLike(String value) {
            addCriterion("T_SYNC not like", value, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncIn(List<String> values) {
            addCriterion("T_SYNC in", values, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncNotIn(List<String> values) {
            addCriterion("T_SYNC not in", values, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncBetween(String value1, String value2) {
            addCriterion("T_SYNC between", value1, value2, "tSync");
            return (Criteria) this;
        }

        public Criteria andTSyncNotBetween(String value1, String value2) {
            addCriterion("T_SYNC not between", value1, value2, "tSync");
            return (Criteria) this;
        }

        public Criteria andTDateIsNull() {
            addCriterion("T_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTDateIsNotNull() {
            addCriterion("T_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTDateEqualTo(String value) {
            addCriterion("T_DATE =", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotEqualTo(String value) {
            addCriterion("T_DATE <>", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateGreaterThan(String value) {
            addCriterion("T_DATE >", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateGreaterThanOrEqualTo(String value) {
            addCriterion("T_DATE >=", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateLessThan(String value) {
            addCriterion("T_DATE <", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateLessThanOrEqualTo(String value) {
            addCriterion("T_DATE <=", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateLike(String value) {
            addCriterion("T_DATE like", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotLike(String value) {
            addCriterion("T_DATE not like", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateIn(List<String> values) {
            addCriterion("T_DATE in", values, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotIn(List<String> values) {
            addCriterion("T_DATE not in", values, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateBetween(String value1, String value2) {
            addCriterion("T_DATE between", value1, value2, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotBetween(String value1, String value2) {
            addCriterion("T_DATE not between", value1, value2, "tDate");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceIsNull() {
            addCriterion("T_OF_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceIsNotNull() {
            addCriterion("T_OF_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE =", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE <>", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceGreaterThan(String value) {
            addCriterion("T_OF_DATASOURCE >", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE >=", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceLessThan(String value) {
            addCriterion("T_OF_DATASOURCE <", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceLessThanOrEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE <=", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceLike(String value) {
            addCriterion("T_OF_DATASOURCE like", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotLike(String value) {
            addCriterion("T_OF_DATASOURCE not like", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceIn(List<String> values) {
            addCriterion("T_OF_DATASOURCE in", values, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotIn(List<String> values) {
            addCriterion("T_OF_DATASOURCE not in", values, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceBetween(String value1, String value2) {
            addCriterion("T_OF_DATASOURCE between", value1, value2, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotBetween(String value1, String value2) {
            addCriterion("T_OF_DATASOURCE not between", value1, value2, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfProjectIsNull() {
            addCriterion("T_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andTOfProjectIsNotNull() {
            addCriterion("T_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andTOfProjectEqualTo(String value) {
            addCriterion("T_OF_PROJECT =", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotEqualTo(String value) {
            addCriterion("T_OF_PROJECT <>", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectGreaterThan(String value) {
            addCriterion("T_OF_PROJECT >", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("T_OF_PROJECT >=", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectLessThan(String value) {
            addCriterion("T_OF_PROJECT <", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectLessThanOrEqualTo(String value) {
            addCriterion("T_OF_PROJECT <=", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectLike(String value) {
            addCriterion("T_OF_PROJECT like", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotLike(String value) {
            addCriterion("T_OF_PROJECT not like", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectIn(List<String> values) {
            addCriterion("T_OF_PROJECT in", values, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotIn(List<String> values) {
            addCriterion("T_OF_PROJECT not in", values, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectBetween(String value1, String value2) {
            addCriterion("T_OF_PROJECT between", value1, value2, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotBetween(String value1, String value2) {
            addCriterion("T_OF_PROJECT not between", value1, value2, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfModuleIsNull() {
            addCriterion("T_OF_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andTOfModuleIsNotNull() {
            addCriterion("T_OF_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andTOfModuleEqualTo(String value) {
            addCriterion("T_OF_MODULE =", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleNotEqualTo(String value) {
            addCriterion("T_OF_MODULE <>", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleGreaterThan(String value) {
            addCriterion("T_OF_MODULE >", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleGreaterThanOrEqualTo(String value) {
            addCriterion("T_OF_MODULE >=", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleLessThan(String value) {
            addCriterion("T_OF_MODULE <", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleLessThanOrEqualTo(String value) {
            addCriterion("T_OF_MODULE <=", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleLike(String value) {
            addCriterion("T_OF_MODULE like", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleNotLike(String value) {
            addCriterion("T_OF_MODULE not like", value, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleIn(List<String> values) {
            addCriterion("T_OF_MODULE in", values, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleNotIn(List<String> values) {
            addCriterion("T_OF_MODULE not in", values, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleBetween(String value1, String value2) {
            addCriterion("T_OF_MODULE between", value1, value2, "tOfModule");
            return (Criteria) this;
        }

        public Criteria andTOfModuleNotBetween(String value1, String value2) {
            addCriterion("T_OF_MODULE not between", value1, value2, "tOfModule");
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