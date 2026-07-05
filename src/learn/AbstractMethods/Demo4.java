package learn.AbstractMethods;

public abstract class Demo4 {
    abstract void test();
    abstract void disp();
}
class Sample4 extends Demo4{
    @Override
    void disp() {
        System.out.println("disp method");

    }

    @Override
    void test() {
        System.out.println("test method");
    }
}
