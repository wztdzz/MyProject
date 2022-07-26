package com.wzt.polymorphism;

public class Animal {
    public void shout(){
        System.out.println("shout!");

    }

}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("wolf!wolf!");
    }
    public void seeDoor(){
        System.out.println("seeing door!");
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("mmmmm");
    }
}