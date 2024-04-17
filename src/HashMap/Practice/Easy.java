package HashMap.Practice;

import java.util.*;

public class Easy {
    public static void main(String[] args) {
//         characterMap();
//         String s = "car"; String t = "rat";
//        System.out.println(isAnagram(s,t));
//        int[] arr = {12,7,2,2}; int target = 9;
//        int[] newResult = twoSum(arr, target);
//        System.out.println(Arrays.toString(newResult));

        int[] num = {1,2,2,4};
        System.out.println(containsDuplicate(num));

    }

    public static void characterMap(){

        Map<Character, Integer> charMap = new HashMap<>();
        String name = "givemeanaccess";

        for (char c : name.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        System.out.println( charMap.get('v'));
        System.out.println(charMap.size());
        System.out.println(charMap.isEmpty());
        System.out.println(charMap.containsKey('a'));
        System.out.println(charMap.containsValue(3));
        System.out.println(charMap.get('z'));

        charMap.put('b',2);
        charMap.put('z',5);
        charMap.remove('z');
        System.out.println(charMap.get('z'));
        System.out.println(charMap.size());

        for (Map.Entry<Character, Integer> entry: charMap.entrySet()){
            int count = entry.getValue();
            char character = entry.getKey();

            System.out.println("Character: " + character + " count: " + count );
        }

        System.out.println(charMap.keySet());
        System.out.println(charMap.values());


        Map<Character, Integer> newCharacter = new HashMap<>();
        newCharacter.put('x',2);
        newCharacter.put('y',4);
        newCharacter.put('z',6);

        newCharacter.putAll(charMap);
        System.out.println("*".repeat(20));
        System.out.println(newCharacter.keySet());
        System.out.println(newCharacter.values());
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> count = new HashMap<>();

        for(char c: s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) - 1);
        }

        for (int val: count.values()){
            if (val != 0 ){
                return  false;
            }
        }

        System.out.println(count.keySet());
        System.out.println(count.values());
        System.out.println(count.size());

        return true;

    }

    public static int[] twoSum(int[] num, int target){



        Map<Integer, Integer> map = new HashMap<>();
        int[] result  = new int[2];

        for (int i=0; i < num.length; i++){
            if (map.containsKey(target - num[i])){
                result[1] = i;
                result[0] = map.get(target - num[i]);
                //System.out.println(map.get(target - num[i]));
                return result;
            }
            map.put( num[i],i);
        }

        return result;
    }

    public static boolean containsDuplicate(int[] num) {
        Set<Integer> set = new HashSet<>();
        for (int i : num){
            if (set.contains(i)){
                return true;
            }
            set.add(i);
        }
         return false;
    }


}

