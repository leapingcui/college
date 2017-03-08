package com.qijun.goods.goodstype.mapper;


import com.qijun.goods.goodstype.entity.GoodsCommon;

import java.util.List;

/**
 * Created by Administrator on 2017/3/5.
 */
public interface GoodsCommonMapper {

    long insert(GoodsCommon goodsCommon);

    int update(GoodsCommon goodsCommon);

    int deleteByPrimaryKey(Long gcTypeId);

}
