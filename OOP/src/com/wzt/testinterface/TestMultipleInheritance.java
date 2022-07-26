package com.wzt.testinterface;

//测试接口多继承

public class TestMultipleInheritance {
    public static void main(String[] args) {
        Cinpul01 c = new Cinpul01();
        c.testA();
        c.testB();
        c.testC();
    }
}


interface B {
    void testB();
}
interface A {
    void testA();
}

interface C extends A,B {
    void testC();

    @Override
    void testB();

    @Override
    void testA();
}

class Cinpul01 implements C {

    @Override
    public void testC() {

    }

    @Override
    public void testB() {

    }

    @Override
    public void testA() {

    }
}
