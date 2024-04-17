package Array;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.*;

public class ConsoleInputToArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        int[] input = new int[5];

        for (int i=0; i < input.length; i++){
            out.print("Please enter new value: ");
            input[i] = scanner.nextInt();
        }

        out.println("hello" + Arrays.toString(input));

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length ; j++) {
                if (input[i] < input[j]){
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }

        out.println(Arrays.toString(input));


        int[] sortedArray = Arrays.copyOf(input, input.length);
        List<Integer> list = new ArrayList<>();

        for (int i : sortedArray){
            list.add(i);
        }

        out.println("hello");

    }
}
