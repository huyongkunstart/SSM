package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName SpecialMapper
 * @create 2022-09-03 16:32
 * @Version 1.0
 * @description: 模糊查询
 */
public interface SpecialMapper {

    /*
    * 模糊查询
    */
    //通过用户名模糊查询用户信息
    List<User> getUserByLike(@Param("mohu") String mohu);

    /*
    * 批量删除
    */
    void deleteMoreUser(@Param("ids") String ids);

    /*
    动态设置表名，查询用户信息
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /*
    *添加用户信息，并获取自增的主键
    * */
    void insertUser(User user);

}
