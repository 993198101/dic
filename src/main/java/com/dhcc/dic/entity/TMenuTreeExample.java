package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TMenuTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMenuTreeExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("M_ID is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("M_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(String value) {
            addCriterion("M_ID =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(String value) {
            addCriterion("M_ID <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(String value) {
            addCriterion("M_ID >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(String value) {
            addCriterion("M_ID >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(String value) {
            addCriterion("M_ID <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(String value) {
            addCriterion("M_ID <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLike(String value) {
            addCriterion("M_ID like", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotLike(String value) {
            addCriterion("M_ID not like", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<String> values) {
            addCriterion("M_ID in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<String> values) {
            addCriterion("M_ID not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(String value1, String value2) {
            addCriterion("M_ID between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(String value1, String value2) {
            addCriterion("M_ID not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMTextIsNull() {
            addCriterion("M_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andMTextIsNotNull() {
            addCriterion("M_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andMTextEqualTo(String value) {
            addCriterion("M_TEXT =", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextNotEqualTo(String value) {
            addCriterion("M_TEXT <>", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextGreaterThan(String value) {
            addCriterion("M_TEXT >", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextGreaterThanOrEqualTo(String value) {
            addCriterion("M_TEXT >=", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextLessThan(String value) {
            addCriterion("M_TEXT <", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextLessThanOrEqualTo(String value) {
            addCriterion("M_TEXT <=", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextLike(String value) {
            addCriterion("M_TEXT like", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextNotLike(String value) {
            addCriterion("M_TEXT not like", value, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextIn(List<String> values) {
            addCriterion("M_TEXT in", values, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextNotIn(List<String> values) {
            addCriterion("M_TEXT not in", values, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextBetween(String value1, String value2) {
            addCriterion("M_TEXT between", value1, value2, "mText");
            return (Criteria) this;
        }

        public Criteria andMTextNotBetween(String value1, String value2) {
            addCriterion("M_TEXT not between", value1, value2, "mText");
            return (Criteria) this;
        }

        public Criteria andMParentIdIsNull() {
            addCriterion("M_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMParentIdIsNotNull() {
            addCriterion("M_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMParentIdEqualTo(String value) {
            addCriterion("M_PARENT_ID =", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdNotEqualTo(String value) {
            addCriterion("M_PARENT_ID <>", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdGreaterThan(String value) {
            addCriterion("M_PARENT_ID >", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("M_PARENT_ID >=", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdLessThan(String value) {
            addCriterion("M_PARENT_ID <", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdLessThanOrEqualTo(String value) {
            addCriterion("M_PARENT_ID <=", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdLike(String value) {
            addCriterion("M_PARENT_ID like", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdNotLike(String value) {
            addCriterion("M_PARENT_ID not like", value, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdIn(List<String> values) {
            addCriterion("M_PARENT_ID in", values, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdNotIn(List<String> values) {
            addCriterion("M_PARENT_ID not in", values, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdBetween(String value1, String value2) {
            addCriterion("M_PARENT_ID between", value1, value2, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMParentIdNotBetween(String value1, String value2) {
            addCriterion("M_PARENT_ID not between", value1, value2, "mParentId");
            return (Criteria) this;
        }

        public Criteria andMDescIsNull() {
            addCriterion("M_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMDescIsNotNull() {
            addCriterion("M_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMDescEqualTo(String value) {
            addCriterion("M_DESC =", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotEqualTo(String value) {
            addCriterion("M_DESC <>", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescGreaterThan(String value) {
            addCriterion("M_DESC >", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescGreaterThanOrEqualTo(String value) {
            addCriterion("M_DESC >=", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescLessThan(String value) {
            addCriterion("M_DESC <", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescLessThanOrEqualTo(String value) {
            addCriterion("M_DESC <=", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescLike(String value) {
            addCriterion("M_DESC like", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotLike(String value) {
            addCriterion("M_DESC not like", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescIn(List<String> values) {
            addCriterion("M_DESC in", values, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotIn(List<String> values) {
            addCriterion("M_DESC not in", values, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescBetween(String value1, String value2) {
            addCriterion("M_DESC between", value1, value2, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotBetween(String value1, String value2) {
            addCriterion("M_DESC not between", value1, value2, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDateIsNull() {
            addCriterion("M_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMDateIsNotNull() {
            addCriterion("M_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMDateEqualTo(String value) {
            addCriterion("M_DATE =", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotEqualTo(String value) {
            addCriterion("M_DATE <>", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThan(String value) {
            addCriterion("M_DATE >", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThanOrEqualTo(String value) {
            addCriterion("M_DATE >=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThan(String value) {
            addCriterion("M_DATE <", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThanOrEqualTo(String value) {
            addCriterion("M_DATE <=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLike(String value) {
            addCriterion("M_DATE like", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotLike(String value) {
            addCriterion("M_DATE not like", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateIn(List<String> values) {
            addCriterion("M_DATE in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotIn(List<String> values) {
            addCriterion("M_DATE not in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateBetween(String value1, String value2) {
            addCriterion("M_DATE between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotBetween(String value1, String value2) {
            addCriterion("M_DATE not between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMEnableIsNull() {
            addCriterion("M_ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andMEnableIsNotNull() {
            addCriterion("M_ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andMEnableEqualTo(String value) {
            addCriterion("M_ENABLE =", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableNotEqualTo(String value) {
            addCriterion("M_ENABLE <>", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableGreaterThan(String value) {
            addCriterion("M_ENABLE >", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableGreaterThanOrEqualTo(String value) {
            addCriterion("M_ENABLE >=", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableLessThan(String value) {
            addCriterion("M_ENABLE <", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableLessThanOrEqualTo(String value) {
            addCriterion("M_ENABLE <=", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableLike(String value) {
            addCriterion("M_ENABLE like", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableNotLike(String value) {
            addCriterion("M_ENABLE not like", value, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableIn(List<String> values) {
            addCriterion("M_ENABLE in", values, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableNotIn(List<String> values) {
            addCriterion("M_ENABLE not in", values, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableBetween(String value1, String value2) {
            addCriterion("M_ENABLE between", value1, value2, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMEnableNotBetween(String value1, String value2) {
            addCriterion("M_ENABLE not between", value1, value2, "mEnable");
            return (Criteria) this;
        }

        public Criteria andMUrlIsNull() {
            addCriterion("M_URL is null");
            return (Criteria) this;
        }

        public Criteria andMUrlIsNotNull() {
            addCriterion("M_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMUrlEqualTo(String value) {
            addCriterion("M_URL =", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotEqualTo(String value) {
            addCriterion("M_URL <>", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlGreaterThan(String value) {
            addCriterion("M_URL >", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlGreaterThanOrEqualTo(String value) {
            addCriterion("M_URL >=", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLessThan(String value) {
            addCriterion("M_URL <", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLessThanOrEqualTo(String value) {
            addCriterion("M_URL <=", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLike(String value) {
            addCriterion("M_URL like", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotLike(String value) {
            addCriterion("M_URL not like", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlIn(List<String> values) {
            addCriterion("M_URL in", values, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotIn(List<String> values) {
            addCriterion("M_URL not in", values, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlBetween(String value1, String value2) {
            addCriterion("M_URL between", value1, value2, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotBetween(String value1, String value2) {
            addCriterion("M_URL not between", value1, value2, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMIconIsNull() {
            addCriterion("M_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMIconIsNotNull() {
            addCriterion("M_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMIconEqualTo(String value) {
            addCriterion("M_ICON =", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotEqualTo(String value) {
            addCriterion("M_ICON <>", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconGreaterThan(String value) {
            addCriterion("M_ICON >", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconGreaterThanOrEqualTo(String value) {
            addCriterion("M_ICON >=", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconLessThan(String value) {
            addCriterion("M_ICON <", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconLessThanOrEqualTo(String value) {
            addCriterion("M_ICON <=", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconLike(String value) {
            addCriterion("M_ICON like", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotLike(String value) {
            addCriterion("M_ICON not like", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconIn(List<String> values) {
            addCriterion("M_ICON in", values, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotIn(List<String> values) {
            addCriterion("M_ICON not in", values, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconBetween(String value1, String value2) {
            addCriterion("M_ICON between", value1, value2, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotBetween(String value1, String value2) {
            addCriterion("M_ICON not between", value1, value2, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMStateIsNull() {
            addCriterion("M_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMStateIsNotNull() {
            addCriterion("M_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMStateEqualTo(String value) {
            addCriterion("M_STATE =", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotEqualTo(String value) {
            addCriterion("M_STATE <>", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateGreaterThan(String value) {
            addCriterion("M_STATE >", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateGreaterThanOrEqualTo(String value) {
            addCriterion("M_STATE >=", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateLessThan(String value) {
            addCriterion("M_STATE <", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateLessThanOrEqualTo(String value) {
            addCriterion("M_STATE <=", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateLike(String value) {
            addCriterion("M_STATE like", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotLike(String value) {
            addCriterion("M_STATE not like", value, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateIn(List<String> values) {
            addCriterion("M_STATE in", values, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotIn(List<String> values) {
            addCriterion("M_STATE not in", values, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateBetween(String value1, String value2) {
            addCriterion("M_STATE between", value1, value2, "mState");
            return (Criteria) this;
        }

        public Criteria andMStateNotBetween(String value1, String value2) {
            addCriterion("M_STATE not between", value1, value2, "mState");
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