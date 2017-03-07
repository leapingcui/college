package com.qijun.goods.goodstype.service.impl;

import com.qijun.goods.goodstype.entity.GoodsCommon;
import com.qijun.goods.goodstype.mapper.GoodsCommonMapper;
import com.qijun.goods.goodstype.service.GoodsCommonService;
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
public class GoodsCommonServiceImpl implements GoodsCommonService {

    @Autowired
    private GoodsCommonMapper goodsCommonMapper;


    public long insert(GoodsCommon goodsCommon) {
        return goodsCommonMapper.insert(goodsCommon);
    }

    public int update(GoodsCommon goodsCommon) {
        return goodsCommonMapper.update(goodsCommon);
    }

    public int deleteByPrimaryKey(long gcTypeId) {
        return goodsCommonMapper.deleteByPrimaryKey(gcTypeId);
    }
}
