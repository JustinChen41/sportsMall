package com.jtchen.dto;

import com.jtchen.entity.Area;
import com.jtchen.entity.Team;
import com.jtchen.enums.TeamStateEnum;

import java.util.List;

/**
 * 球队返回结果
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/17 0017 20:24
 */
public class TeamExecution {
    //结果状态
    private int state;
    //状态标识
    private String stateInfo;
    //板块数量
    private int count;
    //操作的team（增删改店铺的时候用到）
    private Team team;
    //team列表（查询店铺列表的时候使用）
    private List<Team> teamList;

    public TeamExecution() {

    }

    //操作失败的时候使用的构造器
    public TeamExecution(TeamStateEnum stateEnum){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }
    //操作成功的时候使用的构造器
    public TeamExecution(TeamStateEnum stateEnum, Team team){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.team = team;
    }
    //操作成功的时候使用的构造器
    public TeamExecution(TeamStateEnum stateEnum, List<Team> teamList){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.teamList = teamList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }
}
