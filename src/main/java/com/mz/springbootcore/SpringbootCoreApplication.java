package com.mz.springbootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 尽量不要使用 如下方式进行properties 属性的注入 这种扫描的方式进行注入 会让组件无法从 应有的 properties文件中获取值
 * @EnableConfigurationProperties(value = {UserProperties.class})
 */
@ImportResource(value = {"classpath:beanConfig.xml"})
@SpringBootApplication
public class SpringbootCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCoreApplication.class, args);
    }

}
