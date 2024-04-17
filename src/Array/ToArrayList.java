package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ToArrayList {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7};
        List<Integer> myList = Arrays.asList(arr);
        ArrayList<Integer> list = new ArrayList<>(myList);
        list.contains(4);
    }
}
