package Array;

import java.util.Arrays;

public class StringBinarySearch {
    public static void main(String[] args) {

        String[] sArray = {"Able", "Jane","Mark", "Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "surafel") >=0){
            System.out.println("Found Mark in the list");
        } else{
            System.out.println("Not found in the list");
        }
    }

}
