package com.javabase.reflectdemo.herodemo;

import java.lang.reflect.Field;

/**
 * @author chenliang
 * @date 2020/5/14
 *  3: 获取成员变量并使用
 *  1.获取HeroPlus类的对象 new方法/第2章中的方法 h
 *  2. 获取属性 Field f1 = h.getDeclaredField("属性名")
 *  3. 修改属性 f1.set(h，实参)，注意这里的h是对象，不是类对象
 *
 */
public class ParaTest {
    public static void main(String[] args) {
        HeroPlus h = new HeroPlus();

        //使用传统方法修改name的值为garen
        h.name = "garen";

        try {
            /**
             * getField和getDeclaredField的区别
             *    getField 只能获取public的，包括从父类继承来的字段。
             *    getDeclaredField 可以获取本类所有的字段，包括private的，但是 不能获取继承来的字段。
             * (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
             *
             */
            //获取类HeroPlus的名字叫做name的字段
            Field f1 = h.getClass().getDeclaredField("name");
            //修改这个字段的值
            f1.set(h, "teemo");
            System.out.println(h.name);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
