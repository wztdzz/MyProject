package com.wzt.String;

import java.util.Locale;

public class TestString1 {
    public static void main(String[] args) {
        String s ="How are you?" ;
        String s1 = "";

        System.out.println(s.startsWith("How"));

        System.out.println(s.endsWith("you"));

        s1=s.substring(4);// 从4开始 提取剩余字符串
        System.out.println(s1);

        s1=s.substring(4,7);//4,7
        System.out.println(s1);

        s1=s.toLowerCase();//小写
        System.out.println(s1);

        s1=s.toUpperCase();//大写
        System.out.println(s1);

        String s2 = "    How old are you!!";

        s1 = s2.trim();// 去除首尾空格

        System.out.println(s1);
        System.out.println(s2);//因为s2是不可变字符串，所以保持原来




    }
}
