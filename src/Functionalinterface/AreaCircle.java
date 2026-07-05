package Functionalinterface;
import java.util.function.*;
public class AreaCircle {
    public static void main(String[] args) {
        Consumer<Double>c1=(r)-> System.out.println(3.14*r*r);
        c1.accept(10.5);
    }
}
