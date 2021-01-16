package com.mtx.lesson1129;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/29 14:29
 */
public class SetStudy {

    public static void main(String[] args) {
        //定义一个set集合
        HashSet<String> set=new HashSet<String>();
        System.out.println(set.size());//获取集合的大小
        set.add("张三");//添加元素
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        //特点1：set集合是无序的
        Object[] setArray=set.toArray();//换换成数组以后就可以按照索引访问了
        System.out.println(setArray[2]);
        //特点2：set的数据是不能重复的
        set.add("张三");
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }

        set.remove("张三");//删除元素

        //list和set的区别：list是有序的，set是无序的
        //               list的元素可以重复，set的元素不能重复
        //               list里可以随意插入和修改，set是无序所以所谓插入不插入并且不能修改元素


        //i am shamo, shamo is mtx teacher,mtx is very good,i love mtx
        //统计mtx单词出现的次数
        String s="i am shamo, shamo is mtx teacher,mtx is very good,i love mtx";
        String[] sArray=s.split(" |,");
        System.out.println(Arrays.toString(sArray));
        int count=0;
        for (String s1 : sArray) {
            if (s1.equalsIgnoreCase("mtx")){
                count=count+1;//count++
            }
        }
        System.out.println(count);




    }
}
