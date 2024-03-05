package Easy;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {

        // A palindrome is a kind of word reading forward and backward is same
        // In this case avoid numbers and Special cases - using the class of character.isDigit and CHARACTER.IsLetter
        // Convert to lower cases
        //using a two pointer concept can check the value from the left and right same

       String newString = "";

       for (char c: s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c) || Character.isUpperCase(c)){
                newString += c;
            }
       }

       newString = newString.toLowerCase();

       int leftPointer = 0;
       int rightPointer = newString.length() -1;

        while (leftPointer <= rightPointer){
            if(newString.charAt(leftPointer) != newString.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("112211"));
    }
}
