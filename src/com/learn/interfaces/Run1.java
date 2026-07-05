package com.learn.interfaces;

public class Run1 {
    void view(){
        System.out.println("running view ()methods");
    }
}
interface Demo7{
    void test();
}
class Sample7 extends Run1 implements Demo7{
    @Override
    public void test() {
        System.out.println("test ()implemnted in sample7 class");
    }
}