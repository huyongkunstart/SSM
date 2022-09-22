package com.hu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName PageTest
 * @create 2022-09-07 15:51
 * @Version 1.0
 * @description: 使用插件设置分页
 */
public class PageTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //查询功能之前开启分页功能

        Page<Object> page = PageHelper.startPage(4, 4);
        List<Emp> emps = mapper.selectByExample(null);
        //查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(emps,3);
        emps.forEach(System.out::println);
//        System.out.println(page);
//        System.out.println(pageInfo);
    }

    /*
    Page{count=true, pageNum=4, pageSize=4,
         startRow=12, endRow=16, total=30,
         pages=8, reasonable=false, pageSizeZero=false}
    [Emp{empId=15, empName='a', age=1, gender='n', deptId=null}, Emp{empId=16, empName='a', age=1, gender='n', deptId=null}, Emp{empId=17, empName='a', age=1, gender='n', deptId=null}, Emp{empId=18, empName='a', age=1, gender='n', deptId=null}]

    PageInfo{pageNum=4, pageSize=4, size=4,
    startRow=13, endRow=16, total=30, pages=8,
            list=Page{count=true, pageNum=4, pageSize=4, startRow=12, endRow=16, total=30, pages=8, reasonable=false, pageSizeZero=false}[Emp{empId=15, empName='a', age=1, gender='n', deptId=null}, Emp{empId=16, empName='a', age=1, gender='n', deptId=null}, Emp{empId=17, empName='a', age=1, gender='n', deptId=null},Emp{empId=18, empName='a', age=1, gender='n', deptId=null}],
    prePage=3, nextPage=5, isFirstPage=false, isLastPage=false,
    hasPreviousPage=true, hasNextPage=true, navigatePages=3,
    navigateFirstPage=3, navigateLastPage=5, navigatepageNums=[3, 4, 5]}

     */
}
