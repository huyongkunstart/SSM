package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author huyongkun
 * @ClassName DeptMapper
 * @create 2022-09-06 7:24
 * @Version 1.0
 * @description: TODO
 */
public interface DeptMapper {
    /*
    通过分布查询查询员工以及所对应的部门信息的第二步
     */
    Dept getEmpAndDeptBystepTwo(@Param("deptId") Integer deptId);


    /*
     一对多 使用collection
    查询部门以及部门中的员工信息
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);


    /*
        一对多 分步查询 第一步
        通过分步查询 查询部门以及部门中的员工信息的第一步
    */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
