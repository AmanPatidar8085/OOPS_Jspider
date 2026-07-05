package com.jspiders.p1;

public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method start");
        Demo1 d1=new Demo1();
        System.out.println(d1.x);
        d1.test();

        System.out.println("--------------");
        Demo2 d2= new Demo2();
        System.out.println(d2.y);
        d2.disp();

        System.out.println("main methos ended");
    }
}
