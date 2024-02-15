package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>> partition(String s){

        //Base case
        if(s == null || s.length() == 0) return new ArrayList<>();

        List<List<String>> result  = new ArrayList<>();
        partition(s, new ArrayList<>() ,result);
        return result;
    }

    public static void partition(String s,List<String> currentPartition, List<List<String>> partitions){

        if (s == null ||  s.length() == 0){
            partitions.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int i= 1; i <= s.length(); i++){
            String temp = s.substring(0, i);
            if (!isPalindrome(temp)) continue;

            currentPartition.add(temp);
            partition(s.substring(i, s.length()),currentPartition,partitions);
            currentPartition.remove(currentPartition.size()-1);

        }
    }
     public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        while(left < right){
            if (str.charAt(left) != str.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
          return true;
    }

    public static void main(String[] args) {

        String s = "aab";
        List<List<String>> result = partition(s);

        for (List<String> partition: result){
            System.out.println(partition);
        }

    }
}
