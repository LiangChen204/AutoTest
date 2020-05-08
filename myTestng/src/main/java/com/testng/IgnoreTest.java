package com.testng;

import org.testng.annotations.Test;

/**
 * @author chenliang
 * @date 2020/5/5
 */
public class IgnoreTest {

    @Test
    public void ingore1(){
        System.out.println("ignore1 执行！");
    }

    @Test(enabled = false)
    public void ingore2(){
        System.out.println("ignore2 执行！");
    }

    @Test(enabled = true)
    public void ingore3(){
        System.out.println("ignore3 执行！");
    }

}
