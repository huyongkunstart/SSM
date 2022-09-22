package com.hu.dao;

/**
 * @author huyongkun
 * @ClassName Userdao
 * @create 2022-08-30 21:23
 * @Version 1.0
 * @description: TODO
 */
public interface Userdao {
    public void addMoney(String username,int money);
    public void reduceMoney(String username,int money);
}
