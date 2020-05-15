package com.javabase.reflectdemo.herodemo;

/**
 * @author chenliang
 * @date 2020/5/14
 **/

public class HeroPlus {
    public String name;
    public float hp;
    public int damage;
    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroPlus() {
    }

    public HeroPlus(String string) {
        name = string;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + "]";
    }

    public boolean isDead(){
        return false;
    }

    public void attackHero(HeroPlus h2){
        System.out.println(this.name + "正在攻击" + h2.getName());
    }

    public static void main(String[] args) {
        System.out.println("执行main方法");
    }

}
