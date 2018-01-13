package com.jtchen.dao;

import com.jtchen.BaseTest;
import com.jtchen.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 版块儿数据接口测试单元
 * Created by jtchen on 2017/11/22.
 */
public class AreaDaoTest extends BaseTest{

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
    }

    @Test
    public void testInsertArea(){
        Area area = new Area();
        area.setAreaName("springArea");
        area.setAreaNo(21);
        area.setAreaLogo("/public/images/areaLogo/spring.png");
        area.setDateTimestamp(System.currentTimeMillis());
        area.setAreaOutline("spring板块");
        area.setIsHaveLabel("0");
        area.setIsSupply(null);
        area.setAreaTip("HOT");
        area.setIsDelete("0");
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1, effectedNum);
    }

    @Test
    public void testUpdateArea(){
        Area area = new Area();
        area.setAreaId("b344aec0-4fe9-424f-9652-341c7e931678");
        area.setAreaName("springArea");
        area.setAreaNo(21);
        area.setAreaLogo("/public/images/areaLogo/spring.png");
        area.setDateTimestamp(System.currentTimeMillis());
        area.setAreaOutline("spring板块");
        area.setIsHaveLabel("1");
        area.setIsSupply(null);
        area.setAreaTip("HOT");
        area.setIsDelete("1");
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1, effectedNum);
    }
}
