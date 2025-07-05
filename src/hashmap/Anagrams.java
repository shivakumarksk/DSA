package hashmap;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> anagramGroups = getAnagrams(words);
        System.out.println(anagramGroups);
    }
    public static List<List<String>> getAnagrams(List<String> names) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String words : names) {
            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (anagramMap.containsKey(sortedStr)) {
                anagramMap.get(sortedStr).add(words);
            } else {
                List<String> list = new ArrayList<>();

                list.add(words);
                anagramMap.put(sortedStr, list);
            }
        }
        return new ArrayList<>(anagramMap.values());
    }
}
