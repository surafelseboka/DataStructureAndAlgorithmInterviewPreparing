package Array;

public class containsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i+1; j < arr.length -1; j++) {
                if (arr[j] < arr[i] ) {
                    swap(arr,i,j);
                }
            }
            // Check for consecutive duplicates after the swap
            if (i > 0 && arr[i] == arr[i - 1]) {
         //       return true;
            }
        }

        // return flase;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean containsDuplicate(int[] nums){



        for (int i = 0; i < nums.length -1; i++) {
               swap(nums, i ,i+1);
            if (nums[i] != nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
