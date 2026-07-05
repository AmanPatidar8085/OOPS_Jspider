package MethodOverriding;

public class Bank {
    void rateinterset(){
        System.out.println("generally 5%interst");
    }

}
class SBI extends Bank{
    void rateinterset(){
        System.out.println("SBI 6%interst");
    }
}

class PNB extends Bank{
    void rateinterset(){
        System.out.println("PNB 7%interst");
    }
}
