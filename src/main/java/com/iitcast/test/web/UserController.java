package com.iitcast.test.web;

import com.iitcast.test.domain.Spring.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    @Test
    public void run(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContexTest.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}
