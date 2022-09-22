package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author huyongkun
 * @ClassName CacheMapper
 * @create 2022-09-06 19:19
 * @Version 1.0
 * @description: TODO
 */
public interface CacheMapper {

    /*
        根据员工id查询员工信息
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /*
    插入一名员工信息
     */
    void insertEmp(Emp emp);
}
