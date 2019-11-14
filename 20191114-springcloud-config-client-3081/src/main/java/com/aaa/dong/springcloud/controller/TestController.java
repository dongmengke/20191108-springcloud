package com.aaa.dong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:DongMengKe
 * @Date:2019/11/14 001416:33
 * @Version 1.0
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;
    @Value("${spring.datasource.driver-class-name}")
    private String name;
    @Value("${mybatis.type-aliases-package}")
    private String LLpackage;
    @RequestMapping("/test")
    public String test(){
        return port+"------------"+name+"-------------------"+LLpackage;
    }
}
