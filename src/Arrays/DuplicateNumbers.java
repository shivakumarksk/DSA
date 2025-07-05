package Arrays;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int[] ar={1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int[] arr={1,2,3,4,5,6};
        System.out.println(isDuplicateHashNew(arr));
        Map<Integer, Long> dupes = (Arrays.stream(numbers).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        dupes.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    public static boolean isDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (unique.contains(num)) {
                return true;
            }
            unique.add(num);
        }
        return false;
    }

    public static boolean isDuplicateHashNew(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
