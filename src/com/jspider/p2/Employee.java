package com.jspider.p2;

public class Employee  extends Person{
    int id;
    double salary;
    String designation;

    public Employee(String name, int age, String gender, int id, double salary, String designation) {
        super(name, age, gender);
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }
}
