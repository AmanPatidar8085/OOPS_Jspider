package Functionalinterface;

public class Employee {
    String name;
    String company;
    double salary;

    public Employee(String name, String company, double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
