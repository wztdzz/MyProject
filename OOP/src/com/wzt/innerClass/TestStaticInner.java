package com.wzt.innerClass;

public class TestStaticInner {

    private int a =10;
    private  static int b=20;

    public static void main(String[] args) {
        TestStaticInner.stain.test();
    }

    static class stain{

        public static  void test(){

           // System.out.println(a); //静态内部类不能访问外部类的非静态属性
            System.out.println(b); //静态内部类can访问外部类的静态属性

        }

    }

}
