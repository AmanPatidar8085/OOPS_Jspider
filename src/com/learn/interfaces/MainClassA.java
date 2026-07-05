package com.learn.interfaces;

public class MainClassA {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
         Dog d=(Dog) a;
         d.bark();
         d.sound();
    }
}
