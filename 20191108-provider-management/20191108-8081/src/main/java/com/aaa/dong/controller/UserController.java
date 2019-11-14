package com.aaa.dong.controller;

import com.aaa.dong.model.User;
import com.aaa.dong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/11/9 000911:13
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/all")
    public List<User> selectAllUser(){
        System.out.println("8081");
        return userService.selectAllUsers();
    }
}
