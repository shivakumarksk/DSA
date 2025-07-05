package java8;

import java.util.Arrays;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("Siva","Kumar","Techie");
        strings.sort((a,b)->a.compareTo(b));
        System.out.println(strings);
    }
}
