package com.qijun.goods.goodstype.service;

import com.qijun.goods.goodstype.entity.Goods;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
public interface GoodsService {
    List<Goods> selectAll();

    Goods selectByPrimaryKey(long gsId);

    int insert(Goods goods);

    int update(Goods goods);

    int deleteByPrimaryKey(long gsId);


}
