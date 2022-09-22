package com.hu.mybatis;

import com.hu.mybatis.mapper.UserMapper;
import com.hu.mybatis.pojo.User;
import com.hu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author huyongkun
 * @ClassName UserTest
 * @create 2022-09-01 21:56
 * @Version 1.0
 * @description: TODO
 */
public class UserTest {
    @Test
    public void test1() throws IOException {

        //获取SqlSession
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.insertUser();
        System.out.println(i);
        sqlSession.close();
    }

    @Test
    public void test2(){
        //获取SqlSession
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser();
        sqlSession.close();
    }

    //测试删除功能
    @Test
    public void test3(){
        //获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser();
        sqlSession.close();
    }

    //测试查询功能
    @Test
    public void test4(){
        //获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.GetUserById();
        System.out.println(user);
        sqlSession.close();
    }
    //测试查询所有功能
    @Test
    public void test5(){
        //获取SqlSession对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = userMapper.getAllUser();
        allUser.forEach(System.out::println);
        sqlSession.close();
    }
}
