package com.learn.interfaces;

public interface Demo9 {
    void test();
}
interface  Demo10{
    void test();
}
class Sample10 implements Demo10,Demo9{
    @Override
    public void test() {
        System.out.println("test implements in sample8 class");
    }
}
