package com.mtx.lesson1213;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/13 11:11
 */
public class LoginService {

    //登录方法
    public  static boolean login(String username,String password){
        if (username.equals("admin")&&password.equals("123456")){
            return true;
        }else{
            return false;
        }
    }
}
