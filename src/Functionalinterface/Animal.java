package Functionalinterface;
@FunctionalInterface
public interface Animal {
    void sound();
}
class cat implements Animal{
    @Override
   public void sound(){
        System.out.println("meow");
    }


public static void main(String[] args) {
        cat c1=new cat();
        c1.sound();
        Animal a1=()-> System.out.println("meow");
        a1.sound();
}
}
