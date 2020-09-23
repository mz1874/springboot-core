package com.mz.springbootcore.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author candy
 * @author candy
 * @author: candy
 * @date: 2020/9/22
 * @description :
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repository
/**
 * 具备派生性 被标注的 其子类注解同样有效
 */
public @interface MyRepository {

    String value() default "";
}
