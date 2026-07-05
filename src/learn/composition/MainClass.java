package learn.composition;

public class MainClass {
    public static void main(String[] args) {
        Car c=new Car("BMW",40000000.9,new Engine(1200,"Petrol"));
        System.out.println(c.getBrand());
        System.out.println(c.getPrice());
        System.out.println(c.getE());
        System.out.println(c.getE().getHp());
        c.getE().setHp(1500);
        System.out.println(c.getE().getHp());
    }
}
