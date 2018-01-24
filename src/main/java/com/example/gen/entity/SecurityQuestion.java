package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class SecurityQuestion implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 问题
     *
     * @mbg.generated
     */
    private String question;

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
     * 状态（0可用、1不可用）
     *
     * @mbg.generated
     */
    private String state;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 创建者管理员id
     *
     * @mbg.generated
     */
    private Integer createManagerId;

    /**
     * 修改者管理员id
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        sb.append(", question=").append(question);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", state=").append(state);
        sb.append(", note=").append(note);
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
        SecurityQuestion other = (SecurityQuestion) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getCreateManagerId() == null ? other.getCreateManagerId() == null : this.getCreateManagerId().equals(other.getCreateManagerId()))
            && (this.getUpdateManagerId() == null ? other.getUpdateManagerId() == null : this.getUpdateManagerId().equals(other.getUpdateManagerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getCreateManagerId() == null) ? 0 : getCreateManagerId().hashCode());
        result = prime * result + ((getUpdateManagerId() == null) ? 0 : getUpdateManagerId().hashCode());
        return result;
    }
}