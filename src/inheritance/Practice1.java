package inheritance;

public class Practice1 {
    Practice1(int arg1){
        System.out.println("running practice1 class constructor");
    }
}
class Practice2 extends Practice1{
    Practice2(double arg2){
        super(12);
        System.out.println("running  class constructor");
    }

}
class Practice3 extends Practice2 {
    Practice3(double arg2) {
        super(12.3);
        System.out.println("running  class constructor");
    }
}