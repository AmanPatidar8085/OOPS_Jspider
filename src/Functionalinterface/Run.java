package Functionalinterface;

import java.util.*;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {


        Employee e1 = new Employee("Ram", "Wipro", 45000);
        Employee e2 = new Employee("Raj", "Tcs", 60000);
        Employee e3 = new Employee("Aman", "Infos", 27400);
        Employee e4 = new Employee("Rajesh", "Tcs", 42000);
        Employee e5 = new Employee("Kamlesh", "Wipro", 44000);
        Employee e6 = new Employee("Akshat", "Capital", 60000);
        Employee e7 = new Employee("Ajay", "Azure", 67000);
        Employee e8 = new Employee("Ayush", "Tcs", 40000);

        List<Employee> l1 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);
        Collections.sort(l1, (emp1, emp2) ->
                Double.compare(emp2.salary, emp1.salary)
        );
        l1.forEach(emp-> System.out.println(emp));


        System.out.println(" --------------------------");

        l1.stream().filter(emp->emp.salary>=40000 && emp.salary<=45000).forEach(n-> System.out.println(n));


        System.out.println("------------------------------");
        l1.stream().filter(emp->emp.company.equals("Wipro")).forEach(n-> System.out.println(n));


        System.out.println("-------------------------");
        l1.stream().sorted((emp1,emp2)->emp1.name.compareTo(emp2.name)).forEach(n-> System.out.println(n));

        System.out.println("-------------------------");
        l1.stream().sorted((emp1,emp2)->Double.compare(emp2.salary,emp1.salary)).forEach(n-> System.out.println(n));


        System.out.println("-------------------------");
        l1.stream().map(emp->emp.company).distinct().sorted().forEach(n-> System.out.println(n));

        Employee maxemp=l1.stream().max((emp1,emp2)->Double.compare(emp1.salary,emp2.salary)).orElse(null);
        System.out.println(maxemp);


        System.out.println("-------------------------");
        l1.stream().map(emp->emp.company).distinct().sorted().forEach(n-> System.out.println(n));

        Employee minemp=l1.stream().min((emp1,emp2)->Double.compare(emp1.salary,emp2.salary)).orElse(null);
        System.out.println(minemp);


        System.out.println("----------------------------");
        l1.stream().sorted((emp1,emp2)->Double.compare(emp1.salary,emp2.salary)).skip(1).limit(1).forEach(n-> System.out.println(n));


        System.out.println("------------------------");
        Object empName[]=l1.stream().map(emp->emp.name).toArray();
        Arrays.stream(empName).forEach(n-> System.out.print(n+" "));


        System.out.println("----------------------");

        List<Employee>e=l1.stream().filter(emp->emp.salary>40000).collect(Collectors.toList());
        e.forEach(n-> System.out.println(n));

        System.out.println("-------------------------");
        Set<String>company=l1.stream().map(emp->emp.company).collect(Collectors.toSet());
        company.stream().sorted().forEach(n-> System.out.println(n));


        System.out.println("-----------------");
        Map<String,List<Employee>>hm=new HashMap<>();
        hm.put("Wipro",Arrays.asList(e1,e5));
        hm.put("Tcs",Arrays.asList(e2,e4,e8));
        hm.forEach((k,v)-> System.out.println(k+"-->"+v.size()));


        System.out.println("------------------");
        Map<Object,List<Employee>>hm1 = l1.stream().collect(Collectors.groupingBy(emp->emp.company));
        hm1.forEach((k,v)-> System.out.println(k+" "+v.size()));

    }

}
