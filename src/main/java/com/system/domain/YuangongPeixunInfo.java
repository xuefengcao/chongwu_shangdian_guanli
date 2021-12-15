package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class YuangongPeixunInfo  extends PubOut implements Serializable {
    private Integer id;

    private String title;

    private Integer peixunTypeId;

    private String peixunType;

    private Date peixunTime;

    private Integer userId;

    private String userName;

    private Integer bumenId;

    private String bumen;

    private String flag;

    private String status;

    private String type;

    private String chengji;

    private String remark;

    private Integer peixunNum;

    private String details;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public YuangongPeixunInfo(Integer id, String title, Integer peixunTypeId, String peixunType, Date peixunTime, Integer userId, String userName, Integer bumenId, String bumen, String flag, String status, String type, String chengji, String remark, Integer peixunNum, String details, Date createTime) {
        this.id = id;
        this.title = title;
        this.peixunTypeId = peixunTypeId;
        this.peixunType = peixunType;
        this.peixunTime = peixunTime;
        this.userId = userId;
        this.userName = userName;
        this.bumenId = bumenId;
        this.bumen = bumen;
        this.flag = flag;
        this.status = status;
        this.type = type;
        this.chengji = chengji;
        this.remark = remark;
        this.peixunNum = peixunNum;
        this.details = details;
        this.createTime = createTime;
    }

    public YuangongPeixunInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPeixunTypeId() {
        return peixunTypeId;
    }

    public void setPeixunTypeId(Integer peixunTypeId) {
        this.peixunTypeId = peixunTypeId;
    }

    public String getPeixunType() {
        return peixunType;
    }

    public void setPeixunType(String peixunType) {
        this.peixunType = peixunType == null ? null : peixunType.trim();
    }

    public Date getPeixunTime() {
        return peixunTime;
    }

    public void setPeixunTime(Date peixunTime) {
        this.peixunTime = peixunTime;
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

    public Integer getBumenId() {
        return bumenId;
    }

    public void setBumenId(Integer bumenId) {
        this.bumenId = bumenId;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen == null ? null : bumen.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getChengji() {
        return chengji;
    }

    public void setChengji(String chengji) {
        this.chengji = chengji == null ? null : chengji.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getPeixunNum() {
        return peixunNum;
    }

    public void setPeixunNum(Integer peixunNum) {
        this.peixunNum = peixunNum;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        YuangongPeixunInfo other = (YuangongPeixunInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getPeixunTypeId() == null ? other.getPeixunTypeId() == null : this.getPeixunTypeId().equals(other.getPeixunTypeId()))
            && (this.getPeixunType() == null ? other.getPeixunType() == null : this.getPeixunType().equals(other.getPeixunType()))
            && (this.getPeixunTime() == null ? other.getPeixunTime() == null : this.getPeixunTime().equals(other.getPeixunTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getBumenId() == null ? other.getBumenId() == null : this.getBumenId().equals(other.getBumenId()))
            && (this.getBumen() == null ? other.getBumen() == null : this.getBumen().equals(other.getBumen()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getChengji() == null ? other.getChengji() == null : this.getChengji().equals(other.getChengji()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPeixunNum() == null ? other.getPeixunNum() == null : this.getPeixunNum().equals(other.getPeixunNum()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getPeixunTypeId() == null) ? 0 : getPeixunTypeId().hashCode());
        result = prime * result + ((getPeixunType() == null) ? 0 : getPeixunType().hashCode());
        result = prime * result + ((getPeixunTime() == null) ? 0 : getPeixunTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getBumenId() == null) ? 0 : getBumenId().hashCode());
        result = prime * result + ((getBumen() == null) ? 0 : getBumen().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getChengji() == null) ? 0 : getChengji().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPeixunNum() == null) ? 0 : getPeixunNum().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}