import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionBean implements FactoryBean<Connection> {

    @Nullable
    @Override
    public Connection getObject() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybatis?serverTimezone=GMT%2B8&useSSL=false";
        String user = "root";
        String password = "147258369jk";
        return DriverManager.getConnection(url, user, password);
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 通过 factoryBean提供创建的对象,是否为单例模式
     */
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
