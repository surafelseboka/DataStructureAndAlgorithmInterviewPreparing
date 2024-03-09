package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] num, int target){
        int[] result  = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if(map.containsKey(target - num[i])){
                result[1] = i;
                result[0] = map.get(target - num[i]);
                return result;
            }
            map.put(num[i],i );
        }
         return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }
}
