package HasACom;

public class MainClass {
    public static void main(String[] args) {
        Car c=new Car("BMW",4500000,new Engine(1200,"Diesal"));
        System.out.println(c.getBrand());
        System.out.println(c.getPrice());
        System.out.println(c.getE());
        System.out.println(c.getE().getEngineType());
        System.out.println(c.getE().getHorsepower());
        c.getE().setHorsepower(1500);

        System.out.println(c.getE().getEngineType());
        System.out.println(c.getE().getHorsepower());
    }
}
