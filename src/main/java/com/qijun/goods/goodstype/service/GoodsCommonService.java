package com.qijun.goods.goodstype.service;


import com.qijun.goods.goodstype.entity.GoodsCommon;


/**
 * Created by Administrator on 2017/3/6.
 */
public interface GoodsCommonService {

    long insert(GoodsCommon goodsCommon);

    int update(GoodsCommon goodsCommon);

    int deleteByPrimaryKey(long gcTypeId);


}
