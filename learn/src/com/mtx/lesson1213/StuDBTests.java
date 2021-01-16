package com.mtx.lesson1213;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/13 15:46
 */
public class StuDBTests {

    @Test(description = "成功登录")
    public void test001_login(){
       // System.out.println("login");
        boolean flag = LoginService.login("admin", "123456");
        //期望flag是true
        //断言
        Assert.assertTrue(flag);
    }
    @Test(description = "增加学员正确",dependsOnMethods = "test001_login")
    public void test002_addStu(){
        System.out.println("添加学员");
        boolean flag = StuDB.addStu("张三", 18900001001L);
        Assert.assertTrue(flag);//判断返回结果是不是true能不能满足我的断言需求呢
        //做数据判断断言
        Student student = StuDB.stuMaps.get(18900001001L);
        Assert.assertNotNull(student);//判断学员对象不是null，说明学员已经加进去了
        String name = student.getName();
        Assert.assertEquals(name,"张三");
    }
    @Test(description = "增加学员手机号已存在",dependsOnMethods = "test001_login")
    public void test003_addStu(){
       // System.out.println("添加学员");
        boolean flag = StuDB.addStu("张三", 18900001001L);
        Assert.assertFalse(flag);
    }
    @Test(description = "删除学员成功",dependsOnMethods = {"test001_login","test002_addStu"})
    public void test004_deleteStu(){
        boolean flag = StuDB.deleteStu(18900001001L);
        Assert.assertTrue(flag);
        boolean b = StuDB.stuMaps.containsKey(18900001001L);
        Assert.assertFalse(b);//没有这个key了就说明学员删除了
    }
    @Test(description = "查询学员-按手机号查询有结果")
    public void test005_selectStu() throws  Exception{
        StuDB.addStu("张三", 18900001001L);
        StuDB.addStu("张三", 18900001002L);
        List<Student> students = StuDB.selectStu(18900001001L);
        String name = students.get(0).getName();
        Assert.assertEquals(name,"张三");
    }
    @Test(description = "查询学员-按手机号查询没结果")
    public void test006_selectStu() throws  Exception{
        StuDB.addStu("张三", 18900001001L);
        StuDB.addStu("张三", 18900001002L);
        List<Student> students = StuDB.selectStu(18900001003L);
        Assert.assertEquals(students.size(),0);
    }
    @Test(description = "查询学员-按姓名查询有结果")
    public void test007_selectStu() throws  Exception{
        StuDB.addStu("张三", 18900001001L);
        StuDB.addStu("张三", 18900001002L);
        List<Student> students = StuDB.selectStu("张三");
        for (Student student : students) {
            String name = student.getName();
            Assert.assertEquals(name,"张三");
        }
    }
    @Test(description = "查询学员-按姓名查询没结果")
    public void test008_selectStu() throws  Exception{
        StuDB.addStu("张三", 18900001001L);
        StuDB.addStu("张三", 18900001002L);
        List<Student> students = StuDB.selectStu("张ss");
        Assert.assertEquals(students.size(),0);
    }
    @Test(description = "修改学员-修改姓名")
    public void test009_modifyStu() throws  Exception{
        StuDB.modifyStu(18900001001L,"name","李四");
        Student student = StuDB.stuMaps.get(18900001001L);
        String name = student.getName();
        Assert.assertEquals(name,"李四");
    }
    @Test(description = "修改学员-修改wx")
    public void test010_modifyStu() throws  Exception{
        StuDB.modifyStu(18900001001L,"wx","asdsdsd");
        Student student = StuDB.stuMaps.get(18900001001L);
        String wx = student.getWx();
        Assert.assertEquals(wx,"asdsdsd");
    }
    //该注解所标注的方法是用来提供测试数据的，该方法的返回值必须是一个二维数组
    @DataProvider
    public Object[][] getModifyData(){
        Object[][] obj={
                {"修改学员姓名",  18900001001L,"name","李四"},
                {"修改学员微信",  18900001001L,"wx"," dffff"},
                {"修改学员QQ",    18900001001L,"qq",  "3245455"},
                {"修改学员性别",  18900001001L,"sex",  "女"},
                {"修改学员手机号",18900001001L,"phone",18900001008L}
        };
        return obj;
    }
    //该测试用例要采用dataprovider提供的测试数据则必须使用dataprovider属性进行标识
    //给测试用例方法要增加参数，并且参数个数和类型要和数据一致，有几列数据那么就必须有几个参数，按照参数顺序和数据一一对应
    @Test(description = "修改学员数据驱动用例",dataProvider = "getModifyData")
    public void test011_modifyStu(String casename,Long phone,String attrName,Object attrValue){
        StuDB.modifyStu(phone,attrName,attrValue);
        Student student = StuDB.stuMaps.get(phone);
        switch(attrName){
            case "name":
                String name = student.getName();
                Assert.assertEquals(name,attrValue);
                break;
            case "wx":
                String wx = student.getWx();
                Assert.assertEquals(wx,attrValue);
                break;
            case "qq":
                String qq = student.getQq();
                Assert.assertEquals(qq,attrValue);
                break;
            case "sex":
                String sex = student.getSex();
                Assert.assertEquals(sex,attrValue);
                break;
            case "phone":
                Student student1 = StuDB.stuMaps.get(attrValue);
                Assert.assertNotNull(student1);
//                Long phone1 = student.getPhone();
//                Assert.assertEquals(phone1,attrValue);
                break;
            default:
                break;
        }

    }
}
