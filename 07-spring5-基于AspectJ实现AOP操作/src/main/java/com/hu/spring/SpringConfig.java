package com.hu.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author huyongkun
 * @ClassName SpringConfig
 * @create 2022-08-11 20:25
 * @Version 1.0
 * @description: 完全注解开发，此类来代替配置文件，可以删除配置文件
 */

@Configuration
@ComponentScan(basePackages = {"com.hu.spring"})
/*
    <!--开启注解扫描-->
    <context:component-scan base-package="com.hu.spring"/>
*/
@EnableAspectJAutoProxy(proxyTargetClass = true)
/*
    <!--开启Aspect生成代理对象-->
    <aop:aspectj-autoproxy/>
*/

public class SpringConfig {

}
