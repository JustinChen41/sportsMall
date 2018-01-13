package com.jtchen.service;

import com.jtchen.dto.AreaExecution;
import com.jtchen.entity.Area;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * Created by jtchen on 2017/11/23.
 */
public interface AreaService {
    /**
     * 获取版块儿
     */
    List<Area> getAreaList();
    /**
     * 添加板块
     */
    AreaExecution addArea(Area area, InputStream areaImgInputStream, String fileName) throws RuntimeException;
}
