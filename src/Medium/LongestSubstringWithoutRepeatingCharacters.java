package Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0; int j =0; int max = 0;

        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() == j - i + 1){
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) -1);
                        if (map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                        i++;
                }
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
