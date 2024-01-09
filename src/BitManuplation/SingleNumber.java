package BitManuplation;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        int count  = 0;

        for (int num :nums ){
            count ^= num;
        }
        return count;

    }

    public static void main(String[] args) {

        int[] num = {1};

        System.out.println(singleNumber(num));
    }
}
