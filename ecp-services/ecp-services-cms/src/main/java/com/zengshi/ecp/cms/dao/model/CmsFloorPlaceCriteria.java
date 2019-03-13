package com.zengshi.ecp.cms.dao.model;

import com.zengshi.ecp.frame.vo.BaseCriteria;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CmsFloorPlaceCriteria extends BaseCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CmsFloorPlaceCriteria() {
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

        public Criteria andFloorTemplateIdIsNull() {
            addCriterion("FLOOR_TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdIsNotNull() {
            addCriterion("FLOOR_TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdEqualTo(Long value) {
            addCriterion("FLOOR_TEMPLATE_ID =", value, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdNotEqualTo(Long value) {
            addCriterion("FLOOR_TEMPLATE_ID <>", value, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdGreaterThan(Long value) {
            addCriterion("FLOOR_TEMPLATE_ID >", value, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FLOOR_TEMPLATE_ID >=", value, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdLessThan(Long value) {
            addCriterion("FLOOR_TEMPLATE_ID <", value, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("FLOOR_TEMPLATE_ID <=", value, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdIn(List<Long> values) {
            addCriterion("FLOOR_TEMPLATE_ID in", values, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdNotIn(List<Long> values) {
            addCriterion("FLOOR_TEMPLATE_ID not in", values, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdBetween(Long value1, Long value2) {
            addCriterion("FLOOR_TEMPLATE_ID between", value1, value2, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andFloorTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("FLOOR_TEMPLATE_ID not between", value1, value2, "floorTemplateId");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthIsNull() {
            addCriterion("PLACE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthIsNotNull() {
            addCriterion("PLACE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthEqualTo(Long value) {
            addCriterion("PLACE_WIDTH =", value, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthNotEqualTo(Long value) {
            addCriterion("PLACE_WIDTH <>", value, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthGreaterThan(Long value) {
            addCriterion("PLACE_WIDTH >", value, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("PLACE_WIDTH >=", value, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthLessThan(Long value) {
            addCriterion("PLACE_WIDTH <", value, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthLessThanOrEqualTo(Long value) {
            addCriterion("PLACE_WIDTH <=", value, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthIn(List<Long> values) {
            addCriterion("PLACE_WIDTH in", values, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthNotIn(List<Long> values) {
            addCriterion("PLACE_WIDTH not in", values, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthBetween(Long value1, Long value2) {
            addCriterion("PLACE_WIDTH between", value1, value2, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceWidthNotBetween(Long value1, Long value2) {
            addCriterion("PLACE_WIDTH not between", value1, value2, "placeWidth");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightIsNull() {
            addCriterion("PLACE_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightIsNotNull() {
            addCriterion("PLACE_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightEqualTo(Long value) {
            addCriterion("PLACE_HEIGHT =", value, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightNotEqualTo(Long value) {
            addCriterion("PLACE_HEIGHT <>", value, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightGreaterThan(Long value) {
            addCriterion("PLACE_HEIGHT >", value, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("PLACE_HEIGHT >=", value, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightLessThan(Long value) {
            addCriterion("PLACE_HEIGHT <", value, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightLessThanOrEqualTo(Long value) {
            addCriterion("PLACE_HEIGHT <=", value, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightIn(List<Long> values) {
            addCriterion("PLACE_HEIGHT in", values, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightNotIn(List<Long> values) {
            addCriterion("PLACE_HEIGHT not in", values, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightBetween(Long value1, Long value2) {
            addCriterion("PLACE_HEIGHT between", value1, value2, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceHeightNotBetween(Long value1, Long value2) {
            addCriterion("PLACE_HEIGHT not between", value1, value2, "placeHeight");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeIsNull() {
            addCriterion("PLACE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeIsNotNull() {
            addCriterion("PLACE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeEqualTo(Long value) {
            addCriterion("PLACE_SIZE =", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeNotEqualTo(Long value) {
            addCriterion("PLACE_SIZE <>", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeGreaterThan(Long value) {
            addCriterion("PLACE_SIZE >", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("PLACE_SIZE >=", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeLessThan(Long value) {
            addCriterion("PLACE_SIZE <", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeLessThanOrEqualTo(Long value) {
            addCriterion("PLACE_SIZE <=", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeIn(List<Long> values) {
            addCriterion("PLACE_SIZE in", values, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeNotIn(List<Long> values) {
            addCriterion("PLACE_SIZE not in", values, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeBetween(Long value1, Long value2) {
            addCriterion("PLACE_SIZE between", value1, value2, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeNotBetween(Long value1, Long value2) {
            addCriterion("PLACE_SIZE not between", value1, value2, "placeSize");
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