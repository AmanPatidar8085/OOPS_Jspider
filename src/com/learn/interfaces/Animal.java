package com.learn.interfaces;

public interface Animal {
    void sound();
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("dog is barking");
    }
    void bark(){
        System.out.println("dog barking loudly");
    }
}
