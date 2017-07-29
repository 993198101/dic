package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRelationExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("R_ID is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("R_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(String value) {
            addCriterion("R_ID =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(String value) {
            addCriterion("R_ID <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(String value) {
            addCriterion("R_ID >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(String value) {
            addCriterion("R_ID >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(String value) {
            addCriterion("R_ID <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(String value) {
            addCriterion("R_ID <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLike(String value) {
            addCriterion("R_ID like", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotLike(String value) {
            addCriterion("R_ID not like", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<String> values) {
            addCriterion("R_ID in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<String> values) {
            addCriterion("R_ID not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(String value1, String value2) {
            addCriterion("R_ID between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(String value1, String value2) {
            addCriterion("R_ID not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdIsNull() {
            addCriterion("R_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andRMenuIdIsNotNull() {
            addCriterion("R_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRMenuIdEqualTo(String value) {
            addCriterion("R_MENU_ID =", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdNotEqualTo(String value) {
            addCriterion("R_MENU_ID <>", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdGreaterThan(String value) {
            addCriterion("R_MENU_ID >", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("R_MENU_ID >=", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdLessThan(String value) {
            addCriterion("R_MENU_ID <", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdLessThanOrEqualTo(String value) {
            addCriterion("R_MENU_ID <=", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdLike(String value) {
            addCriterion("R_MENU_ID like", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdNotLike(String value) {
            addCriterion("R_MENU_ID not like", value, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdIn(List<String> values) {
            addCriterion("R_MENU_ID in", values, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdNotIn(List<String> values) {
            addCriterion("R_MENU_ID not in", values, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdBetween(String value1, String value2) {
            addCriterion("R_MENU_ID between", value1, value2, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuIdNotBetween(String value1, String value2) {
            addCriterion("R_MENU_ID not between", value1, value2, "rMenuId");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeIsNull() {
            addCriterion("R_MENU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeIsNotNull() {
            addCriterion("R_MENU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeEqualTo(String value) {
            addCriterion("R_MENU_TYPE =", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeNotEqualTo(String value) {
            addCriterion("R_MENU_TYPE <>", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeGreaterThan(String value) {
            addCriterion("R_MENU_TYPE >", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("R_MENU_TYPE >=", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeLessThan(String value) {
            addCriterion("R_MENU_TYPE <", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("R_MENU_TYPE <=", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeLike(String value) {
            addCriterion("R_MENU_TYPE like", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeNotLike(String value) {
            addCriterion("R_MENU_TYPE not like", value, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeIn(List<String> values) {
            addCriterion("R_MENU_TYPE in", values, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeNotIn(List<String> values) {
            addCriterion("R_MENU_TYPE not in", values, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeBetween(String value1, String value2) {
            addCriterion("R_MENU_TYPE between", value1, value2, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRMenuTypeNotBetween(String value1, String value2) {
            addCriterion("R_MENU_TYPE not between", value1, value2, "rMenuType");
            return (Criteria) this;
        }

        public Criteria andRTableIsNull() {
            addCriterion("R_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andRTableIsNotNull() {
            addCriterion("R_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andRTableEqualTo(String value) {
            addCriterion("R_TABLE =", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableNotEqualTo(String value) {
            addCriterion("R_TABLE <>", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableGreaterThan(String value) {
            addCriterion("R_TABLE >", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableGreaterThanOrEqualTo(String value) {
            addCriterion("R_TABLE >=", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableLessThan(String value) {
            addCriterion("R_TABLE <", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableLessThanOrEqualTo(String value) {
            addCriterion("R_TABLE <=", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableLike(String value) {
            addCriterion("R_TABLE like", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableNotLike(String value) {
            addCriterion("R_TABLE not like", value, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableIn(List<String> values) {
            addCriterion("R_TABLE in", values, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableNotIn(List<String> values) {
            addCriterion("R_TABLE not in", values, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableBetween(String value1, String value2) {
            addCriterion("R_TABLE between", value1, value2, "rTable");
            return (Criteria) this;
        }

        public Criteria andRTableNotBetween(String value1, String value2) {
            addCriterion("R_TABLE not between", value1, value2, "rTable");
            return (Criteria) this;
        }

        public Criteria andRPkIdIsNull() {
            addCriterion("R_PK_ID is null");
            return (Criteria) this;
        }

        public Criteria andRPkIdIsNotNull() {
            addCriterion("R_PK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRPkIdEqualTo(String value) {
            addCriterion("R_PK_ID =", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdNotEqualTo(String value) {
            addCriterion("R_PK_ID <>", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdGreaterThan(String value) {
            addCriterion("R_PK_ID >", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("R_PK_ID >=", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdLessThan(String value) {
            addCriterion("R_PK_ID <", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdLessThanOrEqualTo(String value) {
            addCriterion("R_PK_ID <=", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdLike(String value) {
            addCriterion("R_PK_ID like", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdNotLike(String value) {
            addCriterion("R_PK_ID not like", value, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdIn(List<String> values) {
            addCriterion("R_PK_ID in", values, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdNotIn(List<String> values) {
            addCriterion("R_PK_ID not in", values, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdBetween(String value1, String value2) {
            addCriterion("R_PK_ID between", value1, value2, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRPkIdNotBetween(String value1, String value2) {
            addCriterion("R_PK_ID not between", value1, value2, "rPkId");
            return (Criteria) this;
        }

        public Criteria andRDescIsNull() {
            addCriterion("R_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRDescIsNotNull() {
            addCriterion("R_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRDescEqualTo(String value) {
            addCriterion("R_DESC =", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescNotEqualTo(String value) {
            addCriterion("R_DESC <>", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescGreaterThan(String value) {
            addCriterion("R_DESC >", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescGreaterThanOrEqualTo(String value) {
            addCriterion("R_DESC >=", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescLessThan(String value) {
            addCriterion("R_DESC <", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescLessThanOrEqualTo(String value) {
            addCriterion("R_DESC <=", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescLike(String value) {
            addCriterion("R_DESC like", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescNotLike(String value) {
            addCriterion("R_DESC not like", value, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescIn(List<String> values) {
            addCriterion("R_DESC in", values, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescNotIn(List<String> values) {
            addCriterion("R_DESC not in", values, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescBetween(String value1, String value2) {
            addCriterion("R_DESC between", value1, value2, "rDesc");
            return (Criteria) this;
        }

        public Criteria andRDescNotBetween(String value1, String value2) {
            addCriterion("R_DESC not between", value1, value2, "rDesc");
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