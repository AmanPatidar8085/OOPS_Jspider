package polymorphism.example;

public class Mobile {
    void use(){
        System.out.println("Using Mobiles");
    }
}
class Call extends Mobile{
    @Override
    void use() {
        System.out.println("Call someone");
    }
}
class Gaming extends Mobile{
    @Override
    void use() {
        System.out.println("PlayGames");
    }
}
class Camera extends Mobile{
    @Override
    void use() {
        System.out.println("taking photo");
    }
}
