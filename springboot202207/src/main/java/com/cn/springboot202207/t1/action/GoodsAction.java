package com.cn.springboot202207.t1.action;

import com.cn.springboot202207.t1.entity.Goods;
import com.cn.springboot202207.t1.services.GoodsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/goods")
public class GoodsAction {

    @Autowired
    private GoodsServices goodsServices;

    @RequestMapping("/goods")
    public String doFirst(int gid){
        Goods goods = goodsServices.getGoodsById(gid);

        System.out.println(goods);

        return "idx";
    }

    @RequestMapping("/getgoods")
    public ModelAndView getGoods(int gid){
        ModelAndView mv = new ModelAndView("res");

        Goods goods = goodsServices.getGoodsById(gid);

        mv.addObject("goods",goods);

        mv.addObject("msg","this is test骚豆腐加搜到附近");


        return mv;
    }

    @RequestMapping("/idx")
    public ModelAndView getIdx(){
        ModelAndView mv = new ModelAndView("myspace/study");


        return mv;
    }



    @RequestMapping("/myins")
    public ModelAndView myins(){
        ModelAndView mv = new ModelAndView("myspace/myinspection");

        return mv;
    }













    @RequestMapping("/gs2")
    public ModelAndView doSecond(int gid){
        ModelAndView mv = new ModelAndView("idx");
        Goods goods = goodsServices.getGoodsById(gid);

        System.out.println(goods);

        mv.addObject("goods",goods);
        return mv;
    }
}
