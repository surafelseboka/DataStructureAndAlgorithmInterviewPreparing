package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ReverseOrder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomNumber(7)));
        System.out.println(Arrays.toString(reverseOrder(getRandomNumber(7))));
    }

    public static int[] getRandomNumber(int len){

        Random random = new Random();
        int[] newArray = new int[len];

        for (int i=0; i< newArray.length; i++){
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

    public static int[] reverseOrder(int[] number){
        for (int i = 0; i<number.length; i++){
            for (int j = i +1; j< number.length; j++){
                if (number[i] < number[j]){
                    int temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        }
        return number;
    }
}
