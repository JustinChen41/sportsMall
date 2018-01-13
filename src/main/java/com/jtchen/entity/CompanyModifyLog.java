package com.jtchen.entity;

import java.util.Date;

/**
 * 企业词条审核记录
 * Created by jtchen on 2017/11/21.
 */
public class CompanyModifyLog {
    //id
    private String companyModifyId;

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

    //企业词条Id
    private String companyLemmaId;

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

    //是否删除logo
    public String isDeleteLogo;

    public String getCompanyModifyId() {
        return companyModifyId;
    }

    public void setCompanyModifyId(String companyModifyId) {
        this.companyModifyId = companyModifyId;
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

    public String getCompanyLemmaId() {
        return companyLemmaId;
    }

    public void setCompanyLemmaId(String companyLemmaId) {
        this.companyLemmaId = companyLemmaId;
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

    public String getIsDeleteLogo() {
        return isDeleteLogo;
    }

    public void setIsDeleteLogo(String isDeleteLogo) {
        this.isDeleteLogo = isDeleteLogo;
    }
}
