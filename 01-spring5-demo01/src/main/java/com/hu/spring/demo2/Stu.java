package com.hu.spring.demo2;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author huyongkun
 * @ClassName Stu
 * @create 2022-08-09 16:49
 * @Version 1.0
 * @description: 注入数组，list，集合类型的属性
 */
public class Stu {
    //1数组类型属性
    private String[]  courses;
    //2 list集合类型属性
    private List<Course> list;
    //3 map集合类型属性
    private Map<String,String> maps;
    //4 set集合类型属性
    private Set<String> sets;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setList(List<Course> list) {
        this.list = list;
    }
    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public String[] getCourses() {
        return courses;
    }

    public List<Course> getList() {
        return list;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public Set<String> getSets() {
        return sets;
    }
}
