package com.hu.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huyongkun
 * @ClassName FirstInterceptor
 * @create 2022-09-16 19:42
 * @Version 1.0
 * @description: TODO
 */

/*
    拦截器的三个方法
    preHandle()：在控制器方法执行之前执行，其返回值表示对控制器方法的拦截（false）或 放行(true)
    postHandle()：在控制器方法执行之后执行
    afterCompletion()：在控制器方法执行之后，且渲染视图完毕之后执行

    多个拦截器的执行顺序和在SprinMVC的配置文件中配置的顺序有关
    preHandle() 按照配置的顺序执行
    postHandle() 和 afterCompletion() 按照配置的反序执行

    若拦截器中某个拦截器B的preHandle()返回了false
        拦截器B和他之前的拦截器的preHandle()都会执行
        所有的拦截器的postHandle()都不会执行
        拦截器B之前的拦截器的afterCompletion()会执行
*/
@Component
public class FirstInterceptor implements HandlerInterceptor {
    //控制器方法之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInterceptor-->preHandle");
        //返回值代表拦截功能，返回false则控制器不会执行
        return false;
    }

    //控制器之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FirstInterceptor-->postHandle");
    }


    //渲染完视图之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FirstInterceptor-->afterCompletion");
    }
}
