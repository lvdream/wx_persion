package com.saul.wx.model;

import java.io.Serializable;

public class MstbWhereMain implements Serializable {
    private Integer mwmId;

    private Integer mwId;

    private String mwmBoxName;

    private String mwmRemark;

    private String mwmAddress;

    private String mwmImgaes;

    private String mwmCreateTime;

    private String mwmUpdateTime;

    private static final long serialVersionUID = 1L;

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

    public String getMwmBoxName() {
        return mwmBoxName;
    }

    public void setMwmBoxName(String mwmBoxName) {
        this.mwmBoxName = mwmBoxName == null ? null : mwmBoxName.trim();
    }

    public String getMwmRemark() {
        return mwmRemark;
    }

    public void setMwmRemark(String mwmRemark) {
        this.mwmRemark = mwmRemark == null ? null : mwmRemark.trim();
    }

    public String getMwmAddress() {
        return mwmAddress;
    }

    public void setMwmAddress(String mwmAddress) {
        this.mwmAddress = mwmAddress == null ? null : mwmAddress.trim();
    }

    public String getMwmImgaes() {
        return mwmImgaes;
    }

    public void setMwmImgaes(String mwmImgaes) {
        this.mwmImgaes = mwmImgaes == null ? null : mwmImgaes.trim();
    }

    public String getMwmCreateTime() {
        return mwmCreateTime;
    }

    public void setMwmCreateTime(String mwmCreateTime) {
        this.mwmCreateTime = mwmCreateTime == null ? null : mwmCreateTime.trim();
    }

    public String getMwmUpdateTime() {
        return mwmUpdateTime;
    }

    public void setMwmUpdateTime(String mwmUpdateTime) {
        this.mwmUpdateTime = mwmUpdateTime == null ? null : mwmUpdateTime.trim();
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
        MstbWhereMain other = (MstbWhereMain) that;
        return (this.getMwmId() == null ? other.getMwmId() == null : this.getMwmId().equals(other.getMwmId()))
            && (this.getMwId() == null ? other.getMwId() == null : this.getMwId().equals(other.getMwId()))
            && (this.getMwmBoxName() == null ? other.getMwmBoxName() == null : this.getMwmBoxName().equals(other.getMwmBoxName()))
            && (this.getMwmRemark() == null ? other.getMwmRemark() == null : this.getMwmRemark().equals(other.getMwmRemark()))
            && (this.getMwmAddress() == null ? other.getMwmAddress() == null : this.getMwmAddress().equals(other.getMwmAddress()))
            && (this.getMwmImgaes() == null ? other.getMwmImgaes() == null : this.getMwmImgaes().equals(other.getMwmImgaes()))
            && (this.getMwmCreateTime() == null ? other.getMwmCreateTime() == null : this.getMwmCreateTime().equals(other.getMwmCreateTime()))
            && (this.getMwmUpdateTime() == null ? other.getMwmUpdateTime() == null : this.getMwmUpdateTime().equals(other.getMwmUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMwmId() == null) ? 0 : getMwmId().hashCode());
        result = prime * result + ((getMwId() == null) ? 0 : getMwId().hashCode());
        result = prime * result + ((getMwmBoxName() == null) ? 0 : getMwmBoxName().hashCode());
        result = prime * result + ((getMwmRemark() == null) ? 0 : getMwmRemark().hashCode());
        result = prime * result + ((getMwmAddress() == null) ? 0 : getMwmAddress().hashCode());
        result = prime * result + ((getMwmImgaes() == null) ? 0 : getMwmImgaes().hashCode());
        result = prime * result + ((getMwmCreateTime() == null) ? 0 : getMwmCreateTime().hashCode());
        result = prime * result + ((getMwmUpdateTime() == null) ? 0 : getMwmUpdateTime().hashCode());
        return result;
    }
}