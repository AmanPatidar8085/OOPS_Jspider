package Functionalinterface;

public interface upi{
    void send();
    void checkbalance();
    default void welcome(){
        System.out.println("hello wellcome");
    }
    default  void thanks(){
        System.out.println("thanks");
    }
    public  class HDFC implements upi{
        @Override
        public void send() {

        }

        @Override
        public void checkbalance() {

        }

        @Override
        public void welcome() {
            System.out.println("$ wellcome $");
        }

        @Override
        public void thanks() {
            System.out.println("$ thanks $");
        }
    }

    public static void main(String[] args) {
        HDFC h=new HDFC();
        h.welcome();
        h.thanks();
    }
}
