package com.jtchen.dao;

import com.jtchen.entity.Area;

import java.util.List;

/**
 * 板块数据接口
 * Created by jtchen on 2017/11/22.
 */
public interface AreaDao {
    /**
     * 列出板块列表
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 新增板块
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新店铺信息
     * @param area
     * @return
     */
    int updateArea(Area area);
}
