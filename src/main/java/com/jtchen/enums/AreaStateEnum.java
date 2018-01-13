package com.jtchen.enums;

/**
 * 板块状态枚举类
 * Created by jtchen on 2017/12/24.
 */
public enum AreaStateEnum {
    CHECK(0, "审核中"),
    OFFLINE(-1, "非法板块"),
    SUCCESS(1, "操作成功"),
    PASS(2, "通过审核"),
    INNER_ERROR(-1001, "内部系统错误"),
    NULL_ARREAID(-1002, "板块ID为null"),
    NULL_AREA(-1003, "area信息为空");
    private int state;
    private String stateInfo;

    private AreaStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }
    /**
     * 根据传入的state返回相应的enum值
     */
    public static AreaStateEnum stateOf(int state){
        for(AreaStateEnum stateEnum : values()){
            if(stateEnum.getState() == state){
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
