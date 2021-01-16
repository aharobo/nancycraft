package com.mtx.lesson1122;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 14:52
 */
public class OperatorsStudy {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println(a+b);
        System.out.println(a-b);
        float f=1.2f;
        System.out.println(a*f);
        System.out.println(a/b);//因为这两数都是int，结果是0.5，但是取整后为0
        int c=3;
        System.out.println(a%3);//10除以3商个3，余数是1，取余操作就是获取余数
        //偶数、奇数
        System.out.println(a%2==0);//true,判断一个数字是否是偶数
        System.out.println(c%2==1);//true 判断一个数字是否是奇数

        System.out.println(c++);//谁在前就先打印谁,虽然打印的是3，但其实c变成了4
        //c=c+1;
        System.out.println(++c);//因为++并不是变量，是一个运算符，所以++在前则先执行自增运算，此时c变成了5，然后再打印
    }
}
