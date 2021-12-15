package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class AnquanyinhuanInfo  extends PubOut  implements Serializable {
    private Integer id;

    private Integer userId;

    private String userName;

    private Date jianchaStartTime;

    private Date jianchaEndTime;

    private String ifYinhuan;

    private Integer yinhuanTypeId;

    private String yinhuanType;

    private String yinhuanRemark;

    private String yinhuanYanzhong;

    private Integer yinhuanYanzhongId;

    private Date createTime;

    private String flag;

    private String type;

    private String remark;

    private String status;

    private static final long serialVersionUID = 1L;

    public AnquanyinhuanInfo(Integer id, Integer userId, String userName, Date jianchaStartTime, Date jianchaEndTime, String ifYinhuan, Integer yinhuanTypeId, String yinhuanType, String yinhuanRemark, String yinhuanYanzhong, Integer yinhuanYanzhongId, Date createTime, String flag, String type, String remark, String status) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.jianchaStartTime = jianchaStartTime;
        this.jianchaEndTime = jianchaEndTime;
        this.ifYinhuan = ifYinhuan;
        this.yinhuanTypeId = yinhuanTypeId;
        this.yinhuanType = yinhuanType;
        this.yinhuanRemark = yinhuanRemark;
        this.yinhuanYanzhong = yinhuanYanzhong;
        this.yinhuanYanzhongId = yinhuanYanzhongId;
        this.createTime = createTime;
        this.flag = flag;
        this.type = type;
        this.remark = remark;
        this.status = status;
    }

    public AnquanyinhuanInfo() {
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

    public Date getJianchaStartTime() {
        return jianchaStartTime;
    }

    public void setJianchaStartTime(Date jianchaStartTime) {
        this.jianchaStartTime = jianchaStartTime;
    }

    public Date getJianchaEndTime() {
        return jianchaEndTime;
    }

    public void setJianchaEndTime(Date jianchaEndTime) {
        this.jianchaEndTime = jianchaEndTime;
    }

    public String getIfYinhuan() {
        return ifYinhuan;
    }

    public void setIfYinhuan(String ifYinhuan) {
        this.ifYinhuan = ifYinhuan == null ? null : ifYinhuan.trim();
    }

    public Integer getYinhuanTypeId() {
        return yinhuanTypeId;
    }

    public void setYinhuanTypeId(Integer yinhuanTypeId) {
        this.yinhuanTypeId = yinhuanTypeId;
    }

    public String getYinhuanType() {
        return yinhuanType;
    }

    public void setYinhuanType(String yinhuanType) {
        this.yinhuanType = yinhuanType == null ? null : yinhuanType.trim();
    }

    public String getYinhuanRemark() {
        return yinhuanRemark;
    }

    public void setYinhuanRemark(String yinhuanRemark) {
        this.yinhuanRemark = yinhuanRemark == null ? null : yinhuanRemark.trim();
    }

    public String getYinhuanYanzhong() {
        return yinhuanYanzhong;
    }

    public void setYinhuanYanzhong(String yinhuanYanzhong) {
        this.yinhuanYanzhong = yinhuanYanzhong == null ? null : yinhuanYanzhong.trim();
    }

    public Integer getYinhuanYanzhongId() {
        return yinhuanYanzhongId;
    }

    public void setYinhuanYanzhongId(Integer yinhuanYanzhongId) {
        this.yinhuanYanzhongId = yinhuanYanzhongId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        AnquanyinhuanInfo other = (AnquanyinhuanInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getJianchaStartTime() == null ? other.getJianchaStartTime() == null : this.getJianchaStartTime().equals(other.getJianchaStartTime()))
                && (this.getJianchaEndTime() == null ? other.getJianchaEndTime() == null : this.getJianchaEndTime().equals(other.getJianchaEndTime()))
                && (this.getIfYinhuan() == null ? other.getIfYinhuan() == null : this.getIfYinhuan().equals(other.getIfYinhuan()))
                && (this.getYinhuanTypeId() == null ? other.getYinhuanTypeId() == null : this.getYinhuanTypeId().equals(other.getYinhuanTypeId()))
                && (this.getYinhuanType() == null ? other.getYinhuanType() == null : this.getYinhuanType().equals(other.getYinhuanType()))
                && (this.getYinhuanRemark() == null ? other.getYinhuanRemark() == null : this.getYinhuanRemark().equals(other.getYinhuanRemark()))
                && (this.getYinhuanYanzhong() == null ? other.getYinhuanYanzhong() == null : this.getYinhuanYanzhong().equals(other.getYinhuanYanzhong()))
                && (this.getYinhuanYanzhongId() == null ? other.getYinhuanYanzhongId() == null : this.getYinhuanYanzhongId().equals(other.getYinhuanYanzhongId()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getJianchaStartTime() == null) ? 0 : getJianchaStartTime().hashCode());
        result = prime * result + ((getJianchaEndTime() == null) ? 0 : getJianchaEndTime().hashCode());
        result = prime * result + ((getIfYinhuan() == null) ? 0 : getIfYinhuan().hashCode());
        result = prime * result + ((getYinhuanTypeId() == null) ? 0 : getYinhuanTypeId().hashCode());
        result = prime * result + ((getYinhuanType() == null) ? 0 : getYinhuanType().hashCode());
        result = prime * result + ((getYinhuanRemark() == null) ? 0 : getYinhuanRemark().hashCode());
        result = prime * result + ((getYinhuanYanzhong() == null) ? 0 : getYinhuanYanzhong().hashCode());
        result = prime * result + ((getYinhuanYanzhongId() == null) ? 0 : getYinhuanYanzhongId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}