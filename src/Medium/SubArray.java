package Medium;

public class SubArray {

    public static int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int currentMaxProduct = nums[0];
        int currentMinProduct = nums[0];


        for(int i=1; i < nums.length; i++){

            if(nums[i] < 0) {
                int temp = currentMaxProduct;
                currentMaxProduct = currentMinProduct;
                currentMinProduct = temp;
            }
                currentMaxProduct = Math.max(nums[i], currentMaxProduct * nums[i]);
                currentMinProduct = Math.min(nums[i], currentMinProduct * nums[i]);

                maxProduct = Math.max(maxProduct, currentMaxProduct);
            }

        return maxProduct;
    }
    public static int maxSubArray(int[] nums){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i=0; i< nums.length; i++){
            currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }


        return maxSum;
    }

    public static int minimumSubArray(int[] nums) {

        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum < minSum) {
                    minSum = currentSum;
                }

            }
        }
        return minSum;
    }

    public static int subArray(int[] nums) {

        int sum = 0;
        int startIndex = 2;
        int endIndex =  6;

        int subArrayLength = endIndex - startIndex; // 4

        int[] subArray = new int[subArrayLength]; // 2
        System.arraycopy(nums, startIndex,subArray,0,subArrayLength);

        for (int value : subArray
             ) {
            sum += value;
        }
      return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
//        System.out.println( ("SubArray [2,6] is: " + subArray(nums)));
//        System.out.println("Minimum sum of subArray: " + minimumSubArray(nums));
//        System.out.println("maximum sum of subArray: " + maxSubArray(nums));
        System.out.println("Maximum product of subArray: " + maxProduct(nums));
    }
}
