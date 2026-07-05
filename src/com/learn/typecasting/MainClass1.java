package com.learn.typecasting;

public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method started");
        int x=(int)59.9;
        System.out.println(x);//explicit narrowing

        double y=5;
        System.out.println(y);//impicit widening
        System.out.println("main method end");
    }
}
