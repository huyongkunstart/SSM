package com.hu.spring.anno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author huyongkun
 * @ClassName SpringConfig
 * @create 2022-08-10 21:09
 * @Version 1.0
 * @description: TODO
 */
@Configuration //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.hu"})
public class SpringConfig {
}
