package learn.AbstractMethods;

public class MainClass2 {
    public static void main(String[] args) {
        Sample1 d1=new Sample1();
        System.out.println(d1.x);
        d1.m1();

        //liskov principle
        Demo2 d2=new Sample1();
        System.out.println(d2.x);
        d2.m1();

    }
}
