package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingByFn {
    public static void main(String[] args) {
        EmpSlave emp1=new EmpSlave(01,"Mike",10,"Operations",123);
        EmpSlave emp2=new EmpSlave(02,"John",15000,"Marketing",234);
        EmpSlave emp3=new EmpSlave(03,"John",15000,"Marketing",456);


        List<EmpSlave> emplist=new ArrayList<>();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        Map<Character , List<EmpSlave>> groupnames=emplist.stream().collect(Collectors.groupingBy(e->e.getName().charAt(0)));

        groupnames.forEach((k,v)-> {
            System.out.println("key :" +k +"\nvalue :" +v);
        });

    }
}
