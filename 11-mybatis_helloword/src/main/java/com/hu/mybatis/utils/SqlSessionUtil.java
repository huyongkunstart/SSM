package com.hu.mybatis.utils;

import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author huyongkun
 * @ClassName SqlSessionUtil
 * @create 2022-09-02 20:26
 * @Version 1.0
 * @description: TODO
 */
public class SqlSessionUtil {

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        try {
            //获取核心配置文件的输入流
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取SqlSession对象
            sqlSession = sqlSessionFactory.openSession(true);
        }catch (IOException e){
            e.printStackTrace();
        }
        return sqlSession;
    }
}