package string;

public class lengthOfLastWord {
    public static void main(String[] args) {
       String s = "Hello World";
       String n = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(n));

    }

    public static int lengthOfLastWord(String s) {

         String trimmedString = s.trim();
         int lastSpaceIndex = -1;

        for (int i = trimmedString.length() -1; i >= 0 ; i--) {
            if(trimmedString.charAt(i) == ' '){
                  lastSpaceIndex = i;
                  break;
            }
        }

        if(lastSpaceIndex == -1) {
            return 0;
        }
        return trimmedString.length() - lastSpaceIndex -1;
    }
}
