package com.mtx.lesson1213;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/13 15:22
 */
public class StuLoginTests {

    //在当前类下测试用例默认执行顺序是以测试用例方法名称的阿斯克码进行排序的

    @Test(description = "用户名错误")
    public void test001_loginUserError(){
        System.out.println("aloginUserError");
        boolean flag = LoginService.login("sdfdff", "123456");
        //期望flag是false
        Assert.assertFalse(flag);
    }

    @Test(description = "正确登录")
    public  void test002_login(){
        System.out.println("login");
        boolean flag = LoginService.login("admin", "123456");
        //期望flag是true
        //断言
        Assert.assertTrue(flag);
    }
    @Test(description = "密码错误")
    public void test003_loginPWDError(){
        System.out.println("loginPWDError");
        boolean flag = LoginService.login("admin", "1236464");
        //期望flag是false
        Assert.assertFalse(flag);
    }
    @Test(description = "密码错误")
    public void test100_loginPWDError(){
        System.out.println("loginPWDError");
        boolean flag = LoginService.login("admin", "1236464");
        //期望flag是false
        Assert.assertFalse(flag);
    }

    @DataProvider
    public Object[][] getLoginData(){
        Object[][] obj={
                {"正确登录",  "admin","123456",true},
                {"用户名不正确",  "asdff","123456",false},
                {"密码不正确",  "admin","1234567",false},
        };
        return obj;
    }
    @Test(description = "正确登录",dataProvider = "getLoginData")
    public  void test005_login(String casename,String username,String password,boolean assertValue){
        System.out.println("login");
        boolean flag = LoginService.login(username, password);
        //期望flag是true
        //断言
        Assert.assertEquals(flag,assertValue);
    }


}
