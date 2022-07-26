package com.wzt.String;

public class TestString {
    public static void main(String[] args) {
        String a ="123";
        String b="123";
        String c=new String("123");


        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));


        String s1= "Coer java";
        String s2= "coer java";

        System.out.println(s1.charAt(3));

        System.out.println(s2.length());

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2)); // 忽略大小写

        System.out.println(s1.indexOf("java"));   //是否包含“”，包含返回位置，不包含返回-1
        System.out.println(s1.indexOf("apple"));//从前往后找
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        String s3="i o java. java i b l";
        System.out.println(s3.lastIndexOf("java"));//从后往前找

        String s =s1.replace(' ','&');
        System.out.println("改完之后结果为："+s);

    }
}
