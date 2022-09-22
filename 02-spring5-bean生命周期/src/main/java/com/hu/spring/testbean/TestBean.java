package com.hu.spring.testbean;

import com.hu.spring.bean.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huyongkun
 * @ClassName TestBean
 * @create 2022-08-09 21:40
 * @Version 1.0
 * @description: 测试bean
 */
public class TestBean {
    @Test
    public void test1(){
//      ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步,bean对象的使用");

        //手动让bean实例销毁
        context.close();
    }
}
