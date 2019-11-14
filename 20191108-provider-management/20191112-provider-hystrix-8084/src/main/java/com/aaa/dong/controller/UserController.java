package com.aaa.dong.controller;

import com.aaa.dong.model.User;
import com.aaa.dong.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/11/12 001220:39
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    //@HystrixCommand(fallbackMethod = "selectAllFallBack")
    public List<User> selectAllUsers() throws Exception {
        List<User> users = userService.selectAllUsers();
        if(users.size()>0){
            throw new Exception("模拟异常");
        }
        return users;
    }

//    public List<User> selectAllFallBack(){
//        List<User> users = new ArrayList<User>();
//        User user = new User();
//        user.setId(1111L);
//        user.setNewFileName("ddd");
//        users.add(user);
//        return users;
//    }
}
