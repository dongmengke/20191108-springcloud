package com.aaa.dong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:DongMengKe
 * @Date:2019/11/8 000816:43
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6081.class,args);
    }
}
