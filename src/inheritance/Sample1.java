package inheritance;

public class Sample1 {
    int p = 10;

    void m1() {
        System.out.println("running m1()method");
    }
}
    class Sample2 extends Sample1{
        int q=20;
        void m2(){
            System.out.println("running m2()method");
        }
    }

     class Sample3 extends Sample1{
    int r=30;
    void m3(){
        System.out.println("running m3() method");
    }
     }
