package com.wzt.encapsulation.a;

public class Person {
    private     int testPrivate;
                int testDefault;
    protected   int testProtected;
    public      int testPublic;



    public static void main(String[] args) {
        Person a =new Person(1,2);
        a.testPrivate =1;
        System.out.println(a.testPublic);

    }

    public Person(int testPublic,int testPrivate){
        this.testPrivate=testPrivate;
        this.testPublic=testPublic;
    }

    public void person(){
        System.out.println(this.testDefault);//包内友好
        System.out.println(this.testPrivate);//类内友好
        System.out.println(this.testProtected);//父子友好，包内友好
        System.out.println(this.testPublic);//public全局友好
    }
}
