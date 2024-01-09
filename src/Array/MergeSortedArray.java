package Array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] num1, int m, int[] num2,int n){

        for (int i=0, j = n;  i < n; i++ ){
            num1[j] = num2[i];
            j++;
        }
        Arrays.sort(num1);
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m =3;
        int n=3;

        merge(num1,m,num2,n);
        System.out.println(Arrays.toString(num1 ));

    }
}
