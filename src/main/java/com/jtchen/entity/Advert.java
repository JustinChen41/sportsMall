package com.jtchen.entity;

import java.util.Date;

/** 
 * 广告
 * @author 作者: jtchen
 * @version 创建时间：2017-4-17 下午4:27:36
 */
public class Advert{
	//id
	private String advertId;
	//广告标题
	private String advertTitle;

	//广告图
	private String advertImg;

	//今日江湖-轮播
	private String isNotice;

	//广告状态，notStart 未投放；starting 投放中；over 结束投放；preview 预览（部分用户有权限）
	private String advertState;

	//广告位置，todayNews 今日江湖-江湖速递，newsList 最新速递；helpList 最新求助；mpDetail 早报详情；newsDetail 速递详情；hotNews 热门速递
	private String advertPosition;

	//广告位置名称。今日江湖-江湖速递，最新速递，最新求助，早报详情，速递详情
	private String advertPositionName;

	//广告格式，picture图片形式，banner标题+图片形式
	private String advertType;

	//广告跳转类型，template 广告模板 link 网站链接
	private String advertLinkType;
	
	//跳转链接
	private String redirectUrl;
	
	//广告描述
	private String advertDescribe;
	
	//广告内容
	private String advertContent;
	
	//创建时间
	private Date createDate;
	
	//开始时间
	private Date startDate;
	
	//结束时间
	private Date endDate;

	//预览用户ID
	private String previewUserId;
	
	//展示次数
	private int showCount;
	
	//点击次数
	private int clickCount;
	
	//实际阅读数
	private int readCount;
	
	//显示阅读数
	private int showReadCount;

	//分享数
	private int shareCount;
	
	//分享阅读数
	private int shareReadCount;
	
	//投诉数量，使用触发器增加数量
	private int complainCount;
	
	//反馈数量，使用触发器增加数量
	private int feedbackCount;
	
	//是否删除
	private String isDelete;
	
	//删除时间
	private Date deleteDate;
	
	//删除人Id
	private String deleteUserId;
	
	//是否隐藏按钮，1为隐藏
	private String isHideButton;
	
	//网页版背景颜色编码
	private String bgColor;
	
	//显示在轮播的第几个
	private String carouselNum;

	//发布人
	private Nbuser user;

	public String getAdvertId() {
		return advertId;
	}

	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

	public String getAdvertTitle() {
		return advertTitle;
	}

	public void setAdvertTitle(String advertTitle) {
		this.advertTitle = advertTitle;
	}

	public String getAdvertImg() {
		return advertImg;
	}

	public void setAdvertImg(String advertImg) {
		this.advertImg = advertImg;
	}

	public String getIsNotice() {
		return isNotice;
	}

	public void setIsNotice(String isNotice) {
		this.isNotice = isNotice;
	}

	public String getAdvertState() {
		return advertState;
	}

	public void setAdvertState(String advertState) {
		this.advertState = advertState;
	}

	public String getAdvertPosition() {
		return advertPosition;
	}

	public void setAdvertPosition(String advertPosition) {
		this.advertPosition = advertPosition;
	}

	public String getAdvertPositionName() {
		return advertPositionName;
	}

	public void setAdvertPositionName(String advertPositionName) {
		this.advertPositionName = advertPositionName;
	}

	public String getAdvertType() {
		return advertType;
	}

	public void setAdvertType(String advertType) {
		this.advertType = advertType;
	}

	public String getAdvertLinkType() {
		return advertLinkType;
	}

	public void setAdvertLinkType(String advertLinkType) {
		this.advertLinkType = advertLinkType;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getAdvertDescribe() {
		return advertDescribe;
	}

	public void setAdvertDescribe(String advertDescribe) {
		this.advertDescribe = advertDescribe;
	}

	public String getAdvertContent() {
		return advertContent;
	}

	public void setAdvertContent(String advertContent) {
		this.advertContent = advertContent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPreviewUserId() {
		return previewUserId;
	}

	public void setPreviewUserId(String previewUserId) {
		this.previewUserId = previewUserId;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

	public int getClickCount() {
		return clickCount;
	}

	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getShowReadCount() {
		return showReadCount;
	}

	public void setShowReadCount(int showReadCount) {
		this.showReadCount = showReadCount;
	}

	public int getShareCount() {
		return shareCount;
	}

	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}

	public int getShareReadCount() {
		return shareReadCount;
	}

	public void setShareReadCount(int shareReadCount) {
		this.shareReadCount = shareReadCount;
	}

	public int getComplainCount() {
		return complainCount;
	}

	public void setComplainCount(int complainCount) {
		this.complainCount = complainCount;
	}

	public int getFeedbackCount() {
		return feedbackCount;
	}

	public void setFeedbackCount(int feedbackCount) {
		this.feedbackCount = feedbackCount;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUserId() {
		return deleteUserId;
	}

	public void setDeleteUserId(String deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	public String getIsHideButton() {
		return isHideButton;
	}

	public void setIsHideButton(String isHideButton) {
		this.isHideButton = isHideButton;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getCarouselNum() {
		return carouselNum;
	}

	public void setCarouselNum(String carouselNum) {
		this.carouselNum = carouselNum;
	}

	public Nbuser getUser() {
		return user;
	}

	public void setUser(Nbuser user) {
		this.user = user;
	}
}
