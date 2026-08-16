package com.xzit.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_annotaion.xml");
        Student student = (Student) context.getBean("student");// 默认情况下把 component 的 value 设为当前类的首字母小写
        System.out.println(student);
    }
}
