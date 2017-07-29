package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TModuleExample() {
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

        public Criteria andMNameIsNull() {
            addCriterion("M_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("M_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("M_NAME =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("M_NAME <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("M_NAME >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("M_NAME >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("M_NAME <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("M_NAME <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("M_NAME like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("M_NAME not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("M_NAME in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("M_NAME not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("M_NAME between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("M_NAME not between", value1, value2, "mName");
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

        public Criteria andMOfDatasourceIsNull() {
            addCriterion("M_OF_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceIsNotNull() {
            addCriterion("M_OF_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceEqualTo(String value) {
            addCriterion("M_OF_DATASOURCE =", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceNotEqualTo(String value) {
            addCriterion("M_OF_DATASOURCE <>", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceGreaterThan(String value) {
            addCriterion("M_OF_DATASOURCE >", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("M_OF_DATASOURCE >=", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceLessThan(String value) {
            addCriterion("M_OF_DATASOURCE <", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceLessThanOrEqualTo(String value) {
            addCriterion("M_OF_DATASOURCE <=", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceLike(String value) {
            addCriterion("M_OF_DATASOURCE like", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceNotLike(String value) {
            addCriterion("M_OF_DATASOURCE not like", value, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceIn(List<String> values) {
            addCriterion("M_OF_DATASOURCE in", values, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceNotIn(List<String> values) {
            addCriterion("M_OF_DATASOURCE not in", values, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceBetween(String value1, String value2) {
            addCriterion("M_OF_DATASOURCE between", value1, value2, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfDatasourceNotBetween(String value1, String value2) {
            addCriterion("M_OF_DATASOURCE not between", value1, value2, "mOfDatasource");
            return (Criteria) this;
        }

        public Criteria andMOfProjectIsNull() {
            addCriterion("M_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andMOfProjectIsNotNull() {
            addCriterion("M_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andMOfProjectEqualTo(String value) {
            addCriterion("M_OF_PROJECT =", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectNotEqualTo(String value) {
            addCriterion("M_OF_PROJECT <>", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectGreaterThan(String value) {
            addCriterion("M_OF_PROJECT >", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("M_OF_PROJECT >=", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectLessThan(String value) {
            addCriterion("M_OF_PROJECT <", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectLessThanOrEqualTo(String value) {
            addCriterion("M_OF_PROJECT <=", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectLike(String value) {
            addCriterion("M_OF_PROJECT like", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectNotLike(String value) {
            addCriterion("M_OF_PROJECT not like", value, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectIn(List<String> values) {
            addCriterion("M_OF_PROJECT in", values, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectNotIn(List<String> values) {
            addCriterion("M_OF_PROJECT not in", values, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectBetween(String value1, String value2) {
            addCriterion("M_OF_PROJECT between", value1, value2, "mOfProject");
            return (Criteria) this;
        }

        public Criteria andMOfProjectNotBetween(String value1, String value2) {
            addCriterion("M_OF_PROJECT not between", value1, value2, "mOfProject");
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