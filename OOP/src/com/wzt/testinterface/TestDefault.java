package com.wzt.testinterface;

public interface TestDefault {
    void printInfo();

    default void  moren(){           //前面带default则是默认方法
        System.out.println("Moren");
    }

    static void testStatic(){                         //接口的静态方法只能通过接口本身调用
        System.out.println("TestDefault.testStatic");
    }
}

class TestDefaultImpl01 implements TestDefault{

    @Override
    public void printInfo() {
        System.out.println("printinfo已被执行");
    }

    @Override
    public void moren() {
        System.out.println("moren已被执行");
    }



    static void testStatic(){
        System.out.println("TestDefaultImpl01.testStatic");
    }
}


