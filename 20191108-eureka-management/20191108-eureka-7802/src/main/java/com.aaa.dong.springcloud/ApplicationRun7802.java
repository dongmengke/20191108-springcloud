package com.aaa.dong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:DongMengKe
 * @Date:2019/11/10 001023:16
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7802 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7802.class,args);
    }
}
