package com.hu.spring.demo3;

import com.hu.spring.demo2.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author huyongkun
 * @ClassName MyBean
 * @create 2022-08-09 17:49
 * @Version 1.0
 * @description: 工厂bean
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("张三");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
