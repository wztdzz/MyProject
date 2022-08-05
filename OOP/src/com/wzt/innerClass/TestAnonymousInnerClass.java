package com.wzt.innerClass;

public class TestAnonymousInnerClass {

    public void test1(A a){
        a.run();
    }

    public static void main(String[] args) {

        TestAnonymousInnerClass t = new TestAnonymousInnerClass();
//        t.test1(new AImpl());

        t.test1(new A() {       //使用了实现A接口的匿名内部类，该内部类没有名字，只能使用一次
            @Override
            public void run() {

                System.out.println("第一个匿名内部类");

            }
        });
        t.test1(new A() {
            @Override
            public void run() {
                System.out.println("第二个匿名内部类");
            }
        });
    }
}




//定义接口A的实现类 AImpl （接口是一组规范，实现类要实现所有方法）
class AImpl implements A{

    @Override
    public void run() {
        System.out.println("AImpl.run");
    }
}

//定义接口A
interface A{
    void run();
}