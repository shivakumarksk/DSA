package Arrays;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class SecondLargest {
    public static void main(String[] args) {
       // int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        int[] ar = {8,6,9,7,1, 2, 3, 4, 5, 6,7,6,8,9,9,9,9};
        System.out.println(getLargest(ar));
        System.out.println(secnLargest(ar));
        //System.out.println(twoPointersApproach(ar));

    }

    public static int getLargest(int[] arr) {

        return Arrays.stream(arr)
                .distinct()
                .boxed()// Convert primitive int[] to Integer[] for sorting in reverse order
                .sorted((a,b)->b-a) // Sort in descending order
                .skip(1)                // Skip the first (largest) element
                .findFirst().orElseThrow();// Convert back to primitive int
    }
    public static int twoPointersApproach(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int num: arr) {
            if(num>max) {
                secondmax=max;
                max=num;
            } else if (num > secondmax && num < max) {
                secondmax = num;  // Update second max if num is between max and secondmax
            }
        }
return secondmax;
    }
    public static int secnLargest(int[] ar) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] > max) {
                secmax=max;
                max=ar[i];
            }
        }
        return secmax;
    }
}
