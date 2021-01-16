package com.mtx.lesson1122;

import java.util.Random;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 15:46
 */
public class WhileStudy {
    public static void main(String[] args) {

        //while后面的括号是放条件表达式
        int i=10;
//        while (i>10){
//            System.out.println("抄课文"+i);
//            //每循环一次让i减个1
//            i--;
//        }
        //先执行再判断
        do{
            System.out.println("抄课文"+i);
            i--;
        }while (i>10);//while后面的小括号还是条件表达式

        int j=5;
        int k=5;
        //随机生成一个k和j的值不一样
//        Math.random();//默认是生成0到1之间的一个数
//        System.out.println((int)(Math.random()*10));

        do {
            k=(int)(Math.random()*10);
        }while (k==j);
        System.out.println(k);


    }
}
