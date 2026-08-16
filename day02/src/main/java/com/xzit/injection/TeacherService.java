package com.xzit.injection;

import java.util.*;

public class TeacherService {
    private TeacherDao teacherDao;
    private String name;
    private int age;
    private String[] addrs;
    private Set<String> set;
    private List<String> list;
    private Map<String,Double> map;

    public String[] getAddrs() {
        return addrs;
    }

    public void setAddrs(String[] addrs) {
        this.addrs = addrs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Double> getMap() {
        return map;
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    private Properties properties;

    @Override
    public String toString() {
        return "TeacherService{" +
                "addrs=" + Arrays.toString(addrs) +
                ", teacherDao=" + teacherDao +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", set=" + set +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
