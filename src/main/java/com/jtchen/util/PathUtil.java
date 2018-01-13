package com.jtchen.util;

/**
 * 路径工具类
 * Created by jtchen on 2017/11/27.
 */
public class PathUtil {
    private static String seperator = System.getProperty("file.separator");//获取程序运行时文件的分隔符
    public static String getImageBasePath(){
        String os = System.getProperty("os.name");//获取程序运行时的系统名称
        String basePath = "";
        if(os.toLowerCase().startsWith("win")){
            basePath = "F:/projectdev/images";
        }
        else{
            basePath = "/home/";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    public static String getUserImagePath(String userId){
        String imagePath = "/upload/item/user/" + userId + "/";
        return imagePath.replace("/", seperator);
    }

    public static String getAreaImagePath(String areaId){
        String imagePath = "/upload/item/area/" + areaId + "/";
        return imagePath.replace("/", seperator);
    }
}
