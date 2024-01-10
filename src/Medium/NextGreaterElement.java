package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] num1, int[] num2){

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num: num2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);

        }
        for (int i=0; i < num1.length; i++)
            num1[i] = map.getOrDefault(num1[i],-1);

        return num1;
    }

    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(num1, num2)));
    }
}
