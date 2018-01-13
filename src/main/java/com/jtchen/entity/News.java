package com.jtchen.entity;

import java.util.Date;
/**
 * 资讯速递表
 * @author chenjianting
 *
 */
public class News {
	//id
	private String newsId;
	
	//新闻标题
	private String newsTitle;
	
	//新闻发布日期
	private Date newsDate;
	
	//新闻操作日期时间戳
	private long dateTimestamp;
	
	//新闻内容
	private String newsContent;
	
	//新闻内容
	private String newsHtmlContent;
	
	//是否发布
	private String isSubmit;
	
	//是否置顶
	private boolean isTop;
	
	//是否精华
	private boolean isEssence;
	
	//供需
	private String supplyOrDemand;
	
	//是否首页显示
	private String isIndex;
	
	//阅读量
	private int readCount;
	
	//网页阅读量
	private int webReadCount;
	
	//网页阅读量
	private int webReadCount2;

	//是否热门
	private String isHot;

	//userId
	private Nbuser user;
	
	//areaId
	private Area area;
	
	//删除标记
	private String isdelete;
	
	//速递图片地址
	private String imgUrls;
	
	//速递标签
	private String newsLabels;
	
	//速递标签ID
	private String newsLabelsId;
	
	//速递标签发布人帐号
	private String account;
	
	//速递标签发布人头像
	private String portrait;
	
	//速递标签发布人是否认证
	private String isAuthentication;
	
	//速递版块名称
	private String areaName;
	
	//发布人姓名
	private String userName;
	
	//删除人ID
	private String deleteUserId;
	
	//删除时间
	private Date deleteDate;
	
	//是否为公众平台发布
	private String isprivate;
	
	//是否审核通过
	private String isPass;
	
	//公众号Id
	private String platformId;
	
	//公众号名称
	private String platformName;
	
	//公众号头像
	private String platformPortrait;
	
	//是否公众号置顶
	private boolean isPlatformTop;
	
	//是否公众号精华
	private boolean isPlatformEssence;
	
	//公众号是否关闭
	private String isPlatformClose;

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getNewsHtmlContent() {
		return newsHtmlContent;
	}

	public void setNewsHtmlContent(String newsHtmlContent) {
		this.newsHtmlContent = newsHtmlContent;
	}

	public String getIsSubmit() {
		return isSubmit;
	}

	public void setIsSubmit(String isSubmit) {
		this.isSubmit = isSubmit;
	}

	public boolean isTop() {
		return isTop;
	}

	public void setTop(boolean top) {
		isTop = top;
	}

	public boolean isEssence() {
		return isEssence;
	}

	public void setEssence(boolean essence) {
		isEssence = essence;
	}

	public String getSupplyOrDemand() {
		return supplyOrDemand;
	}

	public void setSupplyOrDemand(String supplyOrDemand) {
		this.supplyOrDemand = supplyOrDemand;
	}

	public String getIsIndex() {
		return isIndex;
	}

	public void setIsIndex(String isIndex) {
		this.isIndex = isIndex;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getWebReadCount() {
		return webReadCount;
	}

	public void setWebReadCount(int webReadCount) {
		this.webReadCount = webReadCount;
	}

	public int getWebReadCount2() {
		return webReadCount2;
	}

	public void setWebReadCount2(int webReadCount2) {
		this.webReadCount2 = webReadCount2;
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}

	public Nbuser getUser() {
		return user;
	}

	public void setUser(Nbuser user) {
		this.user = user;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}

	public String getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(String imgUrls) {
		this.imgUrls = imgUrls;
	}

	public String getNewsLabels() {
		return newsLabels;
	}

	public void setNewsLabels(String newsLabels) {
		this.newsLabels = newsLabels;
	}

	public String getNewsLabelsId() {
		return newsLabelsId;
	}

	public void setNewsLabelsId(String newsLabelsId) {
		this.newsLabelsId = newsLabelsId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getIsAuthentication() {
		return isAuthentication;
	}

	public void setIsAuthentication(String isAuthentication) {
		this.isAuthentication = isAuthentication;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeleteUserId() {
		return deleteUserId;
	}

	public void setDeleteUserId(String deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getIsprivate() {
		return isprivate;
	}

	public void setIsprivate(String isprivate) {
		this.isprivate = isprivate;
	}

	public String getIsPass() {
		return isPass;
	}

	public void setIsPass(String isPass) {
		this.isPass = isPass;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformPortrait() {
		return platformPortrait;
	}

	public void setPlatformPortrait(String platformPortrait) {
		this.platformPortrait = platformPortrait;
	}

	public boolean isPlatformTop() {
		return isPlatformTop;
	}

	public void setPlatformTop(boolean platformTop) {
		isPlatformTop = platformTop;
	}

	public boolean isPlatformEssence() {
		return isPlatformEssence;
	}

	public void setPlatformEssence(boolean platformEssence) {
		isPlatformEssence = platformEssence;
	}

	public String getIsPlatformClose() {
		return isPlatformClose;
	}

	public void setIsPlatformClose(String isPlatformClose) {
		this.isPlatformClose = isPlatformClose;
	}
}
