package com.saul.wx.model;

import com.Page;
import java.util.ArrayList;
import java.util.List;

public class MstbWhereSubCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MstbWhereSubCriteria() {
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

        public Criteria andMwsIdIsNull() {
            addCriterion("mws_id is null");
            return (Criteria) this;
        }

        public Criteria andMwsIdIsNotNull() {
            addCriterion("mws_id is not null");
            return (Criteria) this;
        }

        public Criteria andMwsIdEqualTo(Integer value) {
            addCriterion("mws_id =", value, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdNotEqualTo(Integer value) {
            addCriterion("mws_id <>", value, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdGreaterThan(Integer value) {
            addCriterion("mws_id >", value, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mws_id >=", value, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdLessThan(Integer value) {
            addCriterion("mws_id <", value, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdLessThanOrEqualTo(Integer value) {
            addCriterion("mws_id <=", value, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdIn(List<Integer> values) {
            addCriterion("mws_id in", values, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdNotIn(List<Integer> values) {
            addCriterion("mws_id not in", values, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdBetween(Integer value1, Integer value2) {
            addCriterion("mws_id between", value1, value2, "mwsId");
            return (Criteria) this;
        }

        public Criteria andMwsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mws_id not between", value1, value2, "mwsId");
            return (Criteria) this;
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

        public Criteria andMwsItemNameIsNull() {
            addCriterion("mws_item_name is null");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameIsNotNull() {
            addCriterion("mws_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameEqualTo(String value) {
            addCriterion("mws_item_name =", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameNotEqualTo(String value) {
            addCriterion("mws_item_name <>", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameGreaterThan(String value) {
            addCriterion("mws_item_name >", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("mws_item_name >=", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameLessThan(String value) {
            addCriterion("mws_item_name <", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameLessThanOrEqualTo(String value) {
            addCriterion("mws_item_name <=", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameLike(String value) {
            addCriterion("mws_item_name like", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameNotLike(String value) {
            addCriterion("mws_item_name not like", value, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameIn(List<String> values) {
            addCriterion("mws_item_name in", values, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameNotIn(List<String> values) {
            addCriterion("mws_item_name not in", values, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameBetween(String value1, String value2) {
            addCriterion("mws_item_name between", value1, value2, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameNotBetween(String value1, String value2) {
            addCriterion("mws_item_name not between", value1, value2, "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkIsNull() {
            addCriterion("mws_remark is null");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkIsNotNull() {
            addCriterion("mws_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkEqualTo(String value) {
            addCriterion("mws_remark =", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkNotEqualTo(String value) {
            addCriterion("mws_remark <>", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkGreaterThan(String value) {
            addCriterion("mws_remark >", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mws_remark >=", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkLessThan(String value) {
            addCriterion("mws_remark <", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkLessThanOrEqualTo(String value) {
            addCriterion("mws_remark <=", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkLike(String value) {
            addCriterion("mws_remark like", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkNotLike(String value) {
            addCriterion("mws_remark not like", value, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkIn(List<String> values) {
            addCriterion("mws_remark in", values, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkNotIn(List<String> values) {
            addCriterion("mws_remark not in", values, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkBetween(String value1, String value2) {
            addCriterion("mws_remark between", value1, value2, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkNotBetween(String value1, String value2) {
            addCriterion("mws_remark not between", value1, value2, "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsAddressIsNull() {
            addCriterion("mws_address is null");
            return (Criteria) this;
        }

        public Criteria andMwsAddressIsNotNull() {
            addCriterion("mws_address is not null");
            return (Criteria) this;
        }

        public Criteria andMwsAddressEqualTo(String value) {
            addCriterion("mws_address =", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressNotEqualTo(String value) {
            addCriterion("mws_address <>", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressGreaterThan(String value) {
            addCriterion("mws_address >", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mws_address >=", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressLessThan(String value) {
            addCriterion("mws_address <", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressLessThanOrEqualTo(String value) {
            addCriterion("mws_address <=", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressLike(String value) {
            addCriterion("mws_address like", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressNotLike(String value) {
            addCriterion("mws_address not like", value, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressIn(List<String> values) {
            addCriterion("mws_address in", values, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressNotIn(List<String> values) {
            addCriterion("mws_address not in", values, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressBetween(String value1, String value2) {
            addCriterion("mws_address between", value1, value2, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsAddressNotBetween(String value1, String value2) {
            addCriterion("mws_address not between", value1, value2, "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesIsNull() {
            addCriterion("mws_imgaes is null");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesIsNotNull() {
            addCriterion("mws_imgaes is not null");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesEqualTo(String value) {
            addCriterion("mws_imgaes =", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesNotEqualTo(String value) {
            addCriterion("mws_imgaes <>", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesGreaterThan(String value) {
            addCriterion("mws_imgaes >", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesGreaterThanOrEqualTo(String value) {
            addCriterion("mws_imgaes >=", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesLessThan(String value) {
            addCriterion("mws_imgaes <", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesLessThanOrEqualTo(String value) {
            addCriterion("mws_imgaes <=", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesLike(String value) {
            addCriterion("mws_imgaes like", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesNotLike(String value) {
            addCriterion("mws_imgaes not like", value, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesIn(List<String> values) {
            addCriterion("mws_imgaes in", values, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesNotIn(List<String> values) {
            addCriterion("mws_imgaes not in", values, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesBetween(String value1, String value2) {
            addCriterion("mws_imgaes between", value1, value2, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesNotBetween(String value1, String value2) {
            addCriterion("mws_imgaes not between", value1, value2, "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeIsNull() {
            addCriterion("mws_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeIsNotNull() {
            addCriterion("mws_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeEqualTo(String value) {
            addCriterion("mws_create_time =", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeNotEqualTo(String value) {
            addCriterion("mws_create_time <>", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeGreaterThan(String value) {
            addCriterion("mws_create_time >", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mws_create_time >=", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeLessThan(String value) {
            addCriterion("mws_create_time <", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("mws_create_time <=", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeLike(String value) {
            addCriterion("mws_create_time like", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeNotLike(String value) {
            addCriterion("mws_create_time not like", value, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeIn(List<String> values) {
            addCriterion("mws_create_time in", values, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeNotIn(List<String> values) {
            addCriterion("mws_create_time not in", values, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeBetween(String value1, String value2) {
            addCriterion("mws_create_time between", value1, value2, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeNotBetween(String value1, String value2) {
            addCriterion("mws_create_time not between", value1, value2, "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeIsNull() {
            addCriterion("mws_update_time is null");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeIsNotNull() {
            addCriterion("mws_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeEqualTo(String value) {
            addCriterion("mws_update_time =", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeNotEqualTo(String value) {
            addCriterion("mws_update_time <>", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeGreaterThan(String value) {
            addCriterion("mws_update_time >", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mws_update_time >=", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeLessThan(String value) {
            addCriterion("mws_update_time <", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("mws_update_time <=", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeLike(String value) {
            addCriterion("mws_update_time like", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeNotLike(String value) {
            addCriterion("mws_update_time not like", value, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeIn(List<String> values) {
            addCriterion("mws_update_time in", values, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeNotIn(List<String> values) {
            addCriterion("mws_update_time not in", values, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeBetween(String value1, String value2) {
            addCriterion("mws_update_time between", value1, value2, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("mws_update_time not between", value1, value2, "mwsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMwsItemNameLikeInsensitive(String value) {
            addCriterion("upper(mws_item_name) like", value.toUpperCase(), "mwsItemName");
            return (Criteria) this;
        }

        public Criteria andMwsRemarkLikeInsensitive(String value) {
            addCriterion("upper(mws_remark) like", value.toUpperCase(), "mwsRemark");
            return (Criteria) this;
        }

        public Criteria andMwsAddressLikeInsensitive(String value) {
            addCriterion("upper(mws_address) like", value.toUpperCase(), "mwsAddress");
            return (Criteria) this;
        }

        public Criteria andMwsImgaesLikeInsensitive(String value) {
            addCriterion("upper(mws_imgaes) like", value.toUpperCase(), "mwsImgaes");
            return (Criteria) this;
        }

        public Criteria andMwsCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(mws_create_time) like", value.toUpperCase(), "mwsCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwsUpdateTimeLikeInsensitive(String value) {
            addCriterion("upper(mws_update_time) like", value.toUpperCase(), "mwsUpdateTime");
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