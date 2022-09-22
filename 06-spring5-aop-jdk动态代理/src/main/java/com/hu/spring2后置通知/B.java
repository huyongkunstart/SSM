package com.hu.spring2后置通知;

/**
 * @author huyongkun
 * @ClassName B
 * @create 2022-08-30 14:59
 * @Version 1.0
 * @description: TODO
 */
public class B implements A{
    @Override
    public int show1(int a, int b) {
        return a+b;
    }

    @Override
    public String show2(String name) {
        return name;
    }
}
