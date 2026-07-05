package methodoveloadingexample;

public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method start");
        Demo1 d1=new Demo1();
        d1.test(10);
        d1.test(3.3);
        d1.test(3,4.4);
        d1.test(4.3,2);
    }
}
