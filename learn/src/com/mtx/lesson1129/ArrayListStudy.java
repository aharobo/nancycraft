package com.mtx.lesson1129;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/29 11:46
 */
public class ArrayListStudy {

    public static void main(String[] args) {
        //ArrayList定义
        //定义了一个可以存放字符串类型的list对象
        //<>里边写的就是可以存放的数据元素的类型
        ArrayList<String> strList=new ArrayList<String>();
        System.out.println(strList.size());//strList.size()表示得到这个集合的大小
        strList.add("张三");//增加元素
        System.out.println(strList.size());
        //strList.remove("张三");//删除元素
//        System.out.println(strList.size());
        strList.set(0,"张三三");//修改元素
        System.out.println(strList.get(0));//获取元素
        strList.add("李四");
        strList.add("王五");
        for (String s : strList) {
            System.out.println(s);
        }
        strList.add(1,"李二四");//在某个位置上插入某个元素
        System.out.println();
        strList.add(4,"赵六");
        for (String s : strList) {
            System.out.println(s);
        }
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        //定一个一个集合，用来存放整数
        ArrayList<Integer> iList=new ArrayList<Integer>();
        iList.add(1);
        iList.add(4);
        iList.add(89);

        //将iList这个集合转换成数组
        //1.定义一个和集合大小一样的数组
        int[] iArray=new int[iList.size()];
        //2.遍历集合，同时赋值数组
        for (int i = 0; i < iList.size(); i++) {
            iArray[i]=iList.get(i);
        }
        System.out.println(Arrays.toString(iArray));
        Object[] oArray=iList.toArray();//集合转数组

        Integer[] inArray=iList.toArray(new Integer[iList.size()]);//集合转数组

        Arrays.asList(iArray);//数组转成集合


        //定一个一个集合，用来存放double类型
        ArrayList<Double> dList=new ArrayList<Double>();

        //最重要的一个区别，数组的大小是固定不变的，集合的大小是动态变化

        //练习：数组转集合，不使用自带转换方法
        //判断集合中是否包含某个元素
        if (strList.contains("赵")){//特别注意的是这里的包含指的是包含某个元素的整体
            System.out.println("已存在");
        }else{
            System.out.println("不包含");
        }

        //要求定一个集合里专门用来存放字符串数组的对象
        ArrayList<String[]> arrayList=new ArrayList<String[]>();
        //产品部门的人
        String[] cArray={"A","B","C"};
        //研发部门的人
        String[] yArray={"D","E","F","F1","F2"};
        //测试部门的人
        String[] tArray={"G","H","I"};
        arrayList.add(cArray);
        arrayList.add(yArray);
        arrayList.add(tArray);
        //打出所有人的名单
        for (String[] strings : arrayList) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
}
