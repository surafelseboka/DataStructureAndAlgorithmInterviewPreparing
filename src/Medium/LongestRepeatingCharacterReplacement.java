package Medium;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {


        int[] charCount = new int[26];
        int result = 0;
        int left = 0;
        int maxCount= 0;

        for(int right =0; right<s.length(); right++ ){
            charCount[s.charAt(right) - 'A'] ++;

            maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;

            if(windowSize -maxCount <= k){
                result = windowSize;
            } else {
                charCount[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}
