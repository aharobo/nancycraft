package com.mtx.lesson1206;

import java.util.Collection;
import java.util.HashMap;
/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 16:10
 */
public class StuDB {
    //{phone1=Student1,phone2=Student2,phone3=Student3},意味着stuMaps将会存储所有的学员对象
    public static HashMap<Long,Student> stuMaps=new HashMap<Long,Student>();

    //增加学员
    public static void addStu(String name,Long phone){
        if (!stuMaps.containsKey(phone)){
            Student stu=new Student(name,phone);
            stuMaps.put(stu.getPhone(),stu);
        }else{
            System.out.println(phone+"已存在，不能添加");
        }
    }
    //删除学员
    //选择手机号作为我们的删除目标比较方便
    public static boolean deleteStu(Long phone){
        if (stuMaps.containsKey(phone)){
            stuMaps.remove(phone);
            return true;
        }else{
            System.out.println(phone+"不存在");
            return false;
        }
    }
    //查询学员
    //我想用手机号或者姓名进行查询，但是他两是不一样的数据类型，所以我才用Object作为参数类型，因为Object是所有类的基类
    public static void selectStu(Object object) throws Exception{
        if (object instanceof Long){//判断object对象的类型是不是Long
            Student stu=stuMaps.get(object);
            try {
                stu.showInfo();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println(object+"不存在");
            }

        }else if(object instanceof String){//如果是字符串类型，那么传进来的就是学员姓名
            //遍历stuMaps所有的value值，因为value是每一个学员对象，判断学员的姓名和查询的是否一致，如果一致则展示该学员信息
            Collection<Student> stus=stuMaps.values();
            int count=0;
            for (Student stu : stus) {
                String name=stu.getName();//当前学员的姓名
                if (name.equals(object)){
                    stu.showInfo();
                    count++;
                }
            }
            if (count==0){
                System.out.println(object+"不存在");
            }
        }else{
            throw new Exception("参数类型不对");
        }
    }
    //增加学员成绩，并且增加展示全班平均分的业务方法，展示第一名学员的方法

    public static void main(String[] args) throws Exception {
        StuDB.addStu("张三",18900010001L);
        StuDB.addStu("李四",18900010002L);
//        boolean res=StuDB.deleteStu(18900010001L);
////        System.out.println(res);//true
////        boolean res1=StuDB.deleteStu(18900010001L);
////        System.out.println(res1);//false
////        System.out.println(StuDB.stuMaps.size());
//        try {
//            StuDB.selectStu(18900010003L);
//        }catch (Exception e){
//            System.out.println("我能搞定不用管");
//        }
        StuDB.selectStu(18900010003L);

    }

}
