package com.mtx.lesson1129;

import java.util.Arrays;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/29 9:53
 */
public class ArrayStudy {


    public static void main(String[] args) {
        //数组是用来存储固定大小的同类型元素的一种数据结构
        //1.第一种定义方式
        //int表示这个数组里存放的数据的类型是int类型
        //[]表示这是一个数组
        //iArray数组的名称
        //{}表示数组内容，大括号内通过逗号区分不同的数组元素
        int[] iArray={56,45,23,46,26};
      //  iArray[5]=17;

        //2.第二种定义方式,只定义数组的大小，未进行赋值，后面的中括号里的数字表示数组的大小
        int[] iArray1=new int[4];
        System.out.println(iArray1[0]);//打印数组的第一个
        iArray1[0]=12;
        iArray1[1]=1;
        iArray1[2]=4;
        iArray1[3]=19;

        for(int i:iArray1){
            System.out.println(i);
        }

        //给上面的数组的每一个元素都加10
//        iArray1[0]=iArray1[0]+10;
//        iArray1[1]=iArray1[1]+10;
//        iArray1[2]=iArray1[2]+10;
//        iArray1[3]=iArray1[3]+10;
        for (int i = 0; i < iArray1.length; i++) {
            iArray1[i]=iArray1[i]+10;
            System.out.println(iArray1[i]);
        }
        //定义一个数组，用来存放学员姓名，然后再给每一个学员加上前缀"码同学"
        //第3种，也是最完整的一种数组定义方式
        String[] names=new String[]{"name1","name2","name3"};
        //itar循环的快捷键
        for (int i = 0; i < names.length; i++) {
            //String name = names[i];
            names[i]="码同学"+names[i];
        }
        //增强for循环
        //for后面紧跟的括号里写遍历的循环变量名称及数组对象(要遍历的对象)
        //冒号前写循环变量的定义，你的数组是String的,那么循环变量的类型就是String的，然后起个名字
        //冒号后就是你的循环对象
        //大括号里是循环体
        //iter快捷方式
        for(String name:names){
            System.out.println(name);
            //name=name+"aaa";
        }
        System.out.println(Arrays.toString(names));

        //用while循环能否遍历数组呢？
        int a=0;
        while(a<names.length){
            System.out.println(names[a]);
            a++;
        }

//        int[] iArray2={2,4,78,1,4,16,8,2,7,9};
//        int sum=0;
        //sum=sum+iArray2[0]
        //sum=sum+iArray2[1]
        //sum=sum+iArray2[2]
        int[] iArray2={2,4,78,1,4,16,8,2,7,9};
        int sum=0;
        for (int i : iArray2) {
            if (i%2==0&&i>10){
                sum=sum+i;
            }
        }
        System.out.println(sum);
//        Arrays.sort(iArray2);//把数组自动排序
//        System.out.println(Arrays.toString(iArray2));
        //针对上述数组进行排序，不能用自带的
        for (int i = 0; i < iArray2.length; i++) {//9
            for (int j = 0; j < iArray2.length-1-i; j++) {//8
                //两个数的交换
                int tmp;
                if (iArray2[j]<iArray2[j+1]){
                    tmp=iArray2[j+1];
                    iArray2[j+1]=iArray2[j];
                    iArray2[j]=tmp;
                }
               // System.out.println(Arrays.toString(iArray2));
            }
        }
        System.out.println(Arrays.toString(iArray2));
        //二维数组，就是数组套数组
        //int[]表示这个数组里放的每一个元素都是int数组
        // {
        // {1,3,4},
        // {2,5,3},
        // {4,2,4},
        //{7,8,2}
        // }
        int[][] iArray3={{1,3,4},{2,5,3},{4,2,4},{7,8,2}};
        System.out.println(iArray3.length);//
//        for (int i = 0; i < iArray3.length; i++) {
//            System.out.println(iArray3[i]);
//            for (int j = 0; j < iArray3[i].length; j++) {
//                System.out.println(iArray3[i][j]);
//            }
//        }
        System.out.println(iArray3[2][1]);//第一个中括号里放的是行的索引，第二个中括号里放的列的索引
        iArray3[2][1]=3;
        String[][] sArray={{"A"},{"b"},{"c"}};
    }
}
