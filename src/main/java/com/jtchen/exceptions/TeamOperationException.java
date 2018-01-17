package com.jtchen.exceptions;

/**
 * 球队异常类
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/17 0017 20:36
 */
public class TeamOperationException extends RuntimeException{
    public TeamOperationException(String msg){
        super(msg);
    }
}
