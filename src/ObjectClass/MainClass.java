package ObjectClass;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("main method start");

      Demo d1=new Demo();
      Demo d2=d1;//both reference varible refer to the same object
        System.out.println(d1);
        System.out.println(d2);
        d1.x=300;
        d1.y=400;
        System.out.println(d1.x);
        System.out.println(d1.y);
        System.out.println(d2.x);
        System.out.println(d2.y);

        System.out.println("main method ended");
    }
}
