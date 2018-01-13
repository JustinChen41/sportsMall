package com.jtchen.entity;

import java.util.Date;
public class Label{
	//id
	private String labelId;

	//标签名称
	private String labelName;
	
	//标签添加时间
	private Date labelDate;
	
	//标签添加时间戳
	private long dateTimestamp;

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public Date getLabelDate() {
		return labelDate;
	}

	public void setLabelDate(Date labelDate) {
		this.labelDate = labelDate;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}
}
