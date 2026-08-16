package com.xzit.homework;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(Waiter.class.getClassLoader());
        enhancer.setSuperclass(Waiter.class);
        enhancer.setCallback((MethodInterceptor) (o, method,objects,methodproxy)->{
            System.out.println("你好，欢迎光临");
            Object invoke = method.invoke(waiter, objects);
            return invoke;
        });
        Enhancer enhancer1 = new Enhancer();
        enhancer1.setClassLoader(Waiter.class.getClassLoader());
        enhancer1.setSuperclass(Waiter.class);
        enhancer1.setCallback((MethodInterceptor)(o, method,objects,methodproxy)->{
            Object invoke = method.invoke(waiter, objects);
            System.out.println("慢走，欢迎再来");
            return invoke;
        });
        Waiter waiter1 = (Waiter) enhancer.create();
        Waiter waiter2 = (Waiter) enhancer1.create();
        waiter1.sal();
        System.out.println("---------------------------");
        waiter2.pay();
    }
}
