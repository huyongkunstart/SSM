package com.hu.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huyongkun
 * @ClassName TestUserProxy
 * @create 2022-08-11 14:58
 * @Version 1.0
 * @description: TODO
 */
public class TestUserProxy {
    @Test
    public void test1(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        int add = user.add(12,4);
        System.out.println(add);
    }
}
