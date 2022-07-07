package com.zqc.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zqc.common.utils.PageUtils;
import com.zqc.mall.mallproduct.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zqc
 * @email 1820901097@qq.com
 * @date 2022-07-07 21:37:54
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

