package com.cn.springboot202207;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.cn.springboot202207.t1.dao")
@SpringBootApplication
public class Springboot202207Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot202207Application.class, args);
    }

}
