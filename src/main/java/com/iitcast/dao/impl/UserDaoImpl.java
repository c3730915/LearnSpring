package com.iitcast.dao.impl;

import com.iitcast.dao.UserDao;
import com.iitcast.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private Map<String, User> userMap;
    private List<String> strList;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void save() {
//        System.out.println(username +"======" +age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running");
    }
}
