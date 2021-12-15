package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class ShiguInfo extends PubOut implements Serializable {
    private Integer id;

    private String title;

    private Date createTime;

    private Date startTime;

    private String addr;

    private Integer userId;

    private String userName;

    private String shiguType;

    private Integer shiguTypeId;

    private String remark;

    private String results;

    private String status;

    private String flag;

    private String type;



    private static final long serialVersionUID = 1L;

    public ShiguInfo(Integer id, String title, Date createTime, Date startTime, String addr, Integer userId, String userName, String shiguType, Integer shiguTypeId, String remark, String results, String status, String flag, String type) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.startTime = startTime;
        this.addr = addr;
        this.userId = userId;
        this.userName = userName;
        this.shiguType = shiguType;
        this.shiguTypeId = shiguTypeId;
        this.remark = remark;
        this.results = results;
        this.status = status;
        this.flag = flag;
        this.type = type;
    }

    public ShiguInfo() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getShiguType() {
        return shiguType;
    }

    public void setShiguType(String shiguType) {
        this.shiguType = shiguType == null ? null : shiguType.trim();
    }

    public Integer getShiguTypeId() {
        return shiguTypeId;
    }

    public void setShiguTypeId(Integer shiguTypeId) {
        this.shiguTypeId = shiguTypeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results == null ? null : results.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        ShiguInfo other = (ShiguInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
                && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getShiguType() == null ? other.getShiguType() == null : this.getShiguType().equals(other.getShiguType()))
                && (this.getShiguTypeId() == null ? other.getShiguTypeId() == null : this.getShiguTypeId().equals(other.getShiguTypeId()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getResults() == null ? other.getResults() == null : this.getResults().equals(other.getResults()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getShiguType() == null) ? 0 : getShiguType().hashCode());
        result = prime * result + ((getShiguTypeId() == null) ? 0 : getShiguTypeId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getResults() == null) ? 0 : getResults().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}