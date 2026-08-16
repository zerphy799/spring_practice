package com.homework;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        InputStream is = Test.class.getResourceAsStream("/bean.xml");
        SAXReader reader = new SAXReader();
        Document doc = reader.read(is);


        Element root = doc.getRootElement();
        Element beanEle = root.element("bean");
        String className = beanEle.attributeValue("class");
        Class<?> clazz = Class.forName(className);


        Object teacherObj = clazz.getDeclaredConstructor().newInstance();

        List<Element> propList = beanEle.elements("property");
        for (Element prop : propList) {
            String propName = prop.attributeValue("name");
            String propValue = prop.attributeValue("value");
            // 拼接set方法名 setName / setAddr
            String setMethodName = "set" + propName.substring(0,1).toUpperCase() + propName.substring(1);
            Method setMethod = clazz.getDeclaredMethod(setMethodName, String.class);
            setMethod.invoke(teacherObj, propValue);
        }


        System.out.println(teacherObj);
    }
    }

