package com.jtchen.dao;

import com.jtchen.entity.Player;

import java.util.List;

/**
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/14 0014 23:32
 */
public interface PlayDao {
    /**
     * 查询球员列表
     */
    List<Player> queryPlayerList();
    /**
     * 根据Id查询球员
     * @param playerId
     * @return
     */
    Player queryByPlayerId(int playerId);

    /**
     * 插入球员数据
     * @param player
     * @return
     */
    int insertPlayer(Player player);

    /**
     * 更新球员数据
     * @param player
     * @return
     */
    int updatePlayer(Player player);
}
