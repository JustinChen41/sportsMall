package com.jtchen.entity;

import java.util.Date;
/**
 * 词条修改记录类
 * @author chenjianting
 *
 */
public class LemmaModifyLog {
	//id
	private String lemmaModifyId;
	
	//记录类型，添加或修改
	private String logType;
	
	//记录修改原因
	private String modifyReason;
	
	//记录修改原因说明
	private String modifyExplain;
	
	//操作时间
	private Date modifyDate;
	
	//操作时间的时间戳
	private long dateTimestamp;
	
	//修改词条内容
	private String modifyContent;
	
	//修改词条内容
	private String modifyHtmlContent;
	
	//是否提交
	private String isSubmit;
	
	//是否审核通过
	private String isPass;
	
	//审核时间
	private Date verifyDate;
	
	//未通过原因
	private String notPassReason;
	
	//建议
	private String suggest;
	
	//用户Id
	private String userId;
	
	//词条Id
	private String lemmaId;
	
	//临时分类Id，更改词条且审核未通过时保存分类用
	private String tempCategoryId;

	public String getLemmaModifyId() {
		return lemmaModifyId;
	}

	public void setLemmaModifyId(String lemmaModifyId) {
		this.lemmaModifyId = lemmaModifyId;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getModifyReason() {
		return modifyReason;
	}

	public void setModifyReason(String modifyReason) {
		this.modifyReason = modifyReason;
	}

	public String getModifyExplain() {
		return modifyExplain;
	}

	public void setModifyExplain(String modifyExplain) {
		this.modifyExplain = modifyExplain;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getModifyContent() {
		return modifyContent;
	}

	public void setModifyContent(String modifyContent) {
		this.modifyContent = modifyContent;
	}

	public String getModifyHtmlContent() {
		return modifyHtmlContent;
	}

	public void setModifyHtmlContent(String modifyHtmlContent) {
		this.modifyHtmlContent = modifyHtmlContent;
	}

	public String getIsSubmit() {
		return isSubmit;
	}

	public void setIsSubmit(String isSubmit) {
		this.isSubmit = isSubmit;
	}

	public String getIsPass() {
		return isPass;
	}

	public void setIsPass(String isPass) {
		this.isPass = isPass;
	}

	public Date getVerifyDate() {
		return verifyDate;
	}

	public void setVerifyDate(Date verifyDate) {
		this.verifyDate = verifyDate;
	}

	public String getNotPassReason() {
		return notPassReason;
	}

	public void setNotPassReason(String notPassReason) {
		this.notPassReason = notPassReason;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLemmaId() {
		return lemmaId;
	}

	public void setLemmaId(String lemmaId) {
		this.lemmaId = lemmaId;
	}

	public String getTempCategoryId() {
		return tempCategoryId;
	}

	public void setTempCategoryId(String tempCategoryId) {
		this.tempCategoryId = tempCategoryId;
	}
}
