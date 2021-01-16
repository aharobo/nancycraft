package com.mtx.lesson1206;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 9:34
 */
public class Homeowork1129 {

    public static void main(String[] args) {
        //给定一个list集合，存储内容如下：AA,BB,CC,AA,cc,DD,BB,ee,Bb，输出所有的重复元素和他的重复次数
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add("CC");
        arrayList.add("AA");
        arrayList.add("cc");
        arrayList.add("DD");
        arrayList.add("BB");
        arrayList.add("ee");
        arrayList.add("Bb");
        //有对应关系的数据
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        //{"AA":1,"BB":1,"CC":1}

        for (int i = 0; i < arrayList.size(); i++) {
            int count=1;
            for (int j = i+1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equalsIgnoreCase(arrayList.get(j))){
                    count++;
                }

            }
            if (!hashMap.containsKey(arrayList.get(i))){
                hashMap.put(arrayList.get(i),count);
            }

        }

        Set sets=hashMap.entrySet();
        for (Object set : sets) {
            Map.Entry entry=(Map.Entry)set;
            if ((Integer)entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }

        }
    }
}
