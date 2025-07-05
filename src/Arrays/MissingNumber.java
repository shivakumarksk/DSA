package Arrays;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] missing = {1, 2, 3, 4, 5, 7, 8, 9};

        //System.out.println(findMissingNumber(numbers));
        System.out.println(missing(missing));
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Total numbers including missing one
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
        System.out.println(expectedSum);
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static int missing(int[] ar) {
        HashSet<Integer> hset = new HashSet<>();
        int n = ar.length + 1;
        for (int i = 1; i <= n + 1; i++) {
            hset.add(i);
        }
        for (int num : ar) {
            hset.remove(num);
        }
        return hset.iterator().next();
    }
}
