package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Wpr {


    public static void main(String[] args) {

        int[] ars={1,1,2,2,6,7,8,3,8};
        Map<Integer, Long> dupes = Arrays.stream(ars)
                .boxed()
                .collect(Collectors.groupingByConcurrent(i -> i, Collectors.counting()));
        System.out.println(dupes);

        int firstNonRepeated = Arrays.stream(ars)
                .filter(dupes::containsKey)
                .filter(key -> dupes.get(key) == 1)
                .findFirst()
                .getAsInt();


        System.out.println(firstNonRepeated);
    }
}


