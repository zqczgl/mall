package com.zqc.mall.order.dao;

import com.zqc.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zqc
 * @email 1820901097@qq.com
 * @date 2022-07-07 20:27:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
