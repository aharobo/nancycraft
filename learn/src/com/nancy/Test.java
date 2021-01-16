package com.nancy;

import java.util.Scanner;

public class Test{
    
    public static void main(String[] args) {
        //正方形面积计算
        Scanner scanner=new Scanner(System.in);
        Double width=scanner.nextDouble();
        ZhengFangXing zfx=new ZhengFangXing(width);
        System.out.println("正方形的面积等于："+zfx.getArea());
        //长方形面积计算
        Scanner scanner1=new Scanner(System.in);
        Double width1=scanner1.nextDouble();
        Scanner scanner2=new Scanner(System.in);
        Double height=scanner2.nextDouble();
        JuXing jx=new JuXing(width1,height);
        Double area1=jx.getArea();
        System.out.println("长方形的面积等于："+area1);
    }
}
