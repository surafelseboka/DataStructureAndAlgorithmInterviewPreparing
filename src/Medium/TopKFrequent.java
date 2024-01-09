package Medium;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> numFrequency = new HashMap<>();

        for (int i : nums) {
            numFrequency.put(i, numFrequency.getOrDefault(i,0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> numFrequency.get(b) - numFrequency.get(a));
        pq.addAll(numFrequency.keySet());

        //Putting top k values in array
        int[] result = new int[k];
        for (int i=0; i<k; i++){
            result[i] = pq.poll();
        }

        return result;

//        for (Integer c: numFrequency.values()){
//            int value = numFrequency.get(c) == null ? 0 : numFrequency.get(c);
//            numFrequency.put(c,value + 1);
//        }
//        System.out.println("numFrequency: " + numFrequency);
//
//        for (Map.Entry<Integer,Integer> entry: numFrequency.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//       int count = Collections.frequency(numFrequency.values(),5);
//        System.out.println(count);
//
//
//
//
//        return nums;
    }

    public static void main(String[] args) {
        int[] result  = topKFrequent(new int[]{5,5,5,4,4,3}, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
