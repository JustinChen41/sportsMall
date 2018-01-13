package com.jtchen.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 系统管理模块-用户实体对象
 * @author chenjianting
 */
public class Nbuser{
    //id
    private String userId;
    
    //账号
    private String account;
    
    //用户名
    private String userName;
    
    //密码
    private String password;
    
    //超级用户
    private String issuper;
    
    //电话
    private String phone;
    
    //头像
    private String portrait;
    
    //注册时间
    private Date registerDate;
    
    //填写邀请码时间
    private Date receivedCodeDate;
    
    //注册时间戳
    private long dateTimestamp;
    
   //真实姓名
    private String trueName;
    
    //性别
    private int sex;
    
    //生日
    private String birthday;
    
    //所在地
    private String location;
    
    //公司
    private String company;

    //职务
    private String job;

    //身份证号
    private String card;
    
    //描述
    private String description;

    //是否为联合发起人
    private String isOriginator;
    
    //是否认证，0为审核不通过，1为审核通过，2为待审核
    private String isAuthentication;

    //用户积分余额
	private BigDecimal points;
    
    //积分称谓
    private String appellation;
    
    //城市
    private String city;

    //公众号运营人标记
	private String platformId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIssuper() {
        return issuper;
    }

    public void setIssuper(String issuper) {
        this.issuper = issuper;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getReceivedCodeDate() {
        return receivedCodeDate;
    }

    public void setReceivedCodeDate(Date receivedCodeDate) {
        this.receivedCodeDate = receivedCodeDate;
    }

    public long getDateTimestamp() {
        return dateTimestamp;
    }

    public void setDateTimestamp(long dateTimestamp) {
        this.dateTimestamp = dateTimestamp;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsOriginator() {
        return isOriginator;
    }

    public void setIsOriginator(String isOriginator) {
        this.isOriginator = isOriginator;
    }

    public String getIsAuthentication() {
        return isAuthentication;
    }

    public void setIsAuthentication(String isAuthentication) {
        this.isAuthentication = isAuthentication;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }
}