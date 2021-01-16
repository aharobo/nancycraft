package com.mtx.lesson1122;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 16:51
 */
public class Lianxi1 {
    public static void main(String[] args) {
        //输入某年某月某日，判断这一天是这一年的第几天
        String date="2020-11-22";
        //11月，前10个月的天数相加+22
        int year=Integer.parseInt(date.split("-")[0]);//date分割以后取到数字是字符串，所以采用Integer.parseInt将其转换成数字类型
        int month=Integer.parseInt(date.split("-")[1]);
        int day=Integer.parseInt(date.split("-")[2]);

        //1/3/5/7/8/10/12  这些都是31天
        //4/6/9/11 这是都是30天
        //2 闰年是29，普通年是28
        int sum=0;
        for (int i = 1; i < month; i++) {
//            if (i==1||i==3||i==5||i==7||i==8||i==10||i==12){
////                sum=sum+31;
////            }else if (i==4||i==6||i==9||i==11){
////                sum=sum+30;
////            }else if (i==2){
////                //要判断年是否是闰年
////                if ((year%4==0&&year%100!=0)||year%400==0){
////                    sum=sum+29;
////                }else {
////                    sum=sum+28;
////                }
////            }
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum=sum+31;
                    break;
                case 2:
                    //要判断年是否是闰年
                    if ((year%4==0&&year%100!=0)||year%400==0){
                        sum=sum+29;
                    }else {
                        sum=sum+28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum=sum+30;
                    break;
            }
        }
        sum=sum+day;
        System.out.printf("%s是%d年的第%d天",date,year,sum);
    }
}
