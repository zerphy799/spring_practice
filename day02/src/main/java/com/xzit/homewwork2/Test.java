package com.xzit.homewwork2;

import com.xzit.homework.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student1 student1 = (Student1) context.getBean("student1");
        student1.getStudents().forEach(Manager2::check);
    }
}
