package com.wzt.testinterface;

//飞行接口
public interface Volant {
    int Fly_HIGHT =100; //前面默认就有publi static final 修饰 默认就是常量
    void fly();    //默认有public static 修饰 默认就是静态方法
}

//善良接口
interface Honest{
    void helpOther();
    void test();
}

class GoofMan implements Honest{

    @Override                           //调用了Honest接口，就要实现Honest的所有方法
    public void helpOther() {
        System.out.println("好事1");
    }

    @Override
    public void test() {

    }

}

class BirdMan implements Volant{

    @Override
    public void fly() {

    }
}


class Angle implements Honest,Volant{

    @Override
    public void fly() {

    }

    @Override
    public void helpOther() {

    }

    @Override
    public void test() {

    }
}


class Plane implements Volant{

    @Override
    public void fly() {

    }
}















