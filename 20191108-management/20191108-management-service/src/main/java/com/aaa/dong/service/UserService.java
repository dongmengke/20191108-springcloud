package com.aaa.dong.service;

import com.aaa.dong.mapper.UserMapper;
import com.aaa.dong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/11/9 000911:32
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> selectAllUsers(){
        return userMapper.selectAll();
    }
}
