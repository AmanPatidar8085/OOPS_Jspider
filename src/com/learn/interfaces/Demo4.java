package com.learn.interfaces;

public interface Demo4 {
    void test();
}
interface  Demo5{
    void disp();
}
class Sample3 implements Demo4,Demo5{
    @Override
    public void disp() {
        System.out.println("disp method");
    }

    @Override
    public void test() {
        System.out.println("test methods");
    }
}
