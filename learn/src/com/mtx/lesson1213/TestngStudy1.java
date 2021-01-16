package com.mtx.lesson1213;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/13 13:48
 */
public class TestngStudy1 {

    //@后边带点东西，这种在java里边就叫做注解
    @BeforeSuite
    public static void beforesutie(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public static void aftersutie(){
        System.out.println("aftersutie");
    }

    @BeforeTest
    public static void BeforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public static void AfterTest(){
        System.out.println("AfterTest");
    }

    @BeforeClass
    public static void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("AfterClass");
    }

    //beforemethod标注的方法会在每一个@Test标注的测试用例执行之前执行
    @BeforeMethod
    public static void BeforeMethod(){
        System.out.println("BeforeMethod");
    }
    //aftermethod标注的方法会在每一个@Test标注的测试用例执行之后执行
    @AfterMethod
    public static void AfterMethod(){
        System.out.println("AfterMethod");
    }

    //@Test标注的方法就是所谓的测试用例
    @Test
    public void test(){
        System.out.println("这是testng");
    }
    @Test
    public void test1(){
        System.out.println("这是testng");
        Assert.fail();
    }
}
