package inheritance;
//multilevel inheritance
public class Demo1 {
    int x=10;
    void test(){
        System.out.println("running test method");
    }
}
class Demo2 extends Demo1{
    int y=20;
    void disp(){
        System.out.println("running disp() method");
    }

}
class Demo3 extends Demo2{
    int z=30;
    void view(){
        System.out.println("running view()");
    }
}
