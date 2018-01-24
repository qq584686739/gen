package com.example.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class Coupon implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 优惠券名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 优惠券编号
     *
     * @mbg.generated
     */
    private String number;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 1满减券；2免邮券；3折扣券；4现金券
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * 满足X
     *
     * @mbg.generated
     */
    private Double satisty;

    /**
     * （折）（现）（减）X
     *
     * @mbg.generated
     */
    private Double discount;

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
     * 开始时间
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * 到期时间
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * 0启用；1不启用
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 库存
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     * 创建者管理员id
     *
     * @mbg.generated
     */
    private Integer createManagerId;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getSatisty() {
        return satisty;
    }

    public void setSatisty(Double satisty) {
        this.satisty = satisty;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", note=").append(note);
        sb.append(", type=").append(type);
        sb.append(", satisty=").append(satisty);
        sb.append(", discount=").append(discount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", status=").append(status);
        sb.append(", stock=").append(stock);
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
        Coupon other = (Coupon) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSatisty() == null ? other.getSatisty() == null : this.getSatisty().equals(other.getSatisty()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getCreateManagerId() == null ? other.getCreateManagerId() == null : this.getCreateManagerId().equals(other.getCreateManagerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSatisty() == null) ? 0 : getSatisty().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getCreateManagerId() == null) ? 0 : getCreateManagerId().hashCode());
        return result;
    }
}