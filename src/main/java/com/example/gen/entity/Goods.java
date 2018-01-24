package com.example.gen.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods implements Serializable {
    /**
     * uuid
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 商品证书编号
     *
     * @mbg.generated
     */
    private String certificateNumber;

    /**
     * 商品名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 商品品牌
     *
     * @mbg.generated
     */
    private String brand;

    /**
     * 商品价格
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * 促销价、折扣价
     *
     * @mbg.generated
     */
    private BigDecimal discountPrice;

    /**
     * 商品描述
     *
     * @mbg.generated
     */
    private String discription;

    /**
     * 商品颜色分类
     *
     * @mbg.generated
     */
    private String color;

    /**
     * 库存
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     * 商品大类（吸顶灯、餐厅灯...）
     *
     * @mbg.generated
     */
    private String type;

    /**
     * 规格
     *
     * @mbg.generated
     */
    private String specifications;

    /**
     * 标签（0热卖、1推荐、2新品，3正常，4其他）
     *
     * @mbg.generated
     */
    private Integer label;

    /**
     * 智能类型（0智能、1非智能、2其他）
     *
     * @mbg.generated
     */
    private Integer intelligentType;

    /**
     * 质保年限
     *
     * @mbg.generated
     */
    private BigDecimal warranty;

    /**
     * 型号
     *
     * @mbg.generated
     */
    private String model;

    /**
     * 灯罩主材质
     *
     * @mbg.generated
     */
    private String lampshadeMaterial;

    /**
     * 灯身主材质
     *
     * @mbg.generated
     */
    private String bodyMaterial;

    /**
     * 光源个数
     *
     * @mbg.generated
     */
    private Integer lightSourceNumber;

    /**
     * 光源类型
     *
     * @mbg.generated
     */
    private String lightSourceType;

    /**
     * 是否带光源（0带，1不带）
     *
     * @mbg.generated
     */
    private Integer lightSource;

    /**
     * 电压
     *
     * @mbg.generated
     */
    private String voltage;

    /**
     * 风格
     *
     * @mbg.generated
     */
    private String style;

    /**
     * 产地
     *
     * @mbg.generated
     */
    private String orign;

    /**
     * 照射面积
     *
     * @mbg.generated
     */
    private String irradiationArea;

    /**
     * 功率
     *
     * @mbg.generated
     */
    private String power;

    /**
     * 灯罩形状
     *
     * @mbg.generated
     */
    private String lampshadeShape;

    /**
     * 工艺
     *
     * @mbg.generated
     */
    private String technology;

    /**
     * 适用空间
     *
     * @mbg.generated
     */
    private String applySpace;

    /**
     * 购买送积分
     *
     * @mbg.generated
     */
    private Integer sendScore;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建管理员id
     *
     * @mbg.generated
     */
    private Integer createManagerId;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 厂商
     *
     * @mbg.generated
     */
    private String manufacturer;

    /**
     * 荣誉
     *
     * @mbg.generated
     */
    private String honor;

    /**
     * 主题
     *
     * @mbg.generated
     */
    private String theme;

    /**
     * 主标图像
     *
     * @mbg.generated
     */
    private String icon;

    /**
     * 邮费
     *
     * @mbg.generated
     */
    private BigDecimal postage;

    /**
     * 展示图（4~5，JSON）
     *
     * @mbg.generated
     */
    private String displayPictures;

    /**
     * 详情图片（JSON）
     *
     * @mbg.generated
     */
    private String detailPictures;

    /**
     * 成本价
     *
     * @mbg.generated
     */
    private BigDecimal costPrice;

    /**
     * 详情说明
     *
     * @mbg.generated
     */
    private String detailedExplanation;

    /**
     * 上架（0上架；1不上架）
     *
     * @mbg.generated
     */
    private Integer ground;

    /**
     * 月销量
     *
     * @mbg.generated
     */
    private Integer salesVolume;

    /**
     * 排序等级（优先级）（越高越优先）
     *
     * @mbg.generated
     */
    private Integer goodsSort;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getIntelligentType() {
        return intelligentType;
    }

    public void setIntelligentType(Integer intelligentType) {
        this.intelligentType = intelligentType;
    }

    public BigDecimal getWarranty() {
        return warranty;
    }

    public void setWarranty(BigDecimal warranty) {
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLampshadeMaterial() {
        return lampshadeMaterial;
    }

    public void setLampshadeMaterial(String lampshadeMaterial) {
        this.lampshadeMaterial = lampshadeMaterial;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public Integer getLightSourceNumber() {
        return lightSourceNumber;
    }

    public void setLightSourceNumber(Integer lightSourceNumber) {
        this.lightSourceNumber = lightSourceNumber;
    }

    public String getLightSourceType() {
        return lightSourceType;
    }

    public void setLightSourceType(String lightSourceType) {
        this.lightSourceType = lightSourceType;
    }

    public Integer getLightSource() {
        return lightSource;
    }

    public void setLightSource(Integer lightSource) {
        this.lightSource = lightSource;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getOrign() {
        return orign;
    }

    public void setOrign(String orign) {
        this.orign = orign;
    }

    public String getIrradiationArea() {
        return irradiationArea;
    }

    public void setIrradiationArea(String irradiationArea) {
        this.irradiationArea = irradiationArea;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getLampshadeShape() {
        return lampshadeShape;
    }

    public void setLampshadeShape(String lampshadeShape) {
        this.lampshadeShape = lampshadeShape;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getApplySpace() {
        return applySpace;
    }

    public void setApplySpace(String applySpace) {
        this.applySpace = applySpace;
    }

    public Integer getSendScore() {
        return sendScore;
    }

    public void setSendScore(Integer sendScore) {
        this.sendScore = sendScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateManagerId() {
        return createManagerId;
    }

    public void setCreateManagerId(Integer createManagerId) {
        this.createManagerId = createManagerId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public String getDisplayPictures() {
        return displayPictures;
    }

    public void setDisplayPictures(String displayPictures) {
        this.displayPictures = displayPictures;
    }

    public String getDetailPictures() {
        return detailPictures;
    }

    public void setDetailPictures(String detailPictures) {
        this.detailPictures = detailPictures;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getDetailedExplanation() {
        return detailedExplanation;
    }

    public void setDetailedExplanation(String detailedExplanation) {
        this.detailedExplanation = detailedExplanation;
    }

    public Integer getGround() {
        return ground;
    }

    public void setGround(Integer ground) {
        this.ground = ground;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Integer getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(Integer goodsSort) {
        this.goodsSort = goodsSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", certificateNumber=").append(certificateNumber);
        sb.append(", name=").append(name);
        sb.append(", brand=").append(brand);
        sb.append(", price=").append(price);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", discription=").append(discription);
        sb.append(", color=").append(color);
        sb.append(", stock=").append(stock);
        sb.append(", type=").append(type);
        sb.append(", specifications=").append(specifications);
        sb.append(", label=").append(label);
        sb.append(", intelligentType=").append(intelligentType);
        sb.append(", warranty=").append(warranty);
        sb.append(", model=").append(model);
        sb.append(", lampshadeMaterial=").append(lampshadeMaterial);
        sb.append(", bodyMaterial=").append(bodyMaterial);
        sb.append(", lightSourceNumber=").append(lightSourceNumber);
        sb.append(", lightSourceType=").append(lightSourceType);
        sb.append(", lightSource=").append(lightSource);
        sb.append(", voltage=").append(voltage);
        sb.append(", style=").append(style);
        sb.append(", orign=").append(orign);
        sb.append(", irradiationArea=").append(irradiationArea);
        sb.append(", power=").append(power);
        sb.append(", lampshadeShape=").append(lampshadeShape);
        sb.append(", technology=").append(technology);
        sb.append(", applySpace=").append(applySpace);
        sb.append(", sendScore=").append(sendScore);
        sb.append(", createTime=").append(createTime);
        sb.append(", createManagerId=").append(createManagerId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", honor=").append(honor);
        sb.append(", theme=").append(theme);
        sb.append(", icon=").append(icon);
        sb.append(", postage=").append(postage);
        sb.append(", displayPictures=").append(displayPictures);
        sb.append(", detailPictures=").append(detailPictures);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", detailedExplanation=").append(detailedExplanation);
        sb.append(", ground=").append(ground);
        sb.append(", salesVolume=").append(salesVolume);
        sb.append(", goodsSort=").append(goodsSort);
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCertificateNumber() == null ? other.getCertificateNumber() == null : this.getCertificateNumber().equals(other.getCertificateNumber()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDiscountPrice() == null ? other.getDiscountPrice() == null : this.getDiscountPrice().equals(other.getDiscountPrice()))
            && (this.getDiscription() == null ? other.getDiscription() == null : this.getDiscription().equals(other.getDiscription()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSpecifications() == null ? other.getSpecifications() == null : this.getSpecifications().equals(other.getSpecifications()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getIntelligentType() == null ? other.getIntelligentType() == null : this.getIntelligentType().equals(other.getIntelligentType()))
            && (this.getWarranty() == null ? other.getWarranty() == null : this.getWarranty().equals(other.getWarranty()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getLampshadeMaterial() == null ? other.getLampshadeMaterial() == null : this.getLampshadeMaterial().equals(other.getLampshadeMaterial()))
            && (this.getBodyMaterial() == null ? other.getBodyMaterial() == null : this.getBodyMaterial().equals(other.getBodyMaterial()))
            && (this.getLightSourceNumber() == null ? other.getLightSourceNumber() == null : this.getLightSourceNumber().equals(other.getLightSourceNumber()))
            && (this.getLightSourceType() == null ? other.getLightSourceType() == null : this.getLightSourceType().equals(other.getLightSourceType()))
            && (this.getLightSource() == null ? other.getLightSource() == null : this.getLightSource().equals(other.getLightSource()))
            && (this.getVoltage() == null ? other.getVoltage() == null : this.getVoltage().equals(other.getVoltage()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getOrign() == null ? other.getOrign() == null : this.getOrign().equals(other.getOrign()))
            && (this.getIrradiationArea() == null ? other.getIrradiationArea() == null : this.getIrradiationArea().equals(other.getIrradiationArea()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getLampshadeShape() == null ? other.getLampshadeShape() == null : this.getLampshadeShape().equals(other.getLampshadeShape()))
            && (this.getTechnology() == null ? other.getTechnology() == null : this.getTechnology().equals(other.getTechnology()))
            && (this.getApplySpace() == null ? other.getApplySpace() == null : this.getApplySpace().equals(other.getApplySpace()))
            && (this.getSendScore() == null ? other.getSendScore() == null : this.getSendScore().equals(other.getSendScore()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateManagerId() == null ? other.getCreateManagerId() == null : this.getCreateManagerId().equals(other.getCreateManagerId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getHonor() == null ? other.getHonor() == null : this.getHonor().equals(other.getHonor()))
            && (this.getTheme() == null ? other.getTheme() == null : this.getTheme().equals(other.getTheme()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getPostage() == null ? other.getPostage() == null : this.getPostage().equals(other.getPostage()))
            && (this.getDisplayPictures() == null ? other.getDisplayPictures() == null : this.getDisplayPictures().equals(other.getDisplayPictures()))
            && (this.getDetailPictures() == null ? other.getDetailPictures() == null : this.getDetailPictures().equals(other.getDetailPictures()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getDetailedExplanation() == null ? other.getDetailedExplanation() == null : this.getDetailedExplanation().equals(other.getDetailedExplanation()))
            && (this.getGround() == null ? other.getGround() == null : this.getGround().equals(other.getGround()))
            && (this.getSalesVolume() == null ? other.getSalesVolume() == null : this.getSalesVolume().equals(other.getSalesVolume()))
            && (this.getGoodsSort() == null ? other.getGoodsSort() == null : this.getGoodsSort().equals(other.getGoodsSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCertificateNumber() == null) ? 0 : getCertificateNumber().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDiscountPrice() == null) ? 0 : getDiscountPrice().hashCode());
        result = prime * result + ((getDiscription() == null) ? 0 : getDiscription().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getIntelligentType() == null) ? 0 : getIntelligentType().hashCode());
        result = prime * result + ((getWarranty() == null) ? 0 : getWarranty().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getLampshadeMaterial() == null) ? 0 : getLampshadeMaterial().hashCode());
        result = prime * result + ((getBodyMaterial() == null) ? 0 : getBodyMaterial().hashCode());
        result = prime * result + ((getLightSourceNumber() == null) ? 0 : getLightSourceNumber().hashCode());
        result = prime * result + ((getLightSourceType() == null) ? 0 : getLightSourceType().hashCode());
        result = prime * result + ((getLightSource() == null) ? 0 : getLightSource().hashCode());
        result = prime * result + ((getVoltage() == null) ? 0 : getVoltage().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getOrign() == null) ? 0 : getOrign().hashCode());
        result = prime * result + ((getIrradiationArea() == null) ? 0 : getIrradiationArea().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getLampshadeShape() == null) ? 0 : getLampshadeShape().hashCode());
        result = prime * result + ((getTechnology() == null) ? 0 : getTechnology().hashCode());
        result = prime * result + ((getApplySpace() == null) ? 0 : getApplySpace().hashCode());
        result = prime * result + ((getSendScore() == null) ? 0 : getSendScore().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateManagerId() == null) ? 0 : getCreateManagerId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getHonor() == null) ? 0 : getHonor().hashCode());
        result = prime * result + ((getTheme() == null) ? 0 : getTheme().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getPostage() == null) ? 0 : getPostage().hashCode());
        result = prime * result + ((getDisplayPictures() == null) ? 0 : getDisplayPictures().hashCode());
        result = prime * result + ((getDetailPictures() == null) ? 0 : getDetailPictures().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getDetailedExplanation() == null) ? 0 : getDetailedExplanation().hashCode());
        result = prime * result + ((getGround() == null) ? 0 : getGround().hashCode());
        result = prime * result + ((getSalesVolume() == null) ? 0 : getSalesVolume().hashCode());
        result = prime * result + ((getGoodsSort() == null) ? 0 : getGoodsSort().hashCode());
        return result;
    }
}