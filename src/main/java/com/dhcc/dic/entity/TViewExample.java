package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TViewExample() {
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

        public Criteria andVIdIsNull() {
            addCriterion("V_ID is null");
            return (Criteria) this;
        }

        public Criteria andVIdIsNotNull() {
            addCriterion("V_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVIdEqualTo(String value) {
            addCriterion("V_ID =", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotEqualTo(String value) {
            addCriterion("V_ID <>", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThan(String value) {
            addCriterion("V_ID >", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThanOrEqualTo(String value) {
            addCriterion("V_ID >=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThan(String value) {
            addCriterion("V_ID <", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThanOrEqualTo(String value) {
            addCriterion("V_ID <=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLike(String value) {
            addCriterion("V_ID like", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotLike(String value) {
            addCriterion("V_ID not like", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdIn(List<String> values) {
            addCriterion("V_ID in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotIn(List<String> values) {
            addCriterion("V_ID not in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdBetween(String value1, String value2) {
            addCriterion("V_ID between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotBetween(String value1, String value2) {
            addCriterion("V_ID not between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVNameIsNull() {
            addCriterion("V_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVNameIsNotNull() {
            addCriterion("V_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVNameEqualTo(String value) {
            addCriterion("V_NAME =", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotEqualTo(String value) {
            addCriterion("V_NAME <>", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThan(String value) {
            addCriterion("V_NAME >", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThanOrEqualTo(String value) {
            addCriterion("V_NAME >=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThan(String value) {
            addCriterion("V_NAME <", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThanOrEqualTo(String value) {
            addCriterion("V_NAME <=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLike(String value) {
            addCriterion("V_NAME like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotLike(String value) {
            addCriterion("V_NAME not like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameIn(List<String> values) {
            addCriterion("V_NAME in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotIn(List<String> values) {
            addCriterion("V_NAME not in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameBetween(String value1, String value2) {
            addCriterion("V_NAME between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotBetween(String value1, String value2) {
            addCriterion("V_NAME not between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVSqlIsNull() {
            addCriterion("V_SQL is null");
            return (Criteria) this;
        }

        public Criteria andVSqlIsNotNull() {
            addCriterion("V_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andVSqlEqualTo(String value) {
            addCriterion("V_SQL =", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlNotEqualTo(String value) {
            addCriterion("V_SQL <>", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlGreaterThan(String value) {
            addCriterion("V_SQL >", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlGreaterThanOrEqualTo(String value) {
            addCriterion("V_SQL >=", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlLessThan(String value) {
            addCriterion("V_SQL <", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlLessThanOrEqualTo(String value) {
            addCriterion("V_SQL <=", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlLike(String value) {
            addCriterion("V_SQL like", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlNotLike(String value) {
            addCriterion("V_SQL not like", value, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlIn(List<String> values) {
            addCriterion("V_SQL in", values, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlNotIn(List<String> values) {
            addCriterion("V_SQL not in", values, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlBetween(String value1, String value2) {
            addCriterion("V_SQL between", value1, value2, "vSql");
            return (Criteria) this;
        }

        public Criteria andVSqlNotBetween(String value1, String value2) {
            addCriterion("V_SQL not between", value1, value2, "vSql");
            return (Criteria) this;
        }

        public Criteria andVCnNameIsNull() {
            addCriterion("V_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVCnNameIsNotNull() {
            addCriterion("V_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVCnNameEqualTo(String value) {
            addCriterion("V_CN_NAME =", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameNotEqualTo(String value) {
            addCriterion("V_CN_NAME <>", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameGreaterThan(String value) {
            addCriterion("V_CN_NAME >", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("V_CN_NAME >=", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameLessThan(String value) {
            addCriterion("V_CN_NAME <", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameLessThanOrEqualTo(String value) {
            addCriterion("V_CN_NAME <=", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameLike(String value) {
            addCriterion("V_CN_NAME like", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameNotLike(String value) {
            addCriterion("V_CN_NAME not like", value, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameIn(List<String> values) {
            addCriterion("V_CN_NAME in", values, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameNotIn(List<String> values) {
            addCriterion("V_CN_NAME not in", values, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameBetween(String value1, String value2) {
            addCriterion("V_CN_NAME between", value1, value2, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVCnNameNotBetween(String value1, String value2) {
            addCriterion("V_CN_NAME not between", value1, value2, "vCnName");
            return (Criteria) this;
        }

        public Criteria andVDescIsNull() {
            addCriterion("V_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVDescIsNotNull() {
            addCriterion("V_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVDescEqualTo(String value) {
            addCriterion("V_DESC =", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescNotEqualTo(String value) {
            addCriterion("V_DESC <>", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescGreaterThan(String value) {
            addCriterion("V_DESC >", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescGreaterThanOrEqualTo(String value) {
            addCriterion("V_DESC >=", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescLessThan(String value) {
            addCriterion("V_DESC <", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescLessThanOrEqualTo(String value) {
            addCriterion("V_DESC <=", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescLike(String value) {
            addCriterion("V_DESC like", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescNotLike(String value) {
            addCriterion("V_DESC not like", value, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescIn(List<String> values) {
            addCriterion("V_DESC in", values, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescNotIn(List<String> values) {
            addCriterion("V_DESC not in", values, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescBetween(String value1, String value2) {
            addCriterion("V_DESC between", value1, value2, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDescNotBetween(String value1, String value2) {
            addCriterion("V_DESC not between", value1, value2, "vDesc");
            return (Criteria) this;
        }

        public Criteria andVDateIsNull() {
            addCriterion("V_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVDateIsNotNull() {
            addCriterion("V_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVDateEqualTo(String value) {
            addCriterion("V_DATE =", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateNotEqualTo(String value) {
            addCriterion("V_DATE <>", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateGreaterThan(String value) {
            addCriterion("V_DATE >", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateGreaterThanOrEqualTo(String value) {
            addCriterion("V_DATE >=", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateLessThan(String value) {
            addCriterion("V_DATE <", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateLessThanOrEqualTo(String value) {
            addCriterion("V_DATE <=", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateLike(String value) {
            addCriterion("V_DATE like", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateNotLike(String value) {
            addCriterion("V_DATE not like", value, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateIn(List<String> values) {
            addCriterion("V_DATE in", values, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateNotIn(List<String> values) {
            addCriterion("V_DATE not in", values, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateBetween(String value1, String value2) {
            addCriterion("V_DATE between", value1, value2, "vDate");
            return (Criteria) this;
        }

        public Criteria andVDateNotBetween(String value1, String value2) {
            addCriterion("V_DATE not between", value1, value2, "vDate");
            return (Criteria) this;
        }

        public Criteria andVSyncStateIsNull() {
            addCriterion("V_SYNC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andVSyncStateIsNotNull() {
            addCriterion("V_SYNC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andVSyncStateEqualTo(String value) {
            addCriterion("V_SYNC_STATE =", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateNotEqualTo(String value) {
            addCriterion("V_SYNC_STATE <>", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateGreaterThan(String value) {
            addCriterion("V_SYNC_STATE >", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateGreaterThanOrEqualTo(String value) {
            addCriterion("V_SYNC_STATE >=", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateLessThan(String value) {
            addCriterion("V_SYNC_STATE <", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateLessThanOrEqualTo(String value) {
            addCriterion("V_SYNC_STATE <=", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateLike(String value) {
            addCriterion("V_SYNC_STATE like", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateNotLike(String value) {
            addCriterion("V_SYNC_STATE not like", value, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateIn(List<String> values) {
            addCriterion("V_SYNC_STATE in", values, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateNotIn(List<String> values) {
            addCriterion("V_SYNC_STATE not in", values, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateBetween(String value1, String value2) {
            addCriterion("V_SYNC_STATE between", value1, value2, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVSyncStateNotBetween(String value1, String value2) {
            addCriterion("V_SYNC_STATE not between", value1, value2, "vSyncState");
            return (Criteria) this;
        }

        public Criteria andVOfModuleIsNull() {
            addCriterion("V_OF_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andVOfModuleIsNotNull() {
            addCriterion("V_OF_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andVOfModuleEqualTo(String value) {
            addCriterion("V_OF_MODULE =", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleNotEqualTo(String value) {
            addCriterion("V_OF_MODULE <>", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleGreaterThan(String value) {
            addCriterion("V_OF_MODULE >", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleGreaterThanOrEqualTo(String value) {
            addCriterion("V_OF_MODULE >=", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleLessThan(String value) {
            addCriterion("V_OF_MODULE <", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleLessThanOrEqualTo(String value) {
            addCriterion("V_OF_MODULE <=", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleLike(String value) {
            addCriterion("V_OF_MODULE like", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleNotLike(String value) {
            addCriterion("V_OF_MODULE not like", value, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleIn(List<String> values) {
            addCriterion("V_OF_MODULE in", values, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleNotIn(List<String> values) {
            addCriterion("V_OF_MODULE not in", values, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleBetween(String value1, String value2) {
            addCriterion("V_OF_MODULE between", value1, value2, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfModuleNotBetween(String value1, String value2) {
            addCriterion("V_OF_MODULE not between", value1, value2, "vOfModule");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceIsNull() {
            addCriterion("V_OF_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceIsNotNull() {
            addCriterion("V_OF_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceEqualTo(String value) {
            addCriterion("V_OF_DATASOURCE =", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceNotEqualTo(String value) {
            addCriterion("V_OF_DATASOURCE <>", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceGreaterThan(String value) {
            addCriterion("V_OF_DATASOURCE >", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("V_OF_DATASOURCE >=", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceLessThan(String value) {
            addCriterion("V_OF_DATASOURCE <", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceLessThanOrEqualTo(String value) {
            addCriterion("V_OF_DATASOURCE <=", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceLike(String value) {
            addCriterion("V_OF_DATASOURCE like", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceNotLike(String value) {
            addCriterion("V_OF_DATASOURCE not like", value, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceIn(List<String> values) {
            addCriterion("V_OF_DATASOURCE in", values, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceNotIn(List<String> values) {
            addCriterion("V_OF_DATASOURCE not in", values, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceBetween(String value1, String value2) {
            addCriterion("V_OF_DATASOURCE between", value1, value2, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfDatasourceNotBetween(String value1, String value2) {
            addCriterion("V_OF_DATASOURCE not between", value1, value2, "vOfDatasource");
            return (Criteria) this;
        }

        public Criteria andVOfProjectIsNull() {
            addCriterion("V_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andVOfProjectIsNotNull() {
            addCriterion("V_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andVOfProjectEqualTo(String value) {
            addCriterion("V_OF_PROJECT =", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectNotEqualTo(String value) {
            addCriterion("V_OF_PROJECT <>", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectGreaterThan(String value) {
            addCriterion("V_OF_PROJECT >", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("V_OF_PROJECT >=", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectLessThan(String value) {
            addCriterion("V_OF_PROJECT <", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectLessThanOrEqualTo(String value) {
            addCriterion("V_OF_PROJECT <=", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectLike(String value) {
            addCriterion("V_OF_PROJECT like", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectNotLike(String value) {
            addCriterion("V_OF_PROJECT not like", value, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectIn(List<String> values) {
            addCriterion("V_OF_PROJECT in", values, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectNotIn(List<String> values) {
            addCriterion("V_OF_PROJECT not in", values, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectBetween(String value1, String value2) {
            addCriterion("V_OF_PROJECT between", value1, value2, "vOfProject");
            return (Criteria) this;
        }

        public Criteria andVOfProjectNotBetween(String value1, String value2) {
            addCriterion("V_OF_PROJECT not between", value1, value2, "vOfProject");
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