package com.hu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huyongkun
 * @ClassName testController
 * @create 2022-09-16 19:36
 * @Version 1.0
 * @description: TODO
 */
@Controller
public class testController {
    @RequestMapping("/abc")
    public String testHello(){
//        System.out.println(1/0);
        return "success";
    }
}
