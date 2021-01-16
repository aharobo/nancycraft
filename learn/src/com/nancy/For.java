package com.nancy;

import sun.awt.windows.WPrinterJob;

import java.lang.reflect.Array;
import java.util.Date;

public class For {
    public static void main(String[] args) {
        /*int a,b;
        b=99;
        a=b++;
        System.out.printf("%d,%d",a,b);
         */
        /*int x;
        int i;
        for (i = 2; i <3 ; x=i++) {
            System.out.println(i);
        }*/

        /*for (int j = 0; j <= 10; j++) {
            if (j%2==0) {
                System.out.println(j);
            }
        }*/

        for (int i = 0; i <8 ; ++i) {
            if(i==4){
                continue;
            }
            System.out.println(i);
        }

        System.out.printf("^^^%s^^^^",new Date());
        Date dt= new Date();
        System.out.println(dt);

        //输入某年某月某日，判断是该年的第几天
        //第一步年/月/日截取
        //1/3/5/7/8/10/12为31天
        //4/6/9/11为30天
        String dt1="2020-10-11";
        int year=Integer.parseInt(dt1.split("-")[0]);

    }
}
