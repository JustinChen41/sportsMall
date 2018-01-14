package com.jtchen.entity;

import java.util.Date;

/**
 * 球员表
 * @author jtchen0401@163.com
 * @date 2018/1/14 20:39
 */
public class Player {
    // 主键ID
    private Integer playerId;
    //中文名
    private String playerChineseName;
    //英文名
    private String playerEnglishName;
    //国籍
    private String playerNationality;
    //出生地
    private String playerBirthPlace;
    //出生日期
    private String playerBirthday;
    //场上位置
    private String playerPosition;
    //身高
    private String playerHeight;
    //体重
    private String playerWeight;
    //球衣号码
    private String playerNumber;
    //荣誉
    private String playerHonor;
    //球员介绍
    private String playerDescription;
    //球员wiki地址
    private String playerWikiUrl;
    // 权重，越大越排前显示
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date lastEditTime;
    //球员头像
    private String playerPortrait;
    //所属球队
    private Team team;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerChineseName() {
        return playerChineseName;
    }

    public void setPlayerChineseName(String playerChineseName) {
        this.playerChineseName = playerChineseName;
    }

    public String getPlayerEnglishName() {
        return playerEnglishName;
    }

    public void setPlayerEnglishName(String playerEnglishName) {
        this.playerEnglishName = playerEnglishName;
    }

    public String getPlayerNationality() {
        return playerNationality;
    }

    public void setPlayerNationality(String playerNationality) {
        this.playerNationality = playerNationality;
    }

    public String getPlayerBirthPlace() {
        return playerBirthPlace;
    }

    public void setPlayerBirthPlace(String playerBirthPlace) {
        this.playerBirthPlace = playerBirthPlace;
    }

    public String getPlayerBirthday() {
        return playerBirthday;
    }

    public void setPlayerBirthday(String playerBirthday) {
        this.playerBirthday = playerBirthday;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(String playerHeight) {
        this.playerHeight = playerHeight;
    }

    public String getPlayerWeight() {
        return playerWeight;
    }

    public void setPlayerWeight(String playerWeight) {
        this.playerWeight = playerWeight;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerHonor() {
        return playerHonor;
    }

    public void setPlayerHonor(String playerHonor) {
        this.playerHonor = playerHonor;
    }

    public String getPlayerDescription() {
        return playerDescription;
    }

    public void setPlayerDescription(String playerDescription) {
        this.playerDescription = playerDescription;
    }

    public String getPlayerWikiUrl() {
        return playerWikiUrl;
    }

    public void setPlayerWikiUrl(String playerWikiUrl) {
        this.playerWikiUrl = playerWikiUrl;
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

    public String getPlayerPortrait() {
        return playerPortrait;
    }

    public void setPlayerPortrait(String playerPortrait) {
        this.playerPortrait = playerPortrait;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}