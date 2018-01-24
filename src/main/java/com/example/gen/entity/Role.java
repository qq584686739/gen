package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 角色名（后）
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 角色名（前）
     *
     * @mbg.generated
     */
    private String alias;

    /**
     * 是否启用（0启用；1不启用）
     *
     * @mbg.generated
     */
    private Integer available;

    /**
     * 角色备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 角色描述
     *
     * @mbg.generated
     */
    private String description;

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
     * 创建者id
     *
     * @mbg.generated
     */
    private Integer createManagerId;

    /**
     * 更新者id
     *
     * @mbg.generated
     */
    private Integer updateManagerId;

    private static final long serialVersionUID = 1L;

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
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getUpdateManagerId() {
        return updateManagerId;
    }

    public void setUpdateManagerId(Integer updateManagerId) {
        this.updateManagerId = updateManagerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", alias=").append(alias);
        sb.append(", available=").append(available);
        sb.append(", note=").append(note);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createManagerId=").append(createManagerId);
        sb.append(", updateManagerId=").append(updateManagerId);
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
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getAvailable() == null ? other.getAvailable() == null : this.getAvailable().equals(other.getAvailable()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateManagerId() == null ? other.getCreateManagerId() == null : this.getCreateManagerId().equals(other.getCreateManagerId()))
            && (this.getUpdateManagerId() == null ? other.getUpdateManagerId() == null : this.getUpdateManagerId().equals(other.getUpdateManagerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateManagerId() == null) ? 0 : getCreateManagerId().hashCode());
        result = prime * result + ((getUpdateManagerId() == null) ? 0 : getUpdateManagerId().hashCode());
        return result;
    }
}