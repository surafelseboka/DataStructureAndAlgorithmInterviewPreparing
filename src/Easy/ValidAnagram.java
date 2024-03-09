package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t){
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        // Two ways of return the values
       // return new String(sCharArray).equals(new String(tCharArray));
        return Arrays.equals(sCharArray, tCharArray);
    }

    public static boolean validAnagramUsingHashMap(String s, String t){
        // Handling null cases
        if (s == null || t == null || (s.length() != t.length())){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (char c: t.toCharArray()){
            Integer count = map.get(c);
            if (count == null || count == 0){
                return false;
            }
            map.put(c, count - 1);
        }

        return map.values().stream().allMatch(count -> count ==0);
    }

    public static void main(String[] args) {
        System.out.println(validAnagram("anagram", "nagaram"));
        System.out.println(validAnagramUsingHashMap("anagram", "nagaram"));
    }
}
