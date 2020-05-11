package com.javabase;

/**
 * @author chenliang
 * @date 2020/5/7
 * 理解java反射相关
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.testng.IgnoreTest");
        System.out.println(cls);
    }
}
