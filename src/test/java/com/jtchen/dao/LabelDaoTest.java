package com.jtchen.dao;

import com.jtchen.BaseTest;
import com.jtchen.entity.Label;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 标签测试UT
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/15 0015 21:39
 */
public class LabelDaoTest extends BaseTest {
    @Autowired
    private LabelDao labelDao;

    @Test
    public void labelQuery(){
        List<Label> labelList = labelDao.queryLabel();
    }

    @Test
    public void insertLabel(){
        Date now = new Date();
        Label label = new Label();
        label.setLabelName("逗比");
        label.setCreateTime(now);
        label.setPriority(1);
        label.setLastEditTime(now);
        labelDao.insertLabel(label);
    }

    @Test
    public void updateLabel(){
        Label label = new Label();
        label.setLabelId("4");
        label.setLabelName("逗比");
        label.setPriority(2);
        label.setLastEditTime(new Date());
        labelDao.updateLabel(label);
    }
}
