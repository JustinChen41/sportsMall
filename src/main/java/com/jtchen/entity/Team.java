package com.jtchen.entity;

import java.util.Date;

/**
 * 球队类
 * @author jtchen0401@163.com
 * @date 2018/1/14 20:38
 */
public class Team {
    // 主键ID
    private Integer teamId;
    //球队中文名称
    private String teamChineseName;
    //球队英文名称
    private String teamEnglishName;
    //球队地址
    private String teamAddress;
    //球队老板
    private String teamBoss;
    //球队教练
    private String teamCoach;
    //球队介绍
    private String teamDescription;
    //所属赛事
    private String teamAssociation;
    //主场名称
    private String teamHomeCourt;
    //创建时间
    private String teamFoundTime;
    //主要荣誉
    private String teamHonor;
    //球队wiki地址
    private String teamWikiUrl;
    //球队logo
    private String teamLogo;
    // 权重，越大越排前显示
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date lastEditTime;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamChineseName() {
        return teamChineseName;
    }

    public void setTeamChineseName(String teamChineseName) {
        this.teamChineseName = teamChineseName;
    }

    public String getTeamEnglishName() {
        return teamEnglishName;
    }

    public void setTeamEnglishName(String teamEnglishName) {
        this.teamEnglishName = teamEnglishName;
    }

    public String getTeamAddress() {
        return teamAddress;
    }

    public void setTeamAddress(String teamAddress) {
        this.teamAddress = teamAddress;
    }

    public String getTeamBoss() {
        return teamBoss;
    }

    public void setTeamBoss(String teamBoss) {
        this.teamBoss = teamBoss;
    }

    public String getTeamCoach() {
        return teamCoach;
    }

    public void setTeamCoach(String teamCoach) {
        this.teamCoach = teamCoach;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public void setTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
    }

    public String getTeamAssociation() {
        return teamAssociation;
    }

    public void setTeamAssociation(String teamAssociation) {
        this.teamAssociation = teamAssociation;
    }

    public String getTeamHomeCourt() {
        return teamHomeCourt;
    }

    public void setTeamHomeCourt(String teamHomeCourt) {
        this.teamHomeCourt = teamHomeCourt;
    }

    public String getTeamFoundTime() {
        return teamFoundTime;
    }

    public void setTeamFoundTime(String teamFoundTime) {
        this.teamFoundTime = teamFoundTime;
    }

    public String getTeamHonor() {
        return teamHonor;
    }

    public void setTeamHonor(String teamHonor) {
        this.teamHonor = teamHonor;
    }

    public String getTeamWikiUrl() {
        return teamWikiUrl;
    }

    public void setTeamWikiUrl(String teamWikiUrl) {
        this.teamWikiUrl = teamWikiUrl;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(String teamLogo) {
        this.teamLogo = teamLogo;
    }
}
