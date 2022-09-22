package com.hu.controller;

import com.hu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import java.io.UnsupportedEncodingException;

/**
 * @author huyongkun
 * @ClassName ParamsController
 * @create 2022-09-12 10:15
 * @Version 1.0
 * @description: springmvc获取请求参数
 *
 */

/*
获取请求参数方式：
1.通过servletAPI获取
    只需要在控制器方法中添加HttpServletRequest request参数即可
2.通过控制器形参获取请求参数
    只需要在控制器方法的形参位置设置一个形参，形参的名字和请求提交的参数名字一样
    特殊情况：（形参的名字和请求提交的参数名字不一样）
         @RequestParam：将请求参数和控制器方法的形参绑定
         @RequestParam注解的三个属性：value、required、defaultValue
         1.value:设置和形参绑定的请求参数的名字
         2.required:设置是否必须传输value所对应的请求参数
             默认值为true，表示value所对应的请求参数必须传输，否则页面报错：
             400 - Required String parameter 'xxx' is not present
             若设置为false，则表示value所对应的请求参数不是必须传输，若为传输，则形参值为null
         3.defaultValue:设置当没有传输value所对应的请求参数时，为形参设置的默认值，此时和required属性值无关
     类似用法
         @RequestHeader：将请求头信息和控制器方法的形参绑定
         @CookieValue：将cookie数据和控制器方法的形参绑定
3.通过控制器方法的实体类类型的形参获取请求参数
    需要在控制器方法的形参位置设置实体类类型的形参，要保证实体类中的属性的属性名和请求参数的名字一致
    可以通过实体类类型的形参获取请求参数

4.解决获取请求此参数的乱码问题（多练习）
    在web.xml中配置Spring的编码过滤器CharacterEncodingFilter
*/

@Controller
public class ParamsController2 {

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        HttpSession session = request.getSession(true);
        return "login";
    }


    @RequestMapping("/param/servletAPI")
    public String getparamServletAPI(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+", password:"+password);
        return "success";
    }


    @RequestMapping("/param")
    public String getParam(
        @RequestParam(value = "username",required = false,defaultValue = "张三") String name,
        String password,
        @RequestHeader("referer") String referer,
        @CookieValue("JSESSIONID") String jsessionid
    ){
        System.out.println("username:"+name+", password:"+password);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamBypojo(User user){
        System.out.println(user);
        return "success";
    }




}























