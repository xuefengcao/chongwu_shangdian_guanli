package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class JiaoyuPeixunInfo extends PubOut implements Serializable {
    private Integer id;

    private String title;

    private Integer serialNumber;

    private Integer peixunTypeId;

    private String peixunType;

    private Date peixunTime;

    private String remark;

    private String flag;

    private String type;

    private String status;

    private Date createTime;

    private String addr;

    private static final long serialVersionUID = 1L;

    public JiaoyuPeixunInfo(Integer id, String title, Integer serialNumber, Integer peixunTypeId, String peixunType, Date peixunTime, String remark, String flag, String type, String status, Date createTime, String addr) {
        this.id = id;
        this.title = title;
        this.serialNumber = serialNumber;
        this.peixunTypeId = peixunTypeId;
        this.peixunType = peixunType;
        this.peixunTime = peixunTime;
        this.remark = remark;
        this.flag = flag;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.addr = addr;
    }

    public JiaoyuPeixunInfo() {
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

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
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
        JiaoyuPeixunInfo other = (JiaoyuPeixunInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
                && (this.getPeixunTypeId() == null ? other.getPeixunTypeId() == null : this.getPeixunTypeId().equals(other.getPeixunTypeId()))
                && (this.getPeixunType() == null ? other.getPeixunType() == null : this.getPeixunType().equals(other.getPeixunType()))
                && (this.getPeixunTime() == null ? other.getPeixunTime() == null : this.getPeixunTime().equals(other.getPeixunTime()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getPeixunTypeId() == null) ? 0 : getPeixunTypeId().hashCode());
        result = prime * result + ((getPeixunType() == null) ? 0 : getPeixunType().hashCode());
        result = prime * result + ((getPeixunTime() == null) ? 0 : getPeixunTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        return result;
    }
}