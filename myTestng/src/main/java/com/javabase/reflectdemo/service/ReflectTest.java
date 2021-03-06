package com.javabase.reflectdemo.service;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author chenliang
 * @date 2020/5/15
 */
public class ReflectTest {

    /*
    1. @SuppressWarnings("unchecked")  [^ 抑制单类型的警告]
    2. @SuppressWarnings("unchecked","rawtypes")  [^ 抑制多类型的警告]
    3. @SuppressWarnings("all")  [^ 抑制所有类型的警告]
     */
    @SuppressWarnings({"unchecked","rawtypes"})
    public static void main(String[] args) throws Exception{
        //从spring.txt中获取类名称和方法名称
        File springConfigFile = new File("/Users/liangchen/IdeaProjects/AutoTest/myTestng/src/spring.txt");
        Properties springConfig = new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String)springConfig.get("class");
        String methodName = (String)springConfig.get("method");

        //根据类名称获取类对象
        Class clazz = Class.forName(className);
        //根据方法名称，获取方法对象
        Method m = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器，实例化对象
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);

    }
}
