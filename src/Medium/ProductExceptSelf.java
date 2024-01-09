package Medium;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    public static int[] productExceptSelf(int[] nums){

        int[] result = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i=0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length -1; i >=0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
            return result;
    }
}
