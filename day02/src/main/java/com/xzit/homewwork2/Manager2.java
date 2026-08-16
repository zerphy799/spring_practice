package com.xzit.homewwork2;

public class Manager2 {
    public static void check(Student1 student) {

        switch (student.getLibraryCard()) {
            case "红色A类借书证":
                System.out.println("可以借到《java基础图书》");
            break;
            case "红色B类借书证":
                System.out.println("可以借到《html》");
                break;
            case "蓝色A类借书证":
                System.out.println("可以借到《oracle数据库》");
                break;
            default:
                System.out.println("可以借到《三国演义》");
                break;
        }
    }
}
