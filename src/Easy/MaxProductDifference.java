package Easy;

import java.util.Arrays;

public class MaxProductDifference {

    public static int maxProductDifference( int[] nums){

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num: nums){
            if(num > max1){
               // max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if(num < min1){
               // min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int productDiff = (max2 * max1) - (min2 * min1);
        return productDiff;
    }

    public static void main(String[] args) {
        int[] num = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(num));
    }
}
