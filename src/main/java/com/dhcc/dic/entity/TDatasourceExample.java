package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TDatasourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDatasourceExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("D_ID is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(String value) {
            addCriterion("D_ID =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(String value) {
            addCriterion("D_ID <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(String value) {
            addCriterion("D_ID >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(String value) {
            addCriterion("D_ID >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(String value) {
            addCriterion("D_ID <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(String value) {
            addCriterion("D_ID <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLike(String value) {
            addCriterion("D_ID like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotLike(String value) {
            addCriterion("D_ID not like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<String> values) {
            addCriterion("D_ID in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<String> values) {
            addCriterion("D_ID not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(String value1, String value2) {
            addCriterion("D_ID between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(String value1, String value2) {
            addCriterion("D_ID not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("D_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("D_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("D_NAME =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("D_NAME <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("D_NAME >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("D_NAME >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("D_NAME <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("D_NAME <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("D_NAME like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("D_NAME not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("D_NAME in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("D_NAME not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("D_NAME between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("D_NAME not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDDescIsNull() {
            addCriterion("D_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDDescIsNotNull() {
            addCriterion("D_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDDescEqualTo(String value) {
            addCriterion("D_DESC =", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotEqualTo(String value) {
            addCriterion("D_DESC <>", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThan(String value) {
            addCriterion("D_DESC >", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThanOrEqualTo(String value) {
            addCriterion("D_DESC >=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThan(String value) {
            addCriterion("D_DESC <", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThanOrEqualTo(String value) {
            addCriterion("D_DESC <=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLike(String value) {
            addCriterion("D_DESC like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotLike(String value) {
            addCriterion("D_DESC not like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescIn(List<String> values) {
            addCriterion("D_DESC in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotIn(List<String> values) {
            addCriterion("D_DESC not in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescBetween(String value1, String value2) {
            addCriterion("D_DESC between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotBetween(String value1, String value2) {
            addCriterion("D_DESC not between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNull() {
            addCriterion("D_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNotNull() {
            addCriterion("D_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeEqualTo(String value) {
            addCriterion("D_TYPE =", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotEqualTo(String value) {
            addCriterion("D_TYPE <>", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThan(String value) {
            addCriterion("D_TYPE >", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThanOrEqualTo(String value) {
            addCriterion("D_TYPE >=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThan(String value) {
            addCriterion("D_TYPE <", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThanOrEqualTo(String value) {
            addCriterion("D_TYPE <=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLike(String value) {
            addCriterion("D_TYPE like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotLike(String value) {
            addCriterion("D_TYPE not like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeIn(List<String> values) {
            addCriterion("D_TYPE in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotIn(List<String> values) {
            addCriterion("D_TYPE not in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeBetween(String value1, String value2) {
            addCriterion("D_TYPE between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotBetween(String value1, String value2) {
            addCriterion("D_TYPE not between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDUsernameIsNull() {
            addCriterion("D_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andDUsernameIsNotNull() {
            addCriterion("D_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDUsernameEqualTo(String value) {
            addCriterion("D_USERNAME =", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotEqualTo(String value) {
            addCriterion("D_USERNAME <>", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameGreaterThan(String value) {
            addCriterion("D_USERNAME >", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("D_USERNAME >=", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameLessThan(String value) {
            addCriterion("D_USERNAME <", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameLessThanOrEqualTo(String value) {
            addCriterion("D_USERNAME <=", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameLike(String value) {
            addCriterion("D_USERNAME like", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotLike(String value) {
            addCriterion("D_USERNAME not like", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameIn(List<String> values) {
            addCriterion("D_USERNAME in", values, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotIn(List<String> values) {
            addCriterion("D_USERNAME not in", values, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameBetween(String value1, String value2) {
            addCriterion("D_USERNAME between", value1, value2, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotBetween(String value1, String value2) {
            addCriterion("D_USERNAME not between", value1, value2, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDPasswordIsNull() {
            addCriterion("D_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andDPasswordIsNotNull() {
            addCriterion("D_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andDPasswordEqualTo(String value) {
            addCriterion("D_PASSWORD =", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotEqualTo(String value) {
            addCriterion("D_PASSWORD <>", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordGreaterThan(String value) {
            addCriterion("D_PASSWORD >", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("D_PASSWORD >=", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLessThan(String value) {
            addCriterion("D_PASSWORD <", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLessThanOrEqualTo(String value) {
            addCriterion("D_PASSWORD <=", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLike(String value) {
            addCriterion("D_PASSWORD like", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotLike(String value) {
            addCriterion("D_PASSWORD not like", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordIn(List<String> values) {
            addCriterion("D_PASSWORD in", values, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotIn(List<String> values) {
            addCriterion("D_PASSWORD not in", values, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordBetween(String value1, String value2) {
            addCriterion("D_PASSWORD between", value1, value2, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotBetween(String value1, String value2) {
            addCriterion("D_PASSWORD not between", value1, value2, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDIpIsNull() {
            addCriterion("D_IP is null");
            return (Criteria) this;
        }

        public Criteria andDIpIsNotNull() {
            addCriterion("D_IP is not null");
            return (Criteria) this;
        }

        public Criteria andDIpEqualTo(String value) {
            addCriterion("D_IP =", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotEqualTo(String value) {
            addCriterion("D_IP <>", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpGreaterThan(String value) {
            addCriterion("D_IP >", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpGreaterThanOrEqualTo(String value) {
            addCriterion("D_IP >=", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpLessThan(String value) {
            addCriterion("D_IP <", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpLessThanOrEqualTo(String value) {
            addCriterion("D_IP <=", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpLike(String value) {
            addCriterion("D_IP like", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotLike(String value) {
            addCriterion("D_IP not like", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpIn(List<String> values) {
            addCriterion("D_IP in", values, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotIn(List<String> values) {
            addCriterion("D_IP not in", values, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpBetween(String value1, String value2) {
            addCriterion("D_IP between", value1, value2, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotBetween(String value1, String value2) {
            addCriterion("D_IP not between", value1, value2, "dIp");
            return (Criteria) this;
        }

        public Criteria andDPortIsNull() {
            addCriterion("D_PORT is null");
            return (Criteria) this;
        }

        public Criteria andDPortIsNotNull() {
            addCriterion("D_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andDPortEqualTo(String value) {
            addCriterion("D_PORT =", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortNotEqualTo(String value) {
            addCriterion("D_PORT <>", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortGreaterThan(String value) {
            addCriterion("D_PORT >", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortGreaterThanOrEqualTo(String value) {
            addCriterion("D_PORT >=", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortLessThan(String value) {
            addCriterion("D_PORT <", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortLessThanOrEqualTo(String value) {
            addCriterion("D_PORT <=", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortLike(String value) {
            addCriterion("D_PORT like", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortNotLike(String value) {
            addCriterion("D_PORT not like", value, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortIn(List<String> values) {
            addCriterion("D_PORT in", values, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortNotIn(List<String> values) {
            addCriterion("D_PORT not in", values, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortBetween(String value1, String value2) {
            addCriterion("D_PORT between", value1, value2, "dPort");
            return (Criteria) this;
        }

        public Criteria andDPortNotBetween(String value1, String value2) {
            addCriterion("D_PORT not between", value1, value2, "dPort");
            return (Criteria) this;
        }

        public Criteria andDServiceIsNull() {
            addCriterion("D_SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andDServiceIsNotNull() {
            addCriterion("D_SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andDServiceEqualTo(String value) {
            addCriterion("D_SERVICE =", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceNotEqualTo(String value) {
            addCriterion("D_SERVICE <>", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceGreaterThan(String value) {
            addCriterion("D_SERVICE >", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceGreaterThanOrEqualTo(String value) {
            addCriterion("D_SERVICE >=", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceLessThan(String value) {
            addCriterion("D_SERVICE <", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceLessThanOrEqualTo(String value) {
            addCriterion("D_SERVICE <=", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceLike(String value) {
            addCriterion("D_SERVICE like", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceNotLike(String value) {
            addCriterion("D_SERVICE not like", value, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceIn(List<String> values) {
            addCriterion("D_SERVICE in", values, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceNotIn(List<String> values) {
            addCriterion("D_SERVICE not in", values, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceBetween(String value1, String value2) {
            addCriterion("D_SERVICE between", value1, value2, "dService");
            return (Criteria) this;
        }

        public Criteria andDServiceNotBetween(String value1, String value2) {
            addCriterion("D_SERVICE not between", value1, value2, "dService");
            return (Criteria) this;
        }

        public Criteria andDDateIsNull() {
            addCriterion("D_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDDateIsNotNull() {
            addCriterion("D_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDDateEqualTo(String value) {
            addCriterion("D_DATE =", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotEqualTo(String value) {
            addCriterion("D_DATE <>", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateGreaterThan(String value) {
            addCriterion("D_DATE >", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateGreaterThanOrEqualTo(String value) {
            addCriterion("D_DATE >=", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLessThan(String value) {
            addCriterion("D_DATE <", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLessThanOrEqualTo(String value) {
            addCriterion("D_DATE <=", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLike(String value) {
            addCriterion("D_DATE like", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotLike(String value) {
            addCriterion("D_DATE not like", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateIn(List<String> values) {
            addCriterion("D_DATE in", values, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotIn(List<String> values) {
            addCriterion("D_DATE not in", values, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateBetween(String value1, String value2) {
            addCriterion("D_DATE between", value1, value2, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotBetween(String value1, String value2) {
            addCriterion("D_DATE not between", value1, value2, "dDate");
            return (Criteria) this;
        }

        public Criteria andDOfProjectIsNull() {
            addCriterion("D_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andDOfProjectIsNotNull() {
            addCriterion("D_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andDOfProjectEqualTo(String value) {
            addCriterion("D_OF_PROJECT =", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectNotEqualTo(String value) {
            addCriterion("D_OF_PROJECT <>", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectGreaterThan(String value) {
            addCriterion("D_OF_PROJECT >", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("D_OF_PROJECT >=", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectLessThan(String value) {
            addCriterion("D_OF_PROJECT <", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectLessThanOrEqualTo(String value) {
            addCriterion("D_OF_PROJECT <=", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectLike(String value) {
            addCriterion("D_OF_PROJECT like", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectNotLike(String value) {
            addCriterion("D_OF_PROJECT not like", value, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectIn(List<String> values) {
            addCriterion("D_OF_PROJECT in", values, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectNotIn(List<String> values) {
            addCriterion("D_OF_PROJECT not in", values, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectBetween(String value1, String value2) {
            addCriterion("D_OF_PROJECT between", value1, value2, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDOfProjectNotBetween(String value1, String value2) {
            addCriterion("D_OF_PROJECT not between", value1, value2, "dOfProject");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeIsNull() {
            addCriterion("D_DATABASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeIsNotNull() {
            addCriterion("D_DATABASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeEqualTo(String value) {
            addCriterion("D_DATABASE_TYPE =", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeNotEqualTo(String value) {
            addCriterion("D_DATABASE_TYPE <>", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeGreaterThan(String value) {
            addCriterion("D_DATABASE_TYPE >", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("D_DATABASE_TYPE >=", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeLessThan(String value) {
            addCriterion("D_DATABASE_TYPE <", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeLessThanOrEqualTo(String value) {
            addCriterion("D_DATABASE_TYPE <=", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeLike(String value) {
            addCriterion("D_DATABASE_TYPE like", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeNotLike(String value) {
            addCriterion("D_DATABASE_TYPE not like", value, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeIn(List<String> values) {
            addCriterion("D_DATABASE_TYPE in", values, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeNotIn(List<String> values) {
            addCriterion("D_DATABASE_TYPE not in", values, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeBetween(String value1, String value2) {
            addCriterion("D_DATABASE_TYPE between", value1, value2, "dDatabaseType");
            return (Criteria) this;
        }

        public Criteria andDDatabaseTypeNotBetween(String value1, String value2) {
            addCriterion("D_DATABASE_TYPE not between", value1, value2, "dDatabaseType");
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