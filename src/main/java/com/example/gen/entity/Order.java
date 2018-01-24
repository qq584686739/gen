package com.example.gen.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    private Integer userId;

    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderNumber;

    /**
     * 此数据总价，可直接提交到第三方支付平台
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * 零售价（单）
     *
     * @mbg.generated
     */
    private BigDecimal goodsRetailPrice;

    /**
     * 折扣价（单）
     *
     * @mbg.generated
     */
    private BigDecimal goodsDiscountPrice;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     * 交易号
     *
     * @mbg.generated
     */
    private String transactionNumber;

    /**
     * 流水号
     *
     * @mbg.generated
     */
    private String serialNumber;

    /**
     * 商品数量
     *
     * @mbg.generated
     */
    private Integer number;

    /**
     * 订单状态（1待支付；2取消订单；3支付失败；4其他；5退款中；6退款完成；7退款失败；8待发货（支付成功）；9待签收（支付成功，已发货）；10待评价（支付成功，已签收）；11已评价（支付成功）；12订单顺利完成（支付成功，订单完成，不再支持退款））
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * 取消订单的理由
     *
     * @mbg.generated
     */
    private String cancelReason;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 支付时间
     *
     * @mbg.generated
     */
    private Date payTime;

    /**
     * 发货时间
     *
     * @mbg.generated
     */
    private Date leaveTime;

    /**
     * 物流公司
     *
     * @mbg.generated
     */
    private String logisticsCompany;

    /**
     * 物流运单号
     *
     * @mbg.generated
     */
    private String logisticsNumber;

    /**
     * 支付方式（0支付宝，1微信，2qq，3银联，4网银，5银行卡号，6货到付款，7其他）
     *
     * @mbg.generated
     */
    private Integer payMethod;

    /**
     * 发票（0开，1不开，2纸质版，3电子版，4其他）
     *
     * @mbg.generated
     */
    private Integer invoice;

    /**
     * 发票url（电）
     *
     * @mbg.generated
     */
    private String invoiceUrl;

    /**
     * 订单完成说明
     *
     * @mbg.generated
     */
    private String completeInstructions;

    /**
     * 地址id
     *
     * @mbg.generated
     */
    private Integer addressId;

    /**
     * 成本价（单）
     *
     * @mbg.generated
     */
    private BigDecimal goodsCostPrice;

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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getGoodsRetailPrice() {
        return goodsRetailPrice;
    }

    public void setGoodsRetailPrice(BigDecimal goodsRetailPrice) {
        this.goodsRetailPrice = goodsRetailPrice;
    }

    public BigDecimal getGoodsDiscountPrice() {
        return goodsDiscountPrice;
    }

    public void setGoodsDiscountPrice(BigDecimal goodsDiscountPrice) {
        this.goodsDiscountPrice = goodsDiscountPrice;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public String getCompleteInstructions() {
        return completeInstructions;
    }

    public void setCompleteInstructions(String completeInstructions) {
        this.completeInstructions = completeInstructions;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public BigDecimal getGoodsCostPrice() {
        return goodsCostPrice;
    }

    public void setGoodsCostPrice(BigDecimal goodsCostPrice) {
        this.goodsCostPrice = goodsCostPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", price=").append(price);
        sb.append(", goodsRetailPrice=").append(goodsRetailPrice);
        sb.append(", goodsDiscountPrice=").append(goodsDiscountPrice);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", transactionNumber=").append(transactionNumber);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", number=").append(number);
        sb.append(", state=").append(state);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", createTime=").append(createTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", logisticsCompany=").append(logisticsCompany);
        sb.append(", logisticsNumber=").append(logisticsNumber);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", invoice=").append(invoice);
        sb.append(", invoiceUrl=").append(invoiceUrl);
        sb.append(", completeInstructions=").append(completeInstructions);
        sb.append(", addressId=").append(addressId);
        sb.append(", goodsCostPrice=").append(goodsCostPrice);
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
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getGoodsRetailPrice() == null ? other.getGoodsRetailPrice() == null : this.getGoodsRetailPrice().equals(other.getGoodsRetailPrice()))
            && (this.getGoodsDiscountPrice() == null ? other.getGoodsDiscountPrice() == null : this.getGoodsDiscountPrice().equals(other.getGoodsDiscountPrice()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getTransactionNumber() == null ? other.getTransactionNumber() == null : this.getTransactionNumber().equals(other.getTransactionNumber()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCancelReason() == null ? other.getCancelReason() == null : this.getCancelReason().equals(other.getCancelReason()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getLeaveTime() == null ? other.getLeaveTime() == null : this.getLeaveTime().equals(other.getLeaveTime()))
            && (this.getLogisticsCompany() == null ? other.getLogisticsCompany() == null : this.getLogisticsCompany().equals(other.getLogisticsCompany()))
            && (this.getLogisticsNumber() == null ? other.getLogisticsNumber() == null : this.getLogisticsNumber().equals(other.getLogisticsNumber()))
            && (this.getPayMethod() == null ? other.getPayMethod() == null : this.getPayMethod().equals(other.getPayMethod()))
            && (this.getInvoice() == null ? other.getInvoice() == null : this.getInvoice().equals(other.getInvoice()))
            && (this.getInvoiceUrl() == null ? other.getInvoiceUrl() == null : this.getInvoiceUrl().equals(other.getInvoiceUrl()))
            && (this.getCompleteInstructions() == null ? other.getCompleteInstructions() == null : this.getCompleteInstructions().equals(other.getCompleteInstructions()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getGoodsCostPrice() == null ? other.getGoodsCostPrice() == null : this.getGoodsCostPrice().equals(other.getGoodsCostPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getGoodsRetailPrice() == null) ? 0 : getGoodsRetailPrice().hashCode());
        result = prime * result + ((getGoodsDiscountPrice() == null) ? 0 : getGoodsDiscountPrice().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getTransactionNumber() == null) ? 0 : getTransactionNumber().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCancelReason() == null) ? 0 : getCancelReason().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getLeaveTime() == null) ? 0 : getLeaveTime().hashCode());
        result = prime * result + ((getLogisticsCompany() == null) ? 0 : getLogisticsCompany().hashCode());
        result = prime * result + ((getLogisticsNumber() == null) ? 0 : getLogisticsNumber().hashCode());
        result = prime * result + ((getPayMethod() == null) ? 0 : getPayMethod().hashCode());
        result = prime * result + ((getInvoice() == null) ? 0 : getInvoice().hashCode());
        result = prime * result + ((getInvoiceUrl() == null) ? 0 : getInvoiceUrl().hashCode());
        result = prime * result + ((getCompleteInstructions() == null) ? 0 : getCompleteInstructions().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getGoodsCostPrice() == null) ? 0 : getGoodsCostPrice().hashCode());
        return result;
    }
}