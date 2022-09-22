package com.hu.spring2后置通知;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huyongkun
 * @ClassName BookTest
 * @create 2022-08-11 21:01
 * @Version 1.0
 * @description: TODO
 */
public class BookTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
