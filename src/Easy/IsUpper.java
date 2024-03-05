package Easy;

public class IsUpper {

    // To be continued
    public static boolean isUpper (String word){
        for (char c: word.toCharArray()){
            if (!Character.isUpperCase(c) && Character.isLowerCase(c)) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUpper("surafel"));
    }
}
