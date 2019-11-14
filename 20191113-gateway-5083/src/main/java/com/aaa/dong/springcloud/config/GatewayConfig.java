package com.aaa.dong.springcloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:DongMengKe
 * @Date:2019/11/13 001317:54
 * @Version 1.0
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder locatorBuilder){
        return locatorBuilder.routes().route("baidu-route",p -> p.path("/baidu").
                filters(f -> f.addRequestHeader("name","dongmengke")).
                uri("http://baidu.com")).
                route("/jingdong-route",p -> p.path("/jidong").
                        filters(f -> f.addRequestHeader("name","dong")).
                        uri("http://www.jd.com")).build();
    }

}
