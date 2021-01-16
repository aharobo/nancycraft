package com.nancy;

public class frist {
    public static void main(String[] args) {
        String i = " sklll ";
        System.out.println(i.trim());//去除字符串两端的空格
        String i1 = "1089*1989";
        //截取字段串
        System.out.println(i1.substring(0, 4) + i1.substring(5));
        String i2 = "jdosjdoj";
        //替换字符串
        //替换找到的单字符
        System.out.println(i2.replace('d', 'g'));
        //替换所有找到的字符串
        System.out.println(i2.replace("jd", "哈哈"));
        //替换找到的第一个字符
        System.out.println(i2.replaceFirst("jd", ""));
        //大小写转换
        String i3 = "UEJKDKddddfdsf";
        //转换成小写
        System.out.println(i3.toLowerCase());
        //转换成大写
        System.out.println(i3.toUpperCase());
        //字符串的比较
        String stri = "erttttt";
        String stri1 = "ERTTTTT";
        System.out.println(stri.equals(stri1));
        //忽略大小写比较
        System.out.println(stri.equalsIgnoreCase(stri1));

        //字符串分割
        System.out.println("------------------------");
        String str = "订单,得瑟得瑟,大苏打,是的";
        String r[];
        r = str.split(",");
        System.out.println(r[0]);
        //System.out.println(r[1]);
        //System.out.println(str.split(",")[0]);

        String str2 = "1089,1099,2945";
        String st1[];
        st1 = str2.split(",", 2);
        System.out.println(st1[0]);

        String str3 = "我是张小五";
        //判断是否是以某字符串开头
        System.out.println(str3.startsWith("我是"));

        //StingBuffer和StringBuilder
        StringBuffer str4 = new StringBuffer("花花");
        str4.append("hahah");
        str4.append(4);
        System.out.println(str4);
        StringBuilder str5 = new StringBuilder("我的明天");
        str5.append('r');
        System.out.println(str5);

        int score = 90;
        if (score > 90) {
            System.out.println("绩效等级" + ":S");
        } else if (score <= 90 && score > 80) {
            System.out.println(":A");
        } else {
            System.out.println("B");
        }

        System.out.println(".....");

        String f = "hahah";
        switch (f) {
            case "hah":
                System.out.println("无耻");
                break;
            case "hahah":
                System.out.println("臭不要脸");
                break;
            default:
                System.out.println("你大爷的");
        }
        System.out.println(".....................................................");
        String f1 = "hahah";

        switch (f1) {
            case "hah":
                System.out.println("无耻");
            case "hahah":
                System.out.println("臭不要脸");
            case "jklk":
                System.out.println("我喜欢你的鼻子");
            default:
                System.out.println("你大爷的");
        }
    }
}