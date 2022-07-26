package com.wzt.OOP;

public class TestSuper02 {
    public static void main(String[] args) {
        new ChildClass2();
    }
}
class FatherClass2 {
    public FatherClass2(){
        System.out.println("创建父类2");
    }
}
class ChildClass2 extends FatherClass2{
    public ChildClass2(){
        super();
        System.out.println("创建子类2");
    }
}
//在类中，若是构造器第一行没有super（）或this（），那么java会默认加上super（）；
//意义是调用父类的无参构造方法，如果要调用有参构造器则在super括号中添加