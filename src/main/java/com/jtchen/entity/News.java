package com.jtchen.entity;

import java.util.Date;

/**
 * @author jtchen0401@163.com
 * @date 2018/1/14 23:08
 */
public class News {
    //主键Id
    private Integer newsId;
    //新闻标题
    private String newsTitle;
    //新闻简介
    private String newsOutline;
    //新闻内容
    private String newsContent;
    //新闻作者
    private String newsAuthor;
    //新闻封面图
    private String newsCover;
    // 权重，越大越排前显示
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date lastEditTime;
    //所属球队
    private Team team;
    //所属球员
    private Player player;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsOutline() {
        return newsOutline;
    }

    public void setNewsOutline(String newsOutline) {
        this.newsOutline = newsOutline;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public String getNewsCover() {
        return newsCover;
    }

    public void setNewsCover(String newsCover) {
        this.newsCover = newsCover;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
