package com.javabase.reflectdemo;

import java.lang.reflect.Method;

/**
 * @author chenliang
 * @date 2020/5/11
 * 反射机制的简单demo
 */
public class reflectSimpleDemo {
    public static void main(String[] args) {
        //获得字节码对象
        Class clazz = reflectSimpleTest.class;
        //获得Method对象（传入方法名，参数类型）
        try{
            Method method = clazz.getDeclaredMethod("test", String.class);
            //通过字节码对象创建一个Object
            Object obj = clazz.newInstance();
            //通过Method 对象调用方法
            method.invoke(obj, "hello");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
