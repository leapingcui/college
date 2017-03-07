package com.qijun.goods.goodstype.service.impl;

import com.qijun.goods.goodstype.entity.Goods;
import com.qijun.goods.goodstype.mapper.GoodsMapper;
import com.qijun.goods.goodstype.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }

    public Goods selectByPrimaryKey(long gsId) {
        return goodsMapper.selectByPrimaryKey(gsId);
    }

    public int insert(Goods goods) {
        return goodsMapper.insert(goods);
    }

    public int update(Goods goods) {
        return goodsMapper.update(goods);
    }

    public int deleteByPrimaryKey(long gsId) {
        return goodsMapper.deleteByPrimaryKey(gsId);
    }
}
