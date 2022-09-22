package com.hu.spring.anno.dao.imp;

import com.hu.spring.anno.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * @author huyongkun
 * @ClassName UserDaoImp
 * @create 2022-08-10 20:29
 * @Version 1.0
 * @description: TODO
 */
@Service
public class UserDaoImp implements UserDao {
    @Override
    public void show() {
        System.out.println("dao show .....");
    }
}
