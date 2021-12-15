package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class CaozauoLog implements Serializable {
    private Integer id;

    private String title;

    private String flag;

    private String type;

    private String status;

    private Date createTime;

    private String shebeiId;

    private Date startTime;

    private Date endTime;

    private Integer userId;

    private String userName;

    private Integer bumenId;

    private String bumenName;

    private String remark;

    private String results;

    private static final long serialVersionUID = 1L;

    public CaozauoLog(Integer id, String title, String flag, String type, String status, Date createTime, String shebeiId, Date startTime, Date endTime, Integer userId, String userName, Integer bumenId, String bumenName, String remark, String results) {
        this.id = id;
        this.title = title;
        this.flag = flag;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.shebeiId = shebeiId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userId = userId;
        this.userName = userName;
        this.bumenId = bumenId;
        this.bumenName = bumenName;
        this.remark = remark;
        this.results = results;
    }

    public CaozauoLog() {
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

    public String getShebeiId() {
        return shebeiId;
    }

    public void setShebeiId(String shebeiId) {
        this.shebeiId = shebeiId == null ? null : shebeiId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public String getBumenName() {
        return bumenName;
    }

    public void setBumenName(String bumenName) {
        this.bumenName = bumenName == null ? null : bumenName.trim();
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
        CaozauoLog other = (CaozauoLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getShebeiId() == null ? other.getShebeiId() == null : this.getShebeiId().equals(other.getShebeiId()))
                && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
                && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getBumenId() == null ? other.getBumenId() == null : this.getBumenId().equals(other.getBumenId()))
                && (this.getBumenName() == null ? other.getBumenName() == null : this.getBumenName().equals(other.getBumenName()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getResults() == null ? other.getResults() == null : this.getResults().equals(other.getResults()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getShebeiId() == null) ? 0 : getShebeiId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getBumenId() == null) ? 0 : getBumenId().hashCode());
        result = prime * result + ((getBumenName() == null) ? 0 : getBumenName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getResults() == null) ? 0 : getResults().hashCode());
        return result;
    }
}