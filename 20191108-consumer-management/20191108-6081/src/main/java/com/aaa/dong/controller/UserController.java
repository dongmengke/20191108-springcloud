package com.aaa.dong.controller;


import com.aaa.dong.config.RestFulTemplate;
import com.aaa.dong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/10/24 002420:24
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/all")
    public List<User> selectAllUsers() {

        return restTemplate.getForObject("http://localhost:8080/all",List.class);
    }

}
