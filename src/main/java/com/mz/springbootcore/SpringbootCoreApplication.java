package com.mz.springbootcore;

import com.mz.springbootcore.config.MySelectorConfig;
import com.mz.springbootcore.selector.MySelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 尽量不要使用 如下方式进行properties 属性的注入 这种扫描的方式进行注入 会让组件无法从 应有的 properties文件中获取值
 *
 * @EnableConfigurationProperties(value = {UserProperties.class})
 */
@ImportResource(value = {"classpath:beanConfig.xml"})
//@SpringBootApplication
@ComponentScan("com.mz.springbootcore.config")
@Import(value = {MySelectorConfig.class})
public class SpringbootCoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringbootCoreApplication.class).web(WebApplicationType.NONE)
                .run(args);

        Object demoBeanRepository = context.getBean("mySelectorConfig");
        System.out.println(demoBeanRepository);
        context.close();
    }

}
