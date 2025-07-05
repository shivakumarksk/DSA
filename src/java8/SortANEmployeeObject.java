package java8;

import java.util.ArrayList;
import java.util.List;

public class SortANEmployeeObject {
    public static void main(String[] args) {

        //Employee emp1=new Employee("Siva",1,120000,"Health");
        //Employee emp2=new Employee("Ram",2,130000,"HR");
        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee( "John Doe",1, 50000, "Sales",20));
        emplist.add(new Employee("Jane Doe",2, 60000, "Marketing",30));
        emplist.add(new Employee("Bob Smith",3, 40000, "Sales",25));
        emplist.add(new Employee("Alice Johnson",4, 70000, "Marketing",50));
        emplist.add(new Employee("Sivakumar",5, 75000, "HumanResources",25));
        emplist.add(new Employee("Mahita",6, 95000, "HumanResources",15));
        emplist.add(new Employee("Mahita Krishnan",7, 50000, "HumanResources",35));
        emplist.stream().sorted((e1,e2)-> {
            int dept=e1.getDepartment().compareTo(e2.getDepartment());
            if(dept==0) {
                return Integer.compare(e1.getSalary(),e2.getSalary());
            } else {
                return dept;
            }
        }).toList().forEach(employee -> System.out.println(
                "ID: " + employee.getId() +
                        ", Name: " + employee.getName() +
                        ", Salary: " + employee.getSalary() +
                        ", Department: " + employee.getDepartment()
        ));
    }



}
