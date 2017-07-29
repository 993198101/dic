package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("U_ID like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("U_ID not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUCnNameIsNull() {
            addCriterion("U_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUCnNameIsNotNull() {
            addCriterion("U_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUCnNameEqualTo(String value) {
            addCriterion("U_CN_NAME =", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameNotEqualTo(String value) {
            addCriterion("U_CN_NAME <>", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameGreaterThan(String value) {
            addCriterion("U_CN_NAME >", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_CN_NAME >=", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameLessThan(String value) {
            addCriterion("U_CN_NAME <", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameLessThanOrEqualTo(String value) {
            addCriterion("U_CN_NAME <=", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameLike(String value) {
            addCriterion("U_CN_NAME like", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameNotLike(String value) {
            addCriterion("U_CN_NAME not like", value, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameIn(List<String> values) {
            addCriterion("U_CN_NAME in", values, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameNotIn(List<String> values) {
            addCriterion("U_CN_NAME not in", values, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameBetween(String value1, String value2) {
            addCriterion("U_CN_NAME between", value1, value2, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUCnNameNotBetween(String value1, String value2) {
            addCriterion("U_CN_NAME not between", value1, value2, "uCnName");
            return (Criteria) this;
        }

        public Criteria andUUserNameIsNull() {
            addCriterion("U_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUUserNameIsNotNull() {
            addCriterion("U_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUUserNameEqualTo(String value) {
            addCriterion("U_USER_NAME =", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameNotEqualTo(String value) {
            addCriterion("U_USER_NAME <>", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameGreaterThan(String value) {
            addCriterion("U_USER_NAME >", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_USER_NAME >=", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameLessThan(String value) {
            addCriterion("U_USER_NAME <", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameLessThanOrEqualTo(String value) {
            addCriterion("U_USER_NAME <=", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameLike(String value) {
            addCriterion("U_USER_NAME like", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameNotLike(String value) {
            addCriterion("U_USER_NAME not like", value, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameIn(List<String> values) {
            addCriterion("U_USER_NAME in", values, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameNotIn(List<String> values) {
            addCriterion("U_USER_NAME not in", values, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameBetween(String value1, String value2) {
            addCriterion("U_USER_NAME between", value1, value2, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUUserNameNotBetween(String value1, String value2) {
            addCriterion("U_USER_NAME not between", value1, value2, "uUserName");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("U_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("U_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("U_PASSWORD =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("U_PASSWORD <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("U_PASSWORD >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("U_PASSWORD >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("U_PASSWORD <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("U_PASSWORD <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("U_PASSWORD like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("U_PASSWORD not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("U_PASSWORD in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("U_PASSWORD not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("U_PASSWORD between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("U_PASSWORD not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUTablespaceIsNull() {
            addCriterion("U_TABLESPACE is null");
            return (Criteria) this;
        }

        public Criteria andUTablespaceIsNotNull() {
            addCriterion("U_TABLESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andUTablespaceEqualTo(String value) {
            addCriterion("U_TABLESPACE =", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceNotEqualTo(String value) {
            addCriterion("U_TABLESPACE <>", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceGreaterThan(String value) {
            addCriterion("U_TABLESPACE >", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceGreaterThanOrEqualTo(String value) {
            addCriterion("U_TABLESPACE >=", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceLessThan(String value) {
            addCriterion("U_TABLESPACE <", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceLessThanOrEqualTo(String value) {
            addCriterion("U_TABLESPACE <=", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceLike(String value) {
            addCriterion("U_TABLESPACE like", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceNotLike(String value) {
            addCriterion("U_TABLESPACE not like", value, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceIn(List<String> values) {
            addCriterion("U_TABLESPACE in", values, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceNotIn(List<String> values) {
            addCriterion("U_TABLESPACE not in", values, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceBetween(String value1, String value2) {
            addCriterion("U_TABLESPACE between", value1, value2, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUTablespaceNotBetween(String value1, String value2) {
            addCriterion("U_TABLESPACE not between", value1, value2, "uTablespace");
            return (Criteria) this;
        }

        public Criteria andUDescIsNull() {
            addCriterion("U_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUDescIsNotNull() {
            addCriterion("U_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUDescEqualTo(String value) {
            addCriterion("U_DESC =", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescNotEqualTo(String value) {
            addCriterion("U_DESC <>", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescGreaterThan(String value) {
            addCriterion("U_DESC >", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescGreaterThanOrEqualTo(String value) {
            addCriterion("U_DESC >=", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescLessThan(String value) {
            addCriterion("U_DESC <", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescLessThanOrEqualTo(String value) {
            addCriterion("U_DESC <=", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescLike(String value) {
            addCriterion("U_DESC like", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescNotLike(String value) {
            addCriterion("U_DESC not like", value, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescIn(List<String> values) {
            addCriterion("U_DESC in", values, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescNotIn(List<String> values) {
            addCriterion("U_DESC not in", values, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescBetween(String value1, String value2) {
            addCriterion("U_DESC between", value1, value2, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDescNotBetween(String value1, String value2) {
            addCriterion("U_DESC not between", value1, value2, "uDesc");
            return (Criteria) this;
        }

        public Criteria andUDateIsNull() {
            addCriterion("U_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUDateIsNotNull() {
            addCriterion("U_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUDateEqualTo(String value) {
            addCriterion("U_DATE =", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateNotEqualTo(String value) {
            addCriterion("U_DATE <>", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateGreaterThan(String value) {
            addCriterion("U_DATE >", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateGreaterThanOrEqualTo(String value) {
            addCriterion("U_DATE >=", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateLessThan(String value) {
            addCriterion("U_DATE <", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateLessThanOrEqualTo(String value) {
            addCriterion("U_DATE <=", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateLike(String value) {
            addCriterion("U_DATE like", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateNotLike(String value) {
            addCriterion("U_DATE not like", value, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateIn(List<String> values) {
            addCriterion("U_DATE in", values, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateNotIn(List<String> values) {
            addCriterion("U_DATE not in", values, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateBetween(String value1, String value2) {
            addCriterion("U_DATE between", value1, value2, "uDate");
            return (Criteria) this;
        }

        public Criteria andUDateNotBetween(String value1, String value2) {
            addCriterion("U_DATE not between", value1, value2, "uDate");
            return (Criteria) this;
        }

        public Criteria andUSyncStateIsNull() {
            addCriterion("U_SYNC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUSyncStateIsNotNull() {
            addCriterion("U_SYNC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUSyncStateEqualTo(String value) {
            addCriterion("U_SYNC_STATE =", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateNotEqualTo(String value) {
            addCriterion("U_SYNC_STATE <>", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateGreaterThan(String value) {
            addCriterion("U_SYNC_STATE >", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateGreaterThanOrEqualTo(String value) {
            addCriterion("U_SYNC_STATE >=", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateLessThan(String value) {
            addCriterion("U_SYNC_STATE <", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateLessThanOrEqualTo(String value) {
            addCriterion("U_SYNC_STATE <=", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateLike(String value) {
            addCriterion("U_SYNC_STATE like", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateNotLike(String value) {
            addCriterion("U_SYNC_STATE not like", value, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateIn(List<String> values) {
            addCriterion("U_SYNC_STATE in", values, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateNotIn(List<String> values) {
            addCriterion("U_SYNC_STATE not in", values, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateBetween(String value1, String value2) {
            addCriterion("U_SYNC_STATE between", value1, value2, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUSyncStateNotBetween(String value1, String value2) {
            addCriterion("U_SYNC_STATE not between", value1, value2, "uSyncState");
            return (Criteria) this;
        }

        public Criteria andUAccessIsNull() {
            addCriterion("U_ACCESS is null");
            return (Criteria) this;
        }

        public Criteria andUAccessIsNotNull() {
            addCriterion("U_ACCESS is not null");
            return (Criteria) this;
        }

        public Criteria andUAccessEqualTo(String value) {
            addCriterion("U_ACCESS =", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessNotEqualTo(String value) {
            addCriterion("U_ACCESS <>", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessGreaterThan(String value) {
            addCriterion("U_ACCESS >", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessGreaterThanOrEqualTo(String value) {
            addCriterion("U_ACCESS >=", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessLessThan(String value) {
            addCriterion("U_ACCESS <", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessLessThanOrEqualTo(String value) {
            addCriterion("U_ACCESS <=", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessLike(String value) {
            addCriterion("U_ACCESS like", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessNotLike(String value) {
            addCriterion("U_ACCESS not like", value, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessIn(List<String> values) {
            addCriterion("U_ACCESS in", values, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessNotIn(List<String> values) {
            addCriterion("U_ACCESS not in", values, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessBetween(String value1, String value2) {
            addCriterion("U_ACCESS between", value1, value2, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUAccessNotBetween(String value1, String value2) {
            addCriterion("U_ACCESS not between", value1, value2, "uAccess");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceIsNull() {
            addCriterion("U_OF_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceIsNotNull() {
            addCriterion("U_OF_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceEqualTo(String value) {
            addCriterion("U_OF_DATASOURCE =", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceNotEqualTo(String value) {
            addCriterion("U_OF_DATASOURCE <>", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceGreaterThan(String value) {
            addCriterion("U_OF_DATASOURCE >", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("U_OF_DATASOURCE >=", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceLessThan(String value) {
            addCriterion("U_OF_DATASOURCE <", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceLessThanOrEqualTo(String value) {
            addCriterion("U_OF_DATASOURCE <=", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceLike(String value) {
            addCriterion("U_OF_DATASOURCE like", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceNotLike(String value) {
            addCriterion("U_OF_DATASOURCE not like", value, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceIn(List<String> values) {
            addCriterion("U_OF_DATASOURCE in", values, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceNotIn(List<String> values) {
            addCriterion("U_OF_DATASOURCE not in", values, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceBetween(String value1, String value2) {
            addCriterion("U_OF_DATASOURCE between", value1, value2, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfDatasourceNotBetween(String value1, String value2) {
            addCriterion("U_OF_DATASOURCE not between", value1, value2, "uOfDatasource");
            return (Criteria) this;
        }

        public Criteria andUOfProjectIsNull() {
            addCriterion("U_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andUOfProjectIsNotNull() {
            addCriterion("U_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andUOfProjectEqualTo(String value) {
            addCriterion("U_OF_PROJECT =", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectNotEqualTo(String value) {
            addCriterion("U_OF_PROJECT <>", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectGreaterThan(String value) {
            addCriterion("U_OF_PROJECT >", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("U_OF_PROJECT >=", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectLessThan(String value) {
            addCriterion("U_OF_PROJECT <", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectLessThanOrEqualTo(String value) {
            addCriterion("U_OF_PROJECT <=", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectLike(String value) {
            addCriterion("U_OF_PROJECT like", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectNotLike(String value) {
            addCriterion("U_OF_PROJECT not like", value, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectIn(List<String> values) {
            addCriterion("U_OF_PROJECT in", values, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectNotIn(List<String> values) {
            addCriterion("U_OF_PROJECT not in", values, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectBetween(String value1, String value2) {
            addCriterion("U_OF_PROJECT between", value1, value2, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUOfProjectNotBetween(String value1, String value2) {
            addCriterion("U_OF_PROJECT not between", value1, value2, "uOfProject");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceIsNull() {
            addCriterion("U_TEMP_TABLESPACE is null");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceIsNotNull() {
            addCriterion("U_TEMP_TABLESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceEqualTo(String value) {
            addCriterion("U_TEMP_TABLESPACE =", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceNotEqualTo(String value) {
            addCriterion("U_TEMP_TABLESPACE <>", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceGreaterThan(String value) {
            addCriterion("U_TEMP_TABLESPACE >", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceGreaterThanOrEqualTo(String value) {
            addCriterion("U_TEMP_TABLESPACE >=", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceLessThan(String value) {
            addCriterion("U_TEMP_TABLESPACE <", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceLessThanOrEqualTo(String value) {
            addCriterion("U_TEMP_TABLESPACE <=", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceLike(String value) {
            addCriterion("U_TEMP_TABLESPACE like", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceNotLike(String value) {
            addCriterion("U_TEMP_TABLESPACE not like", value, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceIn(List<String> values) {
            addCriterion("U_TEMP_TABLESPACE in", values, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceNotIn(List<String> values) {
            addCriterion("U_TEMP_TABLESPACE not in", values, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceBetween(String value1, String value2) {
            addCriterion("U_TEMP_TABLESPACE between", value1, value2, "uTempTablespace");
            return (Criteria) this;
        }

        public Criteria andUTempTablespaceNotBetween(String value1, String value2) {
            addCriterion("U_TEMP_TABLESPACE not between", value1, value2, "uTempTablespace");
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