package com.qijun.goods.goodstype.mapper;

import com.qijun.goods.goodstype.BaseTest;
import com.qijun.goods.goodstype.entity.GoodsCommon;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.util.resources.cldr.ga.LocaleNames_ga;

/**
 * Created by Administrator on 2017/3/5.
 */
public class GoodsCommonMapperTest extends BaseTest {

    @Autowired
    private GoodsCommonMapper goodsCommonMapper;

    @Test
    public void testInsert() throws Exception {
        GoodsCommon goodsCommon = new GoodsCommon();
        goodsCommon.setGcName("打印机");

        goodsCommonMapper.insert(goodsCommon);
    }

    @Test
    public void testUpdate() throws Exception {
        GoodsCommon goodsCommon = new GoodsCommon();
        long num = (long)4;
        goodsCommon.setGcTypeId(num);
        goodsCommon.setGcName("笔记本本本");

        goodsCommonMapper.update(goodsCommon);
    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {
        goodsCommonMapper.deleteByPrimaryKey(5);
    }
}
