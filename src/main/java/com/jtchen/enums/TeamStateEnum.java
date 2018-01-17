package com.jtchen.enums;

/**
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/17 0017 20:26
 */
public enum TeamStateEnum {
    CHECK(0, "审核中"),
    OFFLINE(-1, "非法球队"),
    SUCCESS(1, "操作成功"),
    PASS(2, "通过审核"),
    INNER_ERROR(-1001, "内部系统错误"),
    NULL_TEAMID(-1002, "球队ID为null"),
    NULL_TEAM(-1003, "球队信息为空");
    private int state;
    private String stateInfo;

    private TeamStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }
    /**
     * 根据传入的state返回相应的enum值
     */
    public static TeamStateEnum stateOf(int state){
        for(TeamStateEnum stateEnum : values()){
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
