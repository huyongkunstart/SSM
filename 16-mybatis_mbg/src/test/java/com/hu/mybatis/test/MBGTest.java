package com.hu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName MBGTest
 * @create 2022-09-07 11:46
 * @Version 1.0
 * @description: TODO
 */
public class MBGTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
        //无条件的查询所有的数据
//        List<Emp> emps = mapper.selectByExample(null);
//        emps.forEach(System.out::println);

        //有条件的查询
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThan(19);
//        empExample.or().andGenderEqualTo("男");
//        List<Emp> emps = mapper.selectByExample(empExample);
//        emps.forEach(System.out::println);


        Emp emp = new Emp(1, "小米", "男");
        //测试普通修改功能，全部属性都会修改，如果属性没有值，就会设为null
//      int i = mapper.updateByPrimaryKey(emp);

        //测试选择性修改， 选择性修改，不改变其它值
        mapper.updateByPrimaryKeySelective(emp);
    }

}
