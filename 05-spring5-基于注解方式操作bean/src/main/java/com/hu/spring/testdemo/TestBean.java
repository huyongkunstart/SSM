package com.hu.spring.testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huyongkun
 * @ClassName TestBean
 * @create 2022-08-10 0:09
 * @Version 1.0
 * @description:
 */
public class TestBean {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        TestSpring5Demo1 testspring5demo1 = context.getBean("testSpring5Demo1", TestSpring5Demo1.class);
        testspring5demo1.add();
    }
}
