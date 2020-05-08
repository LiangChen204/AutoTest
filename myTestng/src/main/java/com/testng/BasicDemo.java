package com.testng;

import org.testng.annotations.*;

/**
 * @author chenliang
 * @date 2020/4/19
 */
public class BasicDemo {

    @Test
    public void testCase1(){
        System.out.println("测试case1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试case2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在方法运行之前");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在方法运行之前");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass是在类运行之前");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass是在类运行之前");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
