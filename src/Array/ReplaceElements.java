package Array;

public class ReplaceElements {

    public static int[] replaceElements(int[] arr) {

        int maxRight = - 1;

        for(int i= arr.length -1; i >= 0; i--){

            int currentElement = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, currentElement);

        }

        return  arr;
    }

    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        int[] result = replaceElements(nums);

        for (int i: result
             ) {
            System.out.print(i + " ");
        }
    }
}
