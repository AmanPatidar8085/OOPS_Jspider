package com.learn.interfaces;

public interface Demo8 {
    int m1();
    void m2();
    int m3(double arg);
}

class Sample9 implements Demo8{
    @Override
    public int m1() {
        System.out.println("m1");
        return 0;
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public int m3(double arg) {
        System.out.println("m3");
        return 0;
    }
}
