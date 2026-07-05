package JavaBasicProgramObject;

public class Account {
    double accbal;
    int accnum;

    void deposit( double amount){
        accbal=accbal+amount;
        System.out.println("payment credit");
    }
    void withdraw(double amount) {
        if (accbal >= amount) {
            accbal = accbal - amount;
            System.out.println("amount debit");
        } else {
            System.out.println("insufficient balance");
        }
    }
        void checkBal(){
            System.out.println(accbal);

    }
}
