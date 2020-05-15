package com.javabase.reflectdemo.service;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author chenliang
 * @date 2020/5/15
 * 通过使用反射来越过泛型
 */
public class GenericityTest {
    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        list.add("this");
        list.add("is");

        /*
        list.add(5)会报错
        所以越过范型检查
         */

        //获取ArrayList的Class对象，反向的调用add()方法，添加数据
        Class listClass = list.getClass();
        //获取add()方法
        Method m = listClass.getMethod("add", Object.class);
        //调用add()方法
        m.invoke(list, 5);

        //遍历集合
        for (Object obj: list
             ) {
            System.out.println(obj);

        }

    }
}
