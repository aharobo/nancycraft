package com.mtx.lesson1122;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 15:22
 */
public class SwitchCaseStudy {

    public static void main(String[] args) {
        String diretion="Up";
        //switch后面的小括号放的是要判断的变量
        //多个case情况下，只要一个满足其他的则不再判断，而是直接找break
        switch (diretion.toLowerCase()){
            case "up":
                System.out.println("上");
                break;
            case "down":
                System.out.println("下");
                break;
            case "left":
                System.out.println("左");
                break;
            case "right":
                System.out.println("右");
                break;
            default:
                System.out.println("啥也不是");
                break;
        }

    }
}
