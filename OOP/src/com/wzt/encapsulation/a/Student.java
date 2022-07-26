package com.wzt.encapsulation.a;

public class Student extends Person {
    public Student(int testPublic, int testPrivate) {
        super(testPublic, testPrivate);
    }

    public void study(){
        Person p =new Person(1,2);
        //System.out.println(p.testPrivate);// 私有不可访问
        System.out.println(p.testDefault);
        System.out.println(p.testProtected);
        System.out.println(p.testPublic);

    }
}
