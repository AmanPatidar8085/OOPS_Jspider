package JavaBasicProgramObject;
class Circle{
    double radius;
    static double pi=3.14;

    void area(){
        double ar=2*pi*radius;
        System.out.println("area "+ar);
    }

}
public class MainClass1 {
    public static void main(String[] args) {
   Circle c1=new Circle();
   c1.radius=35.765;
   c1.area();
    }
}
