package com.hu.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author huyongkun
 * @ClassName UserProxy
 * @create 2022-08-11 12:03
 * @Version 1.0
 * @description: 增强类
 */
@Component //创建对象的注解
@Aspect //生成代理对象
@Order(1)
public class UserProxy {

    //相同的切入点提取
    @Pointcut(value = "execution(* com.hu.spring.User.add(..))")
    public void pointdemo(){
    }

    //前置通知（在被增强的方法前执行）
    @Before(value = "pointdemo()")  //2
    public void befor(){
        System.out.println("前置通知befor()........");
    }

    //后置通知(在被增强的方法后执行)   //6
    @AfterReturning(value = "execution(* com.hu.spring.User.add(..))")
    public void afterReturning(){
        System.out.println("后置通知after()..........");
    }

    //最终通知   //7
    @After(value = "execution(* com.hu.spring.User.add(..))")
    public void after(){
        System.out.println("最终通知after()..........");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.hu.spring.User.add(..))")
    public void afterThrowing(){
        System.out.println("异常通知afterThrowing()........");
    }

    //环绕通知
    @Around(value = "execution(* com.hu.spring.User.add(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前....."); //1
        //被增强的方法
        Object proceed = proceedingJoinPoint.proceed(); //4
        System.out.println("环绕之后"); //5
        return proceed;
    }



}
