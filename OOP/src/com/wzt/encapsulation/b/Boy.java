package com.wzt.encapsulation.b;

import com.wzt.encapsulation.a.Person;

public class Boy extends Person {
    public Boy(int testPublic, int testPrivate) {
        super(testPublic, testPrivate);
    }

    public void play(){
        Boy b=new Boy(1,2);
        //System.out.println(b.testPrivate); //类内友好
        //System.out.println(b.testDefault); //包内有好
        System.out.println(b.testProtected);//父子友好
        System.out.println(b.testPublic);


//        Person p1 =new Person();
//        System.out.println(p1.testProtected);
        //若父类和子类位于同一包中，子类可以访问父类protected成员，也可以访问父类对象的protected成员
        //若父类和子类不位于同一包中，子类可以访问父类protected成员，不可以访问父类对象的protected成员


    }
}

