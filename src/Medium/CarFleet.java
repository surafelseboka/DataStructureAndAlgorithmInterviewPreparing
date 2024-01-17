package Medium;

import java.util.Arrays;
import java.util.Stack;


public class CarFleet {

    public static int carFleet(int target, int[] position, int[] speed){


        int carPosition = 0, carSpeed = 1;
        int len = position.length;
        int cars[][] = new int[len][2];

        for(int i = 0; i < len; i++)
        {
            cars[i][carPosition] = position[i];
            cars[i][carSpeed] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[carPosition], a[carPosition]));

        Stack<Double> stack = new Stack<>();

        for(int car[] : cars)
        {
            stack.push((double)(target - car[carPosition]) / car[carSpeed]);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2))
                stack.pop();
        }
        return stack.size();

    }

    public static void main(String[] args) {
        System.out.println(carFleet(10, new int[]{0,4,2}, new int[] {2,1,3}));
    }
}
