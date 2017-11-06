package com.saul.wx.model;

import java.io.Serializable;

public class MstbWxUser implements Serializable {
    private Integer mwId;

    private String mwOpenid;

    private String mwNickname;

    private String wxRemark;

    private String wxSex;

    private String wxCountry;

    private String wxProvince;

    private String wxCity;

    private String wxDistrict;

    private String wxAddress;

    private String wxHeadimgurl;

    private String wxScene;

    private Integer wxScore;

    private String wxSubscribe;

    private String wxTagid;

    private String wxCreateTime;

    private static final long serialVersionUID = 1L;

    public Integer getMwId() {
        return mwId;
    }

    public void setMwId(Integer mwId) {
        this.mwId = mwId;
    }

    public String getMwOpenid() {
        return mwOpenid;
    }

    public void setMwOpenid(String mwOpenid) {
        this.mwOpenid = mwOpenid == null ? null : mwOpenid.trim();
    }

    public String getMwNickname() {
        return mwNickname;
    }

    public void setMwNickname(String mwNickname) {
        this.mwNickname = mwNickname == null ? null : mwNickname.trim();
    }

    public String getWxRemark() {
        return wxRemark;
    }

    public void setWxRemark(String wxRemark) {
        this.wxRemark = wxRemark == null ? null : wxRemark.trim();
    }

    public String getWxSex() {
        return wxSex;
    }

    public void setWxSex(String wxSex) {
        this.wxSex = wxSex == null ? null : wxSex.trim();
    }

    public String getWxCountry() {
        return wxCountry;
    }

    public void setWxCountry(String wxCountry) {
        this.wxCountry = wxCountry == null ? null : wxCountry.trim();
    }

    public String getWxProvince() {
        return wxProvince;
    }

    public void setWxProvince(String wxProvince) {
        this.wxProvince = wxProvince == null ? null : wxProvince.trim();
    }

    public String getWxCity() {
        return wxCity;
    }

    public void setWxCity(String wxCity) {
        this.wxCity = wxCity == null ? null : wxCity.trim();
    }

    public String getWxDistrict() {
        return wxDistrict;
    }

    public void setWxDistrict(String wxDistrict) {
        this.wxDistrict = wxDistrict == null ? null : wxDistrict.trim();
    }

    public String getWxAddress() {
        return wxAddress;
    }

    public void setWxAddress(String wxAddress) {
        this.wxAddress = wxAddress == null ? null : wxAddress.trim();
    }

    public String getWxHeadimgurl() {
        return wxHeadimgurl;
    }

    public void setWxHeadimgurl(String wxHeadimgurl) {
        this.wxHeadimgurl = wxHeadimgurl == null ? null : wxHeadimgurl.trim();
    }

    public String getWxScene() {
        return wxScene;
    }

    public void setWxScene(String wxScene) {
        this.wxScene = wxScene == null ? null : wxScene.trim();
    }

    public Integer getWxScore() {
        return wxScore;
    }

    public void setWxScore(Integer wxScore) {
        this.wxScore = wxScore;
    }

    public String getWxSubscribe() {
        return wxSubscribe;
    }

    public void setWxSubscribe(String wxSubscribe) {
        this.wxSubscribe = wxSubscribe == null ? null : wxSubscribe.trim();
    }

    public String getWxTagid() {
        return wxTagid;
    }

    public void setWxTagid(String wxTagid) {
        this.wxTagid = wxTagid == null ? null : wxTagid.trim();
    }

    public String getWxCreateTime() {
        return wxCreateTime;
    }

    public void setWxCreateTime(String wxCreateTime) {
        this.wxCreateTime = wxCreateTime == null ? null : wxCreateTime.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MstbWxUser other = (MstbWxUser) that;
        return (this.getMwId() == null ? other.getMwId() == null : this.getMwId().equals(other.getMwId()))
            && (this.getMwOpenid() == null ? other.getMwOpenid() == null : this.getMwOpenid().equals(other.getMwOpenid()))
            && (this.getMwNickname() == null ? other.getMwNickname() == null : this.getMwNickname().equals(other.getMwNickname()))
            && (this.getWxRemark() == null ? other.getWxRemark() == null : this.getWxRemark().equals(other.getWxRemark()))
            && (this.getWxSex() == null ? other.getWxSex() == null : this.getWxSex().equals(other.getWxSex()))
            && (this.getWxCountry() == null ? other.getWxCountry() == null : this.getWxCountry().equals(other.getWxCountry()))
            && (this.getWxProvince() == null ? other.getWxProvince() == null : this.getWxProvince().equals(other.getWxProvince()))
            && (this.getWxCity() == null ? other.getWxCity() == null : this.getWxCity().equals(other.getWxCity()))
            && (this.getWxDistrict() == null ? other.getWxDistrict() == null : this.getWxDistrict().equals(other.getWxDistrict()))
            && (this.getWxAddress() == null ? other.getWxAddress() == null : this.getWxAddress().equals(other.getWxAddress()))
            && (this.getWxHeadimgurl() == null ? other.getWxHeadimgurl() == null : this.getWxHeadimgurl().equals(other.getWxHeadimgurl()))
            && (this.getWxScene() == null ? other.getWxScene() == null : this.getWxScene().equals(other.getWxScene()))
            && (this.getWxScore() == null ? other.getWxScore() == null : this.getWxScore().equals(other.getWxScore()))
            && (this.getWxSubscribe() == null ? other.getWxSubscribe() == null : this.getWxSubscribe().equals(other.getWxSubscribe()))
            && (this.getWxTagid() == null ? other.getWxTagid() == null : this.getWxTagid().equals(other.getWxTagid()))
            && (this.getWxCreateTime() == null ? other.getWxCreateTime() == null : this.getWxCreateTime().equals(other.getWxCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMwId() == null) ? 0 : getMwId().hashCode());
        result = prime * result + ((getMwOpenid() == null) ? 0 : getMwOpenid().hashCode());
        result = prime * result + ((getMwNickname() == null) ? 0 : getMwNickname().hashCode());
        result = prime * result + ((getWxRemark() == null) ? 0 : getWxRemark().hashCode());
        result = prime * result + ((getWxSex() == null) ? 0 : getWxSex().hashCode());
        result = prime * result + ((getWxCountry() == null) ? 0 : getWxCountry().hashCode());
        result = prime * result + ((getWxProvince() == null) ? 0 : getWxProvince().hashCode());
        result = prime * result + ((getWxCity() == null) ? 0 : getWxCity().hashCode());
        result = prime * result + ((getWxDistrict() == null) ? 0 : getWxDistrict().hashCode());
        result = prime * result + ((getWxAddress() == null) ? 0 : getWxAddress().hashCode());
        result = prime * result + ((getWxHeadimgurl() == null) ? 0 : getWxHeadimgurl().hashCode());
        result = prime * result + ((getWxScene() == null) ? 0 : getWxScene().hashCode());
        result = prime * result + ((getWxScore() == null) ? 0 : getWxScore().hashCode());
        result = prime * result + ((getWxSubscribe() == null) ? 0 : getWxSubscribe().hashCode());
        result = prime * result + ((getWxTagid() == null) ? 0 : getWxTagid().hashCode());
        result = prime * result + ((getWxCreateTime() == null) ? 0 : getWxCreateTime().hashCode());
        return result;
    }
}