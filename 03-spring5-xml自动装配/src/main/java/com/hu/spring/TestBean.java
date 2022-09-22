package com.hu.spring;

import com.hu.spring.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huyongkun
 * @ClassName TestBean
 * @create 2022-08-09 23:05
 * @Version 1.0
 * @description: 测试
 */
public class TestBean {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }
}
