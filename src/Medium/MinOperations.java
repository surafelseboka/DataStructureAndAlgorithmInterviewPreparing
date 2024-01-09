package Medium;

import java.util.HashMap;
import java.util.Map;

public class MinOperations {

    public static int minOperations(int[] nums) {

        HashMap<Integer, Integer> numOfFrequencies = new HashMap<>();
        int count = 0;

        for (int i: nums) {
            numOfFrequencies.put(i, numOfFrequencies.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry: numOfFrequencies.entrySet()){

            int x = entry.getValue();

            // If there is only a single number of occurrence
            if (x == 1) {
                return -1;
            }
            // number of occurrence: 3,6,9,...
            if (x % 3 == 0){
                count += x/3;

             //  number of occurrence 2,5,8,...
            } else if (x % 3 == 2) {
                count += x/3;
                count += 1;

              // number of occurrence 1,4,7,....
            } else if (x % 3 == 1) {
                count += (x - 4) /3;
                count += 2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {2,3,3,2,2,4,2,3,4}));
    }
}
