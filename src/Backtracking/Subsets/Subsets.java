package Backtracking.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] num){


        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), num, 0);
        return result;
    }

    public static void backtrack(List<List<Integer>> resultSets,
                                 List<Integer> tempSet,
                                  int[] num,int start) {
        // Add the sets to the result sets
        resultSets.add(new ArrayList<>(tempSet));
        for (int i=start; i < num.length; i++){

        // Case of including the numbers
        tempSet.add(num[i]);

        //Backtrack to the new subsets
         backtrack(resultSets, tempSet, num, i + 1);
        }

        // Case of not including the number
        tempSet.remove(tempSet.size()-1);
    }

    public static void main(String[] args) {
        int[] num = { 1,2,3};
        List<List<Integer>> subset =  subsets(num);

        //Displaying the list
        for (List<Integer> val : subset){
            System.out.println(val);
        }
    }
}
