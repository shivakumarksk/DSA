package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class ArrDuplicates {
    public static void main(String[] args) {
        int[] arr ={1,1,6,7,8,9,3,3};
        System.out.println(Arrays.toString(Arrays.stream(Arrays.stream(arr).distinct().toArray()).sorted().toArray()));

        System.out.println(Arrays.stream(arr).filter(i->Arrays.stream(arr).filter(j->j==i).count()>1).distinct().findFirst().orElse(0));
        int[] ar ={100,200,300,400,890,765,10};
        Arrays.stream(ar).filter(i->i/10==1).forEach(System.out::println);
        List<String> names=Arrays.asList("A","B","C","D","D");
    System.out.println(names.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())));

        Map<String,Long> counts=names.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
    counts.entrySet().stream().filter(entry->entry.getValue()>1).forEach(System.out::println);
    String tetsnames="shivakumars";
    char[] chrnames=tetsnames.toCharArray();
 Map<Character,Long> dupesmap=tetsnames.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println("count of each char" +dupesmap);
        List<Character> dupesonly=dupesmap.entrySet().stream().filter(c->c.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)).entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("only dupes" +dupesonly);
        Character firstnonrepeated= tetsnames.chars().mapToObj(c->(char)c).filter(c->dupesmap.get(c)==1).findFirst().orElse(null);
        System.out.println("first non repeated character is : " +firstnonrepeated);

    }
}
