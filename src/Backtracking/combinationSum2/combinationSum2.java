package Backtracking.combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {

    public static List<List<Integer>> combinationSum2 (int[] candidate, int target){

        List<List<Integer>> result  = new ArrayList<>();
        Arrays.sort(candidate);
        return result;
    }

    public static void backtracking(int index, int[] arr, int target,
                             List<List<Integer>> result, List<Integer> ds){

        if(target == 0){
            result.add(new ArrayList<>(ds));
        }

        for (int i = index; i < arr.length; i++){
            if(i > index && arr[i]== arr[i -1]){
               continue;
            }

            if (arr[i] > target) break;
            ds.add(arr[i]);
            backtracking(i+1, arr, target - arr[i], result, new ArrayList<>(ds));
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
       int[] candidate = {0,1,2,7,6,1,5};
       int target = 8;

       List<List<Integer>> combinationSum = combinationSum2(candidate, target);

       for (List<Integer> val : combinationSum){
           System.out.println(val);
       }
    }
}
