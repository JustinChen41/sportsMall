package com.jtchen.entity;

import java.util.Date;

/**
 * 江湖通知
 * @author 陈键霆
 *
 */
public class Notice {
	//id
	private String noticeId;
	
	//通知标题
	private String noticeTitle;
	
	//通知发布日期
	private Date noticeDate;
	
	//通知操作日期时间戳
	private long dateTimestamp;
	
	//通知简介
	private String noticeOutline;
	
	//通知内容
	private String noticeContent;
	
	//通知封面
	private String noticeCover;
	
	//是否首页轮播
	private String isBanner;
	
	//通知编号
	private int noticeNum;
	
	//阅读量
	private int readCount;

	//userId
	private Nbuser user;
	
	//是否首页轮播
	private String bgColor;

	public String getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getNoticeOutline() {
		return noticeOutline;
	}

	public void setNoticeOutline(String noticeOutline) {
		this.noticeOutline = noticeOutline;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeCover() {
		return noticeCover;
	}

	public void setNoticeCover(String noticeCover) {
		this.noticeCover = noticeCover;
	}

	public String getIsBanner() {
		return isBanner;
	}

	public void setIsBanner(String isBanner) {
		this.isBanner = isBanner;
	}

	public int getNoticeNum() {
		return noticeNum;
	}

	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Nbuser getUser() {
		return user;
	}

	public void setUser(Nbuser user) {
		this.user = user;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}
}
