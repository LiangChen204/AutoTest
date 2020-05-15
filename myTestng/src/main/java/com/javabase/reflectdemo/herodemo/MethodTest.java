package com.javabase.reflectdemo.herodemo;

import java.lang.reflect.Method;

/**
 * @author chenliang
 * @date 2020/5/14
 * 4: 获取成员方法并使用步骤：
 * 1.获取HeroPlus类的对象 h
 * 2.获取成员方法：
 * public Method getMethod(String name ，Class<?>… parameterTypes):获取"公有方法"；（包含了父类的方法也包含Object类）
 * public Method getDeclaredMethods(String name ，Class<?>… parameterTypes) :获取成员方法，包括私有的(不包括继承的)
 * 参数解释：
 *   name : 方法名；
 *   Class … : 形参的Class类型对象
 * 3.调用方法
 * Method --> public Object invoke(Object obj,Object… args):
 * 参数说明：
 *   obj : 要调用方法的对象；
 *   args:调用方式时所传递的实参；
 *
 */
public class MethodTest {

    public static void main(String[] args) {
        HeroPlus h = new HeroPlus();

        try {

            //获取这个 名字为setName, 参数类型是String的方法
            Method m = h.getClass().getMethod("setName", String.class);
            //对h对象，调用这个方法
            m.invoke(h, "诸葛亮");
            //使用传统的方法，调用getName
            System.out.println(h.getName());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
