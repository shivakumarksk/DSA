package Arrays;

import java.util.HashMap;

public class ArrayIn {
    //time complexity is O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[0];
    }


    public int[] twoSumOptimized(int[] nums, int target) {
        HashMap<Integer, Integer> alreadyvisited = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int visited = target - nums[i];
            if (alreadyvisited.containsKey(visited)) {
                return new int[]{alreadyvisited.get(visited), i + 1};
            }
            alreadyvisited.put(nums[i], i + 1);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        ArrayIn sol = new ArrayIn();
        int[] nums = {3, 2, 3};
        int target = 6;
        for (int a : sol.twoSumOptimized(nums, target)) {
            System.out.println(a);
        }
    }
}

