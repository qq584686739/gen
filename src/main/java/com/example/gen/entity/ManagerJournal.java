package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class ManagerJournal implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 管理员id
     *
     * @mbg.generated
     */
    private Integer managerId;

    /**
     * ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * 操作内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 操作类型（0insert，1delete，2update）
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 被操作者id（user_id）
     *
     * @mbg.generated
     */
    private Integer manipulatedId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getManipulatedId() {
        return manipulatedId;
    }

    public void setManipulatedId(Integer manipulatedId) {
        this.manipulatedId = manipulatedId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", managerId=").append(managerId);
        sb.append(", ip=").append(ip);
        sb.append(", content=").append(content);
        sb.append(", type=").append(type);
        sb.append(", note=").append(note);
        sb.append(", manipulatedId=").append(manipulatedId);
        sb.append(", createTime=").append(createTime);
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
        ManagerJournal other = (ManagerJournal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getManipulatedId() == null ? other.getManipulatedId() == null : this.getManipulatedId().equals(other.getManipulatedId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getManipulatedId() == null) ? 0 : getManipulatedId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}