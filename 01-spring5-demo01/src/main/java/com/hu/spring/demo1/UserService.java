package com.hu.spring.demo1;

/**
 * @author huyongkun
 * @ClassName service
 * @create 2022-08-09 14:25
 * @Version 1.0
 * @description: TODO
 */
public class UserService {
    //创建UserDao类型的属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add...........");
        userDao.update();
    }
}


interface UserDao{
    void update();
}

class UserDaoImp implements UserDao{
    @Override
    public void update(){
        System.out.println("UserDao类中的update方法");
    }
}