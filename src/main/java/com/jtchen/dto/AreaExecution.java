package com.jtchen.dto;

import com.jtchen.entity.Area;
import com.jtchen.enums.AreaStateEnum;

import java.util.List;

/**
 *
 * Created by jtchen on 2017/12/24.
 */
public class AreaExecution {
    //结果状态
    private int state;
    //状态标识
    private String stateInfo;
    //板块数量
    private int count;
    //操作的area（增删改店铺的时候用到）
    private Area area;
    //area列表（查询店铺列表的时候使用）
    private List<Area> areaList;

    public AreaExecution() {

    }
    //操作失败的时候使用的构造器
    public AreaExecution(AreaStateEnum stateEnum){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }
    //操作成功的时候使用的构造器
    public AreaExecution(AreaStateEnum stateEnum, Area area){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.area = area;
    }
    //操作成功的时候使用的构造器
    public AreaExecution(AreaStateEnum stateEnum, List<Area> areaList){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.areaList = areaList;
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }
}
