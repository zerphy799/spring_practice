import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MyConnectionBean connection = context.getBean(MyConnectionBean.class);
        Connection connection1 = (Connection) context.getBean("connection");
        System.out.println(connection==connection1);
    }
}
