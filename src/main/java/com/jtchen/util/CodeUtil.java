package com.jtchen.util;

import com.google.code.kaptcha.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * 验证码验证工具类
 * Created by jtchen on 2018/1/8.
 */
public class CodeUtil {
    public static boolean checkVerifyCode(HttpServletRequest request){
        String verifyCodeExpected = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCode");
        if(verifyCodeActual == null || !verifyCodeExpected.equals(verifyCodeActual.toUpperCase())){
            return false;
        }
        return true;
    }
}
