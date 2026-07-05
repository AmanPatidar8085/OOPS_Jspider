package Functionalinterface;

import java.util.ArrayList;

public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.forEach(t-> System.out.println(t));
    }
}
