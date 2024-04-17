package Easy;

import java.util.Arrays;
import java.util.HashMap;


public class SmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] result = new int[nums.length];
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            if (!map.containsKey(sorted[i])){
                map.put(sorted[i],i );
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("number ");
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
    }
}
