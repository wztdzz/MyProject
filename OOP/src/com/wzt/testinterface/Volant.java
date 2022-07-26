package com.wzt.testinterface;

//飞行接口
public interface Volant {
    int Fly_HIGHT =100;
    void fly();
}

//善良接口
interface Honest{
    void helpOther();
}

class GoofMan implements Honest{

    @Override
    public void helpOther() {
        System.out.println("好事1");
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
}


class Plane implements Volant{

    @Override
    public void fly() {

    }
}















