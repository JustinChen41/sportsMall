package com.jtchen.web.areaAdmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jtchen.dto.AreaExecution;
import com.jtchen.entity.Area;
import com.jtchen.enums.AreaStateEnum;
import com.jtchen.exceptions.AreaOperationException;
import com.jtchen.service.AreaService;
import com.jtchen.util.CodeUtil;
import com.jtchen.util.HttpServletRequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 区域管理类
 * Created by jtchen on 2018/1/2.
 */
@Controller
@RequestMapping("/areaadmin")
public class AreaController {
    Logger logger = LoggerFactory.getLogger("console");
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/addarea")
    private String addArea(){
        return "areaAdmin/addArea";
    }

    @RequestMapping(value = "/saveareatest")
    @ResponseBody
    private Map<String, Object> saveAreaTest(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();
        if(!CodeUtil.checkVerifyCode(request)){
            modelMap.put("success", false);
            modelMap.put("errMsg", "验证码不正确");
            return modelMap;
        }
        modelMap.put("success", true);
        return modelMap;
    }

    @RequestMapping(value = "/saveArea", method = RequestMethod.POST)
    @ResponseBody//自动返回json
    private Map<String, Object> saveArea(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();
        //1. 接收并转化相应的参数，包括板块信息及图片信息
        String areaName = HttpServletRequestUtil.getString(request, "areaName");
        ObjectMapper mapper = new ObjectMapper();
        Area area = null;
        try{
            area = mapper.readValue(areaName, Area.class);
        }
        catch (Exception e){
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
            return modelMap;
        }
        CommonsMultipartFile areaImg = null;
        //文件上传解析器，解析request中的文件信息
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());//从request中的上下文去获取相关文件上传的内容
        if(commonsMultipartResolver.isMultipart(request)){//判断request中是否有上传的文件流
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            areaImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("areaImg");
        }
        else{
            modelMap.put("success", false);
            modelMap.put("errMsg", "上传图片不能为空");
            return modelMap;
        }
        //2. 保存板块
        if(area != null && areaImg != null){
            AreaExecution ae;
            try {
                ae = areaService.addArea(area, areaImg.getInputStream(), areaImg.getOriginalFilename());
                if(ae.getState() == AreaStateEnum.PASS.getState()){
                    modelMap.put("success", true);
                }
                else{
                    modelMap.put("success", false);
                    modelMap.put("errMsg", ae.getStateInfo());
                }
            } catch (AreaOperationException e){
                modelMap.put("success", false);
                modelMap.put("errMsg", e.getMessage());
            } catch (IOException e) {
                modelMap.put("success", false);
                modelMap.put("errMsg", e.getMessage());
            }
            return modelMap;
        }
        else{
            modelMap.put("success", false);
            modelMap.put("errMsg", "请输入板块信息");
            return modelMap;
        }
    }

}
