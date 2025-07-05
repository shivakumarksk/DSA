package strings;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagrams = grpAnagrams(a);
        for (List<String> group : anagrams) {
           // System.out.println(group);
        }
        List<List<String>> ganagrams = groupAnagrams(a);
        for (List<String> group : ganagrams) {
            System.out.println(group);
        }
    }

    public static List<List<String>> grpAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();

        for (String str : strs) {
            boolean found = false;
            for (List<String> group : anagrams) {
                if (isAnagram(str, group.get(0))) {
                    group.add(str);
                    found = true;
                    break;
                }
            }
            if (!found) {
                List<String> newgrp = new ArrayList<>();
                newgrp.add(str);
                anagrams.add(newgrp);
            }
        }
        return anagrams;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static List<List<String>> getAnagrams(String[] words) {

        Map<String, List<String>> map = new HashMap<>();
        //boolean found = false;
        for (String str : words) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String kstr = String.valueOf(chars);
            map.computeIfAbsent(kstr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private static boolean isAnagram(String str, String s) {
        char[] char1 = str.toCharArray();
        char[] chars = s.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(chars);
        return Arrays.equals(char1, chars);
    }
}
