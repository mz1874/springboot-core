package com.mz.springbootcore.config;

import com.mz.springbootcore.service.Cat;
import com.mz.springbootcore.service.DepartmentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: candy
 * @date: 2020/9/18
 * @description :
 **/

@Configuration
public class BeanConfig {


    /**
     * 标注以 一个 Bean的形式将 DepartmentService 注入到Ioc 容器中
     * @return
     */
    @ConditionalOnBean(Cat.class)
    @Bean
    public DepartmentService departmentService() {
        return new DepartmentService();
    }
}
