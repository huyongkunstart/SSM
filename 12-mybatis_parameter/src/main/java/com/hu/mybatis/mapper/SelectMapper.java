package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author huyongkun
 * @ClassName SelectMapper
 * @create 2022-09-03 15:41
 * @Version 1.0
 * @description: TODO
 */
public interface SelectMapper {

    //根据id查询用户信息
    User getUserById(@Param("id") Integer id);

    //查询所有的用户信息
    List<User> getAllUser();

    //查询用户的总记录数
    Integer getCount();

    //根据id查询用户信息，为一个map集合
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);


    /*
        若查询的数据有多条时，并且要将每条数据转换为map集合
        此时有两种解决方案：
            （1）将mapper接口返回值设置为泛型是map的list集合
            （2）可以将每条数据转换的map集合放在一个大的map中，但是必须要通过@MapKey注解
                将查询的某个字段的值作为大的map的键
    */

    //查询所有的用户信息存放到map中
//    List<Map<String,Object>> getAllUserToMap();
    @MapKey("id")
    Map<String,Object> getAllUserToMap();
}
