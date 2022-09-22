package com.hu.spring2后置通知;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huyongkun
 * @ClassName MyTest02
 * @create 2022-08-31 16:23
 * @Version 1.0
 * @description: TODO
 */
public class MyTest02 {

    @Test
    public void test01(){
        System.out.println(123);
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        //取出代理对象
        SomeService someService = ac.getBean("someServiceImpl",SomeService.class);
        String s = someService.doSome("张三",22);
        System.out.println("在测试方法中目标方法的返回值:"+s);

    }

    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        //取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        Student stu = someService.change();
        System.out.println("在测试为中目标方法的返回值是:"+stu);

    }

}
