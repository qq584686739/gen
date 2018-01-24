package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 权限名字（后）
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 权限名字（前）
     *
     * @mbg.generated
     */
    private String alias;

    /**
     * 是否启用（0启用；1不启用）
     *
     * @mbg.generated
     */
    private Integer availavle;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 描述
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

    /**
     * 链接
     *
     * @mbg.generated
     */
    private String connect;

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

    public Integer getAvailavle() {
        return availavle;
    }

    public void setAvailavle(Integer availavle) {
        this.availavle = availavle;
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

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
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
        sb.append(", availavle=").append(availavle);
        sb.append(", note=").append(note);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createManagerId=").append(createManagerId);
        sb.append(", updateManagerId=").append(updateManagerId);
        sb.append(", connect=").append(connect);
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
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getAvailavle() == null ? other.getAvailavle() == null : this.getAvailavle().equals(other.getAvailavle()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateManagerId() == null ? other.getCreateManagerId() == null : this.getCreateManagerId().equals(other.getCreateManagerId()))
            && (this.getUpdateManagerId() == null ? other.getUpdateManagerId() == null : this.getUpdateManagerId().equals(other.getUpdateManagerId()))
            && (this.getConnect() == null ? other.getConnect() == null : this.getConnect().equals(other.getConnect()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getAvailavle() == null) ? 0 : getAvailavle().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateManagerId() == null) ? 0 : getCreateManagerId().hashCode());
        result = prime * result + ((getUpdateManagerId() == null) ? 0 : getUpdateManagerId().hashCode());
        result = prime * result + ((getConnect() == null) ? 0 : getConnect().hashCode());
        return result;
    }
}