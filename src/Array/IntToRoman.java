package Array;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {

    /*


        THESE PROGRAM DOES NOT WORK



     */
    public static String intToRoman(int num) {

        HashMap<Integer,String> romanMap = new HashMap<>();

        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through the romanMap
        for (Map.Entry<Integer,String> entry: romanMap.entrySet()
             ) {
            int value = entry.getKey();
            String romanSymbol = entry.getValue();

               while (num >= value){
                   result.append(romanSymbol);
                    num -= value;
            }

//            // Calculate the number of repetitions using integer division
//            int repetitions = num / value;
//
//            // Handle special case for 10 (avoid repetitive Is)
//            if (value == 10) {
//                result.append(romanSymbol);
//                num -= value;
//                continue;
//            }
//
//            // Append the symbol repeated times
//            result.append(romanSymbol.repeat(repetitions));
//
//            // Update remaining number
//            num -= repetitions * value;
        }

//        // Handle trailing zeros if needed (e.g., 4000 should be MMMM)
//        if (num > 0) {
//            result.append(romanMap.get(1).repeat(num));
//        }

        return result.toString();


//            // Repeat subtracting the largest possible Roman numeral
//            while (num >= value){
//                num -= value;
//                result.append(romanSymbol);
//            }

//            // If the remaining num is 0, we've formed the Roman numeral
//            if(num == 0){
//                break;
//            }

    }

    public static void main(String[] args) {

        int num = 1994;
        String romanNumeral = intToRoman(num);
        System.out.println(romanNumeral);
    }
}
