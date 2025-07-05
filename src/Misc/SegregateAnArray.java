package Misc;

import java.util.Arrays;

public class SegregateAnArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 7, 3, 0, 1, 4, 1, 5, 7, 0, 1};
        segreGate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segreGate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                swap(nums, left, i);
                left++;
                i++;
            } else if (nums[i] == 1) {
                swap(nums, right, i);
                right--;
            } else {
                i++;
            }
        }
        Arrays.sort(nums, left, right + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
