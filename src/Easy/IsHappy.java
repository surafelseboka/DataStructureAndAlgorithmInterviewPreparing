package Easy;

public class IsHappy {

    public static boolean isHappy(int n) {

        int x,y,sum =0;
        int count = 0;

        while (sum != 1) {

            if (n >= 100) {
                x = n / 100;
                y = n % 100;

            } else {
                x = n / 10;
                y = n % 10;
            }

            sum = (int) (Math.pow(x, 2) + Math.pow(y, 2));
            n = sum;
            count++;

            if (count == 10) return false;
        }
       return true;
    }

    public static void main(String[] args) {
        int n =2;
        System.out.println(isHappy(n));
    }
}
