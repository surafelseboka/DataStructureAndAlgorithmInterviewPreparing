package Medium;

public class MinTimeToMakeColorfulRope {

    public static int minTimeToMakeColorfulRope(String colors, int[] neededTime){
        int n = neededTime.length;

        //Base case
        if(n <= 1) {
            return 0; // No time needed if there is 0 or 1 balloons there
        }

        int[] dp = new int[n + 1];

        //Initialization for the first balloon
        dp[1] = 0;

        //Fill the rest dp array
        for (int i=2; i<=n; i++) {

            int currTotal = neededTime[i -1];
            int currMax = neededTime[i -1];

            // Calculate the total time and max time for two consecutive same color balloons
            for (int j = i - 1; j >= 1 && colors.charAt(i - 2) == colors.charAt(j - 1); j--) {
                currTotal += neededTime[j - 1];
                currMax = Math.max(currMax, neededTime[j - 1]);
            }
            //Update the dp array
            dp[i] = Math.min(dp[i-1] + currTotal - currMax, dp[i -2] +currTotal);
        }
        return dp[n];


    }

    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = {1, 2, 3,4,1};

        int result = minTimeToMakeColorfulRope(colors,neededTime);

        System.out.println("Minimum time needed: " + result);
    }
}
