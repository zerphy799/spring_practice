package com.xzit.homework;

public class Manager {
    public static void check(Student student) {
        if(student.getGender().equals("男"))
            System.out.println("可以进入");
        else System.out.println("不能进入");
    }
}
