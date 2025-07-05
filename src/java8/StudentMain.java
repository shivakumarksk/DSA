package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", 30),
                new Student("Alice", 25),
                new Student("Bob", 40)
        );
        List<Student1> studentsgr = Arrays.asList(
                new Student1("John", 9),
                new Student1("Alice", 10),
                new Student1("Bob", 9),
                new Student1("Charlie", 11),
                new Student1("David", 10)
        );
        //sort them by their age in descending order and collect the sorted list.
        students.stream().map(Student::getAge).sorted((a,b)->b-a).collect(Collectors.toList()).forEach(System.out::println);
studentsgr.stream().collect(Collectors.groupingBy(Student1::getGrade)).forEach((k, v)-> {
    System.out.println(k+":");
    v.forEach(s->System.out.println(s));
});
    }
}
