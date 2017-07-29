package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProjectExample() {
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

        public Criteria andPNameIsNull() {
            addCriterion("P_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("P_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("P_NAME =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("P_NAME <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("P_NAME >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("P_NAME >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("P_NAME <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("P_NAME <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("P_NAME like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("P_NAME not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("P_NAME in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("P_NAME not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("P_NAME between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("P_NAME not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPDescIsNull() {
            addCriterion("P_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPDescIsNotNull() {
            addCriterion("P_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPDescEqualTo(String value) {
            addCriterion("P_DESC =", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotEqualTo(String value) {
            addCriterion("P_DESC <>", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThan(String value) {
            addCriterion("P_DESC >", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThanOrEqualTo(String value) {
            addCriterion("P_DESC >=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThan(String value) {
            addCriterion("P_DESC <", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThanOrEqualTo(String value) {
            addCriterion("P_DESC <=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLike(String value) {
            addCriterion("P_DESC like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotLike(String value) {
            addCriterion("P_DESC not like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescIn(List<String> values) {
            addCriterion("P_DESC in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotIn(List<String> values) {
            addCriterion("P_DESC not in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescBetween(String value1, String value2) {
            addCriterion("P_DESC between", value1, value2, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotBetween(String value1, String value2) {
            addCriterion("P_DESC not between", value1, value2, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDateIsNull() {
            addCriterion("P_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPDateIsNotNull() {
            addCriterion("P_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPDateEqualTo(String value) {
            addCriterion("P_DATE =", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotEqualTo(String value) {
            addCriterion("P_DATE <>", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateGreaterThan(String value) {
            addCriterion("P_DATE >", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateGreaterThanOrEqualTo(String value) {
            addCriterion("P_DATE >=", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateLessThan(String value) {
            addCriterion("P_DATE <", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateLessThanOrEqualTo(String value) {
            addCriterion("P_DATE <=", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateLike(String value) {
            addCriterion("P_DATE like", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotLike(String value) {
            addCriterion("P_DATE not like", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateIn(List<String> values) {
            addCriterion("P_DATE in", values, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotIn(List<String> values) {
            addCriterion("P_DATE not in", values, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateBetween(String value1, String value2) {
            addCriterion("P_DATE between", value1, value2, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotBetween(String value1, String value2) {
            addCriterion("P_DATE not between", value1, value2, "pDate");
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