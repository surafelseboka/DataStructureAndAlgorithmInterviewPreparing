package DynamicProgramming.HouseRobberII;

import java.util.Arrays;

public class HouseRobberII {
        public static int[] memo;
        public static int rob(int[] nums){
            memo = new int[nums.length + 1];
            Arrays.fill(memo, -1);
            // int maxVal = Math.max(rob(nums[]))
            return 0;
        }
        public static int rob(int[] num, int i){

            if(i < 0) return 0;
            if (memo[i] >= 0) {
                return memo[i];
            }

            int result = Math.max(rob(num, i-2) + num[i] , rob(num, i-1));
            memo[i] = result;
            return result;
        }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,3,2}));
    }
    }

