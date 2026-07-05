package inheritance;

public class MainClass2 {
    public static void main(String[] args) {
        System.out.println("main method start");
        Demo3 d1=new Demo3();
        System.out.println(d1.x);
        System.out.println(d1.y);
        System.out.println(d1.z);
        d1.test();
        d1.view();
        d1.disp();
    }
}
