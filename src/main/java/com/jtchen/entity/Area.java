package com.jtchen.entity;
/**
 * 新闻速递区域类
 * @author chenjianting
 *
 */
public class Area{
	//id
	private String areaId;
	//区域名称
	private String areaName;

	//区域编号
	private int areaNo;

	//区域图标
	private String areaLogo;

	private long dateTimestamp;

	//区域简介
	private String areaOutline;

	//区域是否选择标签
	private String isHaveLabel;

	//区域是否为供需板块
	private String isSupply;

	//区域提示
	private String areaTip;

	//区域板块是否删除
	private String isDelete;

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getAreaNo() {
		return areaNo;
	}

	public void setAreaNo(int areaNo) {
		this.areaNo = areaNo;
	}

	public String getAreaLogo() {
		return areaLogo;
	}

	public void setAreaLogo(String areaLogo) {
		this.areaLogo = areaLogo;
	}

	public long getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getAreaOutline() {
		return areaOutline;
	}

	public void setAreaOutline(String areaOutline) {
		this.areaOutline = areaOutline;
	}

	public String getIsHaveLabel() {
		return isHaveLabel;
	}

	public void setIsHaveLabel(String isHaveLabel) {
		this.isHaveLabel = isHaveLabel;
	}

	public String getIsSupply() {
		return isSupply;
	}

	public void setIsSupply(String isSupply) {
		this.isSupply = isSupply;
	}

	public String getAreaTip() {
		return areaTip;
	}

	public void setAreaTip(String areaTip) {
		this.areaTip = areaTip;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
}
