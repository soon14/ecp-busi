package com.zengshi.ecp.sys.dao.model;

import com.zengshi.ecp.frame.vo.BaseCriteria;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BaseParamSimpleCriteria extends BaseCriteria implements Serializable {
    protected String orderByClause;
    
    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;
    
    private static final long serialVersionUID = 1L;
    
    public BaseParamSimpleCriteria() {
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

        public Criteria andParamLinkKeyIsNull() {
            addCriterion("PARAM_LINK_KEY is null");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyIsNotNull() {
            addCriterion("PARAM_LINK_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyEqualTo(String value) {
            addCriterion("PARAM_LINK_KEY =", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyNotEqualTo(String value) {
            addCriterion("PARAM_LINK_KEY <>", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyGreaterThan(String value) {
            addCriterion("PARAM_LINK_KEY >", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_LINK_KEY >=", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyLessThan(String value) {
            addCriterion("PARAM_LINK_KEY <", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyLessThanOrEqualTo(String value) {
            addCriterion("PARAM_LINK_KEY <=", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyLike(String value) {
            addCriterion("PARAM_LINK_KEY like", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyNotLike(String value) {
            addCriterion("PARAM_LINK_KEY not like", value, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyIn(List<String> values) {
            addCriterion("PARAM_LINK_KEY in", values, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyNotIn(List<String> values) {
            addCriterion("PARAM_LINK_KEY not in", values, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyBetween(String value1, String value2) {
            addCriterion("PARAM_LINK_KEY between", value1, value2, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andParamLinkKeyNotBetween(String value1, String value2) {
            addCriterion("PARAM_LINK_KEY not between", value1, value2, "paramLinkKey");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNull() {
            addCriterion("SP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNotNull() {
            addCriterion("SP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpCodeEqualTo(String value) {
            addCriterion("SP_CODE =", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotEqualTo(String value) {
            addCriterion("SP_CODE <>", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThan(String value) {
            addCriterion("SP_CODE >", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SP_CODE >=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThan(String value) {
            addCriterion("SP_CODE <", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThanOrEqualTo(String value) {
            addCriterion("SP_CODE <=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLike(String value) {
            addCriterion("SP_CODE like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotLike(String value) {
            addCriterion("SP_CODE not like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeIn(List<String> values) {
            addCriterion("SP_CODE in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotIn(List<String> values) {
            addCriterion("SP_CODE not in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeBetween(String value1, String value2) {
            addCriterion("SP_CODE between", value1, value2, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotBetween(String value1, String value2) {
            addCriterion("SP_CODE not between", value1, value2, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpLangIsNull() {
            addCriterion("SP_LANG is null");
            return (Criteria) this;
        }

        public Criteria andSpLangIsNotNull() {
            addCriterion("SP_LANG is not null");
            return (Criteria) this;
        }

        public Criteria andSpLangEqualTo(String value) {
            addCriterion("SP_LANG =", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangNotEqualTo(String value) {
            addCriterion("SP_LANG <>", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangGreaterThan(String value) {
            addCriterion("SP_LANG >", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangGreaterThanOrEqualTo(String value) {
            addCriterion("SP_LANG >=", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangLessThan(String value) {
            addCriterion("SP_LANG <", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangLessThanOrEqualTo(String value) {
            addCriterion("SP_LANG <=", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangLike(String value) {
            addCriterion("SP_LANG like", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangNotLike(String value) {
            addCriterion("SP_LANG not like", value, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangIn(List<String> values) {
            addCriterion("SP_LANG in", values, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangNotIn(List<String> values) {
            addCriterion("SP_LANG not in", values, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangBetween(String value1, String value2) {
            addCriterion("SP_LANG between", value1, value2, "spLang");
            return (Criteria) this;
        }

        public Criteria andSpLangNotBetween(String value1, String value2) {
            addCriterion("SP_LANG not between", value1, value2, "spLang");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNull() {
            addCriterion("PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNotNull() {
            addCriterion("PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParamNameEqualTo(String value) {
            addCriterion("PARAM_NAME =", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotEqualTo(String value) {
            addCriterion("PARAM_NAME <>", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThan(String value) {
            addCriterion("PARAM_NAME >", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME >=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThan(String value) {
            addCriterion("PARAM_NAME <", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME <=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLike(String value) {
            addCriterion("PARAM_NAME like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotLike(String value) {
            addCriterion("PARAM_NAME not like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameIn(List<String> values) {
            addCriterion("PARAM_NAME in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotIn(List<String> values) {
            addCriterion("PARAM_NAME not in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameBetween(String value1, String value2) {
            addCriterion("PARAM_NAME between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotBetween(String value1, String value2) {
            addCriterion("PARAM_NAME not between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andSpValueIsNull() {
            addCriterion("SP_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSpValueIsNotNull() {
            addCriterion("SP_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSpValueEqualTo(String value) {
            addCriterion("SP_VALUE =", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotEqualTo(String value) {
            addCriterion("SP_VALUE <>", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueGreaterThan(String value) {
            addCriterion("SP_VALUE >", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueGreaterThanOrEqualTo(String value) {
            addCriterion("SP_VALUE >=", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueLessThan(String value) {
            addCriterion("SP_VALUE <", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueLessThanOrEqualTo(String value) {
            addCriterion("SP_VALUE <=", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueLike(String value) {
            addCriterion("SP_VALUE like", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotLike(String value) {
            addCriterion("SP_VALUE not like", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueIn(List<String> values) {
            addCriterion("SP_VALUE in", values, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotIn(List<String> values) {
            addCriterion("SP_VALUE not in", values, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueBetween(String value1, String value2) {
            addCriterion("SP_VALUE between", value1, value2, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotBetween(String value1, String value2) {
            addCriterion("SP_VALUE not between", value1, value2, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpOrderIsNull() {
            addCriterion("SP_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andSpOrderIsNotNull() {
            addCriterion("SP_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSpOrderEqualTo(BigDecimal value) {
            addCriterion("SP_ORDER =", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderNotEqualTo(BigDecimal value) {
            addCriterion("SP_ORDER <>", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderGreaterThan(BigDecimal value) {
            addCriterion("SP_ORDER >", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_ORDER >=", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderLessThan(BigDecimal value) {
            addCriterion("SP_ORDER <", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_ORDER <=", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderIn(List<BigDecimal> values) {
            addCriterion("SP_ORDER in", values, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderNotIn(List<BigDecimal> values) {
            addCriterion("SP_ORDER not in", values, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_ORDER between", value1, value2, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_ORDER not between", value1, value2, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpDescIsNull() {
            addCriterion("SP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSpDescIsNotNull() {
            addCriterion("SP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSpDescEqualTo(String value) {
            addCriterion("SP_DESC =", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescNotEqualTo(String value) {
            addCriterion("SP_DESC <>", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescGreaterThan(String value) {
            addCriterion("SP_DESC >", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescGreaterThanOrEqualTo(String value) {
            addCriterion("SP_DESC >=", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescLessThan(String value) {
            addCriterion("SP_DESC <", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescLessThanOrEqualTo(String value) {
            addCriterion("SP_DESC <=", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescLike(String value) {
            addCriterion("SP_DESC like", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescNotLike(String value) {
            addCriterion("SP_DESC not like", value, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescIn(List<String> values) {
            addCriterion("SP_DESC in", values, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescNotIn(List<String> values) {
            addCriterion("SP_DESC not in", values, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescBetween(String value1, String value2) {
            addCriterion("SP_DESC between", value1, value2, "spDesc");
            return (Criteria) this;
        }

        public Criteria andSpDescNotBetween(String value1, String value2) {
            addCriterion("SP_DESC not between", value1, value2, "spDesc");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("FIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("FIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("FIELD_NAME =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("FIELD_NAME <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("FIELD_NAME >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("FIELD_NAME <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("FIELD_NAME like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("FIELD_NAME not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("FIELD_NAME in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("FIELD_NAME not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("FIELD_NAME between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("FIELD_NAME not between", value1, value2, "fieldName");
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
