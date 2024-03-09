package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ArrayToLinkedList {
    public static void main(String[] args) {

        /*
            Method 1: Iterating and Adding Individually
         */
        int[] arr  = {1,2,3,4,5};
        //Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        for (int element: arr){
            list.add(element);
        }
        System.out.println(list);


        /*
        Method 2: Using Collections.addAll()
         */
        Integer[] array = {1,5,3,8};
        LinkedList<Integer> list1 = new LinkedList<>();

        //convert array to a list
        Collections.addAll(list1, array);

        System.out.println(list1);
    }
}
