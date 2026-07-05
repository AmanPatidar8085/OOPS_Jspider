package com.jsp.learn;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("main method start");
        Employee e1=new Employee();
        e1.setId(123);
        e1.setName("ramesh");
        e1.setSalary(234000);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println("main method ended");
    }
}
