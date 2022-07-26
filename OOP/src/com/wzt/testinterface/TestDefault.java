package com.wzt.testinterface;

public interface TestDefault {
    void printInfo();//抽象方法 必须被实现

    default void  moren(){           //前面带default则是默认方法
        System.out.println("父类Moren方法已被执行");
    }  //定义默认方法  不用必须实现

    static void testStatic(){                         //接口的静态方法只能通过接口本身调用
        System.out.println("TestDefault.testStatic");
    } //定义静态方法 字类中如果有完全一样的方法是毫无关系的
}

class TestDefaultImpl01 implements TestDefault{

    @Override
    public void printInfo() {
        System.out.println("printinfo已被执行");
    }

    @Override
    public void moren() {
        System.out.println("子类moren已被执行");
    }



    static void testStatic(){
        System.out.println("TestDefaultImpl01.testStatic");     //与接口的相同方法没有任何关系
    }



}


