package com.hu.beans;

/**
 * @author huyongkun
 * @ClassName Orders
 * @create 2022-08-09 11:41
 * @Version 1.0
 * @description: TODO
 */
public class Orders {
    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
