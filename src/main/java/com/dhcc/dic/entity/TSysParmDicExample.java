package com.dhcc.dic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSysParmDicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysParmDicExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("P_ID is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("P_ID =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("P_ID <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("P_ID >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("P_ID >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("P_ID <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("P_ID <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("P_ID like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("P_ID not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("P_ID in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("P_ID not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("P_ID between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("P_ID not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPKeyNameIsNull() {
            addCriterion("P_KEY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPKeyNameIsNotNull() {
            addCriterion("P_KEY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPKeyNameEqualTo(String value) {
            addCriterion("P_KEY_NAME =", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameNotEqualTo(String value) {
            addCriterion("P_KEY_NAME <>", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameGreaterThan(String value) {
            addCriterion("P_KEY_NAME >", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameGreaterThanOrEqualTo(String value) {
            addCriterion("P_KEY_NAME >=", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameLessThan(String value) {
            addCriterion("P_KEY_NAME <", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameLessThanOrEqualTo(String value) {
            addCriterion("P_KEY_NAME <=", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameLike(String value) {
            addCriterion("P_KEY_NAME like", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameNotLike(String value) {
            addCriterion("P_KEY_NAME not like", value, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameIn(List<String> values) {
            addCriterion("P_KEY_NAME in", values, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameNotIn(List<String> values) {
            addCriterion("P_KEY_NAME not in", values, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameBetween(String value1, String value2) {
            addCriterion("P_KEY_NAME between", value1, value2, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPKeyNameNotBetween(String value1, String value2) {
            addCriterion("P_KEY_NAME not between", value1, value2, "pKeyName");
            return (Criteria) this;
        }

        public Criteria andPOptCodeIsNull() {
            addCriterion("P_OPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPOptCodeIsNotNull() {
            addCriterion("P_OPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPOptCodeEqualTo(String value) {
            addCriterion("P_OPT_CODE =", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeNotEqualTo(String value) {
            addCriterion("P_OPT_CODE <>", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeGreaterThan(String value) {
            addCriterion("P_OPT_CODE >", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("P_OPT_CODE >=", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeLessThan(String value) {
            addCriterion("P_OPT_CODE <", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeLessThanOrEqualTo(String value) {
            addCriterion("P_OPT_CODE <=", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeLike(String value) {
            addCriterion("P_OPT_CODE like", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeNotLike(String value) {
            addCriterion("P_OPT_CODE not like", value, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeIn(List<String> values) {
            addCriterion("P_OPT_CODE in", values, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeNotIn(List<String> values) {
            addCriterion("P_OPT_CODE not in", values, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeBetween(String value1, String value2) {
            addCriterion("P_OPT_CODE between", value1, value2, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptCodeNotBetween(String value1, String value2) {
            addCriterion("P_OPT_CODE not between", value1, value2, "pOptCode");
            return (Criteria) this;
        }

        public Criteria andPOptNameIsNull() {
            addCriterion("P_OPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPOptNameIsNotNull() {
            addCriterion("P_OPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPOptNameEqualTo(String value) {
            addCriterion("P_OPT_NAME =", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameNotEqualTo(String value) {
            addCriterion("P_OPT_NAME <>", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameGreaterThan(String value) {
            addCriterion("P_OPT_NAME >", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameGreaterThanOrEqualTo(String value) {
            addCriterion("P_OPT_NAME >=", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameLessThan(String value) {
            addCriterion("P_OPT_NAME <", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameLessThanOrEqualTo(String value) {
            addCriterion("P_OPT_NAME <=", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameLike(String value) {
            addCriterion("P_OPT_NAME like", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameNotLike(String value) {
            addCriterion("P_OPT_NAME not like", value, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameIn(List<String> values) {
            addCriterion("P_OPT_NAME in", values, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameNotIn(List<String> values) {
            addCriterion("P_OPT_NAME not in", values, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameBetween(String value1, String value2) {
            addCriterion("P_OPT_NAME between", value1, value2, "pOptName");
            return (Criteria) this;
        }

        public Criteria andPOptNameNotBetween(String value1, String value2) {
            addCriterion("P_OPT_NAME not between", value1, value2, "pOptName");
            return (Criteria) this;
        }

        public Criteria andSeqnIsNull() {
            addCriterion("SEQN is null");
            return (Criteria) this;
        }

        public Criteria andSeqnIsNotNull() {
            addCriterion("SEQN is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnEqualTo(BigDecimal value) {
            addCriterion("SEQN =", value, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnNotEqualTo(BigDecimal value) {
            addCriterion("SEQN <>", value, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnGreaterThan(BigDecimal value) {
            addCriterion("SEQN >", value, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQN >=", value, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnLessThan(BigDecimal value) {
            addCriterion("SEQN <", value, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQN <=", value, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnIn(List<BigDecimal> values) {
            addCriterion("SEQN in", values, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnNotIn(List<BigDecimal> values) {
            addCriterion("SEQN not in", values, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQN between", value1, value2, "seqn");
            return (Criteria) this;
        }

        public Criteria andSeqnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQN not between", value1, value2, "seqn");
            return (Criteria) this;
        }

        public Criteria andStsIsNull() {
            addCriterion("STS is null");
            return (Criteria) this;
        }

        public Criteria andStsIsNotNull() {
            addCriterion("STS is not null");
            return (Criteria) this;
        }

        public Criteria andStsEqualTo(String value) {
            addCriterion("STS =", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotEqualTo(String value) {
            addCriterion("STS <>", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsGreaterThan(String value) {
            addCriterion("STS >", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsGreaterThanOrEqualTo(String value) {
            addCriterion("STS >=", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsLessThan(String value) {
            addCriterion("STS <", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsLessThanOrEqualTo(String value) {
            addCriterion("STS <=", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsLike(String value) {
            addCriterion("STS like", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotLike(String value) {
            addCriterion("STS not like", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsIn(List<String> values) {
            addCriterion("STS in", values, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotIn(List<String> values) {
            addCriterion("STS not in", values, "sts");
            return (Criteria) this;
        }

        public Criteria andStsBetween(String value1, String value2) {
            addCriterion("STS between", value1, value2, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotBetween(String value1, String value2) {
            addCriterion("STS not between", value1, value2, "sts");
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