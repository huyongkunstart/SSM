package com.hu.spring.bean;

/**
 * @author huyongkun
 * @ClassName Emp
 * @create 2022-08-09 22:58
 * @Version 1.0
 * @description: 员工
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
