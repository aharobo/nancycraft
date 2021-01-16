package com.mtx.lesson1129;

import java.util.Scanner;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/29 11:42
 */
public class ScannerStudy {


    public static void main(String[] args) {
        //随便输入两个数字，打印两个数的最大数
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int first=scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int second=scanner.nextInt();
        System.out.println(Math.max(first,second));
    }
}
