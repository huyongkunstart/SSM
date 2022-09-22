package com.hu.mybatie.test;

import com.hu.mybatis.mapper.CacheMapper;
import com.hu.mybatis.pojo.Emp;
import com.hu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author huyongkun
 * @ClassName CacheMapperTest
 * @create 2022-09-06 19:23
 * @Version 1.0
 * @description: TODO
 */

/*
MyBatis的一级缓存： 默认开启
    MyBatis的一级缓存是SqlSession级别的，即通过同一个sqlSession查询的数据会被缓存
    再次使用同一个SqlSession查询同一条数据，会从缓存中获取

    使一级缓存失效的四种情况：
        1) 不同的SqlSession对应不同的一级缓存
        2) 同一个SqlSession但是查询条件不同
        3) 同一个SqlSession两次查询期间执行了任何一次增删改操作
        4) 同一个SqlSession两次查询期间手动清空了缓存  sqlSession.clearCache()



Mybatis的二级缓存
    Mybatis的二级缓存是SqlSessionFactory级别的，即通过同一个SqlSessionFactory所获取的SqlSession对象，
    查询的数据会被缓存，在通过同一个SqlSessionFactory所获取的SqlSession查询相同的数据会从缓存中获取

    二级缓存开启条件：
        a>在核心配置文件中，设置全局配置属性cacheEnabled="true"，默认为true，不需要设置
        b>在映射文件中设置标签<cache/>
        c>二级缓存必须在SqlSession关闭或提交之后有效
        d>查询的数据所转换的实体类类型必须实现序列化的接口
    使二级缓存失效的情况：
    两次查询之间执行了任意的增删改，会使一级和二级缓存同时失效
*/

public class CacheMapperTest {
    @Test
    public void test1(){
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);

        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);

//        sqlSession1.clearCache(); //手动清空缓存
//        mapper1.insertEmp(new Emp(null,"小兵",66,"男"));

        Emp emp2 = mapper1.getEmpById(1);
        System.out.println(emp2);

        System.out.println("-----------------------------------------");


        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp3 = mapper2.getEmpById(1);
        System.out.println(emp3);
    }

    //测试二级缓存
    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
//        sqlSession1.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(1);
        System.out.println(emp2);
        sqlSession2.close();
    }
}