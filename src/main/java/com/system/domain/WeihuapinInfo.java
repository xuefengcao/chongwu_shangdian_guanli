package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class WeihuapinInfo  extends PubOut implements Serializable {
    private Integer id;

    private String name;

    private Integer num;

    private String danwei;

    private String saveMethod;

    private String saveSite;

    private Integer userId;

    private String userName;

    private Date createTime;

    private Date comInTime;

    private Date comOutTime;

    private String remark;

    private String type;

    private String flag;

    private String chuzhi;

    private String status;

    private Integer shiyongUserId;

    private String shiyongUserName;

    private static final long serialVersionUID = 1L;

    public WeihuapinInfo(Integer id, String name, Integer num, String danwei, String saveMethod, String saveSite, Integer userId, String userName, Date createTime, Date comInTime, Date comOutTime, String remark, String type, String flag, String chuzhi, String status, Integer shiyongUserId, String shiyongUserName) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.danwei = danwei;
        this.saveMethod = saveMethod;
        this.saveSite = saveSite;
        this.userId = userId;
        this.userName = userName;
        this.createTime = createTime;
        this.comInTime = comInTime;
        this.comOutTime = comOutTime;
        this.remark = remark;
        this.type = type;
        this.flag = flag;
        this.chuzhi = chuzhi;
        this.status = status;
        this.shiyongUserId = shiyongUserId;
        this.shiyongUserName = shiyongUserName;
    }

    public WeihuapinInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei == null ? null : danwei.trim();
    }

    public String getSaveMethod() {
        return saveMethod;
    }

    public void setSaveMethod(String saveMethod) {
        this.saveMethod = saveMethod == null ? null : saveMethod.trim();
    }

    public String getSaveSite() {
        return saveSite;
    }

    public void setSaveSite(String saveSite) {
        this.saveSite = saveSite == null ? null : saveSite.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getComInTime() {
        return comInTime;
    }

    public void setComInTime(Date comInTime) {
        this.comInTime = comInTime;
    }

    public Date getComOutTime() {
        return comOutTime;
    }

    public void setComOutTime(Date comOutTime) {
        this.comOutTime = comOutTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getChuzhi() {
        return chuzhi;
    }

    public void setChuzhi(String chuzhi) {
        this.chuzhi = chuzhi == null ? null : chuzhi.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getShiyongUserId() {
        return shiyongUserId;
    }

    public void setShiyongUserId(Integer shiyongUserId) {
        this.shiyongUserId = shiyongUserId;
    }

    public String getShiyongUserName() {
        return shiyongUserName;
    }

    public void setShiyongUserName(String shiyongUserName) {
        this.shiyongUserName = shiyongUserName == null ? null : shiyongUserName.trim();
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
        WeihuapinInfo other = (WeihuapinInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
                && (this.getDanwei() == null ? other.getDanwei() == null : this.getDanwei().equals(other.getDanwei()))
                && (this.getSaveMethod() == null ? other.getSaveMethod() == null : this.getSaveMethod().equals(other.getSaveMethod()))
                && (this.getSaveSite() == null ? other.getSaveSite() == null : this.getSaveSite().equals(other.getSaveSite()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getComInTime() == null ? other.getComInTime() == null : this.getComInTime().equals(other.getComInTime()))
                && (this.getComOutTime() == null ? other.getComOutTime() == null : this.getComOutTime().equals(other.getComOutTime()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getChuzhi() == null ? other.getChuzhi() == null : this.getChuzhi().equals(other.getChuzhi()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getShiyongUserId() == null ? other.getShiyongUserId() == null : this.getShiyongUserId().equals(other.getShiyongUserId()))
                && (this.getShiyongUserName() == null ? other.getShiyongUserName() == null : this.getShiyongUserName().equals(other.getShiyongUserName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getDanwei() == null) ? 0 : getDanwei().hashCode());
        result = prime * result + ((getSaveMethod() == null) ? 0 : getSaveMethod().hashCode());
        result = prime * result + ((getSaveSite() == null) ? 0 : getSaveSite().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getComInTime() == null) ? 0 : getComInTime().hashCode());
        result = prime * result + ((getComOutTime() == null) ? 0 : getComOutTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getChuzhi() == null) ? 0 : getChuzhi().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getShiyongUserId() == null) ? 0 : getShiyongUserId().hashCode());
        result = prime * result + ((getShiyongUserName() == null) ? 0 : getShiyongUserName().hashCode());
        return result;
    }
}