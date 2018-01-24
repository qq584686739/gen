package com.example.gen.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    /**
     * 自增主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 密码
     *
     * @mbg.generated
     */
    private String password;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * 账户状态（0正常；1冻结；2过期）
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * 盐
     *
     * @mbg.generated
     */
    private String salt;

    /**
     * 头像
     *
     * @mbg.generated
     */
    private String icon;

    /**
     * 身份证号
     *
     * @mbg.generated
     */
    private String idCard;

    /**
     * 密保问题1
     *
     * @mbg.generated
     */
    private Integer securityQuestionOneId;

    /**
     * 密保问题1答案
     *
     * @mbg.generated
     */
    private String securityAnswerOne;

    /**
     * 密保问题2
     *
     * @mbg.generated
     */
    private Integer securityQuestionTwoId;

    /**
     * 密保问题2答案
     *
     * @mbg.generated
     */
    private String securityAnswerTwo;

    /**
     * 密保问题3
     *
     * @mbg.generated
     */
    private Integer securityQuestionThreeId;

    /**
     * 密保问题3答案
     *
     * @mbg.generated
     */
    private String securityAnswerThree;

    /**
     * 真实姓名
     *
     * @mbg.generated
     */
    private String realName;

    /**
     * 性别（0男；1女；2保密）
     *
     * @mbg.generated
     */
    private Integer sex;

    /**
     * 生日
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     * 星座
     *
     * @mbg.generated
     */
    private String constellation;

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
     * 用户等级
     *
     * @mbg.generated
     */
    private Integer grade;

    /**
     * 用户类型
     *
     * @mbg.generated
     */
    private String type;

    /**
     * 用户积分
     *
     * @mbg.generated
     */
    private Integer score;

    /**
     * 用户余额
     *
     * @mbg.generated
     */
    private BigDecimal balance;

    /**
     * 信用度
     *
     * @mbg.generated
     */
    private Integer credit;

    /**
     * 支付宝账号
     *
     * @mbg.generated
     */
    private String alipayNumber;

    /**
     * 微博账号
     *
     * @mbg.generated
     */
    private String microBlogNumber;

    /**
     * qq账号
     *
     * @mbg.generated
     */
    private String qqNumber;

    /**
     * 微信账号
     *
     * @mbg.generated
     */
    private String wechatNumber;

    /**
     * 人人账号
     *
     * @mbg.generated
     */
    private String renrenNumber;

    /**
     * 豆瓣账号
     *
     * @mbg.generated
     */
    private String doubanNumber;

    /**
     * 个人空间
     *
     * @mbg.generated
     */
    private String personalSpace;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getSecurityQuestionOneId() {
        return securityQuestionOneId;
    }

    public void setSecurityQuestionOneId(Integer securityQuestionOneId) {
        this.securityQuestionOneId = securityQuestionOneId;
    }

    public String getSecurityAnswerOne() {
        return securityAnswerOne;
    }

    public void setSecurityAnswerOne(String securityAnswerOne) {
        this.securityAnswerOne = securityAnswerOne;
    }

    public Integer getSecurityQuestionTwoId() {
        return securityQuestionTwoId;
    }

    public void setSecurityQuestionTwoId(Integer securityQuestionTwoId) {
        this.securityQuestionTwoId = securityQuestionTwoId;
    }

    public String getSecurityAnswerTwo() {
        return securityAnswerTwo;
    }

    public void setSecurityAnswerTwo(String securityAnswerTwo) {
        this.securityAnswerTwo = securityAnswerTwo;
    }

    public Integer getSecurityQuestionThreeId() {
        return securityQuestionThreeId;
    }

    public void setSecurityQuestionThreeId(Integer securityQuestionThreeId) {
        this.securityQuestionThreeId = securityQuestionThreeId;
    }

    public String getSecurityAnswerThree() {
        return securityAnswerThree;
    }

    public void setSecurityAnswerThree(String securityAnswerThree) {
        this.securityAnswerThree = securityAnswerThree;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getAlipayNumber() {
        return alipayNumber;
    }

    public void setAlipayNumber(String alipayNumber) {
        this.alipayNumber = alipayNumber;
    }

    public String getMicroBlogNumber() {
        return microBlogNumber;
    }

    public void setMicroBlogNumber(String microBlogNumber) {
        this.microBlogNumber = microBlogNumber;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    public String getRenrenNumber() {
        return renrenNumber;
    }

    public void setRenrenNumber(String renrenNumber) {
        this.renrenNumber = renrenNumber;
    }

    public String getDoubanNumber() {
        return doubanNumber;
    }

    public void setDoubanNumber(String doubanNumber) {
        this.doubanNumber = doubanNumber;
    }

    public String getPersonalSpace() {
        return personalSpace;
    }

    public void setPersonalSpace(String personalSpace) {
        this.personalSpace = personalSpace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", state=").append(state);
        sb.append(", salt=").append(salt);
        sb.append(", icon=").append(icon);
        sb.append(", idCard=").append(idCard);
        sb.append(", securityQuestionOneId=").append(securityQuestionOneId);
        sb.append(", securityAnswerOne=").append(securityAnswerOne);
        sb.append(", securityQuestionTwoId=").append(securityQuestionTwoId);
        sb.append(", securityAnswerTwo=").append(securityAnswerTwo);
        sb.append(", securityQuestionThreeId=").append(securityQuestionThreeId);
        sb.append(", securityAnswerThree=").append(securityAnswerThree);
        sb.append(", realName=").append(realName);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", constellation=").append(constellation);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", grade=").append(grade);
        sb.append(", type=").append(type);
        sb.append(", score=").append(score);
        sb.append(", balance=").append(balance);
        sb.append(", credit=").append(credit);
        sb.append(", alipayNumber=").append(alipayNumber);
        sb.append(", microBlogNumber=").append(microBlogNumber);
        sb.append(", qqNumber=").append(qqNumber);
        sb.append(", wechatNumber=").append(wechatNumber);
        sb.append(", renrenNumber=").append(renrenNumber);
        sb.append(", doubanNumber=").append(doubanNumber);
        sb.append(", personalSpace=").append(personalSpace);
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getSecurityQuestionOneId() == null ? other.getSecurityQuestionOneId() == null : this.getSecurityQuestionOneId().equals(other.getSecurityQuestionOneId()))
            && (this.getSecurityAnswerOne() == null ? other.getSecurityAnswerOne() == null : this.getSecurityAnswerOne().equals(other.getSecurityAnswerOne()))
            && (this.getSecurityQuestionTwoId() == null ? other.getSecurityQuestionTwoId() == null : this.getSecurityQuestionTwoId().equals(other.getSecurityQuestionTwoId()))
            && (this.getSecurityAnswerTwo() == null ? other.getSecurityAnswerTwo() == null : this.getSecurityAnswerTwo().equals(other.getSecurityAnswerTwo()))
            && (this.getSecurityQuestionThreeId() == null ? other.getSecurityQuestionThreeId() == null : this.getSecurityQuestionThreeId().equals(other.getSecurityQuestionThreeId()))
            && (this.getSecurityAnswerThree() == null ? other.getSecurityAnswerThree() == null : this.getSecurityAnswerThree().equals(other.getSecurityAnswerThree()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getConstellation() == null ? other.getConstellation() == null : this.getConstellation().equals(other.getConstellation()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getAlipayNumber() == null ? other.getAlipayNumber() == null : this.getAlipayNumber().equals(other.getAlipayNumber()))
            && (this.getMicroBlogNumber() == null ? other.getMicroBlogNumber() == null : this.getMicroBlogNumber().equals(other.getMicroBlogNumber()))
            && (this.getQqNumber() == null ? other.getQqNumber() == null : this.getQqNumber().equals(other.getQqNumber()))
            && (this.getWechatNumber() == null ? other.getWechatNumber() == null : this.getWechatNumber().equals(other.getWechatNumber()))
            && (this.getRenrenNumber() == null ? other.getRenrenNumber() == null : this.getRenrenNumber().equals(other.getRenrenNumber()))
            && (this.getDoubanNumber() == null ? other.getDoubanNumber() == null : this.getDoubanNumber().equals(other.getDoubanNumber()))
            && (this.getPersonalSpace() == null ? other.getPersonalSpace() == null : this.getPersonalSpace().equals(other.getPersonalSpace()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getSecurityQuestionOneId() == null) ? 0 : getSecurityQuestionOneId().hashCode());
        result = prime * result + ((getSecurityAnswerOne() == null) ? 0 : getSecurityAnswerOne().hashCode());
        result = prime * result + ((getSecurityQuestionTwoId() == null) ? 0 : getSecurityQuestionTwoId().hashCode());
        result = prime * result + ((getSecurityAnswerTwo() == null) ? 0 : getSecurityAnswerTwo().hashCode());
        result = prime * result + ((getSecurityQuestionThreeId() == null) ? 0 : getSecurityQuestionThreeId().hashCode());
        result = prime * result + ((getSecurityAnswerThree() == null) ? 0 : getSecurityAnswerThree().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getConstellation() == null) ? 0 : getConstellation().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getAlipayNumber() == null) ? 0 : getAlipayNumber().hashCode());
        result = prime * result + ((getMicroBlogNumber() == null) ? 0 : getMicroBlogNumber().hashCode());
        result = prime * result + ((getQqNumber() == null) ? 0 : getQqNumber().hashCode());
        result = prime * result + ((getWechatNumber() == null) ? 0 : getWechatNumber().hashCode());
        result = prime * result + ((getRenrenNumber() == null) ? 0 : getRenrenNumber().hashCode());
        result = prime * result + ((getDoubanNumber() == null) ? 0 : getDoubanNumber().hashCode());
        result = prime * result + ((getPersonalSpace() == null) ? 0 : getPersonalSpace().hashCode());
        return result;
    }
}