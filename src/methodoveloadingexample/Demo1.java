package methodoveloadingexample;

public class Demo1 {
    void test(int arg1){
        System.out.println("running test(int)method");
        System.out.println(arg1);
    }
    void test(double arg1){
        System.out.println("running test(double) method");
        System.out.println(arg1);
    }

    void test(int arg1,double arg2){
        System.out.println("running test(int),(double)method");
        System.out.println(arg1);
        System.out.println(arg2);
    }
    void test(double arg1,int arg2){
        System.out.println("running test,(double,int)method");
        System.out.println(arg1);
        System.out.println(arg2);
    }
}
