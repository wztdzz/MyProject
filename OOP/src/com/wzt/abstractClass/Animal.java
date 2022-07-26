package com.wzt.abstractClass;

public  abstract  class Animal {
    int age;
    public abstract void rest();
    public abstract void run();
    public  void shout(){
        System.out.println("sd");
    }


}

class Dog extends Animal{

    @Override
    public void rest() {

    }

    @Override
    public void run() {

    }
}

class Cat extends Animal{

    @Override
    public void rest() {

    }

    @Override
    public void run() {

    }
}