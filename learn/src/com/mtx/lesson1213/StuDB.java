package com.mtx.lesson1213;


import java.util.*;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/12/6 16:10
 */
public class StuDB {
    //{phone1=Student1,phone2=Student2,phone3=Student3},意味着stuMaps将会存储所有的学员对象
    public static HashMap<Long, Student> stuMaps=new HashMap<Long, Student>();

    //增加学员
    public static boolean addStu(String name,Long phone){
        if (!stuMaps.containsKey(phone)){
            Student stu=new Student(name,phone);
            stuMaps.put(stu.getPhone(),stu);
            return true;
        }else{
            System.out.println(phone+"已存在，不能添加");
            return false;
        }
    }
    //删除学员
    //选择手机号作为我们的删除目标比较方便
    public static boolean deleteStu(Long phone){
        if (stuMaps.containsKey(phone)){
            return true;
        }else{
            System.out.println(phone+"不存在");
            return false;
        }
    }
    //查询学员
    //我想用手机号或者姓名进行查询，但是他两是不一样的数据类型，所以我才用Object作为参数类型，因为Object是所有类的基类
    public static List<Student> selectStu(Object object) throws Exception{
        List<Student> students=new ArrayList<Student>();
        if (object instanceof Long){//判断object对象的类型是不是Long
            Student stu=stuMaps.get(object);
            try {
                stu.showInfo();
                students.add(stu);
            }catch(Exception e){
                e.printStackTrace();
                System.out.println(object+"不存在");
            }

        }else if(object instanceof String){//如果是字符串类型，那么传进来的就是学员姓名
            //遍历stuMaps所有的value值，因为value是每一个学员对象，判断学员的姓名和查询的是否一致，如果一致则展示该学员信息
            Collection<Student> stus=stuMaps.values();
                System.out.println(object+"不存在");
        } else{
            throw new Exception("参数类型不对");
        }
        int count=0;
        for (Student stu : students) {
            String name=stu.getName();//当前学员的姓名
            if (name.equals(object)){
                stu.showInfo();
                students.add(stu);
                count++;
            }
        }
       // if (count==0) {
        return students;
  //

    }
    //增加学员成绩，并且增加展示全班平均分的业务方法，展示第一名学员的方法

    //展示平均分
    public static Map<String, Double> getAvg(){
        //遍历所有学员，得到每个学员的成绩进行累加，累加后除以学员人数就是平均分
        //自动补全方法返回值对象用快捷键alt+enter，然后选择introduce local varible
        Collection<Student> values = stuMaps.values();
        double sum=0;//总分
        double max=0;//第三方变量
        for (Student stu : values) {
            //得到学员成绩,做成绩累加
            sum=sum+stu.getScore();
            max=Math.max(max,stu.getScore());
        }
        double avg=sum/stuMaps.size();
        System.out.println("全班平均分是："+avg);
        Map<String,Double> res=new HashMap<String,Double>();
        res.put("max",max);
        res.put("avg",avg);
        return res;
    }
    //展示第一名学员姓名及成绩
    public static void showFirst(){
        Collection<Student> values = stuMaps.values();
        //第一步先得到全班最高分
        double max=0;//第三方变量
        for (Student stu : values) {
            //得到学员成绩
            double score = stu.getScore();
            max=Math.max(max,score);
        }
        //第二步，再次遍历学员，判断谁的分数和最高分一样，则说明谁就是第一名
        for (Student stu : values) {
            double score = stu.getScore();
            if (score==max){
                System.out.println("第一名是："+stu.getName()+"  分数："+max);
            }
        }
    }
    //修改学员信息
    //首先需要找到待修改的学员，可以通过phone来确定学员，所以需要一个参数
    //还需要知道要修改学员什么信息，是修改qq还是微信还是其他，需要一个参数来指定
    //还需要知道修改的属性改成什么内容，需要一个参数来指定
    public static void modifyStu(Long phone,String attributeName,Object value){
        if (stuMaps.containsKey(phone)){
            Student student = stuMaps.get(phone);
            if (attributeName.equalsIgnoreCase("name")){
                student.setName(value.toString());
            }else if(attributeName.equalsIgnoreCase("wx")){
                student.setWx(value.toString());
            }else if(attributeName.equalsIgnoreCase("qq")){
                student.setQq(value.toString());
            }else if(attributeName.equalsIgnoreCase("sex")){
                student.setSex(value.toString());
            }else if(attributeName.equalsIgnoreCase("score")){
                student.setScore(Double.valueOf(value.toString()));
            }else if(attributeName.equalsIgnoreCase("phone")){
                //Long newPhone=(Long)value;
                Long newPhone=Long.valueOf(value.toString());
                if (!stuMaps.containsKey(newPhone)){
                    student.setPhone(newPhone);
                    stuMaps.put(newPhone,student);//把新手机号对应的学员信息塞进去
                    stuMaps.remove(phone);//删除旧手机号对应的数据
                }else{
                    System.out.println(newPhone+"已经存在，不能修改");
                }
            }else{
                System.out.println("该学员没有这个属性");
            }
        }else{
            System.out.println("学员不存在，无法修改");
        }

    }

    public static void main(String[] args) throws Exception {
        StuDB.addStu("张三",18900010001L);
        StuDB.addStu("李四",18900010002L);
        StuDB.addStu("王五",18900010003L);
        StuDB.modifyStu(18900010001L,"phone",18900010002L);
        StuDB.selectStu(18900010001L);
        StuDB.selectStu(18900010002L);
 //       StuDB.selectStu(18900010007L);
//        StuDB.addStu("李四",18900010002L);
//        StuDB.addStu("王五",18900010003L);
        //StuDB.stuMaps.get(18900010001L) 这会得到一个Student对象
//        StuDB.stuMaps.get(18900010001L).setScore(89);
//        StuDB.stuMaps.get(18900010002L).setScore(90);
//        StuDB.stuMaps.get(18900010003L).setScore(70);
//        StuDB.getAvg();
//        StuDB.showFirst();
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
//        StuDB.selectStu(18900010003L);

    }

}
