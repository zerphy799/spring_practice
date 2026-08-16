package com.xzit.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("converter.xml");
        Ma ma = (Ma)context.getBean("ma");
        System.out.println(ma);
    }
}
