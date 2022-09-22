package com.hu.spring2后置通知;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author huyongkun
 * @ClassName JDKProxy
 * @create 2022-08-30 15:00
 * @Version 1.0
 * @description: TODO
 */
public class JDKProxy {
    public static void main(String[] args) {

        Class[] interfaces = {A.class};
        A a = new B();
        A aaa = (A)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new aaa(a));

        System.out.println(aaa.show1(12,3));
        System.out.println(aaa.show2("张三"));
    }
}

class aaa implements InvocationHandler{
    private Object obj;

    public aaa(Object obj) {
        this.obj = obj;
    }

    //增强方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //这里写增强的方法
        System.out.println("写增强的方法,增强方法的名字:"+method.getName());
        //调用被增强的方法
        Object invoke = method.invoke(obj, args);
        //调用被增强方法后执行的语句
        System.out.println("增强方法的参数:"+ Arrays.toString(args));
        return invoke;
    }
}
