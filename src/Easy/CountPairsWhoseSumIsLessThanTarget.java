package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {

    public static int countPairs(List<Integer> nums, int target) {

        Integer[] numsArray = nums.toArray(new Integer[0]);
        Arrays.sort(numsArray);

        int count = 0;
        int start = 0;
        int end = numsArray.length - 1;

        while( start < end) {

            int sum = numsArray[start] + numsArray[end];

            if ( sum < target) {
                count += end - start;
                start++;
            } else {
                end--;
            }
        }

    return count;

    }

    public static void main(String[] args) {

       List<Integer> list  = new ArrayList<>();
       list.add(-6);
        list.add(2);
        list.add(5);
        list.add(-2);
        list.add(-7);
        list.add(-1);
        list.add(3);
        System.out.println(countPairs(list, -2));

    }
}
