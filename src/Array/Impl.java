package Array;

import java.util.Arrays;

public class Impl {

    public static void main(String[] args) {

        int[] num = {2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(printOdds(num)));
    }

    public static int[] printOdds(int[] num){
        int oddCounts = 0;
        for (int i: num){
            if(i % 2 == 1) oddCounts++;
        }

        int[] result = new int[oddCounts];
        int index=0;

        for (int number: num){
            if (number % 2 != 0){
                result[index] = number;
                index++;
            }
        }
        return result;
    }
}
