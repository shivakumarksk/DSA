package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SlaveMain {
    public static void main(String[] args) {

        List<EmpSlave> employees= Arrays.asList(
                new EmpSlave(1, "John", 30, "Sales", 50000),
                new EmpSlave(2, "Alice", 25, "Marketing", 60000),
                new EmpSlave(3, "Bob", 35, "Sales", 70000)
        );
        List<EmpSlave> onlysales=employees.stream().filter(e->e.getDepartment().equals("Sales")).collect(Collectors.toList());
        //System.out.println();
       // onlysales.stream().forEach(System.out::println);
//sort employees by age
        employees.stream().sorted(Comparator.comparingInt(EmpSlave::getAge))
                .collect(Collectors.toList()).forEach(System.out::println);
        //get emp names
        employees.stream().map(EmpSlave::getName).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Total salary " +employees.stream().mapToDouble(EmpSlave::getSalary).sum());
        double avg=employees.stream().mapToDouble(EmpSlave::getSalary).average().orElse(0.0);
        System.out.println("Average salary " +avg);
    }

}
