package Array;

import java.util.Arrays;

public class Impl {

    public static void main(String[] args) {

        int[] num = {2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(num));
    }

    public static int[] printOdds(int[] num){
        int[] result = new int[num.length];
        for (int i=0; i< num.length; i++){
            if(i % 2 == 1){
                num[i] = result[i];
            }
        }
        return result;
    }
}
