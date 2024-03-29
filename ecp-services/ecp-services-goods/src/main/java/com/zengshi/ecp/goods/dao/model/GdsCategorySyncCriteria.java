package com.zengshi.ecp.goods.dao.model;

import com.zengshi.ecp.frame.vo.BaseCriteria;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class GdsCategorySyncCriteria extends BaseCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public GdsCategorySyncCriteria() {
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

        public Criteria andCatgCodeIsNull() {
            addCriterion("CATG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCatgCodeIsNotNull() {
            addCriterion("CATG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCatgCodeEqualTo(String value) {
            addCriterion("CATG_CODE =", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeNotEqualTo(String value) {
            addCriterion("CATG_CODE <>", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeGreaterThan(String value) {
            addCriterion("CATG_CODE >", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CATG_CODE >=", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeLessThan(String value) {
            addCriterion("CATG_CODE <", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeLessThanOrEqualTo(String value) {
            addCriterion("CATG_CODE <=", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeLike(String value) {
            addCriterion("CATG_CODE like", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeNotLike(String value) {
            addCriterion("CATG_CODE not like", value, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeIn(List<String> values) {
            addCriterion("CATG_CODE in", values, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeNotIn(List<String> values) {
            addCriterion("CATG_CODE not in", values, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeBetween(String value1, String value2) {
            addCriterion("CATG_CODE between", value1, value2, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgCodeNotBetween(String value1, String value2) {
            addCriterion("CATG_CODE not between", value1, value2, "catgCode");
            return (Criteria) this;
        }

        public Criteria andCatgNameIsNull() {
            addCriterion("CATG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCatgNameIsNotNull() {
            addCriterion("CATG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCatgNameEqualTo(String value) {
            addCriterion("CATG_NAME =", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameNotEqualTo(String value) {
            addCriterion("CATG_NAME <>", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameGreaterThan(String value) {
            addCriterion("CATG_NAME >", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATG_NAME >=", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameLessThan(String value) {
            addCriterion("CATG_NAME <", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameLessThanOrEqualTo(String value) {
            addCriterion("CATG_NAME <=", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameLike(String value) {
            addCriterion("CATG_NAME like", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameNotLike(String value) {
            addCriterion("CATG_NAME not like", value, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameIn(List<String> values) {
            addCriterion("CATG_NAME in", values, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameNotIn(List<String> values) {
            addCriterion("CATG_NAME not in", values, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameBetween(String value1, String value2) {
            addCriterion("CATG_NAME between", value1, value2, "catgName");
            return (Criteria) this;
        }

        public Criteria andCatgNameNotBetween(String value1, String value2) {
            addCriterion("CATG_NAME not between", value1, value2, "catgName");
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

        public Criteria andCatgParentIsNull() {
            addCriterion("CATG_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andCatgParentIsNotNull() {
            addCriterion("CATG_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andCatgParentEqualTo(String value) {
            addCriterion("CATG_PARENT =", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentNotEqualTo(String value) {
            addCriterion("CATG_PARENT <>", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentGreaterThan(String value) {
            addCriterion("CATG_PARENT >", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentGreaterThanOrEqualTo(String value) {
            addCriterion("CATG_PARENT >=", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentLessThan(String value) {
            addCriterion("CATG_PARENT <", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentLessThanOrEqualTo(String value) {
            addCriterion("CATG_PARENT <=", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentLike(String value) {
            addCriterion("CATG_PARENT like", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentNotLike(String value) {
            addCriterion("CATG_PARENT not like", value, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentIn(List<String> values) {
            addCriterion("CATG_PARENT in", values, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentNotIn(List<String> values) {
            addCriterion("CATG_PARENT not in", values, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentBetween(String value1, String value2) {
            addCriterion("CATG_PARENT between", value1, value2, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentNotBetween(String value1, String value2) {
            addCriterion("CATG_PARENT not between", value1, value2, "catgParent");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameIsNull() {
            addCriterion("CATG_PARENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameIsNotNull() {
            addCriterion("CATG_PARENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameEqualTo(String value) {
            addCriterion("CATG_PARENT_NAME =", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameNotEqualTo(String value) {
            addCriterion("CATG_PARENT_NAME <>", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameGreaterThan(String value) {
            addCriterion("CATG_PARENT_NAME >", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATG_PARENT_NAME >=", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameLessThan(String value) {
            addCriterion("CATG_PARENT_NAME <", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameLessThanOrEqualTo(String value) {
            addCriterion("CATG_PARENT_NAME <=", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameLike(String value) {
            addCriterion("CATG_PARENT_NAME like", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameNotLike(String value) {
            addCriterion("CATG_PARENT_NAME not like", value, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameIn(List<String> values) {
            addCriterion("CATG_PARENT_NAME in", values, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameNotIn(List<String> values) {
            addCriterion("CATG_PARENT_NAME not in", values, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameBetween(String value1, String value2) {
            addCriterion("CATG_PARENT_NAME between", value1, value2, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andCatgParentNameNotBetween(String value1, String value2) {
            addCriterion("CATG_PARENT_NAME not between", value1, value2, "catgParentName");
            return (Criteria) this;
        }

        public Criteria andSrcSystemIsNull() {
            addCriterion("SRC_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andSrcSystemIsNotNull() {
            addCriterion("SRC_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andSrcSystemEqualTo(String value) {
            addCriterion("SRC_SYSTEM =", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemNotEqualTo(String value) {
            addCriterion("SRC_SYSTEM <>", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemGreaterThan(String value) {
            addCriterion("SRC_SYSTEM >", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemGreaterThanOrEqualTo(String value) {
            addCriterion("SRC_SYSTEM >=", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemLessThan(String value) {
            addCriterion("SRC_SYSTEM <", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemLessThanOrEqualTo(String value) {
            addCriterion("SRC_SYSTEM <=", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemLike(String value) {
            addCriterion("SRC_SYSTEM like", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemNotLike(String value) {
            addCriterion("SRC_SYSTEM not like", value, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemIn(List<String> values) {
            addCriterion("SRC_SYSTEM in", values, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemNotIn(List<String> values) {
            addCriterion("SRC_SYSTEM not in", values, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemBetween(String value1, String value2) {
            addCriterion("SRC_SYSTEM between", value1, value2, "srcSystem");
            return (Criteria) this;
        }

        public Criteria andSrcSystemNotBetween(String value1, String value2) {
            addCriterion("SRC_SYSTEM not between", value1, value2, "srcSystem");
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

        public Criteria andOperTimeIsNull() {
            addCriterion("OPER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("OPER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(Timestamp value) {
            addCriterion("OPER_TIME =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(Timestamp value) {
            addCriterion("OPER_TIME <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(Timestamp value) {
            addCriterion("OPER_TIME >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("OPER_TIME >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(Timestamp value) {
            addCriterion("OPER_TIME <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("OPER_TIME <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<Timestamp> values) {
            addCriterion("OPER_TIME in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<Timestamp> values) {
            addCriterion("OPER_TIME not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPER_TIME between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPER_TIME not between", value1, value2, "operTime");
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

        public Criteria andMapCatgCodeIsNull() {
            addCriterion("MAP_CATG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeIsNotNull() {
            addCriterion("MAP_CATG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeEqualTo(String value) {
            addCriterion("MAP_CATG_CODE =", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeNotEqualTo(String value) {
            addCriterion("MAP_CATG_CODE <>", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeGreaterThan(String value) {
            addCriterion("MAP_CATG_CODE >", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MAP_CATG_CODE >=", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeLessThan(String value) {
            addCriterion("MAP_CATG_CODE <", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeLessThanOrEqualTo(String value) {
            addCriterion("MAP_CATG_CODE <=", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeLike(String value) {
            addCriterion("MAP_CATG_CODE like", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeNotLike(String value) {
            addCriterion("MAP_CATG_CODE not like", value, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeIn(List<String> values) {
            addCriterion("MAP_CATG_CODE in", values, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeNotIn(List<String> values) {
            addCriterion("MAP_CATG_CODE not in", values, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeBetween(String value1, String value2) {
            addCriterion("MAP_CATG_CODE between", value1, value2, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andMapCatgCodeNotBetween(String value1, String value2) {
            addCriterion("MAP_CATG_CODE not between", value1, value2, "mapCatgCode");
            return (Criteria) this;
        }

        public Criteria andCatgTypeIsNull() {
            addCriterion("CATG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCatgTypeIsNotNull() {
            addCriterion("CATG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCatgTypeEqualTo(String value) {
            addCriterion("CATG_TYPE =", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeNotEqualTo(String value) {
            addCriterion("CATG_TYPE <>", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeGreaterThan(String value) {
            addCriterion("CATG_TYPE >", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CATG_TYPE >=", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeLessThan(String value) {
            addCriterion("CATG_TYPE <", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeLessThanOrEqualTo(String value) {
            addCriterion("CATG_TYPE <=", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeLike(String value) {
            addCriterion("CATG_TYPE like", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeNotLike(String value) {
            addCriterion("CATG_TYPE not like", value, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeIn(List<String> values) {
            addCriterion("CATG_TYPE in", values, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeNotIn(List<String> values) {
            addCriterion("CATG_TYPE not in", values, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeBetween(String value1, String value2) {
            addCriterion("CATG_TYPE between", value1, value2, "catgType");
            return (Criteria) this;
        }

        public Criteria andCatgTypeNotBetween(String value1, String value2) {
            addCriterion("CATG_TYPE not between", value1, value2, "catgType");
            return (Criteria) this;
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

        public Criteria andShopAuthIdIsNull() {
            addCriterion("SHOP_AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdIsNotNull() {
            addCriterion("SHOP_AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdEqualTo(Long value) {
            addCriterion("SHOP_AUTH_ID =", value, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdNotEqualTo(Long value) {
            addCriterion("SHOP_AUTH_ID <>", value, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdGreaterThan(Long value) {
            addCriterion("SHOP_AUTH_ID >", value, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_AUTH_ID >=", value, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdLessThan(Long value) {
            addCriterion("SHOP_AUTH_ID <", value, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_AUTH_ID <=", value, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdIn(List<Long> values) {
            addCriterion("SHOP_AUTH_ID in", values, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdNotIn(List<Long> values) {
            addCriterion("SHOP_AUTH_ID not in", values, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_AUTH_ID between", value1, value2, "shopAuthId");
            return (Criteria) this;
        }

        public Criteria andShopAuthIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_AUTH_ID not between", value1, value2, "shopAuthId");
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
