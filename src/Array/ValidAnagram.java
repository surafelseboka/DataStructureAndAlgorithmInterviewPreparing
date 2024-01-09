package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        char[] charS = new char[s.length()];
        char[] charT = new char[s.length()];
        
        int count = 0;

        for (char c: s.toCharArray()
             ) {
           count++;
        }

        for (char newS : s.toCharArray()
             ) {
            count--;
        }

         if (count == 0) {
             return true;
         }

  return false;

    }

}
