package com.hu.controller;

import com.hu.dao.EmployeeDao;
import com.hu.pojo.Employee;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author huyongkun
 * @ClassName EmployeeController
 * @create 2022-09-14 20:03
 * @Version 1.0
 * @description: TODO
 */
/*
    查询所有的员工信息：/employee --> get
    跳转到添加页面:    /to/add   --> get
    新增员工信息：     /employee --> post
    跳转到修改页面：    /employee/1 --> get
    修改员工信息:      /employee  --> put
    删除员工信息:       /employee/1  --> delete
*/
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    //查询所有用户信息
    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        //获取所有的员工信息
        Collection<Employee> allEmployee = employeeDao.getAll();
        //将所有的员工信息放到请求域中
        model.addAttribute("allEmployee", allEmployee);
        //跳转到列表页面
        return "employee_list";
    }

    //添加用户信息
    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        //保存员工信息
        employeeDao.save(employee);
        //重定向到列表功能: /employee
        return "redirect:/employee";
    }

    //根据id查询用户信息
    @GetMapping("/employee/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model){
        //根据id查询员工信息
        Employee employee = employeeDao.get(id);
        //将员工信息共享到请求域中
        model.addAttribute("employee", employee);
        //跳转到employee_update.html
        return "employee_update";
    }

    //更新用户信息
    @PutMapping("/employee")
    public String userUpdate(Employee employee){
        employeeDao.save(employee);
        //重定向到列表
        return "redirect:/employee";
    }

    //删除员工信息
    @DeleteMapping("/employee/{id}")
    public String userDelete(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        //重定向到列表
        return "redirect:/employee";
    }
}
