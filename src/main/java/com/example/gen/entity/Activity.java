package com.example.gen.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Activity implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 活动内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 活动主题
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 参与活动商品ids
     *
     * @mbg.generated
     */
    private String goodsIds;

    /**
     * 满足价格
     *
     * @mbg.generated
     */
    private BigDecimal satisfyPrice;

    /**
     * 优惠价格
     *
     * @mbg.generated
     */
    private BigDecimal favorablePrice;

    /**
     * 活动创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 活动开始时间
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * 活动结束时间
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * 状态（待定）
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 发布人id（管理员id）
     *
     * @mbg.generated
     */
    private Integer managerId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
    }

    public BigDecimal getSatisfyPrice() {
        return satisfyPrice;
    }

    public void setSatisfyPrice(BigDecimal satisfyPrice) {
        this.satisfyPrice = satisfyPrice;
    }

    public BigDecimal getFavorablePrice() {
        return favorablePrice;
    }

    public void setFavorablePrice(BigDecimal favorablePrice) {
        this.favorablePrice = favorablePrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", title=").append(title);
        sb.append(", goodsIds=").append(goodsIds);
        sb.append(", satisfyPrice=").append(satisfyPrice);
        sb.append(", favorablePrice=").append(favorablePrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", state=").append(state);
        sb.append(", note=").append(note);
        sb.append(", managerId=").append(managerId);
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
        Activity other = (Activity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getGoodsIds() == null ? other.getGoodsIds() == null : this.getGoodsIds().equals(other.getGoodsIds()))
            && (this.getSatisfyPrice() == null ? other.getSatisfyPrice() == null : this.getSatisfyPrice().equals(other.getSatisfyPrice()))
            && (this.getFavorablePrice() == null ? other.getFavorablePrice() == null : this.getFavorablePrice().equals(other.getFavorablePrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getGoodsIds() == null) ? 0 : getGoodsIds().hashCode());
        result = prime * result + ((getSatisfyPrice() == null) ? 0 : getSatisfyPrice().hashCode());
        result = prime * result + ((getFavorablePrice() == null) ? 0 : getFavorablePrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        return result;
    }
}