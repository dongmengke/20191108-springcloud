package com.aaa.dong.springcloud.controller;

import com.aaa.dong.model.User;
import com.aaa.dong.springcloud.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/11/12 001216:51
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private ISpringCloudService iSpringCloudService;
    @RequestMapping("/all")
    public List<User> selectAllUsers(){
        return iSpringCloudService.selectAllUsers();
    }
}
