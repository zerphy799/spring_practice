package com.xzit.homework2;

import com.alibaba.druid.util.DruidDataSourceUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

@Aspect
@Component
public class Check {
    private  String Places;

    {
        Properties prop = new Properties();
        InputStream is = Check.class.getResourceAsStream("/dangerours.properties");
        try {
            prop.load(is);
            this.Places = prop.getProperty("city");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        @Around(value = "execution(* com.xzit.homework2.Go.*(..))")
    public Object check(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("开始自检行程");
        Go go = (Go) pjp.getTarget();
        String[] strings = Places.split(",");
        for (String string : strings) {
            if(string.equals(go.getStartPlace())){
                System.out.println("行程中存在危险地区，终止行程");
                return null;
            }
            if(string.equals(go.getDestination())){
                System.out.println("目的地为危险地区，请注意。");
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:/log.log",true));
                bw.write("用户出发地为"+go.getStartPlace());
                bw.newLine();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String str = dtf.format(now);
                bw.write("检测时间为"+str);
            }
        }
        System.out.println("自检完成，形成安全");
        Object res = pjp.proceed();
        return res;
    }
}


