package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharMapList {
    public static void main(String[] args) {
        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee( "John Doe",1, 50000, "Sales",20));
        emplist.add(new Employee("Jane Doe",2, 60000, "Marketing",30));
        emplist.add(new Employee("Bob Smith",3, 40000, "Sales",25));
        emplist.add(new Employee("Alice Johnson",4, 70000, "Marketing",50));
        emplist.add(new Employee("Sivakumar",5, 75000, "HumanResources",25));
        emplist.add(new Employee("Mahita",6, 95000, "HumanResources",15));
        emplist.add(new Employee("Mahita Krishnan",7, 50000, "HumanResources",35));
        Map<Character,List<Employee>> namesmap=emplist.stream().collect(Collectors.groupingBy(e->e.getName().charAt(0)));
        List<Integer> intlist= Arrays.asList(1,2,3,3,4,5,6,5,7,8,7,8);
        Map<Object, List<Integer>> intsmap=intlist.stream().collect(Collectors.groupingBy(a->a));

        /*intsmap.forEach((k,v)-> {
            System.out.println(k+":"+v);
        });*/


        intsmap.forEach((k,v)-> {
            if(v.size()>1) {
                System.out.println(k+":"+v);
            }
        });
    }
}
