package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class CharMsg implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 发送人id
     *
     * @mbg.generated
     */
    private Integer fromId;

    /**
     * 接收人id
     *
     * @mbg.generated
     */
    private Integer toId;

    /**
     * 消息类型（0用户发的，1管理员发的）
     *
     * @mbg.generated
     */
    private Integer msgType;

    /**
     * 消息内容
     *
     * @mbg.generated
     */
    private String msgContent;

    /**
     * 消息状态（0发送成功，1发送失败，2对方已读，3过期）
     *
     * @mbg.generated
     */
    private Integer msgState;

    /**
     * 发送时间
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

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Integer getMsgState() {
        return msgState;
    }

    public void setMsgState(Integer msgState) {
        this.msgState = msgState;
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
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", msgType=").append(msgType);
        sb.append(", msgContent=").append(msgContent);
        sb.append(", msgState=").append(msgState);
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
        CharMsg other = (CharMsg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
            && (this.getToId() == null ? other.getToId() == null : this.getToId().equals(other.getToId()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getMsgContent() == null ? other.getMsgContent() == null : this.getMsgContent().equals(other.getMsgContent()))
            && (this.getMsgState() == null ? other.getMsgState() == null : this.getMsgState().equals(other.getMsgState()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getToId() == null) ? 0 : getToId().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getMsgContent() == null) ? 0 : getMsgContent().hashCode());
        result = prime * result + ((getMsgState() == null) ? 0 : getMsgState().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}