package Queues;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQueue {
    public static void main(String[] args) {
        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");


        int[] nums = {3, 2, 1, 5, 6, 4};
        int[] ar = {1, 1, 3, 8, 9, 6, 6, 7, 8, 9, 9, 9, 10,10, 0,-1,-2};
        //1,2,3,4,5,6
        int k = 3;
        System.out.println("The " + k + "th smallest element is " + findKthSmallest(nums, k));

        System.out.println("The " + k + "th largest element is " + findKthLargest(ar, k));

    }

    public static int findKthSmallest(int[] nums, int k) {
        // Min-Heap to keep the smallest K elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
        }

        int kthSmallest = -1;
        for (int i = 0; i < k; i++) {
            kthSmallest = minHeap.poll(); // Extract Kth smallest element
          //  System.out.println(kthSmallest);

        }

        return kthSmallest;
    }

    public static int findKthLargestUsingStrms(int[] nums, int k) {
        return Arrays.stream(nums)
                .distinct()
                .boxed()
                //.sorted((a, b) -> b-a)
                .sorted()
                .skip(k-1)
                .findFirst()
                .get();
    }
    public static int findKthLargest(int[] nums, int k) {

        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums) {
            pq.offer(val);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
