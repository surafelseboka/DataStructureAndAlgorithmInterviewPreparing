package Easy;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if(s.length() == 0) {
            return false;
        }

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < t.length()){
            if(s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++;
                if(sPointer == s.length()){
                    return true;
                }
            }
            tPointer++;
        }
            return false;

    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "aacccb";
        System.out.println(isSubsequence(s,t));


    }
}
