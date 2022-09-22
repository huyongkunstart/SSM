package com.hu.beans;

/**
 * @author huyongkun
 * @ClassName Emp
 * @create 2022-08-09 15:27
 * @Version 1.0
 * @description: 员工类
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }
}
