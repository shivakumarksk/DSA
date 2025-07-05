package java8;

import java.util.Arrays;
import java.util.List;

public class SquaresOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //sum of the squares of the numbers
        int sum=numbers.stream().map(a->a*a).reduce(0,(a,b)->a+b);
        System.out.println(sum);//1+4+9+16+25
    }
}
