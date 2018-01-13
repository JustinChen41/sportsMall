package com.jtchen.entity;

import java.util.Date;
/**
 * 求助类
 * @author chenjianting
 *
 */
public class Help{
	//id
	private String helpId;
	//求助名称
	public String helpTitle;
	
	//求助时间
	public Date helpDate;
	
	//求助发布时间的时间戳
	public long dateTimestamp;
	
	//求助内容
	public String helpContent;
	
	//邀请回答个数
	public int inviteCount;
	
	//阅读量
	public int readCount;
	
	//阅读量
	public int webReadCount;
	
	//回复数
	public String replyCount;
	
	//最后回复时间
	public Date replyTime;
	
	//是否首页显示
	public String isIndex;
	
	//是否热门
	public String isHot;

	public Nbuser user;
	
	//求助标签
	public String helpLabels;
	
	//求助人帐号
	public String account;
	
	//求助图片地址
	public String imgUrls;
	
	//求助人昵称
	public String userName;
	
	//求助是否收藏
	public String userIsCollect;

	public String getHelpId() {
		return helpId;
	}

	public void setHelpId(String helpId) {
		this.helpId = helpId;
	}

	public String getHelpTitle() {
		return helpTitle;
	}

	public void setHelpTitle(String helpTitle) {
		this.helpTitle = helpTitle;
	}

	public Date getHelpDate() {
		return helpDate;
	}

	public void setHelpDate(Date helpDate) {
		this.helpDate = helpDate;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getHelpContent() {
		return helpContent;
	}

	public void setHelpContent(String helpContent) {
		this.helpContent = helpContent;
	}

	public int getInviteCount() {
		return inviteCount;
	}

	public void setInviteCount(int inviteCount) {
		this.inviteCount = inviteCount;
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

	public String getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(String replyCount) {
		this.replyCount = replyCount;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public String getIsIndex() {
		return isIndex;
	}

	public void setIsIndex(String isIndex) {
		this.isIndex = isIndex;
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

	public String getHelpLabels() {
		return helpLabels;
	}

	public void setHelpLabels(String helpLabels) {
		this.helpLabels = helpLabels;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(String imgUrls) {
		this.imgUrls = imgUrls;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserIsCollect() {
		return userIsCollect;
	}

	public void setUserIsCollect(String userIsCollect) {
		this.userIsCollect = userIsCollect;
	}
}
