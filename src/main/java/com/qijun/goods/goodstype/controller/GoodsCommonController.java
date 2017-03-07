package com.qijun.goods.goodstype.controller;

import com.qijun.goods.goodstype.service.GoodsCommonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/6.
 */

@Controller
@RequestMapping("/goodsCommonController")
public class GoodsCommonController {

    private static final Logger logger = Logger.getLogger(GoodsController.class);

    @Autowired
    private GoodsCommonService goodsCommonService;

}
