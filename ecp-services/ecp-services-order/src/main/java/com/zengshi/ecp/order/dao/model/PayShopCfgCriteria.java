package com.zengshi.ecp.order.dao.model;

import com.zengshi.ecp.frame.vo.BaseCriteria;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PayShopCfgCriteria extends BaseCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public PayShopCfgCriteria() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNull() {
            addCriterion("PAY_WAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNotNull() {
            addCriterion("PAY_WAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameEqualTo(String value) {
            addCriterion("PAY_WAY_NAME =", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotEqualTo(String value) {
            addCriterion("PAY_WAY_NAME <>", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThan(String value) {
            addCriterion("PAY_WAY_NAME >", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_NAME >=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThan(String value) {
            addCriterion("PAY_WAY_NAME <", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_NAME <=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLike(String value) {
            addCriterion("PAY_WAY_NAME like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotLike(String value) {
            addCriterion("PAY_WAY_NAME not like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIn(List<String> values) {
            addCriterion("PAY_WAY_NAME in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotIn(List<String> values) {
            addCriterion("PAY_WAY_NAME not in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameBetween(String value1, String value2) {
            addCriterion("PAY_WAY_NAME between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY_NAME not between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andMercCodeIsNull() {
            addCriterion("MERC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMercCodeIsNotNull() {
            addCriterion("MERC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMercCodeEqualTo(String value) {
            addCriterion("MERC_CODE =", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeNotEqualTo(String value) {
            addCriterion("MERC_CODE <>", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeGreaterThan(String value) {
            addCriterion("MERC_CODE >", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MERC_CODE >=", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeLessThan(String value) {
            addCriterion("MERC_CODE <", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeLessThanOrEqualTo(String value) {
            addCriterion("MERC_CODE <=", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeLike(String value) {
            addCriterion("MERC_CODE like", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeNotLike(String value) {
            addCriterion("MERC_CODE not like", value, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeIn(List<String> values) {
            addCriterion("MERC_CODE in", values, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeNotIn(List<String> values) {
            addCriterion("MERC_CODE not in", values, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeBetween(String value1, String value2) {
            addCriterion("MERC_CODE between", value1, value2, "mercCode");
            return (Criteria) this;
        }

        public Criteria andMercCodeNotBetween(String value1, String value2) {
            addCriterion("MERC_CODE not between", value1, value2, "mercCode");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("BRANCH_ID like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("BRANCH_ID not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andCisNoIsNull() {
            addCriterion("CIS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCisNoIsNotNull() {
            addCriterion("CIS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCisNoEqualTo(String value) {
            addCriterion("CIS_NO =", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoNotEqualTo(String value) {
            addCriterion("CIS_NO <>", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoGreaterThan(String value) {
            addCriterion("CIS_NO >", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoGreaterThanOrEqualTo(String value) {
            addCriterion("CIS_NO >=", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoLessThan(String value) {
            addCriterion("CIS_NO <", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoLessThanOrEqualTo(String value) {
            addCriterion("CIS_NO <=", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoLike(String value) {
            addCriterion("CIS_NO like", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoNotLike(String value) {
            addCriterion("CIS_NO not like", value, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoIn(List<String> values) {
            addCriterion("CIS_NO in", values, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoNotIn(List<String> values) {
            addCriterion("CIS_NO not in", values, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoBetween(String value1, String value2) {
            addCriterion("CIS_NO between", value1, value2, "cisNo");
            return (Criteria) this;
        }

        public Criteria andCisNoNotBetween(String value1, String value2) {
            addCriterion("CIS_NO not between", value1, value2, "cisNo");
            return (Criteria) this;
        }

        public Criteria andShopAccountIsNull() {
            addCriterion("SHOP_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andShopAccountIsNotNull() {
            addCriterion("SHOP_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andShopAccountEqualTo(String value) {
            addCriterion("SHOP_ACCOUNT =", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotEqualTo(String value) {
            addCriterion("SHOP_ACCOUNT <>", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountGreaterThan(String value) {
            addCriterion("SHOP_ACCOUNT >", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ACCOUNT >=", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLessThan(String value) {
            addCriterion("SHOP_ACCOUNT <", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ACCOUNT <=", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLike(String value) {
            addCriterion("SHOP_ACCOUNT like", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotLike(String value) {
            addCriterion("SHOP_ACCOUNT not like", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountIn(List<String> values) {
            addCriterion("SHOP_ACCOUNT in", values, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotIn(List<String> values) {
            addCriterion("SHOP_ACCOUNT not in", values, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountBetween(String value1, String value2) {
            addCriterion("SHOP_ACCOUNT between", value1, value2, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotBetween(String value1, String value2) {
            addCriterion("SHOP_ACCOUNT not between", value1, value2, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountIsNull() {
            addCriterion("PAYEE_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountIsNotNull() {
            addCriterion("PAYEE_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountEqualTo(String value) {
            addCriterion("PAYEE_ACCOUNT =", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotEqualTo(String value) {
            addCriterion("PAYEE_ACCOUNT <>", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountGreaterThan(String value) {
            addCriterion("PAYEE_ACCOUNT >", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE_ACCOUNT >=", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountLessThan(String value) {
            addCriterion("PAYEE_ACCOUNT <", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountLessThanOrEqualTo(String value) {
            addCriterion("PAYEE_ACCOUNT <=", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountLike(String value) {
            addCriterion("PAYEE_ACCOUNT like", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotLike(String value) {
            addCriterion("PAYEE_ACCOUNT not like", value, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountIn(List<String> values) {
            addCriterion("PAYEE_ACCOUNT in", values, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotIn(List<String> values) {
            addCriterion("PAYEE_ACCOUNT not in", values, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountBetween(String value1, String value2) {
            addCriterion("PAYEE_ACCOUNT between", value1, value2, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeAccountNotBetween(String value1, String value2) {
            addCriterion("PAYEE_ACCOUNT not between", value1, value2, "payeeAccount");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIsNull() {
            addCriterion("PAYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIsNotNull() {
            addCriterion("PAYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameEqualTo(String value) {
            addCriterion("PAYEE_NAME =", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotEqualTo(String value) {
            addCriterion("PAYEE_NAME <>", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThan(String value) {
            addCriterion("PAYEE_NAME >", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE_NAME >=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThan(String value) {
            addCriterion("PAYEE_NAME <", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThanOrEqualTo(String value) {
            addCriterion("PAYEE_NAME <=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLike(String value) {
            addCriterion("PAYEE_NAME like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotLike(String value) {
            addCriterion("PAYEE_NAME not like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIn(List<String> values) {
            addCriterion("PAYEE_NAME in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotIn(List<String> values) {
            addCriterion("PAYEE_NAME not in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameBetween(String value1, String value2) {
            addCriterion("PAYEE_NAME between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotBetween(String value1, String value2) {
            addCriterion("PAYEE_NAME not between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNull() {
            addCriterion("POS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNotNull() {
            addCriterion("POS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPosIdEqualTo(String value) {
            addCriterion("POS_ID =", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotEqualTo(String value) {
            addCriterion("POS_ID <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThan(String value) {
            addCriterion("POS_ID >", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThanOrEqualTo(String value) {
            addCriterion("POS_ID >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThan(String value) {
            addCriterion("POS_ID <", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThanOrEqualTo(String value) {
            addCriterion("POS_ID <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLike(String value) {
            addCriterion("POS_ID like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotLike(String value) {
            addCriterion("POS_ID not like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdIn(List<String> values) {
            addCriterion("POS_ID in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotIn(List<String> values) {
            addCriterion("POS_ID not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdBetween(String value1, String value2) {
            addCriterion("POS_ID between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotBetween(String value1, String value2) {
            addCriterion("POS_ID not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andCerNameIsNull() {
            addCriterion("CER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCerNameIsNotNull() {
            addCriterion("CER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCerNameEqualTo(String value) {
            addCriterion("CER_NAME =", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotEqualTo(String value) {
            addCriterion("CER_NAME <>", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameGreaterThan(String value) {
            addCriterion("CER_NAME >", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CER_NAME >=", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLessThan(String value) {
            addCriterion("CER_NAME <", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLessThanOrEqualTo(String value) {
            addCriterion("CER_NAME <=", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLike(String value) {
            addCriterion("CER_NAME like", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotLike(String value) {
            addCriterion("CER_NAME not like", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameIn(List<String> values) {
            addCriterion("CER_NAME in", values, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotIn(List<String> values) {
            addCriterion("CER_NAME not in", values, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameBetween(String value1, String value2) {
            addCriterion("CER_NAME between", value1, value2, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotBetween(String value1, String value2) {
            addCriterion("CER_NAME not between", value1, value2, "cerName");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNull() {
            addCriterion("KEY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNotNull() {
            addCriterion("KEY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNameEqualTo(String value) {
            addCriterion("KEY_NAME =", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotEqualTo(String value) {
            addCriterion("KEY_NAME <>", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThan(String value) {
            addCriterion("KEY_NAME >", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_NAME >=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThan(String value) {
            addCriterion("KEY_NAME <", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThanOrEqualTo(String value) {
            addCriterion("KEY_NAME <=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLike(String value) {
            addCriterion("KEY_NAME like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotLike(String value) {
            addCriterion("KEY_NAME not like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameIn(List<String> values) {
            addCriterion("KEY_NAME in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotIn(List<String> values) {
            addCriterion("KEY_NAME not in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameBetween(String value1, String value2) {
            addCriterion("KEY_NAME between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotBetween(String value1, String value2) {
            addCriterion("KEY_NAME not between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andCerPasswordIsNull() {
            addCriterion("CER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCerPasswordIsNotNull() {
            addCriterion("CER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCerPasswordEqualTo(String value) {
            addCriterion("CER_PASSWORD =", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordNotEqualTo(String value) {
            addCriterion("CER_PASSWORD <>", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordGreaterThan(String value) {
            addCriterion("CER_PASSWORD >", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CER_PASSWORD >=", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordLessThan(String value) {
            addCriterion("CER_PASSWORD <", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordLessThanOrEqualTo(String value) {
            addCriterion("CER_PASSWORD <=", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordLike(String value) {
            addCriterion("CER_PASSWORD like", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordNotLike(String value) {
            addCriterion("CER_PASSWORD not like", value, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordIn(List<String> values) {
            addCriterion("CER_PASSWORD in", values, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordNotIn(List<String> values) {
            addCriterion("CER_PASSWORD not in", values, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordBetween(String value1, String value2) {
            addCriterion("CER_PASSWORD between", value1, value2, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andCerPasswordNotBetween(String value1, String value2) {
            addCriterion("CER_PASSWORD not between", value1, value2, "cerPassword");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNull() {
            addCriterion("USE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNotNull() {
            addCriterion("USE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUseFlagEqualTo(String value) {
            addCriterion("USE_FLAG =", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotEqualTo(String value) {
            addCriterion("USE_FLAG <>", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThan(String value) {
            addCriterion("USE_FLAG >", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThanOrEqualTo(String value) {
            addCriterion("USE_FLAG >=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThan(String value) {
            addCriterion("USE_FLAG <", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThanOrEqualTo(String value) {
            addCriterion("USE_FLAG <=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLike(String value) {
            addCriterion("USE_FLAG like", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotLike(String value) {
            addCriterion("USE_FLAG not like", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagIn(List<String> values) {
            addCriterion("USE_FLAG in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotIn(List<String> values) {
            addCriterion("USE_FLAG not in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagBetween(String value1, String value2) {
            addCriterion("USE_FLAG between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotBetween(String value1, String value2) {
            addCriterion("USE_FLAG not between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andShowOrderIsNull() {
            addCriterion("SHOW_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andShowOrderIsNotNull() {
            addCriterion("SHOW_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andShowOrderEqualTo(Short value) {
            addCriterion("SHOW_ORDER =", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotEqualTo(Short value) {
            addCriterion("SHOW_ORDER <>", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderGreaterThan(Short value) {
            addCriterion("SHOW_ORDER >", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("SHOW_ORDER >=", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderLessThan(Short value) {
            addCriterion("SHOW_ORDER <", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderLessThanOrEqualTo(Short value) {
            addCriterion("SHOW_ORDER <=", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderIn(List<Short> values) {
            addCriterion("SHOW_ORDER in", values, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotIn(List<Short> values) {
            addCriterion("SHOW_ORDER not in", values, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderBetween(Short value1, Short value2) {
            addCriterion("SHOW_ORDER between", value1, value2, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotBetween(Short value1, Short value2) {
            addCriterion("SHOW_ORDER not between", value1, value2, "showOrder");
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