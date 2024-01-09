package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static String frequencySort(String s) {

        HashMap<Character,Integer> frequency = new HashMap<>();
        for (char c: s.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,0) +1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> frequency.get(b) - frequency.get(a));
        pq.addAll(frequency.keySet());

        Character[] result = new Character[s.length()];
        for (int i=0; i<s.length(); i++){
            result[i] = pq.poll();
        }

        return result.toString();

//        for (Map.Entry<Character,Integer> entry: frequency.entrySet()){
//            System.out.println(entry.getKey()+ " : " + entry.getValue());
//        }
//
//        return s;
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
