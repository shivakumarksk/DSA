package java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestInAr {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,6,8,100};
        System.out.println(largest(ar));
    }
    public  static  int largest(int[] ar) {
        //System.out.println(Arrays.asList(ar).stream().max(Integer::compareTo));
    //    OptionalInt max = Arrays.stream(ar).max();
        return Arrays.stream(ar).max().getAsInt();
    }
}
