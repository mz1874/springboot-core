package com.mz.springbootcore.service;

import com.mz.springbootcore.properties.UserProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author: candy
 * @date: 2020/9/18
 * @description :
 **/
@Service
@Slf4j
public class UserService {

    /**
     * 依赖倒转原则中接口的传递方式有三种
     * 1、接口传递 通过传递某个接口的一个具体的实现类来完成对应的业务了解
     * 2、构造器传递
     * 3、setter 方式传递
     */

    private UserProperties userProperties;

    /*若该class 只有一个有参构造器的情况下 该属性 将会从Ioc 容器中获取*/
//    public UserService(UserProperties userProperties) {
//        this.userProperties = userProperties;
//    }

    /**
     * 测试使用Input
     */
    @Resource
    private PersonBean personBean;


    @Autowired
    public void setUserProperties(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    @PostConstruct
    public void showUserName() {
        log.info("user name is :{}", userProperties.getNames());
        log.info("user name is :{}", userProperties.getAge());
    }
}
