package com.jtchen.entity;

/**
 * 企业词条表
 * Created by jtchen on 2017/11/21.
 */
public class CompanyLemma {
    //id
    private String companyId;

    //企业词条logo
    private String logo;

    //是否认证，默认为否，认证不通过为1，认证通过为2
    private String isAuth;

    //企业词条内容
    private String companyIntro;

    //企业名称
    private String companyName;

    //行业Id
    private String companyIndustryId;

    //规模Id
    private String companyScaleId;

    //企业类型Id
    private String companyTypeId;

    //所属行业
    private String companyIndustryName;

    //公司规模
    private String companyScaleName;

    //公司类型
    private String companyTypeName;

    //所在地
    private String companyAddress;

    //创立时间
    private String companyTime;

    //企业地址
    private String companyAddressDetail;

    //邮箱
    private String companyEmail;

    //区号
    private String companyCode;

    //电话
    private String companyPhone;

    //网址
    private String companyInternet;

    //主营业务
    private String companyBusiness;

    //
    private String companySpecificIndustry;

    //阅读数
    private int readCount;

    //分享数
    private int shareCount;

    //企查查代码
    private String qccNumber;

    //词条发布人
    private String lemmaUserId;

    //首字母查询用
    private String firstName;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(String isAuth) {
        this.isAuth = isAuth;
    }

    public String getCompanyIntro() {
        return companyIntro;
    }

    public void setCompanyIntro(String companyIntro) {
        this.companyIntro = companyIntro;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyIndustryId() {
        return companyIndustryId;
    }

    public void setCompanyIndustryId(String companyIndustryId) {
        this.companyIndustryId = companyIndustryId;
    }

    public String getCompanyScaleId() {
        return companyScaleId;
    }

    public void setCompanyScaleId(String companyScaleId) {
        this.companyScaleId = companyScaleId;
    }

    public String getCompanyTypeId() {
        return companyTypeId;
    }

    public void setCompanyTypeId(String companyTypeId) {
        this.companyTypeId = companyTypeId;
    }

    public String getCompanyIndustryName() {
        return companyIndustryName;
    }

    public void setCompanyIndustryName(String companyIndustryName) {
        this.companyIndustryName = companyIndustryName;
    }

    public String getCompanyScaleName() {
        return companyScaleName;
    }

    public void setCompanyScaleName(String companyScaleName) {
        this.companyScaleName = companyScaleName;
    }

    public String getCompanyTypeName() {
        return companyTypeName;
    }

    public void setCompanyTypeName(String companyTypeName) {
        this.companyTypeName = companyTypeName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyTime() {
        return companyTime;
    }

    public void setCompanyTime(String companyTime) {
        this.companyTime = companyTime;
    }

    public String getCompanyAddressDetail() {
        return companyAddressDetail;
    }

    public void setCompanyAddressDetail(String companyAddressDetail) {
        this.companyAddressDetail = companyAddressDetail;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyInternet() {
        return companyInternet;
    }

    public void setCompanyInternet(String companyInternet) {
        this.companyInternet = companyInternet;
    }

    public String getCompanyBusiness() {
        return companyBusiness;
    }

    public void setCompanyBusiness(String companyBusiness) {
        this.companyBusiness = companyBusiness;
    }

    public String getCompanySpecificIndustry() {
        return companySpecificIndustry;
    }

    public void setCompanySpecificIndustry(String companySpecificIndustry) {
        this.companySpecificIndustry = companySpecificIndustry;
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

    public String getQccNumber() {
        return qccNumber;
    }

    public void setQccNumber(String qccNumber) {
        this.qccNumber = qccNumber;
    }

    public String getLemmaUserId() {
        return lemmaUserId;
    }

    public void setLemmaUserId(String lemmaUserId) {
        this.lemmaUserId = lemmaUserId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
