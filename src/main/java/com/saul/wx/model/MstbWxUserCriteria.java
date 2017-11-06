package com.saul.wx.model;

import com.Page;
import java.util.ArrayList;
import java.util.List;

public class MstbWxUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MstbWxUserCriteria() {
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

        public Criteria andMwOpenidIsNull() {
            addCriterion("mw_openid is null");
            return (Criteria) this;
        }

        public Criteria andMwOpenidIsNotNull() {
            addCriterion("mw_openid is not null");
            return (Criteria) this;
        }

        public Criteria andMwOpenidEqualTo(String value) {
            addCriterion("mw_openid =", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidNotEqualTo(String value) {
            addCriterion("mw_openid <>", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidGreaterThan(String value) {
            addCriterion("mw_openid >", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("mw_openid >=", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidLessThan(String value) {
            addCriterion("mw_openid <", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidLessThanOrEqualTo(String value) {
            addCriterion("mw_openid <=", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidLike(String value) {
            addCriterion("mw_openid like", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidNotLike(String value) {
            addCriterion("mw_openid not like", value, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidIn(List<String> values) {
            addCriterion("mw_openid in", values, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidNotIn(List<String> values) {
            addCriterion("mw_openid not in", values, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidBetween(String value1, String value2) {
            addCriterion("mw_openid between", value1, value2, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwOpenidNotBetween(String value1, String value2) {
            addCriterion("mw_openid not between", value1, value2, "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwNicknameIsNull() {
            addCriterion("mw_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMwNicknameIsNotNull() {
            addCriterion("mw_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMwNicknameEqualTo(String value) {
            addCriterion("mw_nickname =", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameNotEqualTo(String value) {
            addCriterion("mw_nickname <>", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameGreaterThan(String value) {
            addCriterion("mw_nickname >", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("mw_nickname >=", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameLessThan(String value) {
            addCriterion("mw_nickname <", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameLessThanOrEqualTo(String value) {
            addCriterion("mw_nickname <=", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameLike(String value) {
            addCriterion("mw_nickname like", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameNotLike(String value) {
            addCriterion("mw_nickname not like", value, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameIn(List<String> values) {
            addCriterion("mw_nickname in", values, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameNotIn(List<String> values) {
            addCriterion("mw_nickname not in", values, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameBetween(String value1, String value2) {
            addCriterion("mw_nickname between", value1, value2, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andMwNicknameNotBetween(String value1, String value2) {
            addCriterion("mw_nickname not between", value1, value2, "mwNickname");
            return (Criteria) this;
        }

        public Criteria andWxRemarkIsNull() {
            addCriterion("wx_remark is null");
            return (Criteria) this;
        }

        public Criteria andWxRemarkIsNotNull() {
            addCriterion("wx_remark is not null");
            return (Criteria) this;
        }

        public Criteria andWxRemarkEqualTo(String value) {
            addCriterion("wx_remark =", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkNotEqualTo(String value) {
            addCriterion("wx_remark <>", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkGreaterThan(String value) {
            addCriterion("wx_remark >", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("wx_remark >=", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkLessThan(String value) {
            addCriterion("wx_remark <", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkLessThanOrEqualTo(String value) {
            addCriterion("wx_remark <=", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkLike(String value) {
            addCriterion("wx_remark like", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkNotLike(String value) {
            addCriterion("wx_remark not like", value, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkIn(List<String> values) {
            addCriterion("wx_remark in", values, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkNotIn(List<String> values) {
            addCriterion("wx_remark not in", values, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkBetween(String value1, String value2) {
            addCriterion("wx_remark between", value1, value2, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxRemarkNotBetween(String value1, String value2) {
            addCriterion("wx_remark not between", value1, value2, "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxSexIsNull() {
            addCriterion("wx_sex is null");
            return (Criteria) this;
        }

        public Criteria andWxSexIsNotNull() {
            addCriterion("wx_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWxSexEqualTo(String value) {
            addCriterion("wx_sex =", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotEqualTo(String value) {
            addCriterion("wx_sex <>", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexGreaterThan(String value) {
            addCriterion("wx_sex >", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexGreaterThanOrEqualTo(String value) {
            addCriterion("wx_sex >=", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexLessThan(String value) {
            addCriterion("wx_sex <", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexLessThanOrEqualTo(String value) {
            addCriterion("wx_sex <=", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexLike(String value) {
            addCriterion("wx_sex like", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotLike(String value) {
            addCriterion("wx_sex not like", value, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexIn(List<String> values) {
            addCriterion("wx_sex in", values, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotIn(List<String> values) {
            addCriterion("wx_sex not in", values, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexBetween(String value1, String value2) {
            addCriterion("wx_sex between", value1, value2, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxSexNotBetween(String value1, String value2) {
            addCriterion("wx_sex not between", value1, value2, "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxCountryIsNull() {
            addCriterion("wx_country is null");
            return (Criteria) this;
        }

        public Criteria andWxCountryIsNotNull() {
            addCriterion("wx_country is not null");
            return (Criteria) this;
        }

        public Criteria andWxCountryEqualTo(String value) {
            addCriterion("wx_country =", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotEqualTo(String value) {
            addCriterion("wx_country <>", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThan(String value) {
            addCriterion("wx_country >", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryGreaterThanOrEqualTo(String value) {
            addCriterion("wx_country >=", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThan(String value) {
            addCriterion("wx_country <", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLessThanOrEqualTo(String value) {
            addCriterion("wx_country <=", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryLike(String value) {
            addCriterion("wx_country like", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotLike(String value) {
            addCriterion("wx_country not like", value, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryIn(List<String> values) {
            addCriterion("wx_country in", values, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotIn(List<String> values) {
            addCriterion("wx_country not in", values, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryBetween(String value1, String value2) {
            addCriterion("wx_country between", value1, value2, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxCountryNotBetween(String value1, String value2) {
            addCriterion("wx_country not between", value1, value2, "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIsNull() {
            addCriterion("wx_province is null");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIsNotNull() {
            addCriterion("wx_province is not null");
            return (Criteria) this;
        }

        public Criteria andWxProvinceEqualTo(String value) {
            addCriterion("wx_province =", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotEqualTo(String value) {
            addCriterion("wx_province <>", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThan(String value) {
            addCriterion("wx_province >", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("wx_province >=", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThan(String value) {
            addCriterion("wx_province <", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLessThanOrEqualTo(String value) {
            addCriterion("wx_province <=", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLike(String value) {
            addCriterion("wx_province like", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotLike(String value) {
            addCriterion("wx_province not like", value, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceIn(List<String> values) {
            addCriterion("wx_province in", values, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotIn(List<String> values) {
            addCriterion("wx_province not in", values, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceBetween(String value1, String value2) {
            addCriterion("wx_province between", value1, value2, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxProvinceNotBetween(String value1, String value2) {
            addCriterion("wx_province not between", value1, value2, "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxCityIsNull() {
            addCriterion("wx_city is null");
            return (Criteria) this;
        }

        public Criteria andWxCityIsNotNull() {
            addCriterion("wx_city is not null");
            return (Criteria) this;
        }

        public Criteria andWxCityEqualTo(String value) {
            addCriterion("wx_city =", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotEqualTo(String value) {
            addCriterion("wx_city <>", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThan(String value) {
            addCriterion("wx_city >", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityGreaterThanOrEqualTo(String value) {
            addCriterion("wx_city >=", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLessThan(String value) {
            addCriterion("wx_city <", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLessThanOrEqualTo(String value) {
            addCriterion("wx_city <=", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityLike(String value) {
            addCriterion("wx_city like", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotLike(String value) {
            addCriterion("wx_city not like", value, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityIn(List<String> values) {
            addCriterion("wx_city in", values, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotIn(List<String> values) {
            addCriterion("wx_city not in", values, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityBetween(String value1, String value2) {
            addCriterion("wx_city between", value1, value2, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxCityNotBetween(String value1, String value2) {
            addCriterion("wx_city not between", value1, value2, "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxDistrictIsNull() {
            addCriterion("wx_district is null");
            return (Criteria) this;
        }

        public Criteria andWxDistrictIsNotNull() {
            addCriterion("wx_district is not null");
            return (Criteria) this;
        }

        public Criteria andWxDistrictEqualTo(String value) {
            addCriterion("wx_district =", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictNotEqualTo(String value) {
            addCriterion("wx_district <>", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictGreaterThan(String value) {
            addCriterion("wx_district >", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("wx_district >=", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictLessThan(String value) {
            addCriterion("wx_district <", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictLessThanOrEqualTo(String value) {
            addCriterion("wx_district <=", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictLike(String value) {
            addCriterion("wx_district like", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictNotLike(String value) {
            addCriterion("wx_district not like", value, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictIn(List<String> values) {
            addCriterion("wx_district in", values, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictNotIn(List<String> values) {
            addCriterion("wx_district not in", values, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictBetween(String value1, String value2) {
            addCriterion("wx_district between", value1, value2, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxDistrictNotBetween(String value1, String value2) {
            addCriterion("wx_district not between", value1, value2, "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxAddressIsNull() {
            addCriterion("wx_address is null");
            return (Criteria) this;
        }

        public Criteria andWxAddressIsNotNull() {
            addCriterion("wx_address is not null");
            return (Criteria) this;
        }

        public Criteria andWxAddressEqualTo(String value) {
            addCriterion("wx_address =", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressNotEqualTo(String value) {
            addCriterion("wx_address <>", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressGreaterThan(String value) {
            addCriterion("wx_address >", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressGreaterThanOrEqualTo(String value) {
            addCriterion("wx_address >=", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressLessThan(String value) {
            addCriterion("wx_address <", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressLessThanOrEqualTo(String value) {
            addCriterion("wx_address <=", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressLike(String value) {
            addCriterion("wx_address like", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressNotLike(String value) {
            addCriterion("wx_address not like", value, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressIn(List<String> values) {
            addCriterion("wx_address in", values, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressNotIn(List<String> values) {
            addCriterion("wx_address not in", values, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressBetween(String value1, String value2) {
            addCriterion("wx_address between", value1, value2, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxAddressNotBetween(String value1, String value2) {
            addCriterion("wx_address not between", value1, value2, "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlIsNull() {
            addCriterion("wx_headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlIsNotNull() {
            addCriterion("wx_headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlEqualTo(String value) {
            addCriterion("wx_headimgurl =", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlNotEqualTo(String value) {
            addCriterion("wx_headimgurl <>", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlGreaterThan(String value) {
            addCriterion("wx_headimgurl >", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("wx_headimgurl >=", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlLessThan(String value) {
            addCriterion("wx_headimgurl <", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("wx_headimgurl <=", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlLike(String value) {
            addCriterion("wx_headimgurl like", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlNotLike(String value) {
            addCriterion("wx_headimgurl not like", value, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlIn(List<String> values) {
            addCriterion("wx_headimgurl in", values, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlNotIn(List<String> values) {
            addCriterion("wx_headimgurl not in", values, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlBetween(String value1, String value2) {
            addCriterion("wx_headimgurl between", value1, value2, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("wx_headimgurl not between", value1, value2, "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxSceneIsNull() {
            addCriterion("wx_scene is null");
            return (Criteria) this;
        }

        public Criteria andWxSceneIsNotNull() {
            addCriterion("wx_scene is not null");
            return (Criteria) this;
        }

        public Criteria andWxSceneEqualTo(String value) {
            addCriterion("wx_scene =", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneNotEqualTo(String value) {
            addCriterion("wx_scene <>", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneGreaterThan(String value) {
            addCriterion("wx_scene >", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneGreaterThanOrEqualTo(String value) {
            addCriterion("wx_scene >=", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneLessThan(String value) {
            addCriterion("wx_scene <", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneLessThanOrEqualTo(String value) {
            addCriterion("wx_scene <=", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneLike(String value) {
            addCriterion("wx_scene like", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneNotLike(String value) {
            addCriterion("wx_scene not like", value, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneIn(List<String> values) {
            addCriterion("wx_scene in", values, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneNotIn(List<String> values) {
            addCriterion("wx_scene not in", values, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneBetween(String value1, String value2) {
            addCriterion("wx_scene between", value1, value2, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSceneNotBetween(String value1, String value2) {
            addCriterion("wx_scene not between", value1, value2, "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxScoreIsNull() {
            addCriterion("wx_score is null");
            return (Criteria) this;
        }

        public Criteria andWxScoreIsNotNull() {
            addCriterion("wx_score is not null");
            return (Criteria) this;
        }

        public Criteria andWxScoreEqualTo(Integer value) {
            addCriterion("wx_score =", value, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreNotEqualTo(Integer value) {
            addCriterion("wx_score <>", value, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreGreaterThan(Integer value) {
            addCriterion("wx_score >", value, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("wx_score >=", value, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreLessThan(Integer value) {
            addCriterion("wx_score <", value, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreLessThanOrEqualTo(Integer value) {
            addCriterion("wx_score <=", value, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreIn(List<Integer> values) {
            addCriterion("wx_score in", values, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreNotIn(List<Integer> values) {
            addCriterion("wx_score not in", values, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreBetween(Integer value1, Integer value2) {
            addCriterion("wx_score between", value1, value2, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("wx_score not between", value1, value2, "wxScore");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeIsNull() {
            addCriterion("wx_subscribe is null");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeIsNotNull() {
            addCriterion("wx_subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeEqualTo(String value) {
            addCriterion("wx_subscribe =", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeNotEqualTo(String value) {
            addCriterion("wx_subscribe <>", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeGreaterThan(String value) {
            addCriterion("wx_subscribe >", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_subscribe >=", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeLessThan(String value) {
            addCriterion("wx_subscribe <", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeLessThanOrEqualTo(String value) {
            addCriterion("wx_subscribe <=", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeLike(String value) {
            addCriterion("wx_subscribe like", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeNotLike(String value) {
            addCriterion("wx_subscribe not like", value, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeIn(List<String> values) {
            addCriterion("wx_subscribe in", values, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeNotIn(List<String> values) {
            addCriterion("wx_subscribe not in", values, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeBetween(String value1, String value2) {
            addCriterion("wx_subscribe between", value1, value2, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeNotBetween(String value1, String value2) {
            addCriterion("wx_subscribe not between", value1, value2, "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxTagidIsNull() {
            addCriterion("wx_tagid is null");
            return (Criteria) this;
        }

        public Criteria andWxTagidIsNotNull() {
            addCriterion("wx_tagid is not null");
            return (Criteria) this;
        }

        public Criteria andWxTagidEqualTo(String value) {
            addCriterion("wx_tagid =", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidNotEqualTo(String value) {
            addCriterion("wx_tagid <>", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidGreaterThan(String value) {
            addCriterion("wx_tagid >", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidGreaterThanOrEqualTo(String value) {
            addCriterion("wx_tagid >=", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidLessThan(String value) {
            addCriterion("wx_tagid <", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidLessThanOrEqualTo(String value) {
            addCriterion("wx_tagid <=", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidLike(String value) {
            addCriterion("wx_tagid like", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidNotLike(String value) {
            addCriterion("wx_tagid not like", value, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidIn(List<String> values) {
            addCriterion("wx_tagid in", values, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidNotIn(List<String> values) {
            addCriterion("wx_tagid not in", values, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidBetween(String value1, String value2) {
            addCriterion("wx_tagid between", value1, value2, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxTagidNotBetween(String value1, String value2) {
            addCriterion("wx_tagid not between", value1, value2, "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeIsNull() {
            addCriterion("wx_create_time is null");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeIsNotNull() {
            addCriterion("wx_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeEqualTo(String value) {
            addCriterion("wx_create_time =", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeNotEqualTo(String value) {
            addCriterion("wx_create_time <>", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeGreaterThan(String value) {
            addCriterion("wx_create_time >", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_create_time >=", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeLessThan(String value) {
            addCriterion("wx_create_time <", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("wx_create_time <=", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeLike(String value) {
            addCriterion("wx_create_time like", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeNotLike(String value) {
            addCriterion("wx_create_time not like", value, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeIn(List<String> values) {
            addCriterion("wx_create_time in", values, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeNotIn(List<String> values) {
            addCriterion("wx_create_time not in", values, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeBetween(String value1, String value2) {
            addCriterion("wx_create_time between", value1, value2, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeNotBetween(String value1, String value2) {
            addCriterion("wx_create_time not between", value1, value2, "wxCreateTime");
            return (Criteria) this;
        }

        public Criteria andMwOpenidLikeInsensitive(String value) {
            addCriterion("upper(mw_openid) like", value.toUpperCase(), "mwOpenid");
            return (Criteria) this;
        }

        public Criteria andMwNicknameLikeInsensitive(String value) {
            addCriterion("upper(mw_nickname) like", value.toUpperCase(), "mwNickname");
            return (Criteria) this;
        }

        public Criteria andWxRemarkLikeInsensitive(String value) {
            addCriterion("upper(wx_remark) like", value.toUpperCase(), "wxRemark");
            return (Criteria) this;
        }

        public Criteria andWxSexLikeInsensitive(String value) {
            addCriterion("upper(wx_sex) like", value.toUpperCase(), "wxSex");
            return (Criteria) this;
        }

        public Criteria andWxCountryLikeInsensitive(String value) {
            addCriterion("upper(wx_country) like", value.toUpperCase(), "wxCountry");
            return (Criteria) this;
        }

        public Criteria andWxProvinceLikeInsensitive(String value) {
            addCriterion("upper(wx_province) like", value.toUpperCase(), "wxProvince");
            return (Criteria) this;
        }

        public Criteria andWxCityLikeInsensitive(String value) {
            addCriterion("upper(wx_city) like", value.toUpperCase(), "wxCity");
            return (Criteria) this;
        }

        public Criteria andWxDistrictLikeInsensitive(String value) {
            addCriterion("upper(wx_district) like", value.toUpperCase(), "wxDistrict");
            return (Criteria) this;
        }

        public Criteria andWxAddressLikeInsensitive(String value) {
            addCriterion("upper(wx_address) like", value.toUpperCase(), "wxAddress");
            return (Criteria) this;
        }

        public Criteria andWxHeadimgurlLikeInsensitive(String value) {
            addCriterion("upper(wx_headimgurl) like", value.toUpperCase(), "wxHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andWxSceneLikeInsensitive(String value) {
            addCriterion("upper(wx_scene) like", value.toUpperCase(), "wxScene");
            return (Criteria) this;
        }

        public Criteria andWxSubscribeLikeInsensitive(String value) {
            addCriterion("upper(wx_subscribe) like", value.toUpperCase(), "wxSubscribe");
            return (Criteria) this;
        }

        public Criteria andWxTagidLikeInsensitive(String value) {
            addCriterion("upper(wx_tagid) like", value.toUpperCase(), "wxTagid");
            return (Criteria) this;
        }

        public Criteria andWxCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(wx_create_time) like", value.toUpperCase(), "wxCreateTime");
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