package com.testng.suit;

import org.testng.annotations.*;

/**
 * @author chenliang
 * @date 2020/5/5
 */
public class SuitConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行啦");
    }

    @BeforeTest
    public void beforeClass(){
        System.out.println("beforeTest运行啦");
    }

    @AfterTest
    public void afterClass(){
        System.out.println("afterTest运行啦");
    }

}
