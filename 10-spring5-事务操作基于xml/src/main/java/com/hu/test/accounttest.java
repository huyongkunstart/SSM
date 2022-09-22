package com.hu.test;

import com.hu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huyongkun
 * @ClassName accounttest
 * @create 2022-08-30 21:41
 * @Version 1.0
 * @description: TODO
 */
public class accounttest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
