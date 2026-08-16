package com.xzit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        System.out.println(teacherService);
//        List<String> list = teacherService.getList();
//        System.out.println(list);
//        Map<String, Double> map = teacherService.getMap();
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            Double value = map.get(key);
//            System.out.println(key + ":" + value);
        Properties properties = teacherService.getProperties();
        System.out.println(properties.get("sb"));
    }
    }

