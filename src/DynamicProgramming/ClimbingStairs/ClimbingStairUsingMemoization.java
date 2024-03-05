package DynamicProgramming.ClimbingStairs;

public class ClimbingStairUsingMemoization {
    private static int[] memo;

    public static int climbStairs(int n){
        memo = new int[n +1];
        return climbStairsHelper(n);
    }
    public static int climbStairsHelper(int n){
        if(n <= 2){
            return n;

            // Save the previous computed values in here
        } if(memo[n] != 0){
            return memo[n];
        }
        memo[n] = climbStairsHelper(n-1) + climbStairsHelper(n-2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(climbStairs(n));
    }
}
