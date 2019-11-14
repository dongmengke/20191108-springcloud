package com.aaa.dong.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:DongMengKe
 * @Date:2019/11/9 000910:28
 * @Version 1.0
 */
@SpringBootApplication
public class RestFulTemplate {
    @Bean
    public RestTemplate getrestTemplate(){
        return new RestTemplate();
    }

}
