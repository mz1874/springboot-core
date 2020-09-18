package com.mz.springbootcore.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: candy
 * @date: 2020/9/18
 * @description :
 **/

/**
 * PropertySource 指定了当前配置的加载位置
 * properties 加载顺序
 * 1、 当前文件夹下的 config文件夹
 * 2、 当前文件夹
 * 3、 classpath:config
 * 4、 classpath:/
 * ConfigurationProperties  配置文件中 指定自动注入的前缀 prefix
 */
@PropertySource(value = {"classpath:user.properties"})
@Data
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {

    private List<String> names;

    private String age;
}
