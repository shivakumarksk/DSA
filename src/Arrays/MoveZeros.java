package Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] mvz = {0, 1, 0, 3, 12, 0};
        moveZeros(mvz);
    }

    public static void moveZeros(int[] nums) {
        int nonZeroCount = 0;
        //int[] ar = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroCount];
                nums[nonZeroCount] = temp;
                nonZeroCount++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
