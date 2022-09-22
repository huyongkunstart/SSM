package com.hu.spring;

import com.hu.spring.entity.Book;
import com.hu.spring.service.BookDaoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyongkun
 * @ClassName Testdemo8
 * @create 2022-08-11 23:58
 * @Version 1.0
 * @description: TODO
 */
public class Testdemo8 {
    //测试添加功能
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookDaoService bookDaoService = context.getBean("bookDaoService", BookDaoService.class);
//        bookDaoService.addBook(new Book("2","时间简史","霍金"));

        int findcount = bookDaoService.findcount();
        System.out.println("一共有"+findcount+"条记录");

        Book findone = bookDaoService.findone("1");
        System.out.println(findone);

        List<Book> findall = bookDaoService.findall();
        System.out.println(findall);

    }

    @Test
    public void test2(){
        //批量插入测试
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookDaoService bookDaoService = context.getBean("bookDaoService", BookDaoService.class);

        ArrayList<Object[]> objects = new ArrayList<>();
        Object[] o1 = {"12","十万个为什么","在货架"};
        Object[] o2 = {"1343","兼职java","已出售"};
        Object[] o3 = {"123123","剑指大数据","已出售"};
        Object[] o4 = {"456456","java编程思想","在货架"};
        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
        objects.add(o4);
        bookDaoService.batchAdd(objects);
    }

    @Test
    public void test3(){
        //批量修改测试
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookDaoService bookDaoService = context.getBean("bookDaoService", BookDaoService.class);

        ArrayList<Object[]> objects = new ArrayList<>();
        Object[] o1 = {"十万个为什么","123","12"};
        Object[] o2 = {"兼职java","123","1343"};
        Object[] o3 = {"剑指大数据","123","123123"};
        Object[] o4 = {"java编程思想","123","456456"};
        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
        objects.add(o4);
        bookDaoService.batchipdate(objects);
    }
}
