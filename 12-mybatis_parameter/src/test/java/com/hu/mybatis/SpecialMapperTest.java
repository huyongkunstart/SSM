package com.hu.mybatis;

import com.hu.mybatis.mapper.SpecialMapper;
import com.hu.mybatis.pojo.User;
import com.hu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName SpecialMapperTest
 * @create 2022-09-03 16:33
 * @Version 1.0
 * @description: TODO
 */
public class SpecialMapperTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }

    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        mapper.deleteMoreUser("5,6,7,8");
    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> t_user = mapper.getUserList("t_user");
        t_user.forEach(System.out::println);
    }

    @Test
    public void test4(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        User user = new User(null, "小明", "123", 34, '男', "123@qq.com");
        mapper.insertUser(user);
        System.out.println(user.getId());
    }

}
