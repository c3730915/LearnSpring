package com.iitcast.test.domain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCtest {
    @Test
    public void jdbc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContexJDBC.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        int row = jdbcTemplate.update("insert into user values (?,?,?)", 5, "zhangfei", "2121");
        System.out.println(row);
    }
}
