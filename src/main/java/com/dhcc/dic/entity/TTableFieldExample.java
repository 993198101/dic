package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TTableFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTableFieldExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("F_ID is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(String value) {
            addCriterion("F_ID =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(String value) {
            addCriterion("F_ID <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(String value) {
            addCriterion("F_ID >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_ID >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(String value) {
            addCriterion("F_ID <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(String value) {
            addCriterion("F_ID <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLike(String value) {
            addCriterion("F_ID like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotLike(String value) {
            addCriterion("F_ID not like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<String> values) {
            addCriterion("F_ID in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<String> values) {
            addCriterion("F_ID not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(String value1, String value2) {
            addCriterion("F_ID between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(String value1, String value2) {
            addCriterion("F_ID not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("F_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("F_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("F_NAME =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("F_NAME <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("F_NAME >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_NAME >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("F_NAME <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("F_NAME <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("F_NAME like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("F_NAME not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("F_NAME in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("F_NAME not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("F_NAME between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("F_NAME not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFCnNameIsNull() {
            addCriterion("F_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFCnNameIsNotNull() {
            addCriterion("F_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFCnNameEqualTo(String value) {
            addCriterion("F_CN_NAME =", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameNotEqualTo(String value) {
            addCriterion("F_CN_NAME <>", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameGreaterThan(String value) {
            addCriterion("F_CN_NAME >", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_CN_NAME >=", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameLessThan(String value) {
            addCriterion("F_CN_NAME <", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameLessThanOrEqualTo(String value) {
            addCriterion("F_CN_NAME <=", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameLike(String value) {
            addCriterion("F_CN_NAME like", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameNotLike(String value) {
            addCriterion("F_CN_NAME not like", value, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameIn(List<String> values) {
            addCriterion("F_CN_NAME in", values, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameNotIn(List<String> values) {
            addCriterion("F_CN_NAME not in", values, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameBetween(String value1, String value2) {
            addCriterion("F_CN_NAME between", value1, value2, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFCnNameNotBetween(String value1, String value2) {
            addCriterion("F_CN_NAME not between", value1, value2, "fCnName");
            return (Criteria) this;
        }

        public Criteria andFAliasIsNull() {
            addCriterion("F_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andFAliasIsNotNull() {
            addCriterion("F_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andFAliasEqualTo(String value) {
            addCriterion("F_ALIAS =", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotEqualTo(String value) {
            addCriterion("F_ALIAS <>", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasGreaterThan(String value) {
            addCriterion("F_ALIAS >", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasGreaterThanOrEqualTo(String value) {
            addCriterion("F_ALIAS >=", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasLessThan(String value) {
            addCriterion("F_ALIAS <", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasLessThanOrEqualTo(String value) {
            addCriterion("F_ALIAS <=", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasLike(String value) {
            addCriterion("F_ALIAS like", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotLike(String value) {
            addCriterion("F_ALIAS not like", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasIn(List<String> values) {
            addCriterion("F_ALIAS in", values, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotIn(List<String> values) {
            addCriterion("F_ALIAS not in", values, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasBetween(String value1, String value2) {
            addCriterion("F_ALIAS between", value1, value2, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotBetween(String value1, String value2) {
            addCriterion("F_ALIAS not between", value1, value2, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeIsNull() {
            addCriterion("F_CTRL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeIsNotNull() {
            addCriterion("F_CTRL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeEqualTo(String value) {
            addCriterion("F_CTRL_TYPE =", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeNotEqualTo(String value) {
            addCriterion("F_CTRL_TYPE <>", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeGreaterThan(String value) {
            addCriterion("F_CTRL_TYPE >", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_CTRL_TYPE >=", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeLessThan(String value) {
            addCriterion("F_CTRL_TYPE <", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeLessThanOrEqualTo(String value) {
            addCriterion("F_CTRL_TYPE <=", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeLike(String value) {
            addCriterion("F_CTRL_TYPE like", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeNotLike(String value) {
            addCriterion("F_CTRL_TYPE not like", value, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeIn(List<String> values) {
            addCriterion("F_CTRL_TYPE in", values, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeNotIn(List<String> values) {
            addCriterion("F_CTRL_TYPE not in", values, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeBetween(String value1, String value2) {
            addCriterion("F_CTRL_TYPE between", value1, value2, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFCtrlTypeNotBetween(String value1, String value2) {
            addCriterion("F_CTRL_TYPE not between", value1, value2, "fCtrlType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeIsNull() {
            addCriterion("F_FUNC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeIsNotNull() {
            addCriterion("F_FUNC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeEqualTo(String value) {
            addCriterion("F_FUNC_TYPE =", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeNotEqualTo(String value) {
            addCriterion("F_FUNC_TYPE <>", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeGreaterThan(String value) {
            addCriterion("F_FUNC_TYPE >", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_FUNC_TYPE >=", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeLessThan(String value) {
            addCriterion("F_FUNC_TYPE <", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeLessThanOrEqualTo(String value) {
            addCriterion("F_FUNC_TYPE <=", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeLike(String value) {
            addCriterion("F_FUNC_TYPE like", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeNotLike(String value) {
            addCriterion("F_FUNC_TYPE not like", value, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeIn(List<String> values) {
            addCriterion("F_FUNC_TYPE in", values, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeNotIn(List<String> values) {
            addCriterion("F_FUNC_TYPE not in", values, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeBetween(String value1, String value2) {
            addCriterion("F_FUNC_TYPE between", value1, value2, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFFuncTypeNotBetween(String value1, String value2) {
            addCriterion("F_FUNC_TYPE not between", value1, value2, "fFuncType");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsIsNull() {
            addCriterion("F_CTRL_CONSTRAINTS is null");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsIsNotNull() {
            addCriterion("F_CTRL_CONSTRAINTS is not null");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsEqualTo(String value) {
            addCriterion("F_CTRL_CONSTRAINTS =", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsNotEqualTo(String value) {
            addCriterion("F_CTRL_CONSTRAINTS <>", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsGreaterThan(String value) {
            addCriterion("F_CTRL_CONSTRAINTS >", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsGreaterThanOrEqualTo(String value) {
            addCriterion("F_CTRL_CONSTRAINTS >=", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsLessThan(String value) {
            addCriterion("F_CTRL_CONSTRAINTS <", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsLessThanOrEqualTo(String value) {
            addCriterion("F_CTRL_CONSTRAINTS <=", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsLike(String value) {
            addCriterion("F_CTRL_CONSTRAINTS like", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsNotLike(String value) {
            addCriterion("F_CTRL_CONSTRAINTS not like", value, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsIn(List<String> values) {
            addCriterion("F_CTRL_CONSTRAINTS in", values, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsNotIn(List<String> values) {
            addCriterion("F_CTRL_CONSTRAINTS not in", values, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsBetween(String value1, String value2) {
            addCriterion("F_CTRL_CONSTRAINTS between", value1, value2, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFCtrlConstraintsNotBetween(String value1, String value2) {
            addCriterion("F_CTRL_CONSTRAINTS not between", value1, value2, "fCtrlConstraints");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("F_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("F_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("F_TYPE =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("F_TYPE <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("F_TYPE >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_TYPE >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("F_TYPE <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("F_TYPE <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("F_TYPE like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("F_TYPE not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("F_TYPE in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("F_TYPE not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("F_TYPE between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("F_TYPE not between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFSizeIsNull() {
            addCriterion("F_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFSizeIsNotNull() {
            addCriterion("F_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFSizeEqualTo(String value) {
            addCriterion("F_SIZE =", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotEqualTo(String value) {
            addCriterion("F_SIZE <>", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeGreaterThan(String value) {
            addCriterion("F_SIZE >", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeGreaterThanOrEqualTo(String value) {
            addCriterion("F_SIZE >=", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeLessThan(String value) {
            addCriterion("F_SIZE <", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeLessThanOrEqualTo(String value) {
            addCriterion("F_SIZE <=", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeLike(String value) {
            addCriterion("F_SIZE like", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotLike(String value) {
            addCriterion("F_SIZE not like", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeIn(List<String> values) {
            addCriterion("F_SIZE in", values, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotIn(List<String> values) {
            addCriterion("F_SIZE not in", values, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeBetween(String value1, String value2) {
            addCriterion("F_SIZE between", value1, value2, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotBetween(String value1, String value2) {
            addCriterion("F_SIZE not between", value1, value2, "fSize");
            return (Criteria) this;
        }

        public Criteria andFScaleIsNull() {
            addCriterion("F_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andFScaleIsNotNull() {
            addCriterion("F_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andFScaleEqualTo(String value) {
            addCriterion("F_SCALE =", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleNotEqualTo(String value) {
            addCriterion("F_SCALE <>", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleGreaterThan(String value) {
            addCriterion("F_SCALE >", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleGreaterThanOrEqualTo(String value) {
            addCriterion("F_SCALE >=", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleLessThan(String value) {
            addCriterion("F_SCALE <", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleLessThanOrEqualTo(String value) {
            addCriterion("F_SCALE <=", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleLike(String value) {
            addCriterion("F_SCALE like", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleNotLike(String value) {
            addCriterion("F_SCALE not like", value, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleIn(List<String> values) {
            addCriterion("F_SCALE in", values, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleNotIn(List<String> values) {
            addCriterion("F_SCALE not in", values, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleBetween(String value1, String value2) {
            addCriterion("F_SCALE between", value1, value2, "fScale");
            return (Criteria) this;
        }

        public Criteria andFScaleNotBetween(String value1, String value2) {
            addCriterion("F_SCALE not between", value1, value2, "fScale");
            return (Criteria) this;
        }

        public Criteria andFDefaultIsNull() {
            addCriterion("F_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andFDefaultIsNotNull() {
            addCriterion("F_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andFDefaultEqualTo(String value) {
            addCriterion("F_DEFAULT =", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultNotEqualTo(String value) {
            addCriterion("F_DEFAULT <>", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultGreaterThan(String value) {
            addCriterion("F_DEFAULT >", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("F_DEFAULT >=", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultLessThan(String value) {
            addCriterion("F_DEFAULT <", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultLessThanOrEqualTo(String value) {
            addCriterion("F_DEFAULT <=", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultLike(String value) {
            addCriterion("F_DEFAULT like", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultNotLike(String value) {
            addCriterion("F_DEFAULT not like", value, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultIn(List<String> values) {
            addCriterion("F_DEFAULT in", values, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultNotIn(List<String> values) {
            addCriterion("F_DEFAULT not in", values, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultBetween(String value1, String value2) {
            addCriterion("F_DEFAULT between", value1, value2, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFDefaultNotBetween(String value1, String value2) {
            addCriterion("F_DEFAULT not between", value1, value2, "fDefault");
            return (Criteria) this;
        }

        public Criteria andFCommentIsNull() {
            addCriterion("F_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andFCommentIsNotNull() {
            addCriterion("F_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andFCommentEqualTo(String value) {
            addCriterion("F_COMMENT =", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentNotEqualTo(String value) {
            addCriterion("F_COMMENT <>", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentGreaterThan(String value) {
            addCriterion("F_COMMENT >", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentGreaterThanOrEqualTo(String value) {
            addCriterion("F_COMMENT >=", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentLessThan(String value) {
            addCriterion("F_COMMENT <", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentLessThanOrEqualTo(String value) {
            addCriterion("F_COMMENT <=", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentLike(String value) {
            addCriterion("F_COMMENT like", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentNotLike(String value) {
            addCriterion("F_COMMENT not like", value, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentIn(List<String> values) {
            addCriterion("F_COMMENT in", values, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentNotIn(List<String> values) {
            addCriterion("F_COMMENT not in", values, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentBetween(String value1, String value2) {
            addCriterion("F_COMMENT between", value1, value2, "fComment");
            return (Criteria) this;
        }

        public Criteria andFCommentNotBetween(String value1, String value2) {
            addCriterion("F_COMMENT not between", value1, value2, "fComment");
            return (Criteria) this;
        }

        public Criteria andFNullableIsNull() {
            addCriterion("F_NULLABLE is null");
            return (Criteria) this;
        }

        public Criteria andFNullableIsNotNull() {
            addCriterion("F_NULLABLE is not null");
            return (Criteria) this;
        }

        public Criteria andFNullableEqualTo(String value) {
            addCriterion("F_NULLABLE =", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableNotEqualTo(String value) {
            addCriterion("F_NULLABLE <>", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableGreaterThan(String value) {
            addCriterion("F_NULLABLE >", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableGreaterThanOrEqualTo(String value) {
            addCriterion("F_NULLABLE >=", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableLessThan(String value) {
            addCriterion("F_NULLABLE <", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableLessThanOrEqualTo(String value) {
            addCriterion("F_NULLABLE <=", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableLike(String value) {
            addCriterion("F_NULLABLE like", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableNotLike(String value) {
            addCriterion("F_NULLABLE not like", value, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableIn(List<String> values) {
            addCriterion("F_NULLABLE in", values, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableNotIn(List<String> values) {
            addCriterion("F_NULLABLE not in", values, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableBetween(String value1, String value2) {
            addCriterion("F_NULLABLE between", value1, value2, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFNullableNotBetween(String value1, String value2) {
            addCriterion("F_NULLABLE not between", value1, value2, "fNullable");
            return (Criteria) this;
        }

        public Criteria andFDescIsNull() {
            addCriterion("F_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFDescIsNotNull() {
            addCriterion("F_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFDescEqualTo(String value) {
            addCriterion("F_DESC =", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotEqualTo(String value) {
            addCriterion("F_DESC <>", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThan(String value) {
            addCriterion("F_DESC >", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThanOrEqualTo(String value) {
            addCriterion("F_DESC >=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThan(String value) {
            addCriterion("F_DESC <", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThanOrEqualTo(String value) {
            addCriterion("F_DESC <=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLike(String value) {
            addCriterion("F_DESC like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotLike(String value) {
            addCriterion("F_DESC not like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescIn(List<String> values) {
            addCriterion("F_DESC in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotIn(List<String> values) {
            addCriterion("F_DESC not in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescBetween(String value1, String value2) {
            addCriterion("F_DESC between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotBetween(String value1, String value2) {
            addCriterion("F_DESC not between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFShowNumberIsNull() {
            addCriterion("F_SHOW_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFShowNumberIsNotNull() {
            addCriterion("F_SHOW_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFShowNumberEqualTo(String value) {
            addCriterion("F_SHOW_NUMBER =", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberNotEqualTo(String value) {
            addCriterion("F_SHOW_NUMBER <>", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberGreaterThan(String value) {
            addCriterion("F_SHOW_NUMBER >", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberGreaterThanOrEqualTo(String value) {
            addCriterion("F_SHOW_NUMBER >=", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberLessThan(String value) {
            addCriterion("F_SHOW_NUMBER <", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberLessThanOrEqualTo(String value) {
            addCriterion("F_SHOW_NUMBER <=", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberLike(String value) {
            addCriterion("F_SHOW_NUMBER like", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberNotLike(String value) {
            addCriterion("F_SHOW_NUMBER not like", value, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberIn(List<String> values) {
            addCriterion("F_SHOW_NUMBER in", values, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberNotIn(List<String> values) {
            addCriterion("F_SHOW_NUMBER not in", values, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberBetween(String value1, String value2) {
            addCriterion("F_SHOW_NUMBER between", value1, value2, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFShowNumberNotBetween(String value1, String value2) {
            addCriterion("F_SHOW_NUMBER not between", value1, value2, "fShowNumber");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryIsNull() {
            addCriterion("F_IS_SUIT_QUERY is null");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryIsNotNull() {
            addCriterion("F_IS_SUIT_QUERY is not null");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryEqualTo(String value) {
            addCriterion("F_IS_SUIT_QUERY =", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryNotEqualTo(String value) {
            addCriterion("F_IS_SUIT_QUERY <>", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryGreaterThan(String value) {
            addCriterion("F_IS_SUIT_QUERY >", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryGreaterThanOrEqualTo(String value) {
            addCriterion("F_IS_SUIT_QUERY >=", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryLessThan(String value) {
            addCriterion("F_IS_SUIT_QUERY <", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryLessThanOrEqualTo(String value) {
            addCriterion("F_IS_SUIT_QUERY <=", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryLike(String value) {
            addCriterion("F_IS_SUIT_QUERY like", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryNotLike(String value) {
            addCriterion("F_IS_SUIT_QUERY not like", value, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryIn(List<String> values) {
            addCriterion("F_IS_SUIT_QUERY in", values, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryNotIn(List<String> values) {
            addCriterion("F_IS_SUIT_QUERY not in", values, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryBetween(String value1, String value2) {
            addCriterion("F_IS_SUIT_QUERY between", value1, value2, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFIsSuitQueryNotBetween(String value1, String value2) {
            addCriterion("F_IS_SUIT_QUERY not between", value1, value2, "fIsSuitQuery");
            return (Criteria) this;
        }

        public Criteria andFShowRowIsNull() {
            addCriterion("F_SHOW_ROW is null");
            return (Criteria) this;
        }

        public Criteria andFShowRowIsNotNull() {
            addCriterion("F_SHOW_ROW is not null");
            return (Criteria) this;
        }

        public Criteria andFShowRowEqualTo(String value) {
            addCriterion("F_SHOW_ROW =", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowNotEqualTo(String value) {
            addCriterion("F_SHOW_ROW <>", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowGreaterThan(String value) {
            addCriterion("F_SHOW_ROW >", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowGreaterThanOrEqualTo(String value) {
            addCriterion("F_SHOW_ROW >=", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowLessThan(String value) {
            addCriterion("F_SHOW_ROW <", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowLessThanOrEqualTo(String value) {
            addCriterion("F_SHOW_ROW <=", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowLike(String value) {
            addCriterion("F_SHOW_ROW like", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowNotLike(String value) {
            addCriterion("F_SHOW_ROW not like", value, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowIn(List<String> values) {
            addCriterion("F_SHOW_ROW in", values, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowNotIn(List<String> values) {
            addCriterion("F_SHOW_ROW not in", values, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowBetween(String value1, String value2) {
            addCriterion("F_SHOW_ROW between", value1, value2, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowRowNotBetween(String value1, String value2) {
            addCriterion("F_SHOW_ROW not between", value1, value2, "fShowRow");
            return (Criteria) this;
        }

        public Criteria andFShowColIsNull() {
            addCriterion("F_SHOW_COL is null");
            return (Criteria) this;
        }

        public Criteria andFShowColIsNotNull() {
            addCriterion("F_SHOW_COL is not null");
            return (Criteria) this;
        }

        public Criteria andFShowColEqualTo(String value) {
            addCriterion("F_SHOW_COL =", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColNotEqualTo(String value) {
            addCriterion("F_SHOW_COL <>", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColGreaterThan(String value) {
            addCriterion("F_SHOW_COL >", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColGreaterThanOrEqualTo(String value) {
            addCriterion("F_SHOW_COL >=", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColLessThan(String value) {
            addCriterion("F_SHOW_COL <", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColLessThanOrEqualTo(String value) {
            addCriterion("F_SHOW_COL <=", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColLike(String value) {
            addCriterion("F_SHOW_COL like", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColNotLike(String value) {
            addCriterion("F_SHOW_COL not like", value, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColIn(List<String> values) {
            addCriterion("F_SHOW_COL in", values, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColNotIn(List<String> values) {
            addCriterion("F_SHOW_COL not in", values, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColBetween(String value1, String value2) {
            addCriterion("F_SHOW_COL between", value1, value2, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowColNotBetween(String value1, String value2) {
            addCriterion("F_SHOW_COL not between", value1, value2, "fShowCol");
            return (Criteria) this;
        }

        public Criteria andFShowableIsNull() {
            addCriterion("F_SHOWABLE is null");
            return (Criteria) this;
        }

        public Criteria andFShowableIsNotNull() {
            addCriterion("F_SHOWABLE is not null");
            return (Criteria) this;
        }

        public Criteria andFShowableEqualTo(String value) {
            addCriterion("F_SHOWABLE =", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableNotEqualTo(String value) {
            addCriterion("F_SHOWABLE <>", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableGreaterThan(String value) {
            addCriterion("F_SHOWABLE >", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableGreaterThanOrEqualTo(String value) {
            addCriterion("F_SHOWABLE >=", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableLessThan(String value) {
            addCriterion("F_SHOWABLE <", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableLessThanOrEqualTo(String value) {
            addCriterion("F_SHOWABLE <=", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableLike(String value) {
            addCriterion("F_SHOWABLE like", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableNotLike(String value) {
            addCriterion("F_SHOWABLE not like", value, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableIn(List<String> values) {
            addCriterion("F_SHOWABLE in", values, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableNotIn(List<String> values) {
            addCriterion("F_SHOWABLE not in", values, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableBetween(String value1, String value2) {
            addCriterion("F_SHOWABLE between", value1, value2, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFShowableNotBetween(String value1, String value2) {
            addCriterion("F_SHOWABLE not between", value1, value2, "fShowable");
            return (Criteria) this;
        }

        public Criteria andFDataElementIsNull() {
            addCriterion("F_DATA_ELEMENT is null");
            return (Criteria) this;
        }

        public Criteria andFDataElementIsNotNull() {
            addCriterion("F_DATA_ELEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andFDataElementEqualTo(String value) {
            addCriterion("F_DATA_ELEMENT =", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementNotEqualTo(String value) {
            addCriterion("F_DATA_ELEMENT <>", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementGreaterThan(String value) {
            addCriterion("F_DATA_ELEMENT >", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementGreaterThanOrEqualTo(String value) {
            addCriterion("F_DATA_ELEMENT >=", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementLessThan(String value) {
            addCriterion("F_DATA_ELEMENT <", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementLessThanOrEqualTo(String value) {
            addCriterion("F_DATA_ELEMENT <=", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementLike(String value) {
            addCriterion("F_DATA_ELEMENT like", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementNotLike(String value) {
            addCriterion("F_DATA_ELEMENT not like", value, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementIn(List<String> values) {
            addCriterion("F_DATA_ELEMENT in", values, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementNotIn(List<String> values) {
            addCriterion("F_DATA_ELEMENT not in", values, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementBetween(String value1, String value2) {
            addCriterion("F_DATA_ELEMENT between", value1, value2, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFDataElementNotBetween(String value1, String value2) {
            addCriterion("F_DATA_ELEMENT not between", value1, value2, "fDataElement");
            return (Criteria) this;
        }

        public Criteria andFOfTableIsNull() {
            addCriterion("F_OF_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andFOfTableIsNotNull() {
            addCriterion("F_OF_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andFOfTableEqualTo(String value) {
            addCriterion("F_OF_TABLE =", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableNotEqualTo(String value) {
            addCriterion("F_OF_TABLE <>", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableGreaterThan(String value) {
            addCriterion("F_OF_TABLE >", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableGreaterThanOrEqualTo(String value) {
            addCriterion("F_OF_TABLE >=", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableLessThan(String value) {
            addCriterion("F_OF_TABLE <", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableLessThanOrEqualTo(String value) {
            addCriterion("F_OF_TABLE <=", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableLike(String value) {
            addCriterion("F_OF_TABLE like", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableNotLike(String value) {
            addCriterion("F_OF_TABLE not like", value, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableIn(List<String> values) {
            addCriterion("F_OF_TABLE in", values, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableNotIn(List<String> values) {
            addCriterion("F_OF_TABLE not in", values, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableBetween(String value1, String value2) {
            addCriterion("F_OF_TABLE between", value1, value2, "fOfTable");
            return (Criteria) this;
        }

        public Criteria andFOfTableNotBetween(String value1, String value2) {
            addCriterion("F_OF_TABLE not between", value1, value2, "fOfTable");
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