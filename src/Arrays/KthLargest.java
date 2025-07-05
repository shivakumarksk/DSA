package Arrays;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] ar = {1, 1, 3, 8, 9, 6, 6, 7, 8, 9, 9, 9, 10, 0, -1, -2};
        int[] ary={1,0,2,0,3,4,0,9,0};
       // System.out.println(findKthLargest(ar, 2));
        System.out.println(findKthLargest2(ary, 2));
       // System.out.println(findKthSmallest(ar, 2));

    }

    private static Integer findKthLargest(int[] ar, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int nums : ar) {
            q.add(nums);
            if (q.size() > k) {
                q.poll();
            }
        }
        return q.poll();
    }

    private static Integer findKthSmallest(int[] ar, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int nums : ar) {
            q.add(nums);
            if (q.size() > k) {
                q.poll();
            }
        }
        return q.poll();
    }

    private static int findKthLargest2(int[] a, int k) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > max) {
                secondmax = max;
                max = num;
            } else if (secondmax > num && max < num) {
                secondmax = num;
            }
        }
        return secondmax;
    }


}
