package com.system.domain;

import java.io.Serializable;
import java.util.Date;

public class ShebeiInfo extends PubOut implements Serializable {
    private Integer id;

    private Integer leibieId;

    private String leibieName;

    private String xinghao;

    private String zhizaoshang;

    private Integer num;

    private Date goumaiTime;

    private Date createTime;

    private Integer bumenId;

    private String bumenName;

    private String shebeizhuangkuang;

    private String flag;

    private String type;

    private String remark;

    private String status;

    private Integer shebeiId;

    private Integer userId;

    private String userName;

    private Integer createUserId;

    private String createUserName;

    private Date endTime;

    private static final long serialVersionUID = 1L;

    public ShebeiInfo(Integer id, Integer leibieId, String leibieName, String xinghao, String zhizaoshang, Integer num, Date goumaiTime, Date createTime, Integer bumenId, String bumenName, String shebeizhuangkuang, String flag, String type, String remark, String status, Integer shebeiId, Integer userId, String userName, Integer createUserId, String createUserName, Date endTime) {
        this.id = id;
        this.leibieId = leibieId;
        this.leibieName = leibieName;
        this.xinghao = xinghao;
        this.zhizaoshang = zhizaoshang;
        this.num = num;
        this.goumaiTime = goumaiTime;
        this.createTime = createTime;
        this.bumenId = bumenId;
        this.bumenName = bumenName;
        this.shebeizhuangkuang = shebeizhuangkuang;
        this.flag = flag;
        this.type = type;
        this.remark = remark;
        this.status = status;
        this.shebeiId = shebeiId;
        this.userId = userId;
        this.userName = userName;
        this.createUserId = createUserId;
        this.createUserName = createUserName;
        this.endTime = endTime;
    }

    public ShebeiInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeibieId() {
        return leibieId;
    }

    public void setLeibieId(Integer leibieId) {
        this.leibieId = leibieId;
    }

    public String getLeibieName() {
        return leibieName;
    }

    public void setLeibieName(String leibieName) {
        this.leibieName = leibieName == null ? null : leibieName.trim();
    }

    public String getXinghao() {
        return xinghao;
    }

    public void setXinghao(String xinghao) {
        this.xinghao = xinghao == null ? null : xinghao.trim();
    }

    public String getZhizaoshang() {
        return zhizaoshang;
    }

    public void setZhizaoshang(String zhizaoshang) {
        this.zhizaoshang = zhizaoshang == null ? null : zhizaoshang.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getGoumaiTime() {
        return goumaiTime;
    }

    public void setGoumaiTime(Date goumaiTime) {
        this.goumaiTime = goumaiTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getShebeizhuangkuang() {
        return shebeizhuangkuang;
    }

    public void setShebeizhuangkuang(String shebeizhuangkuang) {
        this.shebeizhuangkuang = shebeizhuangkuang == null ? null : shebeizhuangkuang.trim();
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

    public Integer getShebeiId() {
        return shebeiId;
    }

    public void setShebeiId(Integer shebeiId) {
        this.shebeiId = shebeiId;
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

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        ShebeiInfo other = (ShebeiInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getLeibieId() == null ? other.getLeibieId() == null : this.getLeibieId().equals(other.getLeibieId()))
                && (this.getLeibieName() == null ? other.getLeibieName() == null : this.getLeibieName().equals(other.getLeibieName()))
                && (this.getXinghao() == null ? other.getXinghao() == null : this.getXinghao().equals(other.getXinghao()))
                && (this.getZhizaoshang() == null ? other.getZhizaoshang() == null : this.getZhizaoshang().equals(other.getZhizaoshang()))
                && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
                && (this.getGoumaiTime() == null ? other.getGoumaiTime() == null : this.getGoumaiTime().equals(other.getGoumaiTime()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getBumenId() == null ? other.getBumenId() == null : this.getBumenId().equals(other.getBumenId()))
                && (this.getBumenName() == null ? other.getBumenName() == null : this.getBumenName().equals(other.getBumenName()))
                && (this.getShebeizhuangkuang() == null ? other.getShebeizhuangkuang() == null : this.getShebeizhuangkuang().equals(other.getShebeizhuangkuang()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getShebeiId() == null ? other.getShebeiId() == null : this.getShebeiId().equals(other.getShebeiId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
                && (this.getCreateUserName() == null ? other.getCreateUserName() == null : this.getCreateUserName().equals(other.getCreateUserName()))
                && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLeibieId() == null) ? 0 : getLeibieId().hashCode());
        result = prime * result + ((getLeibieName() == null) ? 0 : getLeibieName().hashCode());
        result = prime * result + ((getXinghao() == null) ? 0 : getXinghao().hashCode());
        result = prime * result + ((getZhizaoshang() == null) ? 0 : getZhizaoshang().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getGoumaiTime() == null) ? 0 : getGoumaiTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getBumenId() == null) ? 0 : getBumenId().hashCode());
        result = prime * result + ((getBumenName() == null) ? 0 : getBumenName().hashCode());
        result = prime * result + ((getShebeizhuangkuang() == null) ? 0 : getShebeizhuangkuang().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getShebeiId() == null) ? 0 : getShebeiId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateUserName() == null) ? 0 : getCreateUserName().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return result;
    }
}