package com.hu.Tests;
import com.hu.beans.Book;
import com.hu.beans.Orders;
import com.hu.beans.User;
import com.hu.spring.demo2.Course;
import com.hu.spring.demo2.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author huyongkun
 * @ClassName index1
 * @create 2022-08-09 10:47
 * @Version 1.0
 * @description: TODO
 */
public class index1 {
    @Test
    public void test1(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

        Book book = context.getBean("book", Book.class);
        System.out.println(book);

        Orders order = context.getBean("order", Orders.class);
        System.out.println(order);
    }
    @Test
    public void test2(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(Arrays.toString(stu.getCourses()));
        System.out.println(stu.getList());
        System.out.println(stu.getSets());
        System.out.println(stu.getMaps());
    }
    @Test
    public void test3(){
        //工厂bean的测试
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test4(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
