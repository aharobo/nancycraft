package com.mtx.lesson1206;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 14:25
 */
public interface Animall1 {
    //对于接口来说，不能定位常规属性，只能定义final类型的属性
    public final String a="";//final修饰变量在第一次赋值之后是不能被修改
   // public String b="";
    //接口中定义方法是可以没有方法体的,只有方法名称定义
    public void fly();
    public void bb();
    default void aa(){
        System.out.println("这是接口里的方法实现");
    }

    public static void main(String[] args) {
//        Animall1 animall1=new Animall1();//接口是不能直接实例化的
        Animall1 animall1=new Bird();//接口实例化必须采用自己的实现类来进行，这里Bird类就是Animall1的实现类
        animall1.fly();
    }
}
