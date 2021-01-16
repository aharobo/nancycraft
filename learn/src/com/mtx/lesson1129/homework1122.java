package com.mtx.lesson1129;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/29 9:36
 */
public class homework1122 {

    public static void main(String[] args) {
        //字符串分割后做加法运算。给你一个数字，计算这个数字各个位置上数字的和
        //其中，字符串为 1234；
        String s="4567";
        int i=Integer.parseInt(s);//将一个字符串转换成一个数字
        //1.先得到千位数
        int q_i=i/1000;
        //2.得到百位数
        int b_i=i%1000/100;
        //3.得到十位数
        int s_i=i%1000%100/10;
        //4.得到个位数
        int g_i=i%1000%100%10;
        System.out.println(q_i+b_i+s_i+g_i);

//        int i=100;
//        Integer integer=new Integer(i);
//        int a=integer.intValue();

        //根据月份（1,2,3，......，10,11,12），输出季节（3 4 5春季、6 7 8夏季、9 10 11秋季、12 1 2冬季）
        int month=3;
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                break;
        }
    }
}
