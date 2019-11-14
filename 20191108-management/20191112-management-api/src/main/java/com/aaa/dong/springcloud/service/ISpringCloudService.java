package com.aaa.dong.springcloud.service;

import com.aaa.dong.model.User;
import com.aaa.dong.springcloud.fallback.ISpringcloudFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/11/12 001220:28
 * @Version 1.0
 */
@FeignClient(value = "USER-PROVIDER",fallbackFactory = ISpringcloudFallbackFactory.class)
public interface ISpringCloudService {
    @RequestMapping("/all")
    List<User> selectAllUsers();

}
