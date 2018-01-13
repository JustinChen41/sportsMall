package com.jtchen.entity;

import java.util.Date;

/**
 * 回复类
 * @author chenjianting
 *
 */
public class Reply{
	//id
	private String replyId;

	//留言时间
	private Date replyTime;
	
	//回复内容
	private String replyContent;
	
	//留言时间的时间戳
	private long dateTimestamp;
	
	//回复类别
	private String replyType;

	//新闻速递Id")
	private String newsId;
	
	//求助Id
	private String helpId;
	
	//父ID，表示二级回复
	private String parentId;
	
	//回复某人对应的用户Id，二级回复再被回复时，回复内容只表示回复某人不增加层级
	private String replyUserId;

	//userId
	private Nbuser user;
	
	//是否匿名
	private String isUnknown;
	
	//回复人是否匿名
	private String replyUserIsUnknown;
	
	//是否公众号回复
	private String isPlatform;
	
	//回复人是否为公众号
	private String replyUserIsPlatform;
	
	//被回复的回复对应的ID
	private String answeredId;

	public String getReplyId() {
		return replyId;
	}

	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getReplyType() {
		return replyType;
	}

	public void setReplyType(String replyType) {
		this.replyType = replyType;
	}

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getHelpId() {
		return helpId;
	}

	public void setHelpId(String helpId) {
		this.helpId = helpId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getReplyUserId() {
		return replyUserId;
	}

	public void setReplyUserId(String replyUserId) {
		this.replyUserId = replyUserId;
	}

	public Nbuser getUser() {
		return user;
	}

	public void setUser(Nbuser user) {
		this.user = user;
	}

	public String getIsUnknown() {
		return isUnknown;
	}

	public void setIsUnknown(String isUnknown) {
		this.isUnknown = isUnknown;
	}

	public String getReplyUserIsUnknown() {
		return replyUserIsUnknown;
	}

	public void setReplyUserIsUnknown(String replyUserIsUnknown) {
		this.replyUserIsUnknown = replyUserIsUnknown;
	}

	public String getIsPlatform() {
		return isPlatform;
	}

	public void setIsPlatform(String isPlatform) {
		this.isPlatform = isPlatform;
	}

	public String getReplyUserIsPlatform() {
		return replyUserIsPlatform;
	}

	public void setReplyUserIsPlatform(String replyUserIsPlatform) {
		this.replyUserIsPlatform = replyUserIsPlatform;
	}

	public String getAnsweredId() {
		return answeredId;
	}

	public void setAnsweredId(String answeredId) {
		this.answeredId = answeredId;
	}
}
