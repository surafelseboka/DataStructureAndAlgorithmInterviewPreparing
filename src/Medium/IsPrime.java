//package Medium;
//
//public class IsPrime {
//
//    public static int countPrime(int num){
//
//        int count = 0;
//
//        // Assume all numbers are prime initially
//
//        for (int i = 2; i <= num; i++) {
//            isPrime(i);
//        }
//
//        // Mark multiples of primes as non-prime
//        for (int i = 2; i * i <= num; i++) {
//            if(isPrime(i)){
//                for (int j = i * i; j <= num; j+=i) {
//                    isPrime(j);
//                }
//            }
//        }
//
//        // Collect the primes into a list
//
//        for (int i=2; i <= num; i++){
//            if(isPrime(i)){
//                count++;
//            }
//        }
//        return count;
//    }
//   x
//
//    public static void main(String[] args) {
//        int num = 10;
//       // System.out.println(isPrime(num));
//        System.out.println(countPrime(num));
//    }
//}
