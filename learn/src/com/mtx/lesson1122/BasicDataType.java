package com.mtx.lesson1122;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 11:37
 */
public class BasicDataType {

    public static void main(String[] args) {
        //int表示的变量类型
        //a表示变量名称或者叫句柄
        //=表示赋值，是把等号后面的值赋值给等号前面的变量a
        int a=10;
        System.out.println(a);//打印语句括号里放的是你要打印的变量名称

        byte b=1;
        short s=27;
        long phone=187293999607L;

        int c=0;
        int d=c+a;
        //System.out.println(c);
        float f=1.34324346434344f;
        System.out.println(f);
        double d1=1727636.323472634673646;
        System.out.println(d1);

        //现实世界中“是”或者"否",在代码中用布尔值来表示
        boolean flag=true;
        char c1='A';//只能用来表示单个字符，必须使用单引号括起来
    }
}
