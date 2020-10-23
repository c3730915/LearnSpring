package com.iitcast.service.impl;

import com.iitcast.dao.UserDao;
import com.iitcast.dao.impl.UserDaoImpl;
import com.iitcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDaoImpl userDao) {

    }


    @Override
    public void save() {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContex.xml");
//        UserDao userDao = (UserDao)app.getBean("userDao");
        //通过依赖注入，不需要从容器中获取dao 直接从spring注入
        userDao.save();
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
