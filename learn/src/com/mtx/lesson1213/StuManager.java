package com.mtx.lesson1213;

import java.util.Scanner;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/13 11:13
 */
public class StuManager {

    public static void main(String[] args) {
        //和控制台交互
        Scanner scanner=new Scanner(System.in);
        //登录
        System.out.println("请输入用户名：");
        String username=scanner.next();
        System.out.println("请输入密码：");
        String password=scanner.next();
        boolean login = LoginService.login(username, password);
        if (login){
            //进入系统
            System.out.println("=======欢迎登录码同学学员管理系统========");
            boolean flag=true;
            while(flag){
                System.out.println("1.查询；2.增加；3.修改；4.删除；5.平均分；6.第一名；7.退出");
                System.out.println("请输入你的操作：");
                int operator = scanner.nextInt();
                switch(operator){
                    case 1:
                        System.out.println("请输入手机号或者姓名：");
                        String object=scanner.next();
                        Long l;
                        try {
                            l= Long.valueOf(object);
                            StuDB.selectStu(l);
                        }catch (Exception e){
                            try {
                                StuDB.selectStu(object);
                            }catch (Exception e1){
                                e1.printStackTrace();
                            }
                        }
                        break;
                    case 2:
                        //增加学员
                        System.out.println("请输入姓名：");
                        String name=scanner.next();
                        System.out.println("请输入手机号：");
                        Long phone=scanner.nextLong();
                        StuDB.addStu(name,phone);
                        break;
                    case 3:
                        //修改学员
                        System.out.println("请输入手机号：");
                        Long phone1=scanner.nextLong();
                        System.out.println("请输入属性：");
                        String attrName=scanner.next();
                        System.out.println("请输入属性值：");
                        String value=scanner.next();
                        //StuDB.addStu(name,phone);
                        StuDB.modifyStu(phone1,attrName,value);
                        break;
                    case 4:
                        //删除学员
                        System.out.println("请输入手机号：");
                        Long phone2=scanner.nextLong();
                        StuDB.deleteStu(phone2);
                        break;
                    case 5:
                        //展示平均分
                        StuDB.getAvg();
                        break;
                    case 6:
                        //展示第一名
                        StuDB.showFirst();
                        break;
                    case 7:
                        System.out.println("退出成功");
                        flag=false;
                        break;
                    default:
                        break;

                }
            }
        }else{
            System.out.println("用户名或密码错误，请重新输入");
        }

    }
}
