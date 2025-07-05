package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumJavaStream {
    public static void main(String[] args) {
        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee( "John Doe",1, 50000, "Sales",20));
        emplist.add(new Employee("Jane Doe",2, 60000, "Marketing",30));
        emplist.add(new Employee("Bob Smith",3, 40000, "Sales",25));
        emplist.add(new Employee("Alice Johnson",4, 70000, "Marketing",50));
        emplist.add(new Employee("Sivakumar",5, 75000, "HumanResources",25));
        emplist.add(new Employee("Mahita",6, 95000, "HumanResources",15));
        emplist.add(new Employee("Mahita Krishnan",7, 50000, "HumanResources",35));

        System.out.println(emplist.stream().filter(e->e.getAge()>20).mapToInt(e->e.getSalary()).sum());
        System.out.println(emplist.stream().filter(e->e.getAge()>20).map(Employee::getName).collect(Collectors.toList()));

    }
}
