package com.jtchen.service;

import com.jtchen.BaseTest;
import com.jtchen.dto.AreaExecution;
import com.jtchen.entity.Area;
import com.jtchen.enums.AreaStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.imageio.ImageIO;
import java.io.*;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jtchen on 2017/11/23.
 */
public class AreaServiceTest extends BaseTest{
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals("煤炭供需", areaList.get(0).getAreaName());
    }

    @Test
    public void testInsertArea() throws FileNotFoundException {
        Area area = new Area();
        //给板块信息赋初始值
        area.setAreaName("ssm测试33333");
        area.setAreaNo(22);
        area.setDateTimestamp(System.currentTimeMillis());
        area.setAreaOutline("ssm板块插入测试33333");
        area.setIsHaveLabel("0");
        area.setIsSupply("0");
        area.setIsDelete("0");
        File areaImg = new File("E://烟台之旅/20100403290.jpg");
        InputStream inputStream = new FileInputStream(areaImg);
        AreaExecution ae = areaService.addArea(area, inputStream, areaImg.getName());
        assertEquals(AreaStateEnum.PASS.getState(), ae.getState());
    }
}
