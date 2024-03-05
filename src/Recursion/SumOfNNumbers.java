package Recursion;

import java.util.Scanner;

public class SumOfNNumbers {

    // Using a parametrized way
    public static void sumOfN(int i, int sum){

        if ( i < 0){
            System.out.print(sum);
            return;
        }
        sumOfN(i -1, sum + i);
    }

    // using a functional recursion
    public static int sumOfN(int n){
        if( n == 0){
            return 0;
        }
        return n + sumOfN(n -1);
    }

    public static void main(String[] args) {
        System.out.println("which numbers want display: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sumOfN(n, 0);
        System.out.println("\n" + "Printing the functional recursion: ");
        System.out.println(sumOfN(n));
    }
}
