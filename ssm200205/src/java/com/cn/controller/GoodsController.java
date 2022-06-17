package com.cn.controller;

import com.cn.biz.GoodsServices;
import com.cn.entity.Goods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsServices goodsServices;
    private Logger logger = LoggerFactory.getLogger(this.getClass().toString());
    @RequestMapping("/doinit")
    public ModelAndView doInit(int gid){
        logger.info("this is test");
        logger.debug("asdfoasidjf debug");

        ModelAndView mv = new ModelAndView("res");

        Goods goods = goodsServices.getGoodsById(gid);

        mv.addObject("goods",goods);

        return mv;
    }

}
