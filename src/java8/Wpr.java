package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Wpr {
    public static void main(String[] args) {
        int[] ar={2,3,4,7,8,9};
        Arrays.sort(ar);
        //System.out.println(Arrays.asList(ar));
        for(int a: ar) {
            System.out.print(a);
        }
        Employee emp1=new Employee("SIVA",1,20,"HumanR",10);

        Employee emp2=new Employee("SIVA",2,40,"HumanR",16);

        Employee emp3=new Employee("Tst",3,60,"HumanR",32);

        Employee emp4=new Employee("SIVA",4,70,"HumanR",26);

        Employee emp5=new Employee("SIVA",5,80,"HumanR",34);
        List<Employee> emplist=new ArrayList<>();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);
        emplist.add(emp5);
        //System.out.println();
        empSol(emplist);
    }
    public static void empSol(List<Employee> emp) {
        System.out.println(emp.stream().filter(employee -> employee.getName().equals("SIVA")).mapToDouble(Employee::getSalary).average());


    }
}
