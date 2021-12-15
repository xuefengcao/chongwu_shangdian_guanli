package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class ShiguLog implements Serializable {
    private Integer id;

    private String title;

    private Integer serialNumber;

    private Date startTime;

    private String addr;

    private Integer zhuchiUserId;

    private String zhuchiUserName;

    private Integer jiluUserId;

    private String jiluUserName;

    private String remark;

    private String flag;

    private Date createTime;

    private String type;

    private String status;

    private static final long serialVersionUID = 1L;

    public ShiguLog(Integer id, String title, Integer serialNumber, Date startTime, String addr, Integer zhuchiUserId, String zhuchiUserName, Integer jiluUserId, String jiluUserName, String remark, String flag, Date createTime, String type, String status) {
        this.id = id;
        this.title = title;
        this.serialNumber = serialNumber;
        this.startTime = startTime;
        this.addr = addr;
        this.zhuchiUserId = zhuchiUserId;
        this.zhuchiUserName = zhuchiUserName;
        this.jiluUserId = jiluUserId;
        this.jiluUserName = jiluUserName;
        this.remark = remark;
        this.flag = flag;
        this.createTime = createTime;
        this.type = type;
        this.status = status;
    }

    public ShiguLog() {
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getZhuchiUserId() {
        return zhuchiUserId;
    }

    public void setZhuchiUserId(Integer zhuchiUserId) {
        this.zhuchiUserId = zhuchiUserId;
    }

    public String getZhuchiUserName() {
        return zhuchiUserName;
    }

    public void setZhuchiUserName(String zhuchiUserName) {
        this.zhuchiUserName = zhuchiUserName == null ? null : zhuchiUserName.trim();
    }

    public Integer getJiluUserId() {
        return jiluUserId;
    }

    public void setJiluUserId(Integer jiluUserId) {
        this.jiluUserId = jiluUserId;
    }

    public String getJiluUserName() {
        return jiluUserName;
    }

    public void setJiluUserName(String jiluUserName) {
        this.jiluUserName = jiluUserName == null ? null : jiluUserName.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        ShiguLog other = (ShiguLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
            && (this.getZhuchiUserId() == null ? other.getZhuchiUserId() == null : this.getZhuchiUserId().equals(other.getZhuchiUserId()))
            && (this.getZhuchiUserName() == null ? other.getZhuchiUserName() == null : this.getZhuchiUserName().equals(other.getZhuchiUserName()))
            && (this.getJiluUserId() == null ? other.getJiluUserId() == null : this.getJiluUserId().equals(other.getJiluUserId()))
            && (this.getJiluUserName() == null ? other.getJiluUserName() == null : this.getJiluUserName().equals(other.getJiluUserName()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getZhuchiUserId() == null) ? 0 : getZhuchiUserId().hashCode());
        result = prime * result + ((getZhuchiUserName() == null) ? 0 : getZhuchiUserName().hashCode());
        result = prime * result + ((getJiluUserId() == null) ? 0 : getJiluUserId().hashCode());
        result = prime * result + ((getJiluUserName() == null) ? 0 : getJiluUserName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}