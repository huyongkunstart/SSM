package com.hu.controller;

import com.hu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huyongkun
 * @ClassName TestAjaxController
 * @create 2022-09-15 11:19
 * @Version 1.0
 * @description:
 */

/*
    1. @RequestBody: 将请求体中的内容和控制器方法的形参进行绑定

    2. 使用@RequestBody注解将json格式的请求参数转换为java对象
        1.导入jackson的依赖
        2.springmvc的配置文件中设置 <!--开启mvc的注解驱动--> <mvc:annotation-driven/>
        3.在处理请求的控制器方法的形参位置，直接设置json格式的请求参数要转换的java类型的形参.
            使用@RequestBody注解标识即可
    3. @ResponseBody的使用 （用的非常多）
        将所标识的控制器方法的返回值作为响应报文的响应体响应到浏览器

    4.使用@ResponseBody注解响应浏览器json格式的数据
        1.导入jackson的依赖
        2.springmvc的配置文件中设置 <!--开启mvc的注解驱动--> <mvc:annotation-driven/>
        3.将需要转换为json字符串的java对象直接作为控制器方法的返回值，使用@ResponseBody注解标识控制器方法
            就可以将java对象直接转换为java字符串，并响应到浏览器

    常见的java对象转换为json的结果：
       实体类 --> json对象
       map   -->  json对象
       list  --> json数组

   5.@RestController  相当于 @Controller + @ResponseBody  不需要在每个控制器方法上加上@ResponseBody
*/
@Controller
public class TestAjaxController {

    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println(requestBody);
        System.out.println("id:"+id);
        response.getWriter().write("hello,axios");
    }




    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody2(HttpServletResponse response, @RequestBody Map<String,Object> map) throws IOException {
        System.out.println(map);
        response.getWriter().write("hello,requestBody");
    }
    public void testRequestBody1(HttpServletResponse response, @RequestBody User user) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,requestBody");
    }

    @RequestMapping("/test/RequestBody")
    @ResponseBody
    public String testReponseBody(){
        return "success";
    }


    //响应到浏览器list集合
    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    /*public List<User> testReponseBody2(){
        User user1 = new User(1001,"admin1","123",23,"男");
        User user2 = new User(1002,"admin2","123",23,"男");
        User user3 = new User(1003,"admin3","123",23,"女");
        List<User> users = Arrays.asList(user1, user2, user3);
        return users;
    }*/
    /*public User testReponseBody2(){
        User user1 = new User(1001,"admin1","123",23,"男");
        return user1;
    }*/

    public Map<String,Object> testReponseBody2(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("暗室逢灯", "12324");
        map.put("admin", "12324");
        map.put("sdfd", "12324");
        return map;
    }


}
