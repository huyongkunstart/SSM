package com.hu.beans;

import java.util.*;

/**
 * @author huyongkun
 * @ClassName 集合
 * @create 2022-08-29 19:17
 * @Version 1.0
 * @description: TODO
 */
public class 集合 {
    private String[] array; //数组类型属性
    private ArrayList<String> list; //Arraylist类型属性
    private List<Object> objectList;//List类型存放对象的
    private Set<String> set; //set类型属性
    private Map<String,String> map; //map类型属性

    public 集合() {
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    @Override
    public String toString() {
        return "集合{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", objectList=" + objectList +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
