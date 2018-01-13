package com.jtchen.entity;

import java.util.Date;

public class Platform {
	//id
	private String platformId;

	//公众号唯一标识ID
	private String uniqueId;
	
	//企业名称
	private String companyName;
	
	//对应词条
	private String companyId;
    
	//对应等级
	private String levelId;
	
	//平台名称
	private String platformName;
	
	//平台介绍
	private String platformDescription;
	
	//平台头像
	private String platformPortrait;
	
	//平台联系邮箱
	private String platformEmail;
	
	//平台类型，商铺/企业号
	private String platformType;
	
	//是否审核通过
	private String isPass;
	
	//是否开放审核
	private String isOpenVerify;
	
	//平台创建时间
	private Date createDate;
	
	//创建时间时间戳
	private long dateTimestamp;
	
	//是否关闭
	private String isClose;
	
	//是否付款
	private String isPayment;
	
	//付款时间
	private Date paymentDate;
	
	//待付款时间
	private Date waitPaymentDate;

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getLevelId() {
		return levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformDescription() {
		return platformDescription;
	}

	public void setPlatformDescription(String platformDescription) {
		this.platformDescription = platformDescription;
	}

	public String getPlatformPortrait() {
		return platformPortrait;
	}

	public void setPlatformPortrait(String platformPortrait) {
		this.platformPortrait = platformPortrait;
	}

	public String getPlatformEmail() {
		return platformEmail;
	}

	public void setPlatformEmail(String platformEmail) {
		this.platformEmail = platformEmail;
	}

	public String getPlatformType() {
		return platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getIsPass() {
		return isPass;
	}

	public void setIsPass(String isPass) {
		this.isPass = isPass;
	}

	public String getIsOpenVerify() {
		return isOpenVerify;
	}

	public void setIsOpenVerify(String isOpenVerify) {
		this.isOpenVerify = isOpenVerify;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getIsClose() {
		return isClose;
	}

	public void setIsClose(String isClose) {
		this.isClose = isClose;
	}

	public String getIsPayment() {
		return isPayment;
	}

	public void setIsPayment(String isPayment) {
		this.isPayment = isPayment;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Date getWaitPaymentDate() {
		return waitPaymentDate;
	}

	public void setWaitPaymentDate(Date waitPaymentDate) {
		this.waitPaymentDate = waitPaymentDate;
	}
}
