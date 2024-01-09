//package Medium;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SieveOfEratosthenes {
//
//    public static List<Integer> sieveOfEratosthenes(int limit) {
//        boolean[] isPrime = new boolean[limit + 1];
//        List<Integer> primes = new ArrayList<>();
//
//        // Assume all numbers are prime initially
//        for (int i = 2; i <= limit; i++) {
//            isPrime[i] = true;
//        }
//
//        // Mark multiples of primes as non-prime
//        for (int i = 2; i * i <= limit; i++) {
//            if (isPrime[i]) {
//                for (int j = i * i; j <= limit; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//
//        // Collect the primes into a list
//        for (int i = 2; i <= limit; i++) {
//            if (isPrime[i]) {
//                primes.add(i);
//            }
//        }
//
//        return primes;
//    }
//
//    public static List<Integer> countPrimes(int n) {
//
//        sieveOfEratosthenes(n);
//
//        // Extract digits from the number and add them to the list
//        while (n > 0) {
//            n.add(0, n % 10); // Add digit at the beginning of the list
//            n /= 10; // Remove the last digit from the number
//        }
//
//        // Special case for the number 0
//        if (digitList.isEmpty()) {
//            digitList.add(0);
//        }
//      return digitList;
//    }
//
//    public static int convertListToInt(List<Integer> digits) {
//        int result = 0;
//
//        for (int digit : digits) {
//            result = result * 10 + digit;
//        }
//
//        return result;
//    }
//
//
//    public static void main(String[] args) {
//        int limit = 30;
//        List<Integer> result = sieveOfEratosthenes(limit);
//
//        // Print the list of prime numbers
//        System.out.println(result);
//    }
//}
//
