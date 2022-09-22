package com.hu.spring;

import org.springframework.stereotype.Component;

/**
 * @author huyongkun
 * @ClassName User
 * @create 2022-08-11 12:00
 * @Version 1.0
 * @description: 被增强的类
 */
@Component
public class User {
    public int add(int a,int b){
        System.out.println("add().......");
        return a+b;
    }
}
