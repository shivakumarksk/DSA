package javaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesAndFreq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 5, 4, 5};
        Map<Integer,Long> dupes= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                //.filter(entry -> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        dupes.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
