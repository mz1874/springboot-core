package com.mz.springbootcore.conditional;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: candy
 * @date: 2020/9/24
 * @description :
 **/
//@MyConditional(name = "candy", value = "loved")
@ComponentScan(basePackages = {"com.mz.springbootcore.conditional"})
public class CandyBootstarpRun
{
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(CandyBootstarpRun.class)
                .web(WebApplicationType.NONE)
                .run(args);
        Mycandy bean = run.getBean(Mycandy.class);
        System.out.println(bean);
    }
}
