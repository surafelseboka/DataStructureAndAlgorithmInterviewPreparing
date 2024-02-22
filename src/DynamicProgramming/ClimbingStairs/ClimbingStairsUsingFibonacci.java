package DynamicProgramming.ClimbingStairs;

public class ClimbingStairsUsingFibonacci {

     /*
        Using a recursive approach
     */
    public static int climbStairs(int n){

        // Here can be implemented using a fib approach
        // But is not optimal solution
        // And it will take long for large n numbers 
        

        if(n <=2) {
            return n;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(climbStairs(n));
    }
}
