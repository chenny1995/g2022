package com.cn.springboot202207.t1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {
    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @Autowired
    private Student stu;

    @RequestMapping("/hello")
    public String myHello(){

        System.out.println(stu);

        System.out.println(name + age);

        return "thi is test 安山东我驾驶的飞机爱搜地方";
    }
}
