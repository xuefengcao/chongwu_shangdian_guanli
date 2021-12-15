package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class JiaoyuInfo extends PubOut implements Serializable {
    private Integer id;

    private String jiaoyuType;

    private Integer jiaoyuTypeId;

    private String remark;

    private String bumen;

    private Integer bumenId;

    private Integer userId;

    private String userName;

    private String flag;

    private String type;

    private String status;

    private Date createTime;

    private Date jaoyuTime;

    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private static final long serialVersionUID = 1L;

    public JiaoyuInfo(Integer id, String jiaoyuType, Integer jiaoyuTypeId, String remark, String bumen, Integer bumenId, Integer userId, String userName, String flag, String type, String status, Date createTime, Date jaoyuTime) {
        this.id = id;
        this.jiaoyuType = jiaoyuType;
        this.jiaoyuTypeId = jiaoyuTypeId;
        this.remark = remark;
        this.bumen = bumen;
        this.bumenId = bumenId;
        this.userId = userId;
        this.userName = userName;
        this.flag = flag;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.jaoyuTime = jaoyuTime;
    }

    public JiaoyuInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJiaoyuType() {
        return jiaoyuType;
    }

    public void setJiaoyuType(String jiaoyuType) {
        this.jiaoyuType = jiaoyuType == null ? null : jiaoyuType.trim();
    }

    public Integer getJiaoyuTypeId() {
        return jiaoyuTypeId;
    }

    public void setJiaoyuTypeId(Integer jiaoyuTypeId) {
        this.jiaoyuTypeId = jiaoyuTypeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen == null ? null : bumen.trim();
    }

    public Integer getBumenId() {
        return bumenId;
    }

    public void setBumenId(Integer bumenId) {
        this.bumenId = bumenId;
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

    public Date getJaoyuTime() {
        return jaoyuTime;
    }

    public void setJaoyuTime(Date jaoyuTime) {
        this.jaoyuTime = jaoyuTime;
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
        JiaoyuInfo other = (JiaoyuInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJiaoyuType() == null ? other.getJiaoyuType() == null : this.getJiaoyuType().equals(other.getJiaoyuType()))
            && (this.getJiaoyuTypeId() == null ? other.getJiaoyuTypeId() == null : this.getJiaoyuTypeId().equals(other.getJiaoyuTypeId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBumen() == null ? other.getBumen() == null : this.getBumen().equals(other.getBumen()))
            && (this.getBumenId() == null ? other.getBumenId() == null : this.getBumenId().equals(other.getBumenId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getJaoyuTime() == null ? other.getJaoyuTime() == null : this.getJaoyuTime().equals(other.getJaoyuTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJiaoyuType() == null) ? 0 : getJiaoyuType().hashCode());
        result = prime * result + ((getJiaoyuTypeId() == null) ? 0 : getJiaoyuTypeId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBumen() == null) ? 0 : getBumen().hashCode());
        result = prime * result + ((getBumenId() == null) ? 0 : getBumenId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getJaoyuTime() == null) ? 0 : getJaoyuTime().hashCode());
        return result;
    }
}