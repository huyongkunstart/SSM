package com.hu.spring;

/**
 * @author huyongkun
 * @ClassName UserDaoImp
 * @create 2022-08-10 21:48
 * @Version 1.0
 * @description: TODO
 */
public class UserDaoImp implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add()方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update()方法执行了");
        return id;
    }
}
