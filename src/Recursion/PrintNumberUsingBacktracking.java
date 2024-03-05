package Recursion;
import java.util.Scanner;

public class PrintNumberUsingBacktracking {
    public static void printNumbers(int i, int n){
        if(i > n) {
            return;
        }
        printNumbers(i+1,n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        System.out.print("which numbers want display: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers(1, n);
    }
}
