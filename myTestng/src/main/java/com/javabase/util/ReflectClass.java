package com.javabase.util;

import com.javabase.reflectdemo.Book;

import java.util.logging.Logger;

/**
 * @author chenliang
 * @date 2020/5/8
 * 封装反射逻辑
 */
public class ReflectClass {
    private final static String TAG = "";

    //创建对象
    public static void reflectNewInstance(){
        try{
            Class<?> classBook = Class.forName("com.javabase.reflectdemo.Book");
            Object objectBook = classBook.newInstance();
            Book book = (Book)objectBook;
            book.setName("太阳之子");
            book.setAuthor("铁皮枫斗");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
