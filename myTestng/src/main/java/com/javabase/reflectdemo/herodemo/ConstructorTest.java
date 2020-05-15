package com.javabase.reflectdemo.herodemo;

import java.lang.reflect.Constructor;

/**
 * @author chenliang
 * @date 2020/5/14
 * 2.利用反射机制创建对象步骤:
 *1.获取类对象 Class class = Class.forName("pojo.Hero");
 * 2.获取构造器对象 Constructor con = clazz.getConstructor(形参.class);
 * 3 获取对象 Hero hero =con.newInstance(实参);
 *
 */
public class ConstructorTest {
    /*
    * 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
	 *
	 * 1.获取构造方法：
	 * 		1).批量的方法：
	 * 			public Constructor[] getConstructors()：所有"公有的"构造方法
	            public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)

	 * 		2).获取单个的方法，并调用：
	 * 			public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
	 * 			public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
	 *
	 * 2.创建对象
	 * 		Constructor对象调用newInstance(Object... initargs)
	 */

    public static void main(String[] args) throws Exception {

        //1.加载Class对象
        Class clazz = Class.forName("com.javabase.reflectdemo.herodemo.Hero");

        //2.获取所有公有的构造方法
        System.out.println("*****************所有公有构造方法*********************");
        Constructor[] conArray = clazz.getConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        System.out.println("*********************所有的构造方法(包括：私有、受保护、默认、公有)*********************");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        System.out.println("*********************获取无参公有的构造方法*********************");
        Constructor con = clazz.getConstructor(null);
        System.out.println("con = " + con);
        //调用构造方法
        Object obj = con.newInstance();


        System.out.println("*********************获取私有构造方法，并调用*********************");
        con = clazz.getDeclaredConstructor(float.class);
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);//暴力访问
        obj = con.newInstance(100);


    }



}
