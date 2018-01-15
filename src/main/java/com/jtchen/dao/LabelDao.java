package com.jtchen.dao;

import com.jtchen.entity.Label;

import java.util.List;

/**
 * 标签数据接口
 * @Author jtchen
 * @Email jtchen0401@163.com
 * @Date 2018/1/15 0015 20:46
 */
public interface LabelDao {
    /**
     * 列出标签列表
     * @return areaList
     */
    List<Label> queryLabel();

    /**
     * 新增标签
     * @param label
     * @return
     */
    int insertLabel(Label label);

    /**
     * 更新标签信息
     * @param label
     * @return
     */
    int updateLabel(Label label);
}
