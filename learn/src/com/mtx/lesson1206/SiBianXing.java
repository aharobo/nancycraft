package com.mtx.lesson1206;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 15:12
 */
public class SiBianXing {
    //定义一个四边形的类，有属性长和宽，可以计算面积
    public int len;//长度
    public int width;//宽度

    //四边形与生俱来就应该有长和宽，所以这里我们必须创建一个初始化方法，对长和宽进行初始赋值
    public SiBianXing(int len,int width){
        this.len=len;
        this.width=width;
    }
    public void getArea(){
        int area=this.len*this.width;
        System.out.println(area);
    }
    public void getArea(int len,int width){
        int area=len*width;
        System.out.println(area);
    }

    public static void main(String[] args) {
        SiBianXing siBianXing1=new SiBianXing(3,4);
        siBianXing1.getArea();
        SiBianXing siBianXing2=new SiBianXing(18,374);
        siBianXing2.getArea();
    }

}
