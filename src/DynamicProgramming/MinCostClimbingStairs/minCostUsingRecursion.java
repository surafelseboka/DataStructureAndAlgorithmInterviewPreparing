package DynamicProgramming.MinCostClimbingStairs;

public class minCostUsingRecursion {

    public static int minCostClimbingStairs(int[] costs){
        int n = costs.length;
        return Math.min(minCost(costs, n-1), minCost(costs, n-2));
    }
    public static int minCost(int[] costs, int n){

        if (n < 0 ) return 0;
        if (n == 0 || n == 1) return n;

        return costs[n] + Math.min(minCost(costs,n-1), minCost(costs, n-2));

    }
    public static void main(String[] args) {
        int[] costs = {10,15,20};
        System.out.println(minCostClimbingStairs(costs));
    }
}
