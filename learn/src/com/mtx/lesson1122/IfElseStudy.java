package com.mtx.lesson1122;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 15:05
 */
public class IfElseStudy {
    public static void main(String[] args) {
        int score=80;
        //90分以上是优秀，80-90之间是良好，70-80之间是一般，60-70之间是及格，其他的不及格
        //if后的小括号里放的是判断的表达式
        //在if else条件里只会满足一个分支，如果一个分支条件满足则其他分支不会被执行
        if (score>=90){
            System.out.println("优秀");
        }else if (score>=70&&score<80){//&&表示的前后的条件都为true，那么整体结果才为true
            System.out.println("一般");
        }else if (score>=80&&score<90){
            System.out.println("良好");
        }else if (score>=60&&score<70){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        String name="张X虎";
        //判断学员姓名姓张或者姓名包含虎字
        if (name.startsWith("张")||name.contains("虎")){//两个竖线表示或者，或者的意思是前后的表达式只要有一个为true，则整体结果就为true
            System.out.println(name+" 符合条件");
        }
        if (!name.startsWith("张")){//!表示取反，后面的表达式如果是true，取反后是false
            System.out.println("你不姓张");
        }
    }
}
