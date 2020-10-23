package com.iitcast.factory;

import com.iitcast.dao.UserDao;
import com.iitcast.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
