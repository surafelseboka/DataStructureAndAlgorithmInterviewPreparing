package Medium;

import java.util.HashMap;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2){

        if(s1.length()> s2.length()){
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i= 0; i< s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;

        for (int i=0; i < 26; i++){
            if(s1Count[i] == s2Count[i]){
                matches++;
            } else{
                matches = matches;
            }
        }

        int left =0 ;

        for (int right = s1.length(); right < s2.length(); right++) {
            if (matches == 26){
                return true;
            }

            int index = s2.charAt(right) - 'a';
            s2Count[index]+=1;

            if (s1Count[index] == s2Count[index]){
                matches +=1;
            } else if (s1Count[index] + 1 == s2Count[index]) {
                matches -=1;
            }

             index = s2.charAt(left) - 'a';
            s2Count[index]-=1;

            if (s1Count[index] == s2Count[index]){
                matches +=1;
            } else if (s1Count[index] - 1 == s2Count[index]) {
                matches -=1;
            }
            left++;
        }
        return matches == 26;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaoo"));
    }
}
