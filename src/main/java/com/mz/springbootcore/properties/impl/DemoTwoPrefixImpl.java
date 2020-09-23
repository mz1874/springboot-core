package com.mz.springbootcore.properties.impl;

import com.mz.springbootcore.profiles.PrefixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author: candy
 * @date: 2020/9/23
 * @description :
 **/

@Profile("demoTwo")
@Slf4j
@Service
public class DemoTwoPrefixImpl implements PrefixService {
    @Override
    public int sum(int a, int b) {
        System.out.println("第二种方式");
        return a + b;
    }
}
