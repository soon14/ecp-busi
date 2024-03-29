package com.zengshi.ecp.coupon.dao.model;

import com.zengshi.ecp.frame.vo.BaseCriteria;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CoupTypeCriteria extends BaseCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CoupTypeCriteria() {
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

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameIsNull() {
            addCriterion("COUP_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameIsNotNull() {
            addCriterion("COUP_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameEqualTo(String value) {
            addCriterion("COUP_TYPE_NAME =", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameNotEqualTo(String value) {
            addCriterion("COUP_TYPE_NAME <>", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameGreaterThan(String value) {
            addCriterion("COUP_TYPE_NAME >", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUP_TYPE_NAME >=", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameLessThan(String value) {
            addCriterion("COUP_TYPE_NAME <", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameLessThanOrEqualTo(String value) {
            addCriterion("COUP_TYPE_NAME <=", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameLike(String value) {
            addCriterion("COUP_TYPE_NAME like", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameNotLike(String value) {
            addCriterion("COUP_TYPE_NAME not like", value, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameIn(List<String> values) {
            addCriterion("COUP_TYPE_NAME in", values, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameNotIn(List<String> values) {
            addCriterion("COUP_TYPE_NAME not in", values, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameBetween(String value1, String value2) {
            addCriterion("COUP_TYPE_NAME between", value1, value2, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andCoupTypeNameNotBetween(String value1, String value2) {
            addCriterion("COUP_TYPE_NAME not between", value1, value2, "coupTypeName");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeIsNull() {
            addCriterion("USE_RULE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeIsNotNull() {
            addCriterion("USE_RULE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeEqualTo(String value) {
            addCriterion("USE_RULE_CODE =", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeNotEqualTo(String value) {
            addCriterion("USE_RULE_CODE <>", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeGreaterThan(String value) {
            addCriterion("USE_RULE_CODE >", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USE_RULE_CODE >=", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeLessThan(String value) {
            addCriterion("USE_RULE_CODE <", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeLessThanOrEqualTo(String value) {
            addCriterion("USE_RULE_CODE <=", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeLike(String value) {
            addCriterion("USE_RULE_CODE like", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeNotLike(String value) {
            addCriterion("USE_RULE_CODE not like", value, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeIn(List<String> values) {
            addCriterion("USE_RULE_CODE in", values, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeNotIn(List<String> values) {
            addCriterion("USE_RULE_CODE not in", values, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeBetween(String value1, String value2) {
            addCriterion("USE_RULE_CODE between", value1, value2, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andUseRuleCodeNotBetween(String value1, String value2) {
            addCriterion("USE_RULE_CODE not between", value1, value2, "useRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeIsNull() {
            addCriterion("GET_RULE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeIsNotNull() {
            addCriterion("GET_RULE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeEqualTo(String value) {
            addCriterion("GET_RULE_CODE =", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeNotEqualTo(String value) {
            addCriterion("GET_RULE_CODE <>", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeGreaterThan(String value) {
            addCriterion("GET_RULE_CODE >", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GET_RULE_CODE >=", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeLessThan(String value) {
            addCriterion("GET_RULE_CODE <", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeLessThanOrEqualTo(String value) {
            addCriterion("GET_RULE_CODE <=", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeLike(String value) {
            addCriterion("GET_RULE_CODE like", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeNotLike(String value) {
            addCriterion("GET_RULE_CODE not like", value, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeIn(List<String> values) {
            addCriterion("GET_RULE_CODE in", values, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeNotIn(List<String> values) {
            addCriterion("GET_RULE_CODE not in", values, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeBetween(String value1, String value2) {
            addCriterion("GET_RULE_CODE between", value1, value2, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andGetRuleCodeNotBetween(String value1, String value2) {
            addCriterion("GET_RULE_CODE not between", value1, value2, "getRuleCode");
            return (Criteria) this;
        }

        public Criteria andTypeLimitIsNull() {
            addCriterion("TYPE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTypeLimitIsNotNull() {
            addCriterion("TYPE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLimitEqualTo(String value) {
            addCriterion("TYPE_LIMIT =", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotEqualTo(String value) {
            addCriterion("TYPE_LIMIT <>", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitGreaterThan(String value) {
            addCriterion("TYPE_LIMIT >", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_LIMIT >=", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitLessThan(String value) {
            addCriterion("TYPE_LIMIT <", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitLessThanOrEqualTo(String value) {
            addCriterion("TYPE_LIMIT <=", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitLike(String value) {
            addCriterion("TYPE_LIMIT like", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotLike(String value) {
            addCriterion("TYPE_LIMIT not like", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitIn(List<String> values) {
            addCriterion("TYPE_LIMIT in", values, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotIn(List<String> values) {
            addCriterion("TYPE_LIMIT not in", values, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitBetween(String value1, String value2) {
            addCriterion("TYPE_LIMIT between", value1, value2, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotBetween(String value1, String value2) {
            addCriterion("TYPE_LIMIT not between", value1, value2, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNull() {
            addCriterion("SORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("SORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Integer value) {
            addCriterion("SORT_NO =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Integer value) {
            addCriterion("SORT_NO <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Integer value) {
            addCriterion("SORT_NO >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_NO >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Integer value) {
            addCriterion("SORT_NO <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_NO <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Integer> values) {
            addCriterion("SORT_NO in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Integer> values) {
            addCriterion("SORT_NO not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Integer value1, Integer value2) {
            addCriterion("SORT_NO between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_NO not between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNull() {
            addCriterion("CREATE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNotNull() {
            addCriterion("CREATE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffEqualTo(Long value) {
            addCriterion("CREATE_STAFF =", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotEqualTo(Long value) {
            addCriterion("CREATE_STAFF <>", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThan(Long value) {
            addCriterion("CREATE_STAFF >", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_STAFF >=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThan(Long value) {
            addCriterion("CREATE_STAFF <", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_STAFF <=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIn(List<Long> values) {
            addCriterion("CREATE_STAFF in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotIn(List<Long> values) {
            addCriterion("CREATE_STAFF not in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffBetween(Long value1, Long value2) {
            addCriterion("CREATE_STAFF between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_STAFF not between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNull() {
            addCriterion("UPDATE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNotNull() {
            addCriterion("UPDATE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffEqualTo(Long value) {
            addCriterion("UPDATE_STAFF =", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotEqualTo(Long value) {
            addCriterion("UPDATE_STAFF <>", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThan(Long value) {
            addCriterion("UPDATE_STAFF >", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_STAFF >=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThan(Long value) {
            addCriterion("UPDATE_STAFF <", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_STAFF <=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIn(List<Long> values) {
            addCriterion("UPDATE_STAFF in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotIn(List<Long> values) {
            addCriterion("UPDATE_STAFF not in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffBetween(Long value1, Long value2) {
            addCriterion("UPDATE_STAFF between", value1, value2, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_STAFF not between", value1, value2, "updateStaff");
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
