package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TConstraintsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TConstraintsExample() {
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

        public Criteria andConsIdIsNull() {
            addCriterion("CONS_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsIdIsNotNull() {
            addCriterion("CONS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsIdEqualTo(String value) {
            addCriterion("CONS_ID =", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdNotEqualTo(String value) {
            addCriterion("CONS_ID <>", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdGreaterThan(String value) {
            addCriterion("CONS_ID >", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONS_ID >=", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdLessThan(String value) {
            addCriterion("CONS_ID <", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdLessThanOrEqualTo(String value) {
            addCriterion("CONS_ID <=", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdLike(String value) {
            addCriterion("CONS_ID like", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdNotLike(String value) {
            addCriterion("CONS_ID not like", value, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdIn(List<String> values) {
            addCriterion("CONS_ID in", values, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdNotIn(List<String> values) {
            addCriterion("CONS_ID not in", values, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdBetween(String value1, String value2) {
            addCriterion("CONS_ID between", value1, value2, "consId");
            return (Criteria) this;
        }

        public Criteria andConsIdNotBetween(String value1, String value2) {
            addCriterion("CONS_ID not between", value1, value2, "consId");
            return (Criteria) this;
        }

        public Criteria andConsNameIsNull() {
            addCriterion("CONS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConsNameIsNotNull() {
            addCriterion("CONS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConsNameEqualTo(String value) {
            addCriterion("CONS_NAME =", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotEqualTo(String value) {
            addCriterion("CONS_NAME <>", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameGreaterThan(String value) {
            addCriterion("CONS_NAME >", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONS_NAME >=", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameLessThan(String value) {
            addCriterion("CONS_NAME <", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameLessThanOrEqualTo(String value) {
            addCriterion("CONS_NAME <=", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameLike(String value) {
            addCriterion("CONS_NAME like", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotLike(String value) {
            addCriterion("CONS_NAME not like", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameIn(List<String> values) {
            addCriterion("CONS_NAME in", values, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotIn(List<String> values) {
            addCriterion("CONS_NAME not in", values, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameBetween(String value1, String value2) {
            addCriterion("CONS_NAME between", value1, value2, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotBetween(String value1, String value2) {
            addCriterion("CONS_NAME not between", value1, value2, "consName");
            return (Criteria) this;
        }

        public Criteria andConsTypeIsNull() {
            addCriterion("CONS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConsTypeIsNotNull() {
            addCriterion("CONS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConsTypeEqualTo(String value) {
            addCriterion("CONS_TYPE =", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeNotEqualTo(String value) {
            addCriterion("CONS_TYPE <>", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeGreaterThan(String value) {
            addCriterion("CONS_TYPE >", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONS_TYPE >=", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeLessThan(String value) {
            addCriterion("CONS_TYPE <", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeLessThanOrEqualTo(String value) {
            addCriterion("CONS_TYPE <=", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeLike(String value) {
            addCriterion("CONS_TYPE like", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeNotLike(String value) {
            addCriterion("CONS_TYPE not like", value, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeIn(List<String> values) {
            addCriterion("CONS_TYPE in", values, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeNotIn(List<String> values) {
            addCriterion("CONS_TYPE not in", values, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeBetween(String value1, String value2) {
            addCriterion("CONS_TYPE between", value1, value2, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTypeNotBetween(String value1, String value2) {
            addCriterion("CONS_TYPE not between", value1, value2, "consType");
            return (Criteria) this;
        }

        public Criteria andConsTableIdIsNull() {
            addCriterion("CONS_TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsTableIdIsNotNull() {
            addCriterion("CONS_TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsTableIdEqualTo(String value) {
            addCriterion("CONS_TABLE_ID =", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdNotEqualTo(String value) {
            addCriterion("CONS_TABLE_ID <>", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdGreaterThan(String value) {
            addCriterion("CONS_TABLE_ID >", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONS_TABLE_ID >=", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdLessThan(String value) {
            addCriterion("CONS_TABLE_ID <", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdLessThanOrEqualTo(String value) {
            addCriterion("CONS_TABLE_ID <=", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdLike(String value) {
            addCriterion("CONS_TABLE_ID like", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdNotLike(String value) {
            addCriterion("CONS_TABLE_ID not like", value, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdIn(List<String> values) {
            addCriterion("CONS_TABLE_ID in", values, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdNotIn(List<String> values) {
            addCriterion("CONS_TABLE_ID not in", values, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdBetween(String value1, String value2) {
            addCriterion("CONS_TABLE_ID between", value1, value2, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsTableIdNotBetween(String value1, String value2) {
            addCriterion("CONS_TABLE_ID not between", value1, value2, "consTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdIsNull() {
            addCriterion("CONS_REF_CONS_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdIsNotNull() {
            addCriterion("CONS_REF_CONS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdEqualTo(String value) {
            addCriterion("CONS_REF_CONS_ID =", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdNotEqualTo(String value) {
            addCriterion("CONS_REF_CONS_ID <>", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdGreaterThan(String value) {
            addCriterion("CONS_REF_CONS_ID >", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONS_REF_CONS_ID >=", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdLessThan(String value) {
            addCriterion("CONS_REF_CONS_ID <", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdLessThanOrEqualTo(String value) {
            addCriterion("CONS_REF_CONS_ID <=", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdLike(String value) {
            addCriterion("CONS_REF_CONS_ID like", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdNotLike(String value) {
            addCriterion("CONS_REF_CONS_ID not like", value, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdIn(List<String> values) {
            addCriterion("CONS_REF_CONS_ID in", values, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdNotIn(List<String> values) {
            addCriterion("CONS_REF_CONS_ID not in", values, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdBetween(String value1, String value2) {
            addCriterion("CONS_REF_CONS_ID between", value1, value2, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefConsIdNotBetween(String value1, String value2) {
            addCriterion("CONS_REF_CONS_ID not between", value1, value2, "consRefConsId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdIsNull() {
            addCriterion("CONS_REF_TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdIsNotNull() {
            addCriterion("CONS_REF_TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdEqualTo(String value) {
            addCriterion("CONS_REF_TABLE_ID =", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdNotEqualTo(String value) {
            addCriterion("CONS_REF_TABLE_ID <>", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdGreaterThan(String value) {
            addCriterion("CONS_REF_TABLE_ID >", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONS_REF_TABLE_ID >=", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdLessThan(String value) {
            addCriterion("CONS_REF_TABLE_ID <", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdLessThanOrEqualTo(String value) {
            addCriterion("CONS_REF_TABLE_ID <=", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdLike(String value) {
            addCriterion("CONS_REF_TABLE_ID like", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdNotLike(String value) {
            addCriterion("CONS_REF_TABLE_ID not like", value, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdIn(List<String> values) {
            addCriterion("CONS_REF_TABLE_ID in", values, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdNotIn(List<String> values) {
            addCriterion("CONS_REF_TABLE_ID not in", values, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdBetween(String value1, String value2) {
            addCriterion("CONS_REF_TABLE_ID between", value1, value2, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsRefTableIdNotBetween(String value1, String value2) {
            addCriterion("CONS_REF_TABLE_ID not between", value1, value2, "consRefTableId");
            return (Criteria) this;
        }

        public Criteria andConsIsRealIsNull() {
            addCriterion("CONS_IS_REAL is null");
            return (Criteria) this;
        }

        public Criteria andConsIsRealIsNotNull() {
            addCriterion("CONS_IS_REAL is not null");
            return (Criteria) this;
        }

        public Criteria andConsIsRealEqualTo(String value) {
            addCriterion("CONS_IS_REAL =", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealNotEqualTo(String value) {
            addCriterion("CONS_IS_REAL <>", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealGreaterThan(String value) {
            addCriterion("CONS_IS_REAL >", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealGreaterThanOrEqualTo(String value) {
            addCriterion("CONS_IS_REAL >=", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealLessThan(String value) {
            addCriterion("CONS_IS_REAL <", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealLessThanOrEqualTo(String value) {
            addCriterion("CONS_IS_REAL <=", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealLike(String value) {
            addCriterion("CONS_IS_REAL like", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealNotLike(String value) {
            addCriterion("CONS_IS_REAL not like", value, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealIn(List<String> values) {
            addCriterion("CONS_IS_REAL in", values, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealNotIn(List<String> values) {
            addCriterion("CONS_IS_REAL not in", values, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealBetween(String value1, String value2) {
            addCriterion("CONS_IS_REAL between", value1, value2, "consIsReal");
            return (Criteria) this;
        }

        public Criteria andConsIsRealNotBetween(String value1, String value2) {
            addCriterion("CONS_IS_REAL not between", value1, value2, "consIsReal");
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