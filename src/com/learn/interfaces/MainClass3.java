package com.learn.interfaces;

public class MainClass3 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Sample7 s1=new Sample7();
        s1.view();
        s1.test();

        System.out.println("-----------------");
        Run1 r1;
        r1=new Sample7();
        r1.view();
        Demo7 d1;
        d1=new Sample7();
        d1.test();
    }
}
