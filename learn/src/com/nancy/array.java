package com.nancy;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arrays={34,24,3,13,67,11,70,-3,-78};
        int[] result=new int[arrays.length];
        //第一种
        for (int i = 0; i <arrays.length ; i++) {
            for (int j = i+1; j < arrays.length; j++) {
                int a=0;
                    if (arrays[i]>arrays[j]) {
                        a = arrays[j];
                        arrays[j] = arrays[i];
                        arrays[i] = a;
                    }
            }
        }
        System.out.println(Arrays.toString(arrays));
        //第二种
        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j < arrays.length; j++) {
                int b=(int)Double.NEGATIVE_INFINITY;
                if(arrays[j]>b){
                        if(arrays[i]>arrays[j]){
                            b=arrays[j];
                        }else{
                            b=arrays[i];
                        }
                        result[i]=b;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        Scanner scanner=new Scanner(System.in);
    }
}
