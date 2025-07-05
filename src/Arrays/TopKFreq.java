package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFreq {
    public static void main(String[] args) {
        int[] ar = {1, 2, 2, 3, 3, 3};
        int[] arr = {7, 7};
        System.out.println(Arrays.toString(topKFrequent(ar, 2)));
        System.out.println(Arrays.toString(topKFrequentOpti(ar, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> map = new HashMap<>();

        map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(k)
                .mapToInt(e -> (int) e.getKey())
                .toArray();
        //.collect(Collectors.toList());
    }

    public static int[] topKFrequentOpti(int[] nums, int k) {
        Map<Integer, Long> map = new HashMap<>();

        map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        PriorityQueue<Map.Entry<Integer, Long>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        queue.addAll(map.entrySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = (int) queue.poll().getKey();
        }
        return result;
    }

}
