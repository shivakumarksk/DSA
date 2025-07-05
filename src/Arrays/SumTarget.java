package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumTarget {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 80, 90, 20};
        //          {0,   1,  2,  3,  4,  5,  6}
        int[] ar = {2, 7, 11, 15};
        int target = 100;
        sumTarget(arr, target);
        System.out.println(Arrays.deepToString(twoSum(arr, 100)));
    }

    //brute-force
    public static void sumTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }


    public static int[][] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (map.containsKey(diff)) {
                result.add(new int[]{map.get(diff), i});
                //return new int[]{map.get(diff), i};

            }
            map.put(num, i);
        }
        return result.toArray(new int[result.size()][]);

    }
}
