package com.mtx.lesson1122;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/22 13:35
 */
public class StringStudy {

    public static void main(String[] args) {
        //字符串变量的定义
        String s="mongtongxue testfan";

        //获取字符串长度

        System.out.println("字符串s的长度是"+s.length());
        float f=1.23f;
        int i=10;
        System.out.printf("小数是%f,整数是%d，字符串是%s",f,i,s);//格式化输出,不会换行

        String s1="  码同学 ";
        System.out.println();
        System.out.println(s1.trim());//去掉字符串前后的空格，不会去掉字符串中间的空格

        String s2="abcdefg";
        //只要abc
        System.out.println(s2.substring(0,3));//结束的索引是不被包含的，索引从0开始
        //只要bcde
        System.out.println(s2.substring(1,5));
        System.out.println(s2.substring(2));//表示从索引2开始到最后
        //1080*1920  从这个字符串得到1080和1920
        System.out.println(s2.replace('c','a'));

        String s3="mongtongxue testfan mongtongxue testfan mongtongxue testfan";
        //s3里的testfan都替换成mtx
        System.out.println(s3.replace("testfan","mtx"));
        String s4="/css/ddd/ffg/aasd/dfff";
        System.out.println(s4.replaceFirst("/",""));

        String s5="XX婷婷";
        System.out.println(s5.contains("婷婷"));
        String s6="hhsgGSHLEUhsIEU";
        //转换成小写
        System.out.println(s6.toLowerCase());
        //转换成大写
        System.out.println(s6.toUpperCase());
        String s7="shamo";
        String s8="SHAMO";
        System.out.println(s7.equals(s8));//false
        System.out.println(s7.equalsIgnoreCase(s8));//true

        String str = "小学,初中,高中,大专,本科,研究生,博士";
        //从str中单独拎出来各个阶段
        str.split(",");//[小学,初中,高中,大专,本科,研究生,博士]
        System.out.println(str.split(",")[0]);//小学
        System.out.println(str.split(",")[1]);//初中

        //1080*1920  从这个字符串得到1080和1920
        String str1="1080*1920";
        System.out.println(str1.split("\\*")[0]);//1080
        System.out.println(str1.split("\\*")[1]);//1920

        //判断学员姓名是否姓张
        String name="张xxx";
        String firstChar=name.substring(0,1);
        System.out.println(firstChar.equalsIgnoreCase("张"));
        System.out.println(name.startsWith("张"));
        name.replace('x','y');
        System.out.println(name);

        StringBuffer stringBuffer=new StringBuffer("码同学");
        stringBuffer.append("testfan");
        System.out.println(stringBuffer);




    }
}
