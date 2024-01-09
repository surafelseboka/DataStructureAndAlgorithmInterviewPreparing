package Medium;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
 /*
  Problem solved: Using Dynamic window sliding
  */
    public static int lengthOfLongestSubstring(String s) {

        int windowStart = 0;
        int maxLength = 0;

        HashMap<Character,Integer> characterFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char rightChar = s.charAt(windowEnd);
            characterFrequencyMap.put(rightChar, characterFrequencyMap.getOrDefault(rightChar,0) +1);

        while (characterFrequencyMap.size() < windowEnd -windowStart + 1) {
            char leftChar = s.charAt(windowStart);
            characterFrequencyMap.put(leftChar,characterFrequencyMap.get(leftChar) - 1);

            if (characterFrequencyMap.get(leftChar) == 0) {
                characterFrequencyMap.remove(leftChar);
            }
            windowStart++;
        }
        maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(new String("pwwkew")));
    }
}
