package MethodOverriding;

public class Demo1 {
    void test(){
        System.out.println("running test()method demo1 class");
    }

}
class Demo2 extends Demo1{
    void test(){
        System.out.println("running  ovride demo 1");
    }
}
