package com.zengshi.ecp.order.dao.model;

import com.zengshi.ecp.frame.vo.BaseCriteria;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PayWayCriteria extends BaseCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public PayWayCriteria() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andPayWayTypeIsNull() {
            addCriterion("PAY_WAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeIsNotNull() {
            addCriterion("PAY_WAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE =", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE <>", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeGreaterThan(String value) {
            addCriterion("PAY_WAY_TYPE >", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE >=", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeLessThan(String value) {
            addCriterion("PAY_WAY_TYPE <", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE <=", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeLike(String value) {
            addCriterion("PAY_WAY_TYPE like", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotLike(String value) {
            addCriterion("PAY_WAY_TYPE not like", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeIn(List<String> values) {
            addCriterion("PAY_WAY_TYPE in", values, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotIn(List<String> values) {
            addCriterion("PAY_WAY_TYPE not in", values, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeBetween(String value1, String value2) {
            addCriterion("PAY_WAY_TYPE between", value1, value2, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY_TYPE not between", value1, value2, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeIsNull() {
            addCriterion("PAY_ACCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeIsNotNull() {
            addCriterion("PAY_ACCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeEqualTo(String value) {
            addCriterion("PAY_ACCT_TYPE =", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeNotEqualTo(String value) {
            addCriterion("PAY_ACCT_TYPE <>", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeGreaterThan(String value) {
            addCriterion("PAY_ACCT_TYPE >", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACCT_TYPE >=", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeLessThan(String value) {
            addCriterion("PAY_ACCT_TYPE <", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACCT_TYPE <=", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeLike(String value) {
            addCriterion("PAY_ACCT_TYPE like", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeNotLike(String value) {
            addCriterion("PAY_ACCT_TYPE not like", value, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeIn(List<String> values) {
            addCriterion("PAY_ACCT_TYPE in", values, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeNotIn(List<String> values) {
            addCriterion("PAY_ACCT_TYPE not in", values, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeBetween(String value1, String value2) {
            addCriterion("PAY_ACCT_TYPE between", value1, value2, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayAcctTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_ACCT_TYPE not between", value1, value2, "payAcctType");
            return (Criteria) this;
        }

        public Criteria andPayImageIsNull() {
            addCriterion("PAY_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andPayImageIsNotNull() {
            addCriterion("PAY_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPayImageEqualTo(String value) {
            addCriterion("PAY_IMAGE =", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageNotEqualTo(String value) {
            addCriterion("PAY_IMAGE <>", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageGreaterThan(String value) {
            addCriterion("PAY_IMAGE >", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_IMAGE >=", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageLessThan(String value) {
            addCriterion("PAY_IMAGE <", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageLessThanOrEqualTo(String value) {
            addCriterion("PAY_IMAGE <=", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageLike(String value) {
            addCriterion("PAY_IMAGE like", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageNotLike(String value) {
            addCriterion("PAY_IMAGE not like", value, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageIn(List<String> values) {
            addCriterion("PAY_IMAGE in", values, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageNotIn(List<String> values) {
            addCriterion("PAY_IMAGE not in", values, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageBetween(String value1, String value2) {
            addCriterion("PAY_IMAGE between", value1, value2, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayImageNotBetween(String value1, String value2) {
            addCriterion("PAY_IMAGE not between", value1, value2, "payImage");
            return (Criteria) this;
        }

        public Criteria andPayLogoIsNull() {
            addCriterion("PAY_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andPayLogoIsNotNull() {
            addCriterion("PAY_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andPayLogoEqualTo(String value) {
            addCriterion("PAY_LOGO =", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoNotEqualTo(String value) {
            addCriterion("PAY_LOGO <>", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoGreaterThan(String value) {
            addCriterion("PAY_LOGO >", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_LOGO >=", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoLessThan(String value) {
            addCriterion("PAY_LOGO <", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoLessThanOrEqualTo(String value) {
            addCriterion("PAY_LOGO <=", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoLike(String value) {
            addCriterion("PAY_LOGO like", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoNotLike(String value) {
            addCriterion("PAY_LOGO not like", value, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoIn(List<String> values) {
            addCriterion("PAY_LOGO in", values, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoNotIn(List<String> values) {
            addCriterion("PAY_LOGO not in", values, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoBetween(String value1, String value2) {
            addCriterion("PAY_LOGO between", value1, value2, "payLogo");
            return (Criteria) this;
        }

        public Criteria andPayLogoNotBetween(String value1, String value2) {
            addCriterion("PAY_LOGO not between", value1, value2, "payLogo");
            return (Criteria) this;
        }

        public Criteria andCharSetIsNull() {
            addCriterion("CHAR_SET is null");
            return (Criteria) this;
        }

        public Criteria andCharSetIsNotNull() {
            addCriterion("CHAR_SET is not null");
            return (Criteria) this;
        }

        public Criteria andCharSetEqualTo(String value) {
            addCriterion("CHAR_SET =", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetNotEqualTo(String value) {
            addCriterion("CHAR_SET <>", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetGreaterThan(String value) {
            addCriterion("CHAR_SET >", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetGreaterThanOrEqualTo(String value) {
            addCriterion("CHAR_SET >=", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetLessThan(String value) {
            addCriterion("CHAR_SET <", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetLessThanOrEqualTo(String value) {
            addCriterion("CHAR_SET <=", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetLike(String value) {
            addCriterion("CHAR_SET like", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetNotLike(String value) {
            addCriterion("CHAR_SET not like", value, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetIn(List<String> values) {
            addCriterion("CHAR_SET in", values, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetNotIn(List<String> values) {
            addCriterion("CHAR_SET not in", values, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetBetween(String value1, String value2) {
            addCriterion("CHAR_SET between", value1, value2, "charSet");
            return (Criteria) this;
        }

        public Criteria andCharSetNotBetween(String value1, String value2) {
            addCriterion("CHAR_SET not between", value1, value2, "charSet");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlIsNull() {
            addCriterion("PAY_ACTION_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlIsNotNull() {
            addCriterion("PAY_ACTION_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlEqualTo(String value) {
            addCriterion("PAY_ACTION_URL =", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlNotEqualTo(String value) {
            addCriterion("PAY_ACTION_URL <>", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlGreaterThan(String value) {
            addCriterion("PAY_ACTION_URL >", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACTION_URL >=", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlLessThan(String value) {
            addCriterion("PAY_ACTION_URL <", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACTION_URL <=", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlLike(String value) {
            addCriterion("PAY_ACTION_URL like", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlNotLike(String value) {
            addCriterion("PAY_ACTION_URL not like", value, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlIn(List<String> values) {
            addCriterion("PAY_ACTION_URL in", values, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlNotIn(List<String> values) {
            addCriterion("PAY_ACTION_URL not in", values, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlBetween(String value1, String value2) {
            addCriterion("PAY_ACTION_URL between", value1, value2, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayActionUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_ACTION_URL not between", value1, value2, "payActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlIsNull() {
            addCriterion("PAY_QUERY_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlIsNotNull() {
            addCriterion("PAY_QUERY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlEqualTo(String value) {
            addCriterion("PAY_QUERY_URL =", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlNotEqualTo(String value) {
            addCriterion("PAY_QUERY_URL <>", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlGreaterThan(String value) {
            addCriterion("PAY_QUERY_URL >", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_QUERY_URL >=", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlLessThan(String value) {
            addCriterion("PAY_QUERY_URL <", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_QUERY_URL <=", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlLike(String value) {
            addCriterion("PAY_QUERY_URL like", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlNotLike(String value) {
            addCriterion("PAY_QUERY_URL not like", value, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlIn(List<String> values) {
            addCriterion("PAY_QUERY_URL in", values, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlNotIn(List<String> values) {
            addCriterion("PAY_QUERY_URL not in", values, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlBetween(String value1, String value2) {
            addCriterion("PAY_QUERY_URL between", value1, value2, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayQueryUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_QUERY_URL not between", value1, value2, "payQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlIsNull() {
            addCriterion("PAY_REFUND_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlIsNotNull() {
            addCriterion("PAY_REFUND_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlEqualTo(String value) {
            addCriterion("PAY_REFUND_URL =", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlNotEqualTo(String value) {
            addCriterion("PAY_REFUND_URL <>", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlGreaterThan(String value) {
            addCriterion("PAY_REFUND_URL >", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_URL >=", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlLessThan(String value) {
            addCriterion("PAY_REFUND_URL <", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_URL <=", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlLike(String value) {
            addCriterion("PAY_REFUND_URL like", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlNotLike(String value) {
            addCriterion("PAY_REFUND_URL not like", value, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlIn(List<String> values) {
            addCriterion("PAY_REFUND_URL in", values, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlNotIn(List<String> values) {
            addCriterion("PAY_REFUND_URL not in", values, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_URL between", value1, value2, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_URL not between", value1, value2, "payRefundUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlIsNull() {
            addCriterion("BIND_URL is null");
            return (Criteria) this;
        }

        public Criteria andBindUrlIsNotNull() {
            addCriterion("BIND_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBindUrlEqualTo(String value) {
            addCriterion("BIND_URL =", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlNotEqualTo(String value) {
            addCriterion("BIND_URL <>", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlGreaterThan(String value) {
            addCriterion("BIND_URL >", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_URL >=", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlLessThan(String value) {
            addCriterion("BIND_URL <", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlLessThanOrEqualTo(String value) {
            addCriterion("BIND_URL <=", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlLike(String value) {
            addCriterion("BIND_URL like", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlNotLike(String value) {
            addCriterion("BIND_URL not like", value, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlIn(List<String> values) {
            addCriterion("BIND_URL in", values, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlNotIn(List<String> values) {
            addCriterion("BIND_URL not in", values, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlBetween(String value1, String value2) {
            addCriterion("BIND_URL between", value1, value2, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindUrlNotBetween(String value1, String value2) {
            addCriterion("BIND_URL not between", value1, value2, "bindUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlIsNull() {
            addCriterion("BIND_TRANSFER_URL is null");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlIsNotNull() {
            addCriterion("BIND_TRANSFER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlEqualTo(String value) {
            addCriterion("BIND_TRANSFER_URL =", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlNotEqualTo(String value) {
            addCriterion("BIND_TRANSFER_URL <>", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlGreaterThan(String value) {
            addCriterion("BIND_TRANSFER_URL >", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_TRANSFER_URL >=", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlLessThan(String value) {
            addCriterion("BIND_TRANSFER_URL <", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlLessThanOrEqualTo(String value) {
            addCriterion("BIND_TRANSFER_URL <=", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlLike(String value) {
            addCriterion("BIND_TRANSFER_URL like", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlNotLike(String value) {
            addCriterion("BIND_TRANSFER_URL not like", value, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlIn(List<String> values) {
            addCriterion("BIND_TRANSFER_URL in", values, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlNotIn(List<String> values) {
            addCriterion("BIND_TRANSFER_URL not in", values, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlBetween(String value1, String value2) {
            addCriterion("BIND_TRANSFER_URL between", value1, value2, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andBindTransferUrlNotBetween(String value1, String value2) {
            addCriterion("BIND_TRANSFER_URL not between", value1, value2, "bindTransferUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlIsNull() {
            addCriterion("PAY_RETURN_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlIsNotNull() {
            addCriterion("PAY_RETURN_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlEqualTo(String value) {
            addCriterion("PAY_RETURN_URL =", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlNotEqualTo(String value) {
            addCriterion("PAY_RETURN_URL <>", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlGreaterThan(String value) {
            addCriterion("PAY_RETURN_URL >", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_RETURN_URL >=", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlLessThan(String value) {
            addCriterion("PAY_RETURN_URL <", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_RETURN_URL <=", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlLike(String value) {
            addCriterion("PAY_RETURN_URL like", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlNotLike(String value) {
            addCriterion("PAY_RETURN_URL not like", value, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlIn(List<String> values) {
            addCriterion("PAY_RETURN_URL in", values, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlNotIn(List<String> values) {
            addCriterion("PAY_RETURN_URL not in", values, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlBetween(String value1, String value2) {
            addCriterion("PAY_RETURN_URL between", value1, value2, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayReturnUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_RETURN_URL not between", value1, value2, "payReturnUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlIsNull() {
            addCriterion("PAY_NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlIsNotNull() {
            addCriterion("PAY_NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlEqualTo(String value) {
            addCriterion("PAY_NOTIFY_URL =", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlNotEqualTo(String value) {
            addCriterion("PAY_NOTIFY_URL <>", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlGreaterThan(String value) {
            addCriterion("PAY_NOTIFY_URL >", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_NOTIFY_URL >=", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlLessThan(String value) {
            addCriterion("PAY_NOTIFY_URL <", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_NOTIFY_URL <=", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlLike(String value) {
            addCriterion("PAY_NOTIFY_URL like", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlNotLike(String value) {
            addCriterion("PAY_NOTIFY_URL not like", value, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlIn(List<String> values) {
            addCriterion("PAY_NOTIFY_URL in", values, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlNotIn(List<String> values) {
            addCriterion("PAY_NOTIFY_URL not in", values, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlBetween(String value1, String value2) {
            addCriterion("PAY_NOTIFY_URL between", value1, value2, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_NOTIFY_URL not between", value1, value2, "payNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlIsNull() {
            addCriterion("PAY_BIND_NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlIsNotNull() {
            addCriterion("PAY_BIND_NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlEqualTo(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL =", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlNotEqualTo(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL <>", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlGreaterThan(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL >", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL >=", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlLessThan(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL <", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL <=", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlLike(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL like", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlNotLike(String value) {
            addCriterion("PAY_BIND_NOTIFY_URL not like", value, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlIn(List<String> values) {
            addCriterion("PAY_BIND_NOTIFY_URL in", values, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlNotIn(List<String> values) {
            addCriterion("PAY_BIND_NOTIFY_URL not in", values, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlBetween(String value1, String value2) {
            addCriterion("PAY_BIND_NOTIFY_URL between", value1, value2, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayBindNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_BIND_NOTIFY_URL not between", value1, value2, "payBindNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlIsNull() {
            addCriterion("PAY_REFUND_NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlIsNotNull() {
            addCriterion("PAY_REFUND_NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlEqualTo(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL =", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlNotEqualTo(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL <>", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlGreaterThan(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL >", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL >=", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlLessThan(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL <", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL <=", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlLike(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL like", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlNotLike(String value) {
            addCriterion("PAY_REFUND_NOTIFY_URL not like", value, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlIn(List<String> values) {
            addCriterion("PAY_REFUND_NOTIFY_URL in", values, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlNotIn(List<String> values) {
            addCriterion("PAY_REFUND_NOTIFY_URL not in", values, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_NOTIFY_URL between", value1, value2, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_NOTIFY_URL not between", value1, value2, "payRefundNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlIsNull() {
            addCriterion("PAY_ERROR_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlIsNotNull() {
            addCriterion("PAY_ERROR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlEqualTo(String value) {
            addCriterion("PAY_ERROR_URL =", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlNotEqualTo(String value) {
            addCriterion("PAY_ERROR_URL <>", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlGreaterThan(String value) {
            addCriterion("PAY_ERROR_URL >", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ERROR_URL >=", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlLessThan(String value) {
            addCriterion("PAY_ERROR_URL <", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_ERROR_URL <=", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlLike(String value) {
            addCriterion("PAY_ERROR_URL like", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlNotLike(String value) {
            addCriterion("PAY_ERROR_URL not like", value, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlIn(List<String> values) {
            addCriterion("PAY_ERROR_URL in", values, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlNotIn(List<String> values) {
            addCriterion("PAY_ERROR_URL not in", values, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlBetween(String value1, String value2) {
            addCriterion("PAY_ERROR_URL between", value1, value2, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andPayErrorUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_ERROR_URL not between", value1, value2, "payErrorUrl");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("SIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("SIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(String value) {
            addCriterion("SIGN_TYPE =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(String value) {
            addCriterion("SIGN_TYPE <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(String value) {
            addCriterion("SIGN_TYPE >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(String value) {
            addCriterion("SIGN_TYPE <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLike(String value) {
            addCriterion("SIGN_TYPE like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotLike(String value) {
            addCriterion("SIGN_TYPE not like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<String> values) {
            addCriterion("SIGN_TYPE in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<String> values) {
            addCriterion("SIGN_TYPE not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeIsNull() {
            addCriterion("PAY_MERC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeIsNotNull() {
            addCriterion("PAY_MERC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeEqualTo(String value) {
            addCriterion("PAY_MERC_CODE =", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeNotEqualTo(String value) {
            addCriterion("PAY_MERC_CODE <>", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeGreaterThan(String value) {
            addCriterion("PAY_MERC_CODE >", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_MERC_CODE >=", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeLessThan(String value) {
            addCriterion("PAY_MERC_CODE <", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeLessThanOrEqualTo(String value) {
            addCriterion("PAY_MERC_CODE <=", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeLike(String value) {
            addCriterion("PAY_MERC_CODE like", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeNotLike(String value) {
            addCriterion("PAY_MERC_CODE not like", value, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeIn(List<String> values) {
            addCriterion("PAY_MERC_CODE in", values, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeNotIn(List<String> values) {
            addCriterion("PAY_MERC_CODE not in", values, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeBetween(String value1, String value2) {
            addCriterion("PAY_MERC_CODE between", value1, value2, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayMercCodeNotBetween(String value1, String value2) {
            addCriterion("PAY_MERC_CODE not between", value1, value2, "payMercCode");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyIsNull() {
            addCriterion("PAY_PRIVATE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyIsNotNull() {
            addCriterion("PAY_PRIVATE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyEqualTo(String value) {
            addCriterion("PAY_PRIVATE_KEY =", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyNotEqualTo(String value) {
            addCriterion("PAY_PRIVATE_KEY <>", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyGreaterThan(String value) {
            addCriterion("PAY_PRIVATE_KEY >", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PRIVATE_KEY >=", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyLessThan(String value) {
            addCriterion("PAY_PRIVATE_KEY <", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("PAY_PRIVATE_KEY <=", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyLike(String value) {
            addCriterion("PAY_PRIVATE_KEY like", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyNotLike(String value) {
            addCriterion("PAY_PRIVATE_KEY not like", value, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyIn(List<String> values) {
            addCriterion("PAY_PRIVATE_KEY in", values, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyNotIn(List<String> values) {
            addCriterion("PAY_PRIVATE_KEY not in", values, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyBetween(String value1, String value2) {
            addCriterion("PAY_PRIVATE_KEY between", value1, value2, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("PAY_PRIVATE_KEY not between", value1, value2, "payPrivateKey");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserIsNull() {
            addCriterion("PAY_PRIVATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserIsNotNull() {
            addCriterion("PAY_PRIVATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserEqualTo(String value) {
            addCriterion("PAY_PRIVATE_USER =", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserNotEqualTo(String value) {
            addCriterion("PAY_PRIVATE_USER <>", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserGreaterThan(String value) {
            addCriterion("PAY_PRIVATE_USER >", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PRIVATE_USER >=", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserLessThan(String value) {
            addCriterion("PAY_PRIVATE_USER <", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserLessThanOrEqualTo(String value) {
            addCriterion("PAY_PRIVATE_USER <=", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserLike(String value) {
            addCriterion("PAY_PRIVATE_USER like", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserNotLike(String value) {
            addCriterion("PAY_PRIVATE_USER not like", value, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserIn(List<String> values) {
            addCriterion("PAY_PRIVATE_USER in", values, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserNotIn(List<String> values) {
            addCriterion("PAY_PRIVATE_USER not in", values, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserBetween(String value1, String value2) {
            addCriterion("PAY_PRIVATE_USER between", value1, value2, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivateUserNotBetween(String value1, String value2) {
            addCriterion("PAY_PRIVATE_USER not between", value1, value2, "payPrivateUser");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdIsNull() {
            addCriterion("PAY_PRIVATE_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdIsNotNull() {
            addCriterion("PAY_PRIVATE_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdEqualTo(String value) {
            addCriterion("PAY_PRIVATE_PASSWD =", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdNotEqualTo(String value) {
            addCriterion("PAY_PRIVATE_PASSWD <>", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdGreaterThan(String value) {
            addCriterion("PAY_PRIVATE_PASSWD >", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PRIVATE_PASSWD >=", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdLessThan(String value) {
            addCriterion("PAY_PRIVATE_PASSWD <", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdLessThanOrEqualTo(String value) {
            addCriterion("PAY_PRIVATE_PASSWD <=", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdLike(String value) {
            addCriterion("PAY_PRIVATE_PASSWD like", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdNotLike(String value) {
            addCriterion("PAY_PRIVATE_PASSWD not like", value, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdIn(List<String> values) {
            addCriterion("PAY_PRIVATE_PASSWD in", values, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdNotIn(List<String> values) {
            addCriterion("PAY_PRIVATE_PASSWD not in", values, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdBetween(String value1, String value2) {
            addCriterion("PAY_PRIVATE_PASSWD between", value1, value2, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayPrivatePasswdNotBetween(String value1, String value2) {
            addCriterion("PAY_PRIVATE_PASSWD not between", value1, value2, "payPrivatePasswd");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertIsNull() {
            addCriterion("PAY_VERIFY_CERT is null");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertIsNotNull() {
            addCriterion("PAY_VERIFY_CERT is not null");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertEqualTo(String value) {
            addCriterion("PAY_VERIFY_CERT =", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertNotEqualTo(String value) {
            addCriterion("PAY_VERIFY_CERT <>", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertGreaterThan(String value) {
            addCriterion("PAY_VERIFY_CERT >", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_VERIFY_CERT >=", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertLessThan(String value) {
            addCriterion("PAY_VERIFY_CERT <", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertLessThanOrEqualTo(String value) {
            addCriterion("PAY_VERIFY_CERT <=", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertLike(String value) {
            addCriterion("PAY_VERIFY_CERT like", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertNotLike(String value) {
            addCriterion("PAY_VERIFY_CERT not like", value, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertIn(List<String> values) {
            addCriterion("PAY_VERIFY_CERT in", values, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertNotIn(List<String> values) {
            addCriterion("PAY_VERIFY_CERT not in", values, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertBetween(String value1, String value2) {
            addCriterion("PAY_VERIFY_CERT between", value1, value2, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPayVerifyCertNotBetween(String value1, String value2) {
            addCriterion("PAY_VERIFY_CERT not between", value1, value2, "payVerifyCert");
            return (Criteria) this;
        }

        public Criteria andPropertyFileIsNull() {
            addCriterion("PROPERTY_FILE is null");
            return (Criteria) this;
        }

        public Criteria andPropertyFileIsNotNull() {
            addCriterion("PROPERTY_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyFileEqualTo(String value) {
            addCriterion("PROPERTY_FILE =", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileNotEqualTo(String value) {
            addCriterion("PROPERTY_FILE <>", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileGreaterThan(String value) {
            addCriterion("PROPERTY_FILE >", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_FILE >=", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileLessThan(String value) {
            addCriterion("PROPERTY_FILE <", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_FILE <=", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileLike(String value) {
            addCriterion("PROPERTY_FILE like", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileNotLike(String value) {
            addCriterion("PROPERTY_FILE not like", value, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileIn(List<String> values) {
            addCriterion("PROPERTY_FILE in", values, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileNotIn(List<String> values) {
            addCriterion("PROPERTY_FILE not in", values, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileBetween(String value1, String value2) {
            addCriterion("PROPERTY_FILE between", value1, value2, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andPropertyFileNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_FILE not between", value1, value2, "propertyFile");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlIsNull() {
            addCriterion("LOG_FILE_URL is null");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlIsNotNull() {
            addCriterion("LOG_FILE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlEqualTo(String value) {
            addCriterion("LOG_FILE_URL =", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlNotEqualTo(String value) {
            addCriterion("LOG_FILE_URL <>", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlGreaterThan(String value) {
            addCriterion("LOG_FILE_URL >", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_FILE_URL >=", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlLessThan(String value) {
            addCriterion("LOG_FILE_URL <", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlLessThanOrEqualTo(String value) {
            addCriterion("LOG_FILE_URL <=", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlLike(String value) {
            addCriterion("LOG_FILE_URL like", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlNotLike(String value) {
            addCriterion("LOG_FILE_URL not like", value, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlIn(List<String> values) {
            addCriterion("LOG_FILE_URL in", values, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlNotIn(List<String> values) {
            addCriterion("LOG_FILE_URL not in", values, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlBetween(String value1, String value2) {
            addCriterion("LOG_FILE_URL between", value1, value2, "logFileUrl");
            return (Criteria) this;
        }

        public Criteria andLogFileUrlNotBetween(String value1, String value2) {
            addCriterion("LOG_FILE_URL not between", value1, value2, "logFileUrl");
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

        public Criteria andCreateStaffIsNull() {
            addCriterion("CREATE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNotNull() {
            addCriterion("CREATE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffEqualTo(String value) {
            addCriterion("CREATE_STAFF =", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotEqualTo(String value) {
            addCriterion("CREATE_STAFF <>", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThan(String value) {
            addCriterion("CREATE_STAFF >", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_STAFF >=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThan(String value) {
            addCriterion("CREATE_STAFF <", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThanOrEqualTo(String value) {
            addCriterion("CREATE_STAFF <=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLike(String value) {
            addCriterion("CREATE_STAFF like", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotLike(String value) {
            addCriterion("CREATE_STAFF not like", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIn(List<String> values) {
            addCriterion("CREATE_STAFF in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotIn(List<String> values) {
            addCriterion("CREATE_STAFF not in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffBetween(String value1, String value2) {
            addCriterion("CREATE_STAFF between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotBetween(String value1, String value2) {
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

        public Criteria andUpdateStaffEqualTo(String value) {
            addCriterion("UPDATE_STAFF =", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotEqualTo(String value) {
            addCriterion("UPDATE_STAFF <>", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThan(String value) {
            addCriterion("UPDATE_STAFF >", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_STAFF >=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThan(String value) {
            addCriterion("UPDATE_STAFF <", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_STAFF <=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLike(String value) {
            addCriterion("UPDATE_STAFF like", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotLike(String value) {
            addCriterion("UPDATE_STAFF not like", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIn(List<String> values) {
            addCriterion("UPDATE_STAFF in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotIn(List<String> values) {
            addCriterion("UPDATE_STAFF not in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffBetween(String value1, String value2) {
            addCriterion("UPDATE_STAFF between", value1, value2, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotBetween(String value1, String value2) {
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

        public Criteria andPayAuditUrlIsNull() {
            addCriterion("PAY_AUDIT_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlIsNotNull() {
            addCriterion("PAY_AUDIT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlEqualTo(String value) {
            addCriterion("PAY_AUDIT_URL =", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlNotEqualTo(String value) {
            addCriterion("PAY_AUDIT_URL <>", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlGreaterThan(String value) {
            addCriterion("PAY_AUDIT_URL >", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_AUDIT_URL >=", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlLessThan(String value) {
            addCriterion("PAY_AUDIT_URL <", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_AUDIT_URL <=", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlLike(String value) {
            addCriterion("PAY_AUDIT_URL like", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlNotLike(String value) {
            addCriterion("PAY_AUDIT_URL not like", value, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlIn(List<String> values) {
            addCriterion("PAY_AUDIT_URL in", values, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlNotIn(List<String> values) {
            addCriterion("PAY_AUDIT_URL not in", values, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlBetween(String value1, String value2) {
            addCriterion("PAY_AUDIT_URL between", value1, value2, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayAuditUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_AUDIT_URL not between", value1, value2, "payAuditUrl");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodIsNull() {
            addCriterion("PAY_REFUND_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodIsNotNull() {
            addCriterion("PAY_REFUND_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodEqualTo(String value) {
            addCriterion("PAY_REFUND_METHOD =", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodNotEqualTo(String value) {
            addCriterion("PAY_REFUND_METHOD <>", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodGreaterThan(String value) {
            addCriterion("PAY_REFUND_METHOD >", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_METHOD >=", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodLessThan(String value) {
            addCriterion("PAY_REFUND_METHOD <", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodLessThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_METHOD <=", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodLike(String value) {
            addCriterion("PAY_REFUND_METHOD like", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodNotLike(String value) {
            addCriterion("PAY_REFUND_METHOD not like", value, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodIn(List<String> values) {
            addCriterion("PAY_REFUND_METHOD in", values, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodNotIn(List<String> values) {
            addCriterion("PAY_REFUND_METHOD not in", values, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_METHOD between", value1, value2, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayRefundMethodNotBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_METHOD not between", value1, value2, "payRefundMethod");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlIsNull() {
            addCriterion("PAY_APP_ACTION_URL is null");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlIsNotNull() {
            addCriterion("PAY_APP_ACTION_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlEqualTo(String value) {
            addCriterion("PAY_APP_ACTION_URL =", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlNotEqualTo(String value) {
            addCriterion("PAY_APP_ACTION_URL <>", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlGreaterThan(String value) {
            addCriterion("PAY_APP_ACTION_URL >", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_APP_ACTION_URL >=", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlLessThan(String value) {
            addCriterion("PAY_APP_ACTION_URL <", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlLessThanOrEqualTo(String value) {
            addCriterion("PAY_APP_ACTION_URL <=", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlLike(String value) {
            addCriterion("PAY_APP_ACTION_URL like", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlNotLike(String value) {
            addCriterion("PAY_APP_ACTION_URL not like", value, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlIn(List<String> values) {
            addCriterion("PAY_APP_ACTION_URL in", values, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlNotIn(List<String> values) {
            addCriterion("PAY_APP_ACTION_URL not in", values, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlBetween(String value1, String value2) {
            addCriterion("PAY_APP_ACTION_URL between", value1, value2, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andPayAppActionUrlNotBetween(String value1, String value2) {
            addCriterion("PAY_APP_ACTION_URL not between", value1, value2, "payAppActionUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlIsNull() {
            addCriterion("REFUND_RETURN_URL is null");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlIsNotNull() {
            addCriterion("REFUND_RETURN_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlEqualTo(String value) {
            addCriterion("REFUND_RETURN_URL =", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlNotEqualTo(String value) {
            addCriterion("REFUND_RETURN_URL <>", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlGreaterThan(String value) {
            addCriterion("REFUND_RETURN_URL >", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_RETURN_URL >=", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlLessThan(String value) {
            addCriterion("REFUND_RETURN_URL <", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlLessThanOrEqualTo(String value) {
            addCriterion("REFUND_RETURN_URL <=", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlLike(String value) {
            addCriterion("REFUND_RETURN_URL like", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlNotLike(String value) {
            addCriterion("REFUND_RETURN_URL not like", value, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlIn(List<String> values) {
            addCriterion("REFUND_RETURN_URL in", values, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlNotIn(List<String> values) {
            addCriterion("REFUND_RETURN_URL not in", values, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlBetween(String value1, String value2) {
            addCriterion("REFUND_RETURN_URL between", value1, value2, "refundReturnUrl");
            return (Criteria) this;
        }

        public Criteria andRefundReturnUrlNotBetween(String value1, String value2) {
            addCriterion("REFUND_RETURN_URL not between", value1, value2, "refundReturnUrl");
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