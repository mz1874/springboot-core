package com.mz.springbootcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: candy
 * @date: 2020/9/22
 * @description :
 **/
//@Configuration
public class MySelectorConfig {

    @Bean
    public String beanNames() {
        return "hello";
    }
}
