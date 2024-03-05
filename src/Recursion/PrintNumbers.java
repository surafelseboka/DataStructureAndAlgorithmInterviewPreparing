package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void printNumbers(int i, int n){
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        printNumbers(i-1, n);
    }

    public static void main(String[] args) {
        System.out.print("which numbers want display: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers(n, n);
    }
}
