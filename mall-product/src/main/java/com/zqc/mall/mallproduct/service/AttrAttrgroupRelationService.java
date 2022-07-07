package com.zqc.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zqc.common.utils.PageUtils;
import com.zqc.mall.mallproduct.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author zqc
 * @email 1820901097@qq.com
 * @date 2022-07-07 21:37:54
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

