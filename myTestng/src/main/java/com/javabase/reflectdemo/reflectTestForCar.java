package com.javabase.reflectdemo;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author chenliang
 * @date 2020/5/11
 */
public class reflectTestForCar {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过类加载器加载car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("com.javabase.reflectdemo.Car");

        //获取类的默认构造器并通过它实例化Car
        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car)cons.newInstance();

        //通过反射方法设置属性
            Method setBrand = clazz.getMethod("setBrand", String.class);
            setBrand.invoke(car, "红旗🚩");
            Method setColor = clazz.getMethod("setColor", String.class);
            setColor.invoke(car, "黑色");
            Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
            setMaxSpeed.invoke(car, 200);
            Method introduce = clazz.getMethod("introduce", (Class[])null);
            introduce.invoke(car);

    }

}
