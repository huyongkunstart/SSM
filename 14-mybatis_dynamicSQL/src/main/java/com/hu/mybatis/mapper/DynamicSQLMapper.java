package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName DynamicSQLMapper
 * @create 2022-09-06 14:32
 * @Version 1.0
 * @description: TODO
 */
public interface DynamicSQLMapper {
    /*
    根据条件查询员工信息
     */
    List<Emp> getEmpByCondition(Emp emp);

    /*
    使用choose查询员工信息
     */
    List<Emp> getEmpByChoose(Emp emp);

    /*
    foreach标签的使用
    批量添加员工信息
    */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /*
    foreach标签实现批量删除
    批量删除
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
