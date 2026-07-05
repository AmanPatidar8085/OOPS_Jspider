package polymorphism.example;

public class MainClass {
    public static void main(String[] args) {
        Mobile m;
        m=new Call();
        m.use();

        m=new Camera();
        m.use();

        m=new Gaming();
        m.use();
    }
}
