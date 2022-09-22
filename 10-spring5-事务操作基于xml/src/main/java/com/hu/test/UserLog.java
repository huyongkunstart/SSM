package com.hu.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author huyongkun
 * @ClassName UserLog
 * @create 2022-09-01 7:15
 * @Version 1.0
 * @description: TODO
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    //手动日志输出
    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
