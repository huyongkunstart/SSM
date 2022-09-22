package com.hu.spring.testdemo;

import org.springframework.stereotype.Component;

/**
 * @author huyongkun
 * @ClassName TestSpring5Demo1
 * @create 2022-08-10 0:01
 * @Version 1.0
 * @description: TODO
 */

@Component //<bean id="testspring5demo1" class=""></bean>
public class TestSpring5Demo1 {
    public void add(){
        System.out.println("注解");
    }
}
