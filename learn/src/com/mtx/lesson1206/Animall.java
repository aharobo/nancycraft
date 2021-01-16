package com.mtx.lesson1206;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 13:36
 */
public class Animall {

    //访问修饰符有四种
    //public 权限最大，谁都可以访问
    //private 权限最小，只有自己可以访问

    public String name;
    public String color;
    private int legs;//私有属性，子类也不能访问

    public Animall(String name){
        this.name=name;
    }
    public Animall(){
    }

    public void run(){
        System.out.println("大家都会跑，看谁跑的快");
    }

    public static void main(String[] args) {
        Animall animall=new Animall();
        List<String> ss=new ArrayList<String>();
        Set<String> ssa=new HashSet<String>();

        //定义一个四边形的类，有属性长和宽，可以计算面积
    }
}
