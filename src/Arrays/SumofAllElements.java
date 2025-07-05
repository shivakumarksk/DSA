package Arrays;

import java.util.Arrays;

public class SumofAllElements {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,4};
        System.out.println(Arrays.stream(ar).sum());
    }
}
