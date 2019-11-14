package com.aaa.dong.springcloud.fallback;

import com.aaa.dong.model.User;
import com.aaa.dong.springcloud.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author:DongMengKe
 * @Date:2019/11/12 001221:13
 * @Version 1.0
 */
@Component
public class ISpringcloudFallbackFactory implements FallbackFactory<ISpringCloudService> {

    @Override
    public ISpringCloudService create(Throwable throwable) {
        return new ISpringCloudService() {
            @Override
            public List<User> selectAllUsers() {
                System.out.println("我是测试熔断的方法，我被访问了");
                return null;
            }
        };
    }
}
