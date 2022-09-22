package com.hu.mybatis;

import com.hu.mybatis.mapper.UserMapper;
import com.hu.mybatis.pojo.User;
import com.hu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author huyongkun
 * @ClassName ParameterTest
 * @create 2022-09-03 14:21
 * @Version 1.0
 * @description: TODO
 */
public class ParameterTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User aa = mapper.getUserByUsername("root");
        System.out.println(aa);
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User aa = mapper.checkLogin("root", "123");
        System.out.println(aa);
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "root");
        map.put("password", "123");
        User aa = mapper.checkLoginByMap(map);
        System.out.println(aa);
        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User(null,"pig","123",12,'男',"33007@qq.com"));
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.checkLoginByParam("root", "123");
        System.out.println(root);
        sqlSession.close();
    }

}
