package DP;

/*
        Learning a dynamic programming
        By Using three different approach to solve a fibonacci numbers = 1,1,2,3,5,8,13,.....
        fib(n-1) + fib(n-2)

        1.Recursion
        2.Memoized
        3.Bottom up
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
//        System.out.println(fib(n));
//        System.out.println(fibonacci(n));
        System.out.println(bottomUp(n));

    }

    /*
         1. using a recursion method

     */
    public static int fib(int n) {
        int result;

        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }

    /*
         2. Using a memoized approach using an array
         can be used also a hashmap

     */

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non negative integer");
        }
        long[] memo = new long[n + 1];
        return fibM(n, memo);
    }
    public static long fibM(int n, long[] memo) {
       if (n<=1) {
           return n;
       }
        if (memo[n] != 0) {
            return memo[n];
        }
            memo[n] =  fibM(n - 1,memo) + fibM(n - 2, memo);
            return memo[n];
}
        /*
            3. Bottom Up approach

         */

    public static int bottomUp(int n){
        int result;

        if (n==1 || n==2){
            result = 1;
        }

        int[] bottom_up = new int[n + 1];
        bottom_up[1] = 1;
        bottom_up[2] = 1;

        for (int i=2; i<=n; i++){
            bottom_up[i] = bottom_up[i -1] + bottom_up[i -2];
        }
        return bottom_up[n];
    }

    }

