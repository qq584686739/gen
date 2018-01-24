package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 评论者（用户）id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 评论者（管理员）id
     *
     * @mbg.generated
     */
    private Integer managerId;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     * 评论内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 状态（0正常；1回收站）
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * 父评论（0为商品评论，其他为评论id）
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     * 评论创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 评论更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 修改评论管理员id
     *
     * @mbg.generated
     */
    private Integer updateManagerId;

    /**
     * 点赞数（热度）
     *
     * @mbg.generated
     */
    private Integer pointLikeNumber;

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

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Integer getUpdateManagerId() {
        return updateManagerId;
    }

    public void setUpdateManagerId(Integer updateManagerId) {
        this.updateManagerId = updateManagerId;
    }

    public Integer getPointLikeNumber() {
        return pointLikeNumber;
    }

    public void setPointLikeNumber(Integer pointLikeNumber) {
        this.pointLikeNumber = pointLikeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", managerId=").append(managerId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", content=").append(content);
        sb.append(", state=").append(state);
        sb.append(", parentId=").append(parentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateManagerId=").append(updateManagerId);
        sb.append(", pointLikeNumber=").append(pointLikeNumber);
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
        Comment other = (Comment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateManagerId() == null ? other.getUpdateManagerId() == null : this.getUpdateManagerId().equals(other.getUpdateManagerId()))
            && (this.getPointLikeNumber() == null ? other.getPointLikeNumber() == null : this.getPointLikeNumber().equals(other.getPointLikeNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateManagerId() == null) ? 0 : getUpdateManagerId().hashCode());
        result = prime * result + ((getPointLikeNumber() == null) ? 0 : getPointLikeNumber().hashCode());
        return result;
    }
}