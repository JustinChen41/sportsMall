package com.jtchen.service.impl;

import com.jtchen.dao.AreaDao;
import com.jtchen.dto.AreaExecution;
import com.jtchen.entity.Area;
import com.jtchen.enums.AreaStateEnum;
import com.jtchen.exceptions.AreaOperationException;
import com.jtchen.service.AreaService;
import com.jtchen.util.ImageUtil;
import com.jtchen.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * 板块业务实现类
 * Created by jtchen on 2017/11/23.
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    /**
     * 获取版块儿
     */
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    /**
     * 添加板块
     *
     * @param area
     * @param areaImgInputStream
     */
    @Override
    @Transactional
    public AreaExecution addArea(Area area, InputStream areaImgInputStream, String fileName) throws AreaOperationException {
        //空值判断
        if(area == null){
            return new AreaExecution(AreaStateEnum.NULL_AREA);
        }
        try{
            //给板块信息赋初始值
            area.setDateTimestamp(System.currentTimeMillis());
            area.setIsHaveLabel("0");
            area.setIsSupply("0");
            area.setIsDelete("0");
            //添加板块信息
            int effectedNum = areaDao.insertArea(area);
            if(effectedNum <= 0){
                throw new AreaOperationException("板块插入失败");//AreaOperationException事务会终止并回滚
            }
            else{
                if(areaImgInputStream != null){
                    //存储图片
                    try{
                        addAreaImg(area, areaImgInputStream, fileName);
                    }
                    catch (Exception e){
                        throw new AreaOperationException("图片保存异常："+ e.getMessage());
                    }
                    //更新板块的图片地址
                    effectedNum = areaDao.updateArea(area);
                    if(effectedNum <= 0){
                        throw new AreaOperationException("更新图片地址失败");
                    }
                }
            }

        }
        catch (Exception e){
            throw new AreaOperationException("add area error: "+ e.getMessage());
        }
        return new AreaExecution(AreaStateEnum.PASS, area);
    }

    private void addAreaImg(Area area, InputStream areaImgInputStream, String fileName) {
        //获取area图片目录的相对值路径
        String dest = PathUtil.getAreaImagePath(area.getAreaId());
        String areaImgAddr = ImageUtil.generateThumbnail(areaImgInputStream, fileName, dest);
        area.setAreaLogo(areaImgAddr);
    }
}
