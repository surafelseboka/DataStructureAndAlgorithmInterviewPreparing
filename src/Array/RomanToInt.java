package Array;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        s = s.replace("IV","IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        for(int i = 0; i < s.length(); i++){
            sum = sum + (map.get(s.charAt(i)));
        }

        return sum;
    }
}
