package com.hu.spring2后置通知;

/**
 * @author huyongkun
 * @ClassName Student
 * @create 2022-08-31 16:17
 * @Version 1.0
 * @description: TODO
 */
public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}