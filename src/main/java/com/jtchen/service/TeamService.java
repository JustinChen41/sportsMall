package com.jtchen.service;

import com.jtchen.dto.TeamExecution;
import com.jtchen.entity.Team;

import java.io.InputStream;

/**
 * 球队信息业务类
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/14 0014 23:32
 */
public interface TeamService {
    /**
     * 根据Id查询球队
     * @param teamId
     * @return
     */
    Team queryTeamById(int teamId);
    /**
     * 保存球队信息
     * @param team
     * @param teamImgInputStream
     * @param fileName
     * @return
     */
    TeamExecution saveTeam(Team team, InputStream teamImgInputStream, String fileName);

    /**
     * 更新球队信息
     * @param team
     * @param teamImgInputStream
     * @param fileName
     * @return
     */
    TeamExecution modifyTeam(Team team, InputStream teamImgInputStream, String fileName);
}
