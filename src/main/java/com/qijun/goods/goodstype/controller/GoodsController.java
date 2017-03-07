package com.qijun.goods.goodstype.controller;

import com.qijun.goods.goodstype.entity.Goods;
import com.qijun.goods.goodstype.service.GoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
@Controller
@RequestMapping("/goodsController")
public class GoodsController {

    private static final Logger logger = Logger.getLogger(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/showAllGoodses.do")
    public String showAllGoodses(Model model){
        List<Goods> goodses = goodsService.selectAll();
        model.addAttribute("goodses", goodses);
        return "view/goods/goodstype/goodstype";
    }

    @RequestMapping("/loadGoods.do")
    public String loadGoods(Model model,long gsId){
        Goods goods = goodsService.selectByPrimaryKey(gsId);
        model.addAttribute("goods", goods);
        return "view/goods/goodstype/goodstypeDetail";
    }




}
