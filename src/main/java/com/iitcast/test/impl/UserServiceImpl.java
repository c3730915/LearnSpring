package com.iitcast.test.impl;

import com.iitcast.test.domain.UserDao;
import com.iitcast.test.domain.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void save() {
        userDao.save();

    }
}
