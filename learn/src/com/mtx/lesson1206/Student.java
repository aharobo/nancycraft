package com.mtx.lesson1206;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 15:32
 */
public class Student {



    //属性，姓名、电话、微信、qq、sex,生成get、set方法的快捷键是alt+Insert
    public String name;
    public long phone;
    public String wx;
    public String qq;
    public String sex;

    //构造方法
    public Student(String name,long phone){
        this.name=name;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getWx() {
        if (wx==null){
            wx="";
        }
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getQq() {
        if (qq==null){
            qq="";
        }
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSex() {
        if (sex==null){
            sex="";
        }
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //展示学生信息
    public void showInfo(){
        System.out.println(this.getName()+" "+this.getPhone()+" "+this.getWx()+" "+this.getQq()+" "+this.getSex());
    }

    public static void main(String[] args) {
        Student stu1=new Student("张三",18900010002L);
        System.out.println(stu1.getName());
        stu1.setName("李四");
        System.out.println(stu1.getName());
        stu1.setQq("173663663");
        stu1.setWx("Matongxue_2");
        stu1.setSex("male");
        stu1.showInfo();
//        Student stu=null;
//        stu.showInfo();
    }

}
