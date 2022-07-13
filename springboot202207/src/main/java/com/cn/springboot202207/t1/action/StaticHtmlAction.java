package com.cn.springboot202207.t1.action;

import com.cn.springboot202207.t1.entity.Goods;
import com.cn.springboot202207.t1.services.GoodsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sh")
public class StaticHtmlAction {
    @RequestMapping("/{pno}")
    public String doFirst(@PathVariable String pno){

        System.out.println("pno");
        return  pno;
    }
}
