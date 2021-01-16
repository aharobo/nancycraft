package com.mtx.lesson1213;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/13 14:39
 */
public class TestngStudy3 {

    @Test//(priority = 2)
    public void test001_testAdd(){
        System.out.println("TestngStudy3 testAdd");
        int a=10;
        int b=20;
        int sum=a+b;
        //System.out.println(sum);
        //断言，就是判断结果的地方
        //第一个参数实际结果，第二个参数是期望结果
        Assert.assertEquals(sum,30,"加法计算失败了");
    }
}
