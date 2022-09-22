package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.User;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName UserMapper
 * @create 2022-09-01 21:37
 * @Version 1.0
 * @description: TODO
 */
public interface UserMapper {
    /*
    * 添加用户信息
    * */
    int insertUser();

    /*
    * 修改用户信息
    * */
    void updateUser();

    /*
    *查询一个用户信息
    * */
    User GetUserById();

    /*
    *查询所有用户信息
    * */
    List<User> getAllUser();

    /*
    * 删除用户信息
    * */
    int deleteUser();
}
