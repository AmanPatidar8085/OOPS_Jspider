package Functionalinterface;

import java.util.HashMap;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"Aman");
        hm.put(2,"Hari");
        hm.put(3,"Rajesh");
        hm.forEach((k,v)-> System.out.println(k+" -> "+v));
    }
}
