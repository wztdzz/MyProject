package com.wzt.polymorphism;

public class TestPolym {
    public static void main(String[] args) {

        animalCry(new Dog());
        animalCry(new Cat());

        Animal animal = new Dog();   //向上转型（自动）
        animal.shout();
        //animal.seeDoor();    //父类调子类方法 需要向下转型

        Dog d =(Dog) animal;   //强制向下转型，d和animal是一个对象
        d.seeDoor();
    }


    static void animalCry(Animal a){
        a.shout();   //出现多态
    }

}
