package com.hu.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author huyongkun
 * @ClassName JDKProxy
 * @create 2022-08-10 23:48
 * @Version 1.0
 * @description: TODO
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象

        Class[] interfaces = {UserDao.class};

        UserDaoImp userDaoImp = new UserDaoImp();
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImp));
        int result = dao.add(1, 2);

        System.out.println("result:"+result);
        System.out.println("-------------------------");
        String str = dao.update("qweqklw123123");
        System.out.println(str);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler{
    //1.把创建的是谁的代理对象，把谁传递过来
    //有参构造进行传递
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    /*
    *   proxy 代理对象
    *   method  当前方法
    *   args    参数
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行..."+method.getName()+":传递的参数:"+ Arrays.toString(args));
        //被增强的方法执行
        Object invoke = method.invoke(obj,args);
        //方法之后
        System.out.println("方法之后执行，，，"+obj);
        return invoke;
    }
}
