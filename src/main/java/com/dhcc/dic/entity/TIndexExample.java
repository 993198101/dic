package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIndexExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("I_ID is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("I_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(String value) {
            addCriterion("I_ID =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(String value) {
            addCriterion("I_ID <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(String value) {
            addCriterion("I_ID >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(String value) {
            addCriterion("I_ID >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(String value) {
            addCriterion("I_ID <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(String value) {
            addCriterion("I_ID <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLike(String value) {
            addCriterion("I_ID like", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotLike(String value) {
            addCriterion("I_ID not like", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<String> values) {
            addCriterion("I_ID in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<String> values) {
            addCriterion("I_ID not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(String value1, String value2) {
            addCriterion("I_ID between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(String value1, String value2) {
            addCriterion("I_ID not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIOfTableIsNull() {
            addCriterion("I_OF_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andIOfTableIsNotNull() {
            addCriterion("I_OF_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIOfTableEqualTo(String value) {
            addCriterion("I_OF_TABLE =", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableNotEqualTo(String value) {
            addCriterion("I_OF_TABLE <>", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableGreaterThan(String value) {
            addCriterion("I_OF_TABLE >", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableGreaterThanOrEqualTo(String value) {
            addCriterion("I_OF_TABLE >=", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableLessThan(String value) {
            addCriterion("I_OF_TABLE <", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableLessThanOrEqualTo(String value) {
            addCriterion("I_OF_TABLE <=", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableLike(String value) {
            addCriterion("I_OF_TABLE like", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableNotLike(String value) {
            addCriterion("I_OF_TABLE not like", value, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableIn(List<String> values) {
            addCriterion("I_OF_TABLE in", values, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableNotIn(List<String> values) {
            addCriterion("I_OF_TABLE not in", values, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableBetween(String value1, String value2) {
            addCriterion("I_OF_TABLE between", value1, value2, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andIOfTableNotBetween(String value1, String value2) {
            addCriterion("I_OF_TABLE not between", value1, value2, "iOfTable");
            return (Criteria) this;
        }

        public Criteria andINameIsNull() {
            addCriterion("I_NAME is null");
            return (Criteria) this;
        }

        public Criteria andINameIsNotNull() {
            addCriterion("I_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andINameEqualTo(String value) {
            addCriterion("I_NAME =", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotEqualTo(String value) {
            addCriterion("I_NAME <>", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThan(String value) {
            addCriterion("I_NAME >", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThanOrEqualTo(String value) {
            addCriterion("I_NAME >=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThan(String value) {
            addCriterion("I_NAME <", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThanOrEqualTo(String value) {
            addCriterion("I_NAME <=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLike(String value) {
            addCriterion("I_NAME like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotLike(String value) {
            addCriterion("I_NAME not like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameIn(List<String> values) {
            addCriterion("I_NAME in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotIn(List<String> values) {
            addCriterion("I_NAME not in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameBetween(String value1, String value2) {
            addCriterion("I_NAME between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotBetween(String value1, String value2) {
            addCriterion("I_NAME not between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andICnNameIsNull() {
            addCriterion("I_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andICnNameIsNotNull() {
            addCriterion("I_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andICnNameEqualTo(String value) {
            addCriterion("I_CN_NAME =", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameNotEqualTo(String value) {
            addCriterion("I_CN_NAME <>", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameGreaterThan(String value) {
            addCriterion("I_CN_NAME >", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameGreaterThanOrEqualTo(String value) {
            addCriterion("I_CN_NAME >=", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameLessThan(String value) {
            addCriterion("I_CN_NAME <", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameLessThanOrEqualTo(String value) {
            addCriterion("I_CN_NAME <=", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameLike(String value) {
            addCriterion("I_CN_NAME like", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameNotLike(String value) {
            addCriterion("I_CN_NAME not like", value, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameIn(List<String> values) {
            addCriterion("I_CN_NAME in", values, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameNotIn(List<String> values) {
            addCriterion("I_CN_NAME not in", values, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameBetween(String value1, String value2) {
            addCriterion("I_CN_NAME between", value1, value2, "iCnName");
            return (Criteria) this;
        }

        public Criteria andICnNameNotBetween(String value1, String value2) {
            addCriterion("I_CN_NAME not between", value1, value2, "iCnName");
            return (Criteria) this;
        }

        public Criteria andIDescIsNull() {
            addCriterion("I_DESC is null");
            return (Criteria) this;
        }

        public Criteria andIDescIsNotNull() {
            addCriterion("I_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andIDescEqualTo(String value) {
            addCriterion("I_DESC =", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescNotEqualTo(String value) {
            addCriterion("I_DESC <>", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescGreaterThan(String value) {
            addCriterion("I_DESC >", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescGreaterThanOrEqualTo(String value) {
            addCriterion("I_DESC >=", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescLessThan(String value) {
            addCriterion("I_DESC <", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescLessThanOrEqualTo(String value) {
            addCriterion("I_DESC <=", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescLike(String value) {
            addCriterion("I_DESC like", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescNotLike(String value) {
            addCriterion("I_DESC not like", value, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescIn(List<String> values) {
            addCriterion("I_DESC in", values, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescNotIn(List<String> values) {
            addCriterion("I_DESC not in", values, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescBetween(String value1, String value2) {
            addCriterion("I_DESC between", value1, value2, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDescNotBetween(String value1, String value2) {
            addCriterion("I_DESC not between", value1, value2, "iDesc");
            return (Criteria) this;
        }

        public Criteria andIDateIsNull() {
            addCriterion("I_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIDateIsNotNull() {
            addCriterion("I_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIDateEqualTo(String value) {
            addCriterion("I_DATE =", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotEqualTo(String value) {
            addCriterion("I_DATE <>", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateGreaterThan(String value) {
            addCriterion("I_DATE >", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateGreaterThanOrEqualTo(String value) {
            addCriterion("I_DATE >=", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateLessThan(String value) {
            addCriterion("I_DATE <", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateLessThanOrEqualTo(String value) {
            addCriterion("I_DATE <=", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateLike(String value) {
            addCriterion("I_DATE like", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotLike(String value) {
            addCriterion("I_DATE not like", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateIn(List<String> values) {
            addCriterion("I_DATE in", values, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotIn(List<String> values) {
            addCriterion("I_DATE not in", values, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateBetween(String value1, String value2) {
            addCriterion("I_DATE between", value1, value2, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotBetween(String value1, String value2) {
            addCriterion("I_DATE not between", value1, value2, "iDate");
            return (Criteria) this;
        }

        public Criteria andITypeIsNull() {
            addCriterion("I_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andITypeIsNotNull() {
            addCriterion("I_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andITypeEqualTo(String value) {
            addCriterion("I_TYPE =", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotEqualTo(String value) {
            addCriterion("I_TYPE <>", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeGreaterThan(String value) {
            addCriterion("I_TYPE >", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeGreaterThanOrEqualTo(String value) {
            addCriterion("I_TYPE >=", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeLessThan(String value) {
            addCriterion("I_TYPE <", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeLessThanOrEqualTo(String value) {
            addCriterion("I_TYPE <=", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeLike(String value) {
            addCriterion("I_TYPE like", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotLike(String value) {
            addCriterion("I_TYPE not like", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeIn(List<String> values) {
            addCriterion("I_TYPE in", values, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotIn(List<String> values) {
            addCriterion("I_TYPE not in", values, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeBetween(String value1, String value2) {
            addCriterion("I_TYPE between", value1, value2, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotBetween(String value1, String value2) {
            addCriterion("I_TYPE not between", value1, value2, "iType");
            return (Criteria) this;
        }

        public Criteria andISyncStateIsNull() {
            addCriterion("I_SYNC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andISyncStateIsNotNull() {
            addCriterion("I_SYNC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andISyncStateEqualTo(String value) {
            addCriterion("I_SYNC_STATE =", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateNotEqualTo(String value) {
            addCriterion("I_SYNC_STATE <>", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateGreaterThan(String value) {
            addCriterion("I_SYNC_STATE >", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateGreaterThanOrEqualTo(String value) {
            addCriterion("I_SYNC_STATE >=", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateLessThan(String value) {
            addCriterion("I_SYNC_STATE <", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateLessThanOrEqualTo(String value) {
            addCriterion("I_SYNC_STATE <=", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateLike(String value) {
            addCriterion("I_SYNC_STATE like", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateNotLike(String value) {
            addCriterion("I_SYNC_STATE not like", value, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateIn(List<String> values) {
            addCriterion("I_SYNC_STATE in", values, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateNotIn(List<String> values) {
            addCriterion("I_SYNC_STATE not in", values, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateBetween(String value1, String value2) {
            addCriterion("I_SYNC_STATE between", value1, value2, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andISyncStateNotBetween(String value1, String value2) {
            addCriterion("I_SYNC_STATE not between", value1, value2, "iSyncState");
            return (Criteria) this;
        }

        public Criteria andIOfModuleIsNull() {
            addCriterion("I_OF_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andIOfModuleIsNotNull() {
            addCriterion("I_OF_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andIOfModuleEqualTo(String value) {
            addCriterion("I_OF_MODULE =", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleNotEqualTo(String value) {
            addCriterion("I_OF_MODULE <>", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleGreaterThan(String value) {
            addCriterion("I_OF_MODULE >", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleGreaterThanOrEqualTo(String value) {
            addCriterion("I_OF_MODULE >=", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleLessThan(String value) {
            addCriterion("I_OF_MODULE <", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleLessThanOrEqualTo(String value) {
            addCriterion("I_OF_MODULE <=", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleLike(String value) {
            addCriterion("I_OF_MODULE like", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleNotLike(String value) {
            addCriterion("I_OF_MODULE not like", value, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleIn(List<String> values) {
            addCriterion("I_OF_MODULE in", values, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleNotIn(List<String> values) {
            addCriterion("I_OF_MODULE not in", values, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleBetween(String value1, String value2) {
            addCriterion("I_OF_MODULE between", value1, value2, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfModuleNotBetween(String value1, String value2) {
            addCriterion("I_OF_MODULE not between", value1, value2, "iOfModule");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceIsNull() {
            addCriterion("I_OF_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceIsNotNull() {
            addCriterion("I_OF_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceEqualTo(String value) {
            addCriterion("I_OF_DATASOURCE =", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceNotEqualTo(String value) {
            addCriterion("I_OF_DATASOURCE <>", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceGreaterThan(String value) {
            addCriterion("I_OF_DATASOURCE >", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("I_OF_DATASOURCE >=", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceLessThan(String value) {
            addCriterion("I_OF_DATASOURCE <", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceLessThanOrEqualTo(String value) {
            addCriterion("I_OF_DATASOURCE <=", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceLike(String value) {
            addCriterion("I_OF_DATASOURCE like", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceNotLike(String value) {
            addCriterion("I_OF_DATASOURCE not like", value, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceIn(List<String> values) {
            addCriterion("I_OF_DATASOURCE in", values, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceNotIn(List<String> values) {
            addCriterion("I_OF_DATASOURCE not in", values, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceBetween(String value1, String value2) {
            addCriterion("I_OF_DATASOURCE between", value1, value2, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfDatasourceNotBetween(String value1, String value2) {
            addCriterion("I_OF_DATASOURCE not between", value1, value2, "iOfDatasource");
            return (Criteria) this;
        }

        public Criteria andIOfProjectIsNull() {
            addCriterion("I_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andIOfProjectIsNotNull() {
            addCriterion("I_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andIOfProjectEqualTo(String value) {
            addCriterion("I_OF_PROJECT =", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectNotEqualTo(String value) {
            addCriterion("I_OF_PROJECT <>", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectGreaterThan(String value) {
            addCriterion("I_OF_PROJECT >", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("I_OF_PROJECT >=", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectLessThan(String value) {
            addCriterion("I_OF_PROJECT <", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectLessThanOrEqualTo(String value) {
            addCriterion("I_OF_PROJECT <=", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectLike(String value) {
            addCriterion("I_OF_PROJECT like", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectNotLike(String value) {
            addCriterion("I_OF_PROJECT not like", value, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectIn(List<String> values) {
            addCriterion("I_OF_PROJECT in", values, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectNotIn(List<String> values) {
            addCriterion("I_OF_PROJECT not in", values, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectBetween(String value1, String value2) {
            addCriterion("I_OF_PROJECT between", value1, value2, "iOfProject");
            return (Criteria) this;
        }

        public Criteria andIOfProjectNotBetween(String value1, String value2) {
            addCriterion("I_OF_PROJECT not between", value1, value2, "iOfProject");
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