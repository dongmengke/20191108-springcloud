package com.aaa.dong.springcloud;

import com.aaa.dong.ribbon.RibbonRuleMine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:DongMengKe
 * @Date:2019/11/11 001115:37
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "USER-PROVIDER",configuration = {RibbonRuleMine.class})
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }
}
