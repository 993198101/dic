package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TConsColumnsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TConsColumnsExample() {
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

        public Criteria andCcIdIsNull() {
            addCriterion("CC_ID is null");
            return (Criteria) this;
        }

        public Criteria andCcIdIsNotNull() {
            addCriterion("CC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCcIdEqualTo(String value) {
            addCriterion("CC_ID =", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotEqualTo(String value) {
            addCriterion("CC_ID <>", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThan(String value) {
            addCriterion("CC_ID >", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThanOrEqualTo(String value) {
            addCriterion("CC_ID >=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThan(String value) {
            addCriterion("CC_ID <", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThanOrEqualTo(String value) {
            addCriterion("CC_ID <=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLike(String value) {
            addCriterion("CC_ID like", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotLike(String value) {
            addCriterion("CC_ID not like", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdIn(List<String> values) {
            addCriterion("CC_ID in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotIn(List<String> values) {
            addCriterion("CC_ID not in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdBetween(String value1, String value2) {
            addCriterion("CC_ID between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotBetween(String value1, String value2) {
            addCriterion("CC_ID not between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdIsNull() {
            addCriterion("CC_CONS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCcConsIdIsNotNull() {
            addCriterion("CC_CONS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCcConsIdEqualTo(String value) {
            addCriterion("CC_CONS_ID =", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdNotEqualTo(String value) {
            addCriterion("CC_CONS_ID <>", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdGreaterThan(String value) {
            addCriterion("CC_CONS_ID >", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CC_CONS_ID >=", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdLessThan(String value) {
            addCriterion("CC_CONS_ID <", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdLessThanOrEqualTo(String value) {
            addCriterion("CC_CONS_ID <=", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdLike(String value) {
            addCriterion("CC_CONS_ID like", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdNotLike(String value) {
            addCriterion("CC_CONS_ID not like", value, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdIn(List<String> values) {
            addCriterion("CC_CONS_ID in", values, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdNotIn(List<String> values) {
            addCriterion("CC_CONS_ID not in", values, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdBetween(String value1, String value2) {
            addCriterion("CC_CONS_ID between", value1, value2, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcConsIdNotBetween(String value1, String value2) {
            addCriterion("CC_CONS_ID not between", value1, value2, "ccConsId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdIsNull() {
            addCriterion("CC_TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCcTableIdIsNotNull() {
            addCriterion("CC_TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCcTableIdEqualTo(String value) {
            addCriterion("CC_TABLE_ID =", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdNotEqualTo(String value) {
            addCriterion("CC_TABLE_ID <>", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdGreaterThan(String value) {
            addCriterion("CC_TABLE_ID >", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("CC_TABLE_ID >=", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdLessThan(String value) {
            addCriterion("CC_TABLE_ID <", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdLessThanOrEqualTo(String value) {
            addCriterion("CC_TABLE_ID <=", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdLike(String value) {
            addCriterion("CC_TABLE_ID like", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdNotLike(String value) {
            addCriterion("CC_TABLE_ID not like", value, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdIn(List<String> values) {
            addCriterion("CC_TABLE_ID in", values, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdNotIn(List<String> values) {
            addCriterion("CC_TABLE_ID not in", values, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdBetween(String value1, String value2) {
            addCriterion("CC_TABLE_ID between", value1, value2, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableIdNotBetween(String value1, String value2) {
            addCriterion("CC_TABLE_ID not between", value1, value2, "ccTableId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdIsNull() {
            addCriterion("CC_TABLE_FIELD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdIsNotNull() {
            addCriterion("CC_TABLE_FIELD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdEqualTo(String value) {
            addCriterion("CC_TABLE_FIELD_ID =", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdNotEqualTo(String value) {
            addCriterion("CC_TABLE_FIELD_ID <>", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdGreaterThan(String value) {
            addCriterion("CC_TABLE_FIELD_ID >", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdGreaterThanOrEqualTo(String value) {
            addCriterion("CC_TABLE_FIELD_ID >=", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdLessThan(String value) {
            addCriterion("CC_TABLE_FIELD_ID <", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdLessThanOrEqualTo(String value) {
            addCriterion("CC_TABLE_FIELD_ID <=", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdLike(String value) {
            addCriterion("CC_TABLE_FIELD_ID like", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdNotLike(String value) {
            addCriterion("CC_TABLE_FIELD_ID not like", value, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdIn(List<String> values) {
            addCriterion("CC_TABLE_FIELD_ID in", values, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdNotIn(List<String> values) {
            addCriterion("CC_TABLE_FIELD_ID not in", values, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdBetween(String value1, String value2) {
            addCriterion("CC_TABLE_FIELD_ID between", value1, value2, "ccTableFieldId");
            return (Criteria) this;
        }

        public Criteria andCcTableFieldIdNotBetween(String value1, String value2) {
            addCriterion("CC_TABLE_FIELD_ID not between", value1, value2, "ccTableFieldId");
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