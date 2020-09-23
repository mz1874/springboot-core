package com.mz.springbootcore.repository;

import com.mz.springbootcore.annotation.MyRepository;

/**
 * @author: candy
 * @date: 2020/9/22
 * @description :
 **/
@MyRepository
public class DemoBeanRepository {

    /**
     * 本质上来说  Spring的注解 具备派生的层次性
     *
     * 例如 @Configuration 注解
     *
     *      >>
     *          @Target(ElementType.TYPE)
     *          @Retention(RetentionPolicy.RUNTIME)
     *          @Documented
     *          @Component
     *          public @interface Configuration {
     *
     *          }
     * 其使用的底层注解也是 Component
     *
     *    Configuration >>
     *          Component
EN     */
}
