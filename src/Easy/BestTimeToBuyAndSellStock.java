package Easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit( int[] prices){

        /*
            Time complexity: O(n)
            Space complexity: O(1)
         */

        // Using a sliding window and two pointer
        int left  = 0;
        int right = 1;
        int maxProfit = 0;

        while(right < prices.length){
            if (prices[right] < prices[left]){
                left = right;

            }
            int currentProfit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, currentProfit);
            right++;
        }
            return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }
}
