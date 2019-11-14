package com.aaa.dong.springcloud.controller;

import com.aaa.dong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/11/11 001115:54
 * @Version 1.0
 */
@RestController
public class UserController {
    private static final String URL="http://USER-PROVIDER/";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/allLB")
    public List<User> selectAllUserByLoadBlancer(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-provider");
        String host = serviceInstance.getHost();
        System.out.println(host);
        int port = serviceInstance.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/all",List.class);
    }
    @GetMapping("/all")
    public List<User> selectAllUser(){
        return restTemplate.getForObject(URL+"all",List.class);
    }
}
