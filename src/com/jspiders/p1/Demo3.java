package com.jspiders.p1;

public class Demo3 {
    int x=300;

}
class Demo4 extends Demo3{
    int x=400;

    void display(){
        int x=500;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
