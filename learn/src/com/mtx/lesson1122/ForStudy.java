package com.mtx.lesson1122;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 16:02
 */
public class ForStudy {
    public static void main(String[] args) {
        //i表示的循环变量，用来控制循环的次数的
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //输出100以内的奇数
        //第一次
        //1：int i=0;定一个循环变量i，初始值是0
        //2: i <100 ; 判断条件表达式是否满足，如果满足则执行for里的代码，如果不满足则循环终止
        //3: 执行奇数判读及输出
        //4: i++；循环执行完一次以后将循环变量自增1，此时i=1

        //第二次
        //1: i <100 ; 判断条件表达式是否满足，如果满足则执行for里的代码，如果不满足则循环终止
        //2: 执行奇数判读及输出
        //3: i++；循环执行完一次以后将循环变量自增1，此时i=2

        //第三次
        //1: i <100 ; 判断条件表达式是否满足，如果满足则执行for里的代码，如果不满足则循环终止
        //2: 执行奇数判读及输出
        //3: i++；循环执行完一次以后将循环变量自增1，此时i=3

        for (int i = 0; i <100 ; i++) {
            if (i%2==1){
                System.out.println(i);
            }
        }

        //循环变量在循环外部进行定义
        //计算100以内的数字和
        //计算100以内的所有7的倍数的数字和
        int j=0;
        int sum=0;//sum+0=0;  sum=sum+1;sum=sum+2
        for (; j < 100; j++) {
            if (j%7!=0){
                continue;//如果除以7余数不等于0，说明不是7的倍数，那么就跳过本次循环，执行下一次循环
            }
            sum=sum+j;
        }
        System.out.println(sum+j);

        for (int i = 0; i < 5; i++) {
            if (i==2){
                break;
            }
            System.out.println(i);
        }


    }
}
