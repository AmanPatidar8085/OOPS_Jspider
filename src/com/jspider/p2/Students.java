package com.jspider.p2;

public class Students extends Person {
    int rollno;
    String schoolname;
    double marks;

    public Students(String name, int age, String gender, int rollno, String schoolname, double marks) {
        super(name, age, gender);
        this.rollno = rollno;
        this.schoolname = schoolname;
        this.marks = marks;
    }
}
