package com.hu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huyongkun
 * @ClassName ViewController4
 * @create 2022-09-13 20:51
 * @Version 1.0
 * @description: TODO
 */

/*
    thymeleaf视图  转发视图
    forward       转发视图
    Redirect      重定向视图
*/
@Controller
public class ViewController4 {

 /*   @RequestMapping("/test/view/thymeleaf")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/test/view/forward")
    public String testInternalResourceView(){
        return "forward:/test/session";
    }

    @RequestMapping("/test/view/redirect")
    public String testRedirect(){
        return "redirect:/test/session";
    }*/

    //Thymeleaf转发视图
    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleafView(){
        return "success";
    }
    //forward转发视图
    @RequestMapping("/test/view/forward")
    public String testInternalResourceView(){
        return "forward:/test/session";
    }
    //重定向视图
    @RequestMapping("/test/view/redirect")
    public String testRedirect(){
        return "redirect:/test/session";
    }

}
