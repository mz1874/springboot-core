package com.mz.springbootcore.selector;

import com.mz.springbootcore.repository.MySelectorBean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: candy
 * @date: 2020/9/22
 * @description :
 **/
public class MySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{MySelectorBean.class.getName()};
    }
}
