package Recursion;
import java.util.Scanner;
public class PrintNameNTimes {
    public static void printName(int i, int n) {
        // Base case
        if(i < 1) {
            return;
        }
        System.out.println("John");
        printName(i--, n);
    }
    public static void main(String[] args) {

        System.out.print("How many times you want to print John: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printName(n, n);
    }
}


