package com.dhcc.dic.entity;

import java.util.ArrayList;
import java.util.List;

public class TTablespaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTablespaceExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("T_ID like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("T_ID not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("T_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("T_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("T_NAME =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("T_NAME <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("T_NAME >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_NAME >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("T_NAME <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("T_NAME <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("T_NAME like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("T_NAME not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("T_NAME in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("T_NAME not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("T_NAME between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("T_NAME not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTCnNameIsNull() {
            addCriterion("T_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTCnNameIsNotNull() {
            addCriterion("T_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTCnNameEqualTo(String value) {
            addCriterion("T_CN_NAME =", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotEqualTo(String value) {
            addCriterion("T_CN_NAME <>", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameGreaterThan(String value) {
            addCriterion("T_CN_NAME >", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_CN_NAME >=", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameLessThan(String value) {
            addCriterion("T_CN_NAME <", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameLessThanOrEqualTo(String value) {
            addCriterion("T_CN_NAME <=", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameLike(String value) {
            addCriterion("T_CN_NAME like", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotLike(String value) {
            addCriterion("T_CN_NAME not like", value, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameIn(List<String> values) {
            addCriterion("T_CN_NAME in", values, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotIn(List<String> values) {
            addCriterion("T_CN_NAME not in", values, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameBetween(String value1, String value2) {
            addCriterion("T_CN_NAME between", value1, value2, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTCnNameNotBetween(String value1, String value2) {
            addCriterion("T_CN_NAME not between", value1, value2, "tCnName");
            return (Criteria) this;
        }

        public Criteria andTDescIsNull() {
            addCriterion("T_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTDescIsNotNull() {
            addCriterion("T_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTDescEqualTo(String value) {
            addCriterion("T_DESC =", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotEqualTo(String value) {
            addCriterion("T_DESC <>", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescGreaterThan(String value) {
            addCriterion("T_DESC >", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescGreaterThanOrEqualTo(String value) {
            addCriterion("T_DESC >=", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescLessThan(String value) {
            addCriterion("T_DESC <", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescLessThanOrEqualTo(String value) {
            addCriterion("T_DESC <=", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescLike(String value) {
            addCriterion("T_DESC like", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotLike(String value) {
            addCriterion("T_DESC not like", value, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescIn(List<String> values) {
            addCriterion("T_DESC in", values, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotIn(List<String> values) {
            addCriterion("T_DESC not in", values, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescBetween(String value1, String value2) {
            addCriterion("T_DESC between", value1, value2, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTDescNotBetween(String value1, String value2) {
            addCriterion("T_DESC not between", value1, value2, "tDesc");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNull() {
            addCriterion("T_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNotNull() {
            addCriterion("T_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeEqualTo(String value) {
            addCriterion("T_TYPE =", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotEqualTo(String value) {
            addCriterion("T_TYPE <>", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThan(String value) {
            addCriterion("T_TYPE >", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_TYPE >=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThan(String value) {
            addCriterion("T_TYPE <", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThanOrEqualTo(String value) {
            addCriterion("T_TYPE <=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLike(String value) {
            addCriterion("T_TYPE like", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotLike(String value) {
            addCriterion("T_TYPE not like", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeIn(List<String> values) {
            addCriterion("T_TYPE in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotIn(List<String> values) {
            addCriterion("T_TYPE not in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeBetween(String value1, String value2) {
            addCriterion("T_TYPE between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotBetween(String value1, String value2) {
            addCriterion("T_TYPE not between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTMinExtentIsNull() {
            addCriterion("T_MIN_EXTENT is null");
            return (Criteria) this;
        }

        public Criteria andTMinExtentIsNotNull() {
            addCriterion("T_MIN_EXTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTMinExtentEqualTo(String value) {
            addCriterion("T_MIN_EXTENT =", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentNotEqualTo(String value) {
            addCriterion("T_MIN_EXTENT <>", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentGreaterThan(String value) {
            addCriterion("T_MIN_EXTENT >", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentGreaterThanOrEqualTo(String value) {
            addCriterion("T_MIN_EXTENT >=", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentLessThan(String value) {
            addCriterion("T_MIN_EXTENT <", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentLessThanOrEqualTo(String value) {
            addCriterion("T_MIN_EXTENT <=", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentLike(String value) {
            addCriterion("T_MIN_EXTENT like", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentNotLike(String value) {
            addCriterion("T_MIN_EXTENT not like", value, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentIn(List<String> values) {
            addCriterion("T_MIN_EXTENT in", values, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentNotIn(List<String> values) {
            addCriterion("T_MIN_EXTENT not in", values, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentBetween(String value1, String value2) {
            addCriterion("T_MIN_EXTENT between", value1, value2, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTMinExtentNotBetween(String value1, String value2) {
            addCriterion("T_MIN_EXTENT not between", value1, value2, "tMinExtent");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeIsNull() {
            addCriterion("T_BLOCKSIZE is null");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeIsNotNull() {
            addCriterion("T_BLOCKSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeEqualTo(String value) {
            addCriterion("T_BLOCKSIZE =", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeNotEqualTo(String value) {
            addCriterion("T_BLOCKSIZE <>", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeGreaterThan(String value) {
            addCriterion("T_BLOCKSIZE >", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeGreaterThanOrEqualTo(String value) {
            addCriterion("T_BLOCKSIZE >=", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeLessThan(String value) {
            addCriterion("T_BLOCKSIZE <", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeLessThanOrEqualTo(String value) {
            addCriterion("T_BLOCKSIZE <=", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeLike(String value) {
            addCriterion("T_BLOCKSIZE like", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeNotLike(String value) {
            addCriterion("T_BLOCKSIZE not like", value, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeIn(List<String> values) {
            addCriterion("T_BLOCKSIZE in", values, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeNotIn(List<String> values) {
            addCriterion("T_BLOCKSIZE not in", values, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeBetween(String value1, String value2) {
            addCriterion("T_BLOCKSIZE between", value1, value2, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTBlocksizeNotBetween(String value1, String value2) {
            addCriterion("T_BLOCKSIZE not between", value1, value2, "tBlocksize");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupIsNull() {
            addCriterion("T_PARTITION_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupIsNotNull() {
            addCriterion("T_PARTITION_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupEqualTo(String value) {
            addCriterion("T_PARTITION_GROUP =", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupNotEqualTo(String value) {
            addCriterion("T_PARTITION_GROUP <>", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupGreaterThan(String value) {
            addCriterion("T_PARTITION_GROUP >", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupGreaterThanOrEqualTo(String value) {
            addCriterion("T_PARTITION_GROUP >=", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupLessThan(String value) {
            addCriterion("T_PARTITION_GROUP <", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupLessThanOrEqualTo(String value) {
            addCriterion("T_PARTITION_GROUP <=", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupLike(String value) {
            addCriterion("T_PARTITION_GROUP like", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupNotLike(String value) {
            addCriterion("T_PARTITION_GROUP not like", value, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupIn(List<String> values) {
            addCriterion("T_PARTITION_GROUP in", values, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupNotIn(List<String> values) {
            addCriterion("T_PARTITION_GROUP not in", values, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupBetween(String value1, String value2) {
            addCriterion("T_PARTITION_GROUP between", value1, value2, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTPartitionGroupNotBetween(String value1, String value2) {
            addCriterion("T_PARTITION_GROUP not between", value1, value2, "tPartitionGroup");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseIsNull() {
            addCriterion("T_LOGGING_CLAUSE is null");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseIsNotNull() {
            addCriterion("T_LOGGING_CLAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseEqualTo(String value) {
            addCriterion("T_LOGGING_CLAUSE =", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseNotEqualTo(String value) {
            addCriterion("T_LOGGING_CLAUSE <>", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseGreaterThan(String value) {
            addCriterion("T_LOGGING_CLAUSE >", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseGreaterThanOrEqualTo(String value) {
            addCriterion("T_LOGGING_CLAUSE >=", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseLessThan(String value) {
            addCriterion("T_LOGGING_CLAUSE <", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseLessThanOrEqualTo(String value) {
            addCriterion("T_LOGGING_CLAUSE <=", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseLike(String value) {
            addCriterion("T_LOGGING_CLAUSE like", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseNotLike(String value) {
            addCriterion("T_LOGGING_CLAUSE not like", value, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseIn(List<String> values) {
            addCriterion("T_LOGGING_CLAUSE in", values, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseNotIn(List<String> values) {
            addCriterion("T_LOGGING_CLAUSE not in", values, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseBetween(String value1, String value2) {
            addCriterion("T_LOGGING_CLAUSE between", value1, value2, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTLoggingClauseNotBetween(String value1, String value2) {
            addCriterion("T_LOGGING_CLAUSE not between", value1, value2, "tLoggingClause");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingIsNull() {
            addCriterion("T_FORCE_LOGGING is null");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingIsNotNull() {
            addCriterion("T_FORCE_LOGGING is not null");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingEqualTo(String value) {
            addCriterion("T_FORCE_LOGGING =", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingNotEqualTo(String value) {
            addCriterion("T_FORCE_LOGGING <>", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingGreaterThan(String value) {
            addCriterion("T_FORCE_LOGGING >", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingGreaterThanOrEqualTo(String value) {
            addCriterion("T_FORCE_LOGGING >=", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingLessThan(String value) {
            addCriterion("T_FORCE_LOGGING <", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingLessThanOrEqualTo(String value) {
            addCriterion("T_FORCE_LOGGING <=", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingLike(String value) {
            addCriterion("T_FORCE_LOGGING like", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingNotLike(String value) {
            addCriterion("T_FORCE_LOGGING not like", value, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingIn(List<String> values) {
            addCriterion("T_FORCE_LOGGING in", values, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingNotIn(List<String> values) {
            addCriterion("T_FORCE_LOGGING not in", values, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingBetween(String value1, String value2) {
            addCriterion("T_FORCE_LOGGING between", value1, value2, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTForceLoggingNotBetween(String value1, String value2) {
            addCriterion("T_FORCE_LOGGING not between", value1, value2, "tForceLogging");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseIsNull() {
            addCriterion("T_DEF_STORAGE_CLAUSE is null");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseIsNotNull() {
            addCriterion("T_DEF_STORAGE_CLAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseEqualTo(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE =", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseNotEqualTo(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE <>", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseGreaterThan(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE >", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseGreaterThanOrEqualTo(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE >=", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseLessThan(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE <", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseLessThanOrEqualTo(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE <=", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseLike(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE like", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseNotLike(String value) {
            addCriterion("T_DEF_STORAGE_CLAUSE not like", value, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseIn(List<String> values) {
            addCriterion("T_DEF_STORAGE_CLAUSE in", values, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseNotIn(List<String> values) {
            addCriterion("T_DEF_STORAGE_CLAUSE not in", values, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseBetween(String value1, String value2) {
            addCriterion("T_DEF_STORAGE_CLAUSE between", value1, value2, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTDefStorageClauseNotBetween(String value1, String value2) {
            addCriterion("T_DEF_STORAGE_CLAUSE not between", value1, value2, "tDefStorageClause");
            return (Criteria) this;
        }

        public Criteria andTAttributeIsNull() {
            addCriterion("T_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andTAttributeIsNotNull() {
            addCriterion("T_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andTAttributeEqualTo(String value) {
            addCriterion("T_ATTRIBUTE =", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeNotEqualTo(String value) {
            addCriterion("T_ATTRIBUTE <>", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeGreaterThan(String value) {
            addCriterion("T_ATTRIBUTE >", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("T_ATTRIBUTE >=", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeLessThan(String value) {
            addCriterion("T_ATTRIBUTE <", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeLessThanOrEqualTo(String value) {
            addCriterion("T_ATTRIBUTE <=", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeLike(String value) {
            addCriterion("T_ATTRIBUTE like", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeNotLike(String value) {
            addCriterion("T_ATTRIBUTE not like", value, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeIn(List<String> values) {
            addCriterion("T_ATTRIBUTE in", values, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeNotIn(List<String> values) {
            addCriterion("T_ATTRIBUTE not in", values, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeBetween(String value1, String value2) {
            addCriterion("T_ATTRIBUTE between", value1, value2, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTAttributeNotBetween(String value1, String value2) {
            addCriterion("T_ATTRIBUTE not between", value1, value2, "tAttribute");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseIsNull() {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE is null");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseIsNotNull() {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseEqualTo(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE =", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseNotEqualTo(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE <>", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseGreaterThan(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE >", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseGreaterThanOrEqualTo(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE >=", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseLessThan(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE <", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseLessThanOrEqualTo(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE <=", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseLike(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE like", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseNotLike(String value) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE not like", value, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseIn(List<String> values) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE in", values, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseNotIn(List<String> values) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE not in", values, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseBetween(String value1, String value2) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE between", value1, value2, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTExtentManagementClauseNotBetween(String value1, String value2) {
            addCriterion("T_EXTENT_MANAGEMENT_CLAUSE not between", value1, value2, "tExtentManagementClause");
            return (Criteria) this;
        }

        public Criteria andTStateIsNull() {
            addCriterion("T_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTStateIsNotNull() {
            addCriterion("T_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTStateEqualTo(String value) {
            addCriterion("T_STATE =", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotEqualTo(String value) {
            addCriterion("T_STATE <>", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThan(String value) {
            addCriterion("T_STATE >", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThanOrEqualTo(String value) {
            addCriterion("T_STATE >=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThan(String value) {
            addCriterion("T_STATE <", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThanOrEqualTo(String value) {
            addCriterion("T_STATE <=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLike(String value) {
            addCriterion("T_STATE like", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotLike(String value) {
            addCriterion("T_STATE not like", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateIn(List<String> values) {
            addCriterion("T_STATE in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotIn(List<String> values) {
            addCriterion("T_STATE not in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateBetween(String value1, String value2) {
            addCriterion("T_STATE between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotBetween(String value1, String value2) {
            addCriterion("T_STATE not between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateIsNull() {
            addCriterion("T_SAVE_OBJ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateIsNotNull() {
            addCriterion("T_SAVE_OBJ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateEqualTo(String value) {
            addCriterion("T_SAVE_OBJ_STATE =", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateNotEqualTo(String value) {
            addCriterion("T_SAVE_OBJ_STATE <>", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateGreaterThan(String value) {
            addCriterion("T_SAVE_OBJ_STATE >", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateGreaterThanOrEqualTo(String value) {
            addCriterion("T_SAVE_OBJ_STATE >=", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateLessThan(String value) {
            addCriterion("T_SAVE_OBJ_STATE <", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateLessThanOrEqualTo(String value) {
            addCriterion("T_SAVE_OBJ_STATE <=", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateLike(String value) {
            addCriterion("T_SAVE_OBJ_STATE like", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateNotLike(String value) {
            addCriterion("T_SAVE_OBJ_STATE not like", value, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateIn(List<String> values) {
            addCriterion("T_SAVE_OBJ_STATE in", values, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateNotIn(List<String> values) {
            addCriterion("T_SAVE_OBJ_STATE not in", values, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateBetween(String value1, String value2) {
            addCriterion("T_SAVE_OBJ_STATE between", value1, value2, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTSaveObjStateNotBetween(String value1, String value2) {
            addCriterion("T_SAVE_OBJ_STATE not between", value1, value2, "tSaveObjState");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceIsNull() {
            addCriterion("T_OF_DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceIsNotNull() {
            addCriterion("T_OF_DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE =", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE <>", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceGreaterThan(String value) {
            addCriterion("T_OF_DATASOURCE >", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE >=", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceLessThan(String value) {
            addCriterion("T_OF_DATASOURCE <", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceLessThanOrEqualTo(String value) {
            addCriterion("T_OF_DATASOURCE <=", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceLike(String value) {
            addCriterion("T_OF_DATASOURCE like", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotLike(String value) {
            addCriterion("T_OF_DATASOURCE not like", value, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceIn(List<String> values) {
            addCriterion("T_OF_DATASOURCE in", values, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotIn(List<String> values) {
            addCriterion("T_OF_DATASOURCE not in", values, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceBetween(String value1, String value2) {
            addCriterion("T_OF_DATASOURCE between", value1, value2, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfDatasourceNotBetween(String value1, String value2) {
            addCriterion("T_OF_DATASOURCE not between", value1, value2, "tOfDatasource");
            return (Criteria) this;
        }

        public Criteria andTOfProjectIsNull() {
            addCriterion("T_OF_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andTOfProjectIsNotNull() {
            addCriterion("T_OF_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andTOfProjectEqualTo(String value) {
            addCriterion("T_OF_PROJECT =", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotEqualTo(String value) {
            addCriterion("T_OF_PROJECT <>", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectGreaterThan(String value) {
            addCriterion("T_OF_PROJECT >", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("T_OF_PROJECT >=", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectLessThan(String value) {
            addCriterion("T_OF_PROJECT <", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectLessThanOrEqualTo(String value) {
            addCriterion("T_OF_PROJECT <=", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectLike(String value) {
            addCriterion("T_OF_PROJECT like", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotLike(String value) {
            addCriterion("T_OF_PROJECT not like", value, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectIn(List<String> values) {
            addCriterion("T_OF_PROJECT in", values, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotIn(List<String> values) {
            addCriterion("T_OF_PROJECT not in", values, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectBetween(String value1, String value2) {
            addCriterion("T_OF_PROJECT between", value1, value2, "tOfProject");
            return (Criteria) this;
        }

        public Criteria andTOfProjectNotBetween(String value1, String value2) {
            addCriterion("T_OF_PROJECT not between", value1, value2, "tOfProject");
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