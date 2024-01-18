package Medium;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] arr= new int[26];
        int result =0;
        int maxCount =0 ;
        int left =0 ;

        for (int right=0; right <s.length(); right++){

            arr[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount, arr[s.charAt(right) - 'A']);

            int window = right - left + 1;

            if (window- maxCount <= k){
                result= window;
            } else {
                arr[s.charAt(left) - 'A']--;
                left++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
    }
}
