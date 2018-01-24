package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class ManagerRole implements Serializable {
    /**
     * 管理员id
     *
     * @mbg.generated
     */
    private Integer managerId;

    /**
     * 角色id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 授权者id
     *
     * @mbg.generated
     */
    private Integer createManagerId;

    private static final long serialVersionUID = 1L;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateManagerId() {
        return createManagerId;
    }

    public void setCreateManagerId(Integer createManagerId) {
        this.createManagerId = createManagerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", managerId=").append(managerId);
        sb.append(", roleId=").append(roleId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createManagerId=").append(createManagerId);
        sb.append("]");
        return sb.toString();
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
        ManagerRole other = (ManagerRole) that;
        return (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateManagerId() == null ? other.getCreateManagerId() == null : this.getCreateManagerId().equals(other.getCreateManagerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateManagerId() == null) ? 0 : getCreateManagerId().hashCode());
        return result;
    }
}