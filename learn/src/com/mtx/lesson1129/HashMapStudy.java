package com.mtx.lesson1129;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/29 15:14
 */
public class HashMapStudy {
    public static void main(String[] args) {
        //存储多个学员姓名和成绩
        //{"张三"：89，"李四"：90，"王五"：86}，键值对类型的数据
        HashMap<String,Double> stuMaps=new HashMap<String,Double>();
        System.out.println(stuMaps.size());//获取map对象的大小
        stuMaps.put("张三",89d);//添加数据
        stuMaps.put("李四",90d);
        stuMaps.put("王五",86d);
        //map对象也是无序的
        System.out.println(stuMaps.get("张三"));//获取张三的成绩
        //hashMap对象的key不能重复，如果再次put一个已经存在的key，则会替换原有的
        stuMaps.put("张三",99d);//
        System.out.println(stuMaps.size());//获取map对象的大小
        System.out.println(stuMaps.get("张三"));//获取张三的成绩
        stuMaps.replace("李四",92d);//这才是真正的修改，将李四的成绩修改成92
       // stuMaps.remove("王五");//通过key去删除某个元素

        //打印map里所有的键值对
        //第一种遍历
        Set<Map.Entry<String,Double>> entrySet=stuMaps.entrySet();//一个键值对就可以理解成是一个entry,该方法是说把所有的键值对转换成一个set集合
        for (Map.Entry<String, Double> stringDoubleEntry : entrySet) {
            String key=stringDoubleEntry.getKey();
            Double value=stringDoubleEntry.getValue();
            System.out.println(key+":"+value);
        }

        //遍历所有的value
        Collection<Double> values=stuMaps.values();//得到所有的value值，存在Collection集合里
        for (Double value : values) {
            System.out.println(value);
        }

        //遍历所有的key
        Set<String> keys=stuMaps.keySet();//得到所有的key，存在set集合里
        for (String key : keys) {
            System.out.println(key);
        }

        //计算出全班平均分，并且打印出第一名的姓名和成绩
        //平均分：成绩总和除以班级总人数
        //第一名：找全班成绩的最大数

        Set<Map.Entry<String,Double>> entrySet1=stuMaps.entrySet();//一个键值对就可以理解成是一个entry,该方法是说把所有的键值对转换成一个set集合
        Double sum=0d;
        Double max=0d;
        for (Map.Entry<String, Double> stringDoubleEntry : entrySet1) {
            String key=stringDoubleEntry.getKey();
            Double value=stringDoubleEntry.getValue();
            System.out.println(key+":"+value);
            sum=sum+value;
            max=Math.max(max,value);
        }
        System.out.println("成绩总和是："+sum);
        System.out.println("平局分是："+sum/stuMaps.size());
        for (Map.Entry<String, Double> stringDoubleEntry : entrySet1) {
            String key=stringDoubleEntry.getKey();
            Double value=stringDoubleEntry.getValue();
            if (max.equals(value)){
                System.out.println("第一名是："+key+":"+value);
            }
        }

        //如果已经存在key了就不用加了，不存在就加
        if(!stuMaps.containsKey("张三三")){
            stuMaps.put("张三",78d);
        }

        int[] iArray={2,6,3,8,4,7,1,2};
        //借助中间变量
        int tmp=iArray[0];
        //用tmp逐个的和数组的元素进行对比，如果比tmp大，则把数组当前值赋值给tmp
        //tmp=6
        //tmp=8
        for (int i : iArray) {
            tmp=Math.max(tmp,i);
        }
        System.out.println(tmp);


        HashMap<String,Double> stuMaps1=new HashMap<String,Double>();
        System.out.println(stuMaps.size());//获取map对象的大小
        stuMaps1.put("张三",89d);//添加数据
        stuMaps1.put("李四",90d);
        stuMaps1.put("王五",86d);

        //对比stuMaps和stuMaps1
        //遍历所有的key
        Set<String> keys1=stuMaps.keySet();//得到所有的key，存在set集合里
        for (String key : keys1) {
            if (stuMaps1.containsKey(key)){
                Double value=stuMaps.get(key);
                Double value1=stuMaps1.get(key);
                if (value.equals(value1)){
                    continue;
                }else{
                    System.out.println("我们不一样");
                    System.out.println("在key:"+key+"上stuMaps的value是："+value+" stuMaps1的value是："+value1);
                    break;
                }
            }else{
                System.out.println("我们不一样");
                System.out.println("stuMaps有key:"+key+"而stuMaps1没有这个key:"+key);
                break;
            }
        }



    }
}
