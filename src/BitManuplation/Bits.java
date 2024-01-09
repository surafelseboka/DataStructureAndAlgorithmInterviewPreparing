package BitManuplation;

public class Bits {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 3;

        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;

        while (carry != 0){

            int tempSum = sum;
            sum = sum ^ carry;
            carry = (tempSum & carry) << 1;
        }

        System.out.println("Sum: " + sum);
    }
}
