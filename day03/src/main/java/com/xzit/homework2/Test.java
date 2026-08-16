package com.xzit.homework2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("connectionPool.xml");
        DataSource connection = context.getBean("connection", DataSource.class);
        try {
            Connection connection1 = connection.getConnection();
            System.out.println(connection1);
            connection1.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
