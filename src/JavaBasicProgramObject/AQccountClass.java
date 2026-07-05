package JavaBasicProgramObject;

public class AQccountClass {
    public static void main(String[] args) {
        Account a=new Account();
        a.accbal=7000;
        a.accnum=123455667;
        a.deposit(5000);
        a.checkBal();
        a.withdraw(12000);
        a.checkBal();

    }
}
