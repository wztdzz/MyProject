package com.wzt.innerClass;


//测试内部类


public class Outer {

    private int age =10;
    public void show(){
        System.out.println("Outer.show method");
        System.out.println(age);

    }







    public class Inner{

        int age = 20;
        public void show(){
            System.out.println("Inner.show method");
            System.out.println(age);
        }


    }
}









