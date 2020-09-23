package com.mz.springbootcore.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(CandyConditional.class)
public @interface MyConditional {

    /**
     * 是否存在
     * @return
     */
    String name();


    String value();
}
