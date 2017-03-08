package com.qijun.goods.goodstype.mapper;


import com.qijun.goods.goodstype.entity.Goods;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27.
 */
public interface GoodsMapper {

    List<Goods> selectAll();

    Goods selectByPrimaryKey(Long gsId);

    int insert(Goods goods);

    int update(Goods goods);

    int deleteByPrimaryKey(Long gsId);

}
