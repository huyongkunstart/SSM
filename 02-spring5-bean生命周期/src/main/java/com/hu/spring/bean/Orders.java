package com.hu.spring.bean;

import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author huyongkun
 * @ClassName Orders
 * @create 2022-08-09 21:30
 * @Version 1.0
 * @description: TODO
 */
public class Orders {
    public Orders() {
        System.out.println("第一步，执行无参构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        System.out.println("第二步，调用set方法设置属性值");
        this.oname = oname;
    }


    //创建执行的初始化的方法
    @PostConstruct
    public void initMethod(){
        System.out.println("第三步，执行初始化方法");
    }
    @PreDestroy
    //创建执行销毁的方法
    public void destroyMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
