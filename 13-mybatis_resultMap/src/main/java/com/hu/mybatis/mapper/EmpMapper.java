package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.Dept;
import com.hu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName EmpMapper
 * @create 2022-09-05 21:12
 * @Version 1.0
 * @description: TODO
 */
public interface EmpMapper {

    /*
    *根据id查询员工信息
    * */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /*
    获取员工以及对应的部门信息
     */
    Emp getEmpAndDeptByEmpId(@Param("empid") Integer empid);

    /*
    通过分布查询查询员工以及所对应的部门信息的第一步
     */
    Emp getEmpAndDeptBystepone(@Param("empid") Integer empid);


    /*
    处理一对多
    分步查询第二步
    通过分步查询查询部门以及部门中的员工信息的第二步
    */
    List<Emp> getDeotAndEmpByStepTwo(@Param("deptId") Integer deptId);

}
