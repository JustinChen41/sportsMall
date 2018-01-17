package com.jtchen.dao;

import com.jtchen.entity.Team;

import java.util.List;

/**
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/14 0014 23:31
 */
public interface TeamDao {
    /**
     * 查询球队列表
     * @return
     */
    List<Team> queryTeam();

    /**
     * 插入球队
     * @param team
     * @return
     */
    int insertTeam(Team team);

    /**
     * 更新球队信息
     * @param team
     * @return
     */
    int updateTeam(Team team);

    /**
     * 根据Id查询球队
     * @param teamId
     * @return
     */
    Team queryByTeamId(int teamId);
}
