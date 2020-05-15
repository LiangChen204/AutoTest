package com.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author chenliang
 * @date 2020/4/19
 */
public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa", "aaa");
    }

    @Test
    public void logoDemo(){
        String a = "kkkkkk";
        Reporter.log("这个是我们自己写的日志" + a);
        throw new RuntimeException("这是我自己的运行时异常");
    }


}
