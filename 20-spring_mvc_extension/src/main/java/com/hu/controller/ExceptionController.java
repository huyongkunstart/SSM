package com.hu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author huyongkun
 * @ClassName ExceptionController
 * @create 2022-09-17 8:36
 * @Version 1.0
 * @description: 注解方式进行异常处理
 */

//将当前类标识为异常处理的组件
@ControllerAdvice
public class ExceptionController {
    //设置要处理的异常信息
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex, Model model){
        //ex表示控制器方法所出现的异常
        model.addAttribute("ex", ex);
        return "error";
    }
}
