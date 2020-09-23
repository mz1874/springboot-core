package com.mz.springbootcore.properties.impl;

import com.mz.springbootcore.service.PersonBean;
import com.mz.springbootcore.profiles.PrefixService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(value = {PersonBean.class})
@ComponentScan(basePackages = {"com.mz.springbootcore.properties"})
public class PrefixApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(PrefixApplication.class)
                .web(WebApplicationType.NONE)
                .profiles("demoOne")
                .run(args);
        Object demoBeanRepository = context.getBean(PrefixService.class);
        System.out.println(demoBeanRepository);
        context.close();
    }

}
