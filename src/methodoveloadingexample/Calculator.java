package methodoveloadingexample;

public class Calculator {
    void square(int num){
        int res=num*num;
        System.out.println(res);
    }
    void square(double num){
        double res=num*num;
        System.out.println(res);
    }
}
