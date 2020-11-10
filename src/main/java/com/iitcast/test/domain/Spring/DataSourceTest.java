package com.iitcast.test.domain.Spring;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSourceTest {
    @Test
    //TODO 无法解决的bug，获取驱动失败！
    //用读取配置文件的方法创建连接
    public void test_properties_c3p0() throws PropertyVetoException, SQLException {
        //read from properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("jdbc.driver");
        String username = resourceBundle.getString("jdbc.username");
        String password = resourceBundle.getString("jdbc.password");
        String url = resourceBundle.getString("jdbc.url");


        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        System.out.println(driver);

        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();


    }

    @Test
    //测试手动创建c3p0
    public void test_c3p0() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");

        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc?serverTimezone=GMT");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();


    }

    @Test
    public void test_druid() throws SQLException {
        //Druid数据库连接池
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc?serverTimezone=GMT");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();


    }

    @Test
    public void spring_dataSource_c3p0() throws SQLException {
        /**
         * 用spring创建c3p0数据库连接池的对象
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContexDatabase.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource_c3p0");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void spring_dataSource_druid() throws SQLException {
        /**
         *
         * 用spring创建druid数据库连接池的对象
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContexDatabase.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource_druid");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
