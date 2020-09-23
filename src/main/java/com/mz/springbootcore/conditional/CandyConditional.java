package com.mz.springbootcore.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author: candy
 * @date: 2020/9/24
 * @description :
 **/
public class CandyConditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(MyConditional.class.getName());
        /**
         * 此处可以确定 当前的条件是否生效
         * 若 return false 则 无法找到Mycandy的Bean
         */
        return false;
    }
}
