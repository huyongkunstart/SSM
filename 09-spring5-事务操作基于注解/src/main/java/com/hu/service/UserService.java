package com.hu.service;

import com.hu.dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author huyongkun
 * @ClassName UserService
 * @create 2022-08-30 21:28
 * @Version 1.0
 * @description: TODO
 */
@Component
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = 10)
public class UserService {

//    @Autowired
    @Resource(name="userdaoimp")
    private Userdao userdao;

    public void accountMoney(){
        userdao.reduceMoney("lucy", 100);
        //出现异常
        System.out.println(1/0);

        userdao.addMoney("mary", 100);
    }
}
