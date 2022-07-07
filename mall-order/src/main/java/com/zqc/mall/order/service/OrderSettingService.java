package com.zqc.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zqc.common.utils.PageUtils;
import com.zqc.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author zqc
 * @email 1820901097@qq.com
 * @date 2022-07-07 20:27:03
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

