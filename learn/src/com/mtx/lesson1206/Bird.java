package com.mtx.lesson1206;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 14:31
 */
public class Bird extends Animall implements Animall1{


    //子类在实现接口类时，必须实现接口中已定义但未实现的方法
    @Override
    public void fly(){
        System.out.println("这是bird这个类实现的fly");
    }
    @Override
    public void bb(){
        System.out.println("这是bird这个类实现的bb");
    }
}
