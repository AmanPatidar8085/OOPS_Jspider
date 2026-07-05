package com.learn.interfaces;

public interface Demo2 {

    void test();
}
interface  Demo3 extends Demo2{
    void disp();
}
class Sample2 implements Demo3{
    @Override
    public void test() {
        System.out.println("test method implements in smaple 2 class");
    }

    @Override
    public void disp() {
        System.out.println("disp method implements in smaple 2 class");
    }
}