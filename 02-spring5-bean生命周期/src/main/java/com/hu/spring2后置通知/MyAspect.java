package com.hu.spring2后置通知;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author huyongkun
 * @ClassName MyAspect
 * @create 2022-08-31 16:19
 * @Version 1.0
 * @description: TODO
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 后置通知的方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值void
     * 3)方法名称自定义
     * 4)方法有参数(也可以没有参数,如果目标方法没有返回值,则可以写无参的方法,但一般会写有参,这样可以处理无参可以处理有参),这个切面方法的参数就是目标方法的返回值
     * 5)使用@AfterReturning注解表明是后置通知
     *   参数:
     *      value:指定切入点表达式
     *      returning:指定目标方法的返回值的名称,则名称必须与切面方法的参数名称一致.
     */
    @AfterReturning(value = "execution(* com.hu.spring2后置通知.SomeService.*(..))",returning = "obj")
    public void myAfterReturning(Object obj){
        System.out.println("后置通知功能实现..............");
        if(obj != null){
            if(obj instanceof String){
                obj = obj.toString().toUpperCase();
                System.out.println("在切面方法中目标方法的返回值:"+obj);
            }
            if(obj instanceof Student){
                Student stu = (Student) obj;
                stu.setName("李四");
                System.out.println("在切面方法中目标方法的返回值:"+stu);
            }
        }
    }
}
