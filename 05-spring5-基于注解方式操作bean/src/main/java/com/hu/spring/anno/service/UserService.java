package com.hu.spring.anno.service;

import com.hu.spring.anno.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author huyongkun
 * @ClassName UserService
 * @create 2022-08-10 20:30
 * @Version 1.0
 * @description: TODO
 */
@Repository
public class UserService {

    @Value(value="果蔬好")
    private String name;

    /*//使用注解给该对象属性赋值
    //不需要添加set方法
    @Autowired //根据属性的类型进行注入
    @Qualifier("userDaoImp") //根据名称进行注入 ，需要配合@Autowired该注解一起使用*/

    @Resource  //根据类型注入
//    @Resource(name = "userDaoImp") //根据名称进行注入
    private UserDao userDao;

    public void add(){
        userDao.show();
        System.out.println(name);
    }
}
