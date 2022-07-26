package com.wzt.testinterface;

public class Test {
    public static void main(String[] args) {

        Angle a = new Angle();
        a.fly();
        a.helpOther();
        System.out.println(Volant.Fly_HIGHT);

        Volant a2 =new Angle();
        a2.fly();

        Angle v=(Angle)a2;



        System.out.println("=============测试默认方法=============");
        TestDefault td = new TestDefaultImpl01() ;
        td.printInfo();
        td.moren();


        System.out.println("=============测试静态方法=============");

        TestDefault.testStatic();
        TestDefaultImpl01.testStatic();


    }
}
