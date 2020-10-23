package com.iitcast.demo;

import com.iitcast.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContex.xml");
         UserDao userDao = (UserDao)app.getBean("userDao");
         userDao.save();
    }
}
