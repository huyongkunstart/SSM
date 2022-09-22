package com.hu.controller;

import com.hu.dao.EmployeeDao;
import com.hu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author huyongkun
 * @ClassName EmployeeController
 * @create 2022-09-21 15:54
 * @Version 1.0
 * @description: TODO
 */
/*
    查询所有的员工信息  /employee  get
    跳转到添加页面     /to/add  get
    新增员工信息       /employee   post
    跳转到修改页面     /employee/1   get
    修改员工信息       /employee  put
    删除员工信息       /employee/1   delete
*/
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao = new EmployeeDao();

    //查询所有员工信息
    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        Collection<Employee> all = employeeDao.getAll();
        //放到请求域中
        model.addAttribute("allEmployees", all);
        return "employee_list";
    }

    //新增
    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    //删除
    @DeleteMapping("/employee/{id}")
    public String userDelete(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }

    //根据id查询用户信息
    @GetMapping("/employee/{id}")
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }
    //修改
    @PutMapping("/employee")
    public String updateEmp(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}
