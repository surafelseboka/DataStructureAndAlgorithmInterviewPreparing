package Easy;

public class MaxScore {

    public static int maxScore(String s) {

        int maxScore = 0;
        int sumOne = 0;
        int sumZero = 0;

        for (char c : s.toCharArray()){
            if(c == '1'){
                sumOne++;
            }
        }

        for (int i = 0; i < s.length()-1 ; i++) {
            sumZero += s.charAt(i) == '0' ? 1 : 0;
            sumOne -= s.charAt(i) == '1' ? 1: 0 ;
            maxScore = Math.max(maxScore, sumOne + sumZero);
        }

        return maxScore;
    }

    public static void main(String[] args) {

        String s = "00111";
        System.out.println(maxScore(s));
    }
}
