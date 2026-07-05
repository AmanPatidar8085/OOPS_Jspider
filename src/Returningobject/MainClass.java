package Returningobject;
import java.util.Scanner;

 class person {
    int age;
    person(int age){
        this.age=age;
    }
}
class Utility{
    static person test(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        return new person(age);
    }
}
public class MainClass{
    public static void main(String[] args) {
    person  p1=Utility.test();
        System.out.println("Age:"+p1.age);
    }
}
