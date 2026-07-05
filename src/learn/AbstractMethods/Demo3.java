package learn.AbstractMethods;

public  abstract class Demo3 {
    int y=200;
    void m2(){
        System.out.println("hello");
    }
    abstract void test();
}
class sample2 extends Demo3{
    void test(){
        System.out.println("method body defined in sample 2 class");
    }
}
