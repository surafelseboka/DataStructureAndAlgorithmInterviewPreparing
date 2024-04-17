package HashMap.Practice;

import java.util.*;

public class Medium {
    public static void main(String[] args) {
        int[] num = {1,1,1,2,2,3,7,7,7,7};
        int k = 2;
        int[] result = topKFrequent(num, k);
        System.out.println(Arrays.toString(result));
    }
    public static int[] topKFrequent(int[] num, int k) {

            Map<Integer, Integer> map = new HashMap<>();
            for (int i : num){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o2) - map.get(o1);
                }
            });

            pq.addAll(map.keySet());

            // remove the first two elements from pq and add to the array
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = pq.poll();
            }
            return result;

    }
}
