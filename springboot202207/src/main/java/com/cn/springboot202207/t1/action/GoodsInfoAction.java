package com.cn.springboot202207.t1.action;

import com.cn.springboot202207.t1.entity.GoodsInfo;
import com.cn.springboot202207.t1.services.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsInfoAction {
    @Autowired
    private GoodsInfoService goodsInfoService;

    @RequestMapping("/addGi")
    public ModelAndView addGoodsInfo(GoodsInfo goodsInfo){
        ModelAndView mv = new ModelAndView("gisuc");

        goodsInfoService.addGoodsInfo(goodsInfo);

        mv.addObject("msg","添加成功！");

       return mv;
    }

    @RequestMapping("/showGi")
    public ModelAndView showGi(int opt,int curPage){
        ModelAndView mv = new ModelAndView("s32");
        int page = 1;
        int rows = goodsInfoService.getRows();

        int maxPage = rows %10==0?rows/10: rows/10+1;

        if(opt==1){
            page = 1;
        } else if(opt==2){
            page = curPage - 1;
        } else if(opt == 3){
            page = curPage + 1;
        } else if(opt==4){
            page = maxPage;
        }

        if(page<1){
            page = 1;
        }

        if(page > maxPage){
            page = maxPage;
        }

        List<GoodsInfo> list = goodsInfoService.getByPage((page-1)*10);

        mv.addObject("list",list);

        mv.addObject("curPage",page);

        mv.addObject("path1","/goods/showGi?opt=1");
        mv.addObject("path2","/goods/showGi?opt=2");
        mv.addObject("path3","/goods/showGi?opt=3");
        mv.addObject("path4","/goods/showGi?opt=4");

        return mv;
    }

    @RequestMapping("/myindex")
    public ModelAndView myindex(String uname, String upass){
        ModelAndView mv = new ModelAndView("myindex");
        System.out.println("login----->myindex");
        return mv;
    }

    @RequestMapping("/mystudy")
    public ModelAndView mystudy(){
        ModelAndView mv = new ModelAndView("myspace/study");

        return mv;
    }
    @RequestMapping("/myinspection")
    public ModelAndView myinspection(){
        ModelAndView mv = new ModelAndView("myspace/myinspection");

        return mv;
    }

    @RequestMapping("/sidebar")
    public ModelAndView sidebar(){
        ModelAndView mv = new ModelAndView("sidebar");

        return mv;
    }

    @RequestMapping("/bottom")
    public ModelAndView bottom(){
        ModelAndView mv = new ModelAndView("bottom");

        return mv;
    }
}
