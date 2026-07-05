package MethodOverriding;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("main method");
        Demo1 d1=new Demo1();
        d1.test();

        Demo2 d2=new Demo2();
        d2.test();
    }
}

