package com.iitcast.test.domain;

import com.iitcast.dao.UserDao;
import com.iitcast.service.UserService;
import com.iitcast.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void test1(){
//        UserService userService = new UserServiceImpl();
//        userService.save();

    }
    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContex.xml");
        UserDao userDao = (UserDao)app.getBean("userDao");
        UserDao userDao2 = (UserDao)app.getBean("userDao");
        System.out.println(userDao);
        System.out.println(userDao2);
    }
    @Test
    public void test3(){
        /**
         * 通过注解的方式，直接调用dao的save方法
         */
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContex.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }


}
