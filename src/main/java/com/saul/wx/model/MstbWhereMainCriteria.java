package com.saul.wx.model;

import com.Page;
import java.util.ArrayList;
import java.util.List;

public class MstbWhereMainCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MstbWhereMainCriteria() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andMwmIdIsNull() {
            addCriterion("mwm_id is null");
            return (Criteria) this;
        }

        public Criteria andMwmIdIsNotNull() {
            addCriterion("mwm_id is not null");
            return (Criteria) this;
        }

        public Criteria andMwmIdEqualTo(Integer value) {
            addCriterion("mwm_id =", value, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdNotEqualTo(Integer value) {
            addCriterion("mwm_id <>", value, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdGreaterThan(Integer value) {
            addCriterion("mwm_id >", value, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mwm_id >=", value, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdLessThan(Integer value) {
            addCriterion("mwm_id <", value, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdLessThanOrEqualTo(Integer value) {
            addCriterion("mwm_id <=", value, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdIn(List<Integer> values) {
            addCriterion("mwm_id in", values, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdNotIn(List<Integer> values) {
            addCriterion("mwm_id not in", values, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdBetween(Integer value1, Integer value2) {
            addCriterion("mwm_id between", value1, value2, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mwm_id not between", value1, value2, "mwmId");
            return (Criteria) this;
        }

        public Criteria andMwIdIsNull() {
            addCriterion("mw_id is null");
            return (Criteria) this;
        }

        public Criteria andMwIdIsNotNull() {
            addCriterion("mw_id is not null");
            return (Criteria) this;
        }

        public Criteria andMwIdEqualTo(Integer value) {
            addCriterion("mw_id =", value, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdNotEqualTo(Integer value) {
            addCriterion("mw_id <>", value, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdGreaterThan(Integer value) {
            addCriterion("mw_id >", value, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mw_id >=", value, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdLessThan(Integer value) {
            addCriterion("mw_id <", value, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdLessThanOrEqualTo(Integer value) {
            addCriterion("mw_id <=", value, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdIn(List<Integer> values) {
            addCriterion("mw_id in", values, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdNotIn(List<Integer> values) {
            addCriterion("mw_id not in", values, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdBetween(Integer value1, Integer value2) {
            addCriterion("mw_id between", value1, value2, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mw_id not between", value1, value2, "mwId");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameIsNull() {
            addCriterion("mwm_box_name is null");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameIsNotNull() {
            addCriterion("mwm_box_name is not null");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameEqualTo(String value) {
            addCriterion("mwm_box_name =", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameNotEqualTo(String value) {
            addCriterion("mwm_box_name <>", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameGreaterThan(String value) {
            addCriterion("mwm_box_name >", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameGreaterThanOrEqualTo(String value) {
            addCriterion("mwm_box_name >=", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameLessThan(String value) {
            addCriterion("mwm_box_name <", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameLessThanOrEqualTo(String value) {
            addCriterion("mwm_box_name <=", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameLike(String value) {
            addCriterion("mwm_box_name like", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameNotLike(String value) {
            addCriterion("mwm_box_name not like", value, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameIn(List<String> values) {
            addCriterion("mwm_box_name in", values, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameNotIn(List<String> values) {
            addCriterion("mwm_box_name not in", values, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameBetween(String value1, String value2) {
            addCriterion("mwm_box_name between", value1, value2, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameNotBetween(String value1, String value2) {
            addCriterion("mwm_box_name not between", value1, value2, "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkIsNull() {
            addCriterion("mwm_remark is null");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkIsNotNull() {
            addCriterion("mwm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkEqualTo(String value) {
            addCriterion("mwm_remark =", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkNotEqualTo(String value) {
            addCriterion("mwm_remark <>", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkGreaterThan(String value) {
            addCriterion("mwm_remark >", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mwm_remark >=", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkLessThan(String value) {
            addCriterion("mwm_remark <", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkLessThanOrEqualTo(String value) {
            addCriterion("mwm_remark <=", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkLike(String value) {
            addCriterion("mwm_remark like", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkNotLike(String value) {
            addCriterion("mwm_remark not like", value, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkIn(List<String> values) {
            addCriterion("mwm_remark in", values, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkNotIn(List<String> values) {
            addCriterion("mwm_remark not in", values, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkBetween(String value1, String value2) {
            addCriterion("mwm_remark between", value1, value2, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkNotBetween(String value1, String value2) {
            addCriterion("mwm_remark not between", value1, value2, "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmAddressIsNull() {
            addCriterion("mwm_address is null");
            return (Criteria) this;
        }

        public Criteria andMwmAddressIsNotNull() {
            addCriterion("mwm_address is not null");
            return (Criteria) this;
        }

        public Criteria andMwmAddressEqualTo(String value) {
            addCriterion("mwm_address =", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressNotEqualTo(String value) {
            addCriterion("mwm_address <>", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressGreaterThan(String value) {
            addCriterion("mwm_address >", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mwm_address >=", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressLessThan(String value) {
            addCriterion("mwm_address <", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressLessThanOrEqualTo(String value) {
            addCriterion("mwm_address <=", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressLike(String value) {
            addCriterion("mwm_address like", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressNotLike(String value) {
            addCriterion("mwm_address not like", value, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressIn(List<String> values) {
            addCriterion("mwm_address in", values, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressNotIn(List<String> values) {
            addCriterion("mwm_address not in", values, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressBetween(String value1, String value2) {
            addCriterion("mwm_address between", value1, value2, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmAddressNotBetween(String value1, String value2) {
            addCriterion("mwm_address not between", value1, value2, "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesIsNull() {
            addCriterion("mwm_imgaes is null");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesIsNotNull() {
            addCriterion("mwm_imgaes is not null");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesEqualTo(String value) {
            addCriterion("mwm_imgaes =", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesNotEqualTo(String value) {
            addCriterion("mwm_imgaes <>", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesGreaterThan(String value) {
            addCriterion("mwm_imgaes >", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesGreaterThanOrEqualTo(String value) {
            addCriterion("mwm_imgaes >=", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesLessThan(String value) {
            addCriterion("mwm_imgaes <", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesLessThanOrEqualTo(String value) {
            addCriterion("mwm_imgaes <=", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesLike(String value) {
            addCriterion("mwm_imgaes like", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesNotLike(String value) {
            addCriterion("mwm_imgaes not like", value, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesIn(List<String> values) {
            addCriterion("mwm_imgaes in", values, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesNotIn(List<String> values) {
            addCriterion("mwm_imgaes not in", values, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesBetween(String value1, String value2) {
            addCriterion("mwm_imgaes between", value1, value2, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesNotBetween(String value1, String value2) {
            addCriterion("mwm_imgaes not between", value1, value2, "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeIsNull() {
            addCriterion("mwm_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeIsNotNull() {
            addCriterion("mwm_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeEqualTo(String value) {
            addCriterion("mwm_create_time =", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeNotEqualTo(String value) {
            addCriterion("mwm_create_time <>", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeGreaterThan(String value) {
            addCriterion("mwm_create_time >", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mwm_create_time >=", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeLessThan(String value) {
            addCriterion("mwm_create_time <", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("mwm_create_time <=", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeLike(String value) {
            addCriterion("mwm_create_time like", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeNotLike(String value) {
            addCriterion("mwm_create_time not like", value, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeIn(List<String> values) {
            addCriterion("mwm_create_time in", values, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeNotIn(List<String> values) {
            addCriterion("mwm_create_time not in", values, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeBetween(String value1, String value2) {
            addCriterion("mwm_create_time between", value1, value2, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeNotBetween(String value1, String value2) {
            addCriterion("mwm_create_time not between", value1, value2, "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeIsNull() {
            addCriterion("mwm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeIsNotNull() {
            addCriterion("mwm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeEqualTo(String value) {
            addCriterion("mwm_update_time =", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeNotEqualTo(String value) {
            addCriterion("mwm_update_time <>", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeGreaterThan(String value) {
            addCriterion("mwm_update_time >", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mwm_update_time >=", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeLessThan(String value) {
            addCriterion("mwm_update_time <", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("mwm_update_time <=", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeLike(String value) {
            addCriterion("mwm_update_time like", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeNotLike(String value) {
            addCriterion("mwm_update_time not like", value, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeIn(List<String> values) {
            addCriterion("mwm_update_time in", values, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeNotIn(List<String> values) {
            addCriterion("mwm_update_time not in", values, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeBetween(String value1, String value2) {
            addCriterion("mwm_update_time between", value1, value2, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("mwm_update_time not between", value1, value2, "mwmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwmBoxNameLikeInsensitive(String value) {
            addCriterion("upper(mwm_box_name) like", value.toUpperCase(), "mwmBoxName");
            return (Criteria) this;
        }

        public Criteria andMwmRemarkLikeInsensitive(String value) {
            addCriterion("upper(mwm_remark) like", value.toUpperCase(), "mwmRemark");
            return (Criteria) this;
        }

        public Criteria andMwmAddressLikeInsensitive(String value) {
            addCriterion("upper(mwm_address) like", value.toUpperCase(), "mwmAddress");
            return (Criteria) this;
        }

        public Criteria andMwmImgaesLikeInsensitive(String value) {
            addCriterion("upper(mwm_imgaes) like", value.toUpperCase(), "mwmImgaes");
            return (Criteria) this;
        }

        public Criteria andMwmCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(mwm_create_time) like", value.toUpperCase(), "mwmCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwmUpdateTimeLikeInsensitive(String value) {
            addCriterion("upper(mwm_update_time) like", value.toUpperCase(), "mwmUpdateTime");
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