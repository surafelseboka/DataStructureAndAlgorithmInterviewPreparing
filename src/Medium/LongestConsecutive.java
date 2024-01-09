package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {

        if(nums.length <= 1) {
            return nums.length;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)  +1);
        }

        int ans =Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int len  = 1;

            if(!map.containsKey(curr -1)){
                while (map.containsKey(curr+1)){
                    curr++;
                    len++;
                }
            }

            ans = Math.max(len,ans);
        }
            return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
