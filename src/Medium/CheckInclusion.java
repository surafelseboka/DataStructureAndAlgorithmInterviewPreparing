package Medium;

import java.util.HashMap;
import java.util.Map;

public class CheckInclusion {
    public static boolean checkInclusion(String s1, String s2){

        if (s1.length() > s2.length()) {
            return false;
        }
        // Create hashmaps to store character frequencies
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        // Initialize the hashmap for s1
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        // Initialize the sliding window
        int left = 0;
        int right = 0;

        // Slide the window through s2
        while (right < s2.length()) {
            char currentChar = s2.charAt(right);

            // Update the window hashmap
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            // Check if the window size is equal to s1's size
            if (right - left + 1 == s1.length()) {
                // Compare the window hashmap with s1's hashmap
                if (windowMap.equals(s1Map)) {
                    return true;
                }

                // Move the window by one character to the right
                char leftChar = s2.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                // Remove the character from the hashmap if its count becomes zero
                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }

                left++;
            }

            right++;
        }
        return false;
    }

    public static boolean isPermutation(Map<Character,Integer> map1, Map<Character,Integer>map2){
        for (Map.Entry<Character,Integer> entry : map1.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();

            if (!map2.containsKey(key) || map2.get(key) != value) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(checkInclusion("ab","surabl"));
    }
}
