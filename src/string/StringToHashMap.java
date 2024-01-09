package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringToHashMap {

    public static void main(String[] args) {

        String input  = "pwwkew";

        HashMap<Character,Integer> characterFrequencyMap = new HashMap<>();

        for (char c : input.toCharArray()
             ) {
            characterFrequencyMap.put(c, characterFrequencyMap.getOrDefault(c,0) + 1);
        }

        System.out.println("Character frequencies");
        for(Map.Entry<Character,Integer> entry: characterFrequencyMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
        System.out.println("******");

        HashSet<Character> set = new HashSet<>();
        for (char c: input.toCharArray()){
            set.add(c);
        }

        for (char c: set){
            System.out.println(c);
        }

        int size = set.size();
        System.out.println("size: " + size );



    }
}
