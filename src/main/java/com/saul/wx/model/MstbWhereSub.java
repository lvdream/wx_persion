package com.saul.wx.model;

import java.io.Serializable;

public class MstbWhereSub implements Serializable {
    private Integer mwsId;

    private Integer mwmId;

    private Integer mwId;

    private String mwsItemName;

    private String mwsRemark;

    private String mwsAddress;

    private String mwsImgaes;

    private String mwsCreateTime;

    private String mwsUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getMwsId() {
        return mwsId;
    }

    public void setMwsId(Integer mwsId) {
        this.mwsId = mwsId;
    }

    public Integer getMwmId() {
        return mwmId;
    }

    public void setMwmId(Integer mwmId) {
        this.mwmId = mwmId;
    }

    public Integer getMwId() {
        return mwId;
    }

    public void setMwId(Integer mwId) {
        this.mwId = mwId;
    }

    public String getMwsItemName() {
        return mwsItemName;
    }

    public void setMwsItemName(String mwsItemName) {
        this.mwsItemName = mwsItemName == null ? null : mwsItemName.trim();
    }

    public String getMwsRemark() {
        return mwsRemark;
    }

    public void setMwsRemark(String mwsRemark) {
        this.mwsRemark = mwsRemark == null ? null : mwsRemark.trim();
    }

    public String getMwsAddress() {
        return mwsAddress;
    }

    public void setMwsAddress(String mwsAddress) {
        this.mwsAddress = mwsAddress == null ? null : mwsAddress.trim();
    }

    public String getMwsImgaes() {
        return mwsImgaes;
    }

    public void setMwsImgaes(String mwsImgaes) {
        this.mwsImgaes = mwsImgaes == null ? null : mwsImgaes.trim();
    }

    public String getMwsCreateTime() {
        return mwsCreateTime;
    }

    public void setMwsCreateTime(String mwsCreateTime) {
        this.mwsCreateTime = mwsCreateTime == null ? null : mwsCreateTime.trim();
    }

    public String getMwsUpdateTime() {
        return mwsUpdateTime;
    }

    public void setMwsUpdateTime(String mwsUpdateTime) {
        this.mwsUpdateTime = mwsUpdateTime == null ? null : mwsUpdateTime.trim();
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
        MstbWhereSub other = (MstbWhereSub) that;
        return (this.getMwsId() == null ? other.getMwsId() == null : this.getMwsId().equals(other.getMwsId()))
            && (this.getMwmId() == null ? other.getMwmId() == null : this.getMwmId().equals(other.getMwmId()))
            && (this.getMwId() == null ? other.getMwId() == null : this.getMwId().equals(other.getMwId()))
            && (this.getMwsItemName() == null ? other.getMwsItemName() == null : this.getMwsItemName().equals(other.getMwsItemName()))
            && (this.getMwsRemark() == null ? other.getMwsRemark() == null : this.getMwsRemark().equals(other.getMwsRemark()))
            && (this.getMwsAddress() == null ? other.getMwsAddress() == null : this.getMwsAddress().equals(other.getMwsAddress()))
            && (this.getMwsImgaes() == null ? other.getMwsImgaes() == null : this.getMwsImgaes().equals(other.getMwsImgaes()))
            && (this.getMwsCreateTime() == null ? other.getMwsCreateTime() == null : this.getMwsCreateTime().equals(other.getMwsCreateTime()))
            && (this.getMwsUpdateTime() == null ? other.getMwsUpdateTime() == null : this.getMwsUpdateTime().equals(other.getMwsUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMwsId() == null) ? 0 : getMwsId().hashCode());
        result = prime * result + ((getMwmId() == null) ? 0 : getMwmId().hashCode());
        result = prime * result + ((getMwId() == null) ? 0 : getMwId().hashCode());
        result = prime * result + ((getMwsItemName() == null) ? 0 : getMwsItemName().hashCode());
        result = prime * result + ((getMwsRemark() == null) ? 0 : getMwsRemark().hashCode());
        result = prime * result + ((getMwsAddress() == null) ? 0 : getMwsAddress().hashCode());
        result = prime * result + ((getMwsImgaes() == null) ? 0 : getMwsImgaes().hashCode());
        result = prime * result + ((getMwsCreateTime() == null) ? 0 : getMwsCreateTime().hashCode());
        result = prime * result + ((getMwsUpdateTime() == null) ? 0 : getMwsUpdateTime().hashCode());
        return result;
    }
}