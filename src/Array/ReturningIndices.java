package Array;

import java.util.HashMap;

public class ReturningIndices {
    public static void main(String[] args) {
        int[] nums = {2,7,11,13};
        int target = 13;

         int[] result = twoSum(nums, target);
         if (result[0] != -1){
             System.out.println(result[0]  +"," + result[1]);
         } else {
             System.out.println("no result");
         }
    }

    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,1};
    }
}
