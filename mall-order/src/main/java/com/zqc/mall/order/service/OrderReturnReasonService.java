package com.zqc.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zqc.common.utils.PageUtils;
import com.zqc.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author zqc
 * @email 1820901097@qq.com
 * @date 2022-07-07 20:27:03
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

