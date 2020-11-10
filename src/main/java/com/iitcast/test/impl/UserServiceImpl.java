package com.iitcast.test.impl;

import com.iitcast.test.domain.Spring.UserDao;
import com.iitcast.test.domain.Spring.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void save() {
        userDao.save();

    }
}
