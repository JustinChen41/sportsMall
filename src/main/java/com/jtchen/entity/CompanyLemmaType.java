package com.jtchen.entity;

public class CompanyLemmaType{
	//类型id
	private String lemmaTypeId;

	//类别名称
	private String name;
	
	//类型名称
	private String typeName;
	
	//类别id
	private String typeId;
	
	//排序编号
	private int orderNum;

	public String getLemmaTypeId() {
		return lemmaTypeId;
	}

	public void setLemmaTypeId(String lemmaTypeId) {
		this.lemmaTypeId = lemmaTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
}
