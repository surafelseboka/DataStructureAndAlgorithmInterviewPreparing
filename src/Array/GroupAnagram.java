package Array;

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs){

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = generatedKey(str);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private static String generatedKey(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
       String[] str = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(str));
    }
}
