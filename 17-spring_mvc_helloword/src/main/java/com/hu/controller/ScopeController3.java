package com.hu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author huyongkun
 * @ClassName ScopeController3
 * @create 2022-09-13 11:15
 * @Version 1.0
 * @description: 向请求域中共享数据
 */

/*
向请求域共享数据：
    1、通过ModelAndView向请求域共享数据
        使用ModelAndView时，可以使用其Model功能向请求域共享数据
        使用View功能设置逻辑视图，但是控制器方法一定要将ModelAndView作为方法的返回值
    2、使用Model向请求域共享数据
    3、使用ModelMap向请求域共享数据
    4、使用map向请求域共享数据
    5、Model和ModelMap和map的关系
        其实在底层中，这些类型的形参最终都是通过BindingAwareModelMap创建
        public class BindingAwareModelMap extends ExtendedModelMap {}
        public class ExtendedModelMap extends ModelMap implements Model {}
        public class ModelMap extends LinkedHashMap<String, Object> {}
*/
@Controller
public class ScopeController3 {

    //使用ModelAndView向request域共享数据
    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        ModelAndView mav = new ModelAndView();
        //向请求域共享数据
        mav.addObject("testRequestScope","hello,ModeAndView");
        //设置逻辑视图
        mav.setViewName("success");
        return mav;
    }

    //使用Model向请求域共享数据
    @RequestMapping("/test/model")
    public String testModel(Model model){
        model.addAttribute("testRequestScope", "hello,Model");
        return "success";
    }

    //使用ModelMap向请求域中共享数据
    @RequestMapping("/test/modeMap")
    public String tstModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","hello,ModelMap");
        return "success";
    }

    //使用map向请求域中共享数据
    @RequestMapping("/test/map")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","hello , map");
        return "success";
    }


    //向session域中共享数据
    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    //向application域中共享数
    @RequestMapping("/test/appliation")
    public String testapplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testapplication", "hello,application");
        return "success";
    }
}











