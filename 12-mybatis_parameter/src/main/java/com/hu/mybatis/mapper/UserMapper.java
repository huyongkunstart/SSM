package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author huyongkun
 * @ClassName UserMapper
 * @create 2022-09-03 14:02
 * @Version 1.0
 * @description: TODO
 */
public interface UserMapper {
    //根据用户名查询用户信息
    User getUserByUsername(String username);
    //验证登录
    User checkLogin(String username,String password);

    //验证登录(以map作为参数)
    User checkLoginByMap(Map<String,Object> map);

    //插入一条记录
    void insertUser(User user);

    User checkLoginByParam(@Param("username")String username, @Param("password")String password);
}
