package com.hu.spring2后置通知;

import org.springframework.stereotype.Service;

/**
 * @author huyongkun
 * @ClassName SomeServiceImpl
 * @create 2022-08-31 16:18
 * @Version 1.0
 * @description: TODO
 */
@Service(value = "someServiceImpl")
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome()业务方法被执行............");
        return "abcd";
    }

    @Override
    public Student change() {
        System.out.println("change()方法被执行............");
        // System.out.println(1/0);
        return new Student("张三");
    }
}
