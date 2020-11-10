package com.iitcast.test.impl;

import com.iitcast.test.domain.UserDao;
import org.springframework.stereotype.Component;

//    <bean id="userDao" class="com.iitcast.test.impl.UserDaoImpl"></bean>
@Component("userDao")
public class UserDaoImpl  implements UserDao {
    @Override
    public void save() {
        System.out.println("save running");
    }
}
