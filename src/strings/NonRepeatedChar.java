package strings;

import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatedChar {
    public static void main(String[] args) {
        String s = "SivaKumar";
        Map<Character, Long> frequencyMap = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(c -> (char) c.intValue(), Collectors.counting()));
        s.chars().boxed().map(c->(char)c.intValue())
                .filter(c->frequencyMap.get(c)==1)
                .findFirst()
                .ifPresent(c->System.out.println("Non repeated characer is " +c));
    }
}
