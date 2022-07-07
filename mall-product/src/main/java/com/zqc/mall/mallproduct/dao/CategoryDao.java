package com.zqc.mall.mallproduct.dao;

import com.zqc.mall.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zqc
 * @email 1820901097@qq.com
 * @date 2022-07-07 21:37:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
