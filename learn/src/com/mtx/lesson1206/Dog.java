package com.mtx.lesson1206;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 10:51
 */
public class Dog extends Animall{


    //子类构造方法必须先实现父类构造方法，然后才能追加自己特有的实现
    //即便父类中有很多个构造方法，子类只需要继承其中一个就不会报错
    public Dog(String name,String color){
        //this.name=name;
        super(name);//这一行表示继承了家族遗志
        this.color=color;
        //this表示的是当前对象
        //super表示的父类对象
    }

    //重写：子类和父类中的方法名称相同参数个数及类型相同，这种现象叫做重写，重写也是多态的一种表现形式
    //重写和重载的区别：
    //   1. 重载发生当前类，重写发生在子类与父类之间
    @Override
    public void run(){
        System.out.println("小狗跑的快");
    }

//    public String name;
//    public String color;
    public static void main(String[] args) {
//        Dog dog=new Dog();//实例化Dog类的一个对象
//        dog.name="狗1";
//        System.out.println(dog.name);
        Dog dog=new Dog("旺财","黑色");
        dog.run();//如果子类和父类有同名方法并且参数也一样，则执行子类的


    }
}
