package com.javabase.reflectdemo.herodemo;

/**
 * @author chenliang
 * @date 2020/5/14
 *反射的使用：
 * 1:获取类对象
 *
 *获取类对象有3种方式
 * Class.forName（）（常用）
 * Hero.class
 * new Hero().getClass()
 *
 */
public class ObjectTest {

    public static void main(String[] args) {

        String className = "com.javabase.reflectdemo.herodemo.Hero";

        try {
            //第一种获得类的方式
            Class pClass1 = Class.forName(className);
            //第二种获取类对象的方式
            Class pClass2 = Hero.class;
            //第三种获取类对象的方式
            Class pClass3 = new Hero().getClass();

            System.out.println("pClass1:" + pClass1);
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
