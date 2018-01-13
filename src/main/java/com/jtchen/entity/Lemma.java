package com.jtchen.entity;

/**
 * 百科词条类
 * @author chenjianting
 *
 */
public class Lemma{
	//id
	private String lemmaId;

	//词条名称
	private String lemmaName;
	
	//词条内容
	private String lemmaContent;

	//词条分类
	private LemmaCategory categroy;
	
	//是否首页显示
	private String isIndex;
	
	//首字母查询用
	private String firstName;
	
	//是否热门
	private String isHot;
	
	//是否首页显示
	private String isTop;
	
	//词条发布人
	private String lemmaUserId;

	//阅读数
	private int readCount;
	
	//分享数
	private int shareCount;

	public String getLemmaId() {
		return lemmaId;
	}

	public void setLemmaId(String lemmaId) {
		this.lemmaId = lemmaId;
	}

	public String getLemmaName() {
		return lemmaName;
	}

	public void setLemmaName(String lemmaName) {
		this.lemmaName = lemmaName;
	}

	public String getLemmaContent() {
		return lemmaContent;
	}

	public void setLemmaContent(String lemmaContent) {
		this.lemmaContent = lemmaContent;
	}

	public LemmaCategory getCategroy() {
		return categroy;
	}

	public void setCategroy(LemmaCategory categroy) {
		this.categroy = categroy;
	}

	public String getIsIndex() {
		return isIndex;
	}

	public void setIsIndex(String isIndex) {
		this.isIndex = isIndex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}

	public String getIsTop() {
		return isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	public String getLemmaUserId() {
		return lemmaUserId;
	}

	public void setLemmaUserId(String lemmaUserId) {
		this.lemmaUserId = lemmaUserId;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getShareCount() {
		return shareCount;
	}

	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
}
