package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class UserCollection implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 状态（1正在收藏；2回收站）
     *
     * @mbg.generated
     */
    private String state;

    /**
     * 放入回收站时间
     *
     * @mbg.generated
     */
    private Date recoveryTime;

    private static final long serialVersionUID = 1L;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(Date recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", createTime=").append(createTime);
        sb.append(", state=").append(state);
        sb.append(", recoveryTime=").append(recoveryTime);
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
        UserCollection other = (UserCollection) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRecoveryTime() == null ? other.getRecoveryTime() == null : this.getRecoveryTime().equals(other.getRecoveryTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRecoveryTime() == null) ? 0 : getRecoveryTime().hashCode());
        return result;
    }
}