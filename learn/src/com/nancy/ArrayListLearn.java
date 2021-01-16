package com.nancy;

import java.util.*;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<String>();
        String[] st={"张三","李四","王五"};
        //ar.addAll(Arrays.asList(st));
        //for (String s : ar) {
//            System.out.println(s);
//        }
        List<String> sr1=Arrays.asList(st);
        ar.addAll(sr1);
        for (String s : ar) {
            System.out.println(s);
        }
        Set set=new HashSet();
        set.spliterator();
    }
}
