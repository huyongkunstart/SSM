package com.hu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author huyongkun
 * @ClassName Userdaoimp
 * @create 2022-08-30 21:23
 * @Version 1.0
 * @description: TODO
 */
@Component
public class Userdaoimp implements Userdao{

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //多钱
    @Override
    public void addMoney(String username,int money) {
        String sql = "update t_account set money = money + ? where username = ?";
        jdbcTemplate.update(sql,money,username);
    }
    //少钱
    @Override
    public void reduceMoney(String username,int money) {
        String sql = "update t_account set money = money - ? where username = ?";
        jdbcTemplate.update(sql,money,username);
    }
}
