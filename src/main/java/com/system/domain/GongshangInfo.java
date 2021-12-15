package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class GongshangInfo  extends PubOut implements Serializable {
    private Integer id;

    private Integer userId;

    private String userName;

    private Integer shiguTypeId;

    private String shiguType;

    private Integer serialNumber;

    private String remark;

    private String details;

    private Integer canjiLevelId;

    private String canjiLevel;

    private String flag;

    private String type;

    private String status;

    private Date createTime;

    private Date stateTime;

    private static final long serialVersionUID = 1L;

    public GongshangInfo(Integer id, Integer userId, String userName, Integer shiguTypeId, String shiguType, Integer serialNumber, String remark, String details, Integer canjiLevelId, String canjiLevel, String flag, String type, String status, Date createTime, Date stateTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.shiguTypeId = shiguTypeId;
        this.shiguType = shiguType;
        this.serialNumber = serialNumber;
        this.remark = remark;
        this.details = details;
        this.canjiLevelId = canjiLevelId;
        this.canjiLevel = canjiLevel;
        this.flag = flag;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.stateTime = stateTime;
    }

    public GongshangInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getShiguTypeId() {
        return shiguTypeId;
    }

    public void setShiguTypeId(Integer shiguTypeId) {
        this.shiguTypeId = shiguTypeId;
    }

    public String getShiguType() {
        return shiguType;
    }

    public void setShiguType(String shiguType) {
        this.shiguType = shiguType == null ? null : shiguType.trim();
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Integer getCanjiLevelId() {
        return canjiLevelId;
    }

    public void setCanjiLevelId(Integer canjiLevelId) {
        this.canjiLevelId = canjiLevelId;
    }

    public String getCanjiLevel() {
        return canjiLevel;
    }

    public void setCanjiLevel(String canjiLevel) {
        this.canjiLevel = canjiLevel == null ? null : canjiLevel.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStateTime() {
        return stateTime;
    }

    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
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
        GongshangInfo other = (GongshangInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getShiguTypeId() == null ? other.getShiguTypeId() == null : this.getShiguTypeId().equals(other.getShiguTypeId()))
                && (this.getShiguType() == null ? other.getShiguType() == null : this.getShiguType().equals(other.getShiguType()))
                && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
                && (this.getCanjiLevelId() == null ? other.getCanjiLevelId() == null : this.getCanjiLevelId().equals(other.getCanjiLevelId()))
                && (this.getCanjiLevel() == null ? other.getCanjiLevel() == null : this.getCanjiLevel().equals(other.getCanjiLevel()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getStateTime() == null ? other.getStateTime() == null : this.getStateTime().equals(other.getStateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getShiguTypeId() == null) ? 0 : getShiguTypeId().hashCode());
        result = prime * result + ((getShiguType() == null) ? 0 : getShiguType().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getCanjiLevelId() == null) ? 0 : getCanjiLevelId().hashCode());
        result = prime * result + ((getCanjiLevel() == null) ? 0 : getCanjiLevel().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStateTime() == null) ? 0 : getStateTime().hashCode());
        return result;
    }
}