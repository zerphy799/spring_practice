package com.xzit.homework;

import com.xzit.service.AccService;
import com.xzit.service.AccServiceImpl;
import com.xzit.service.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ServiceImpl service = context.getBean(ServiceImpl.class);
//        List<Count> list = new ArrayList<>();
//        list.add(new Count("123456","111111",25));
//        list.add(new Count("1234567", "222222",50));
//        list.add(new Count("1234568","333333",35));
//        service.batchInsert(list);
        List<Count> counts = service.selectAll();
        counts.forEach(System.out::println);
        Count count = new Count();
        count.setAccount("123456");
        count.setPassword("111111");
        service.login(count);
        AccService bean = context.getBean("use", AccService.class);
        bean.pay("123456",5);
        System.out.println(service.selectOne("123456"));
    }
}
