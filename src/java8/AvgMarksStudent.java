package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgMarksStudent {
    public static void main(String[] args) {
        String[][] marks= {{"siva","65"},
                {"arjun","67"},
                {"Bhima","80"},
                {"Mike","76"}
        };

        int [] values={32,67,87,98,100,120};
        System.out.println(Arrays.stream(values).max().orElseThrow(() -> new RuntimeException("Array is empty")));

        Map.Entry<String,Double> marksavg=Arrays.stream(marks).
                collect(Collectors.groupingBy(a->a[0],Collectors.averagingInt(a->Integer.parseInt(a[1])))).
                entrySet().stream().max((e1, e2) -> Double.compare(e1.getValue(), e2.getValue())).get();

        System.out.println(marksavg.getKey() +"" +marksavg.getValue());
    }
}
