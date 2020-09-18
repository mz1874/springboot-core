package com.mz.springbootcore;

import com.mz.springbootcore.service.DepartmentService;
import com.mz.springbootcore.service.PersonBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootTest
class SpringbootCoreApplicationTests {

    @Autowired
    private ApplicationContext ioc;

    @Autowired
    private DepartmentService service;

    @Test
    void contextLoads() {

    }




    @Test
    void testConditionalBean() {
        PersonBean bean = ioc.getBean(PersonBean.class);
        log.info("bean name is :{}", bean.getUserName());
    }


    @Test
    void testConditionalCatBean() {
        log.info("service : {}", service);
    }
}
