package com.xzit.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Team team = (Team) context.getBean("team");
        Service service = new Service();
        service.addTeam(team);
        service.deleteTeam(team);
    }
}
