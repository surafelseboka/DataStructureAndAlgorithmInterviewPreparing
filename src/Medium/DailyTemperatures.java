package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = n -1; i >= 0 ; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()])
                stack.pop();

            if(!stack.isEmpty()) result[i] = stack.peek() - i;
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] tempratures = {30,40,50,60};

        System.out.println(Arrays.toString(dailyTemperatures(tempratures)));
    }
}
