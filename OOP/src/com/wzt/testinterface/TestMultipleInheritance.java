package com.wzt.testinterface;

//测试接口多继承

public class TestMultipleInheritance {
    public static void main(String[] args) {

    }
}
interface B {
    void testB();
}
interface A {
    void testA();
}

interface C extends A {
    void testC();
}