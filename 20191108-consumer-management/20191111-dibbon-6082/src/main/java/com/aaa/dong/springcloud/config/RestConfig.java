package com.aaa.dong.springcloud.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:DongMengKe
 * @Date:2019/11/11 001115:51
 * @Version 1.0
 */
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//    @Bean
//    public RandomRule randomRule(){
//        return new RandomRule();
//    }
}
