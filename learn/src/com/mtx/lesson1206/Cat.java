package com.mtx.lesson1206;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 10:09
 */
public class Cat {
    //有名字
    public String name;//叫做属性
    public String color;//叫做属性
    public static int legs;//static所修饰变量叫做类变量或者类属性，也叫作静态比变量，可以直接采用类进行调用，而不用先实例化对象
    //static所修饰的变量或者方法或者代码块，是随着类的加载而被加载的，因此可以直接采用类进行调用


    //构造方法，是用来在创建该类的对象时做的一些初始化操作
    //构造方法的名称必须和当前类名称一致
    //()里用来定义需要的参数
    public Cat(String name,String color){
//        name="咖啡猫";
//        color="咖啡色";
        this.name=name;
        this.color=color;
    }
    //任何类都有构造方法，如果未进行自定义则有默认的空的构造方法
    //但是如果该类有了自定义的构造方法则默认的会替掉，除非再次自定义一个空的构造方法
    public Cat(){
        //这就是空的构造方法
    }

    public Cat(String color){
        this.color=color;
    }

    //static所修饰的方法叫做类方法，也叫作静态方法，可以直接采用类进行调用，而不用先实例化对象
    public static int max(int a,int b){
       // add(1,2);
        if (a>b){
            return a;
        }else{
            return b;
        }

    }


    //把对象所具备的一些行为可以用方法表示
    //public 表示方法的访问权限
    //void 这个位置上表示方法的返回值类型，void表示没有返回值
    //eatFish 表示方法名称
    //() 表示方法参数
    //{} 方法具体代码实现
    public void eatFish(){
        System.out.println(this.name+"爱吃鱼");
    }


    //return 后面跟的数据是什么类型的，那么方法的返回值位置上就写什么类型
    //重载：在当前类下方法名称相同，但是参数类型不同或者参数个数不同的叫做重载，重载是多态的其中一种形式
    public int add(int a,int b){
//        int a=10;
//        int b=20;
        System.out.println(a+b);
        return a+b;
    }
    public int add(int a,int b,int c){
//        int a=10;
//        int b=20;
        System.out.println(a+b+c);
        Cat.legs=9;
        return a+b+c;
    }

    public double add(double a,double b){
        return a+b;
    }

    public String add(String s1,String s2){
        return s1+s2;
    }

//    public Dog getDog(){
//        Dog dog=new Dog();
//        //return new Dog();
//        return dog;
//    }
    public Cat[] getCats(int num){
        //int[] a=new int[num];
        Cat[] cats=new Cat[num];//初始化一个Cat类型的数组
        for (int i = 0; i < num; i++) {
           cats[i]=new Cat();//针对cats元素里的每一个进行赋值操作
        }
        return cats;
    }



    public static void main(String[] args) {

        Cat.legs=4;
        int max=Cat.max(3,5);

        Cat cat5=new Cat();
        System.out.println(cat5.name);
        //System.out.println(Cat.name);
        int count=cat5.add(28737827,3737473);
        int res=cat5.add(count,12);
        System.out.println(res);

//        Cat cat4=new Cat("灰白");
//        cat4.name="小灰白";
//
//        //根据模板Cat类我可以创造实实在在的具体的某一只猫
//        //new关键字代表去实例化一个对象
//        Cat cat1=new Cat("咖啡猫","咖啡色");
//        System.out.println(cat1.name);
////        cat1.name="咖啡猫";
////        cat1.color="咖啡色";
//        //cat1.eatFish();
//
//        //再根据模板创造一只
//        Cat cat2=new Cat("小灰","灰色");
//        System.out.println(cat2.name);
////        cat2.name="小灰";
////        cat2.color="灰色";
//
//        Cat cat3=new Cat("小白","白色");
//        System.out.println(cat3.name);


    }


}
