package com.qijun.goods.goodstype.mapper;

import com.qijun.goods.goodstype.BaseTest;
import com.qijun.goods.goodstype.entity.Goods;
import com.qijun.goods.goodstype.entity.GoodsCommon;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/3/5.
 */
public class GoodsMapperTest extends BaseTest{

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void testSelectAll() throws Exception {
        List<Goods> goodses = goodsMapper.selectAll();
        for (Goods goods:goodses) {
            System.out.println(goods);
        }
    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Long gsId = (long)2;
        Goods goods = goodsMapper.selectByPrimaryKey(gsId);
        System.out.println("物品对象啊啊啊" + goods);
    }

/*
    @Test
    public void testInsert() throws Exception {
        GoodsCommon goodsCommon = new GoodsCommon();
        long num = (long)2;
        goodsCommon.setGcTypeId(num);

        Goods goods = new Goods();
        goods.setGoodsCommon(goodsCommon);
        goods.setGsTrueId("OOO222");

        goodsMapper.insert(goods);
    }

    @Test
    public void testUpdate() throws Exception {

        GoodsCommon goodsCommon = new GoodsCommon();
        long num = (long)3;
        goodsCommon.setGcTypeId(num);

        Goods goods = new Goods();
        long num2 = (long)8;
        goods.setGsId(num2);
        goods.setGoodsCommon(goodsCommon);
        goods.setGsTrueId("OOO666");

        goodsMapper.update(goods);


    }

    @Test
    public void testDeleteGoodsByPrimaryKey() throws Exception {
        Long num = (long) 8;
        goodsMapper.deleteByPrimaryKey(num);

    }
*/

}
