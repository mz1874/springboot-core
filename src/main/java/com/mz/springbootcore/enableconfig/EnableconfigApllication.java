package com.mz.springbootcore.enableconfig;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: candy
 * @date: 2020/9/24
 * @description :
 **/
@EnableAutoConfiguration
public class EnableconfigApllication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LovedCandy.class).web(WebApplicationType.NONE)
                .run(args);

        Object demoBeanRepository = context.getBean("lovedCandy");
        System.out.println(demoBeanRepository);
        context.close();
    }
}
