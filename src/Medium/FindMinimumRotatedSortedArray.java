package Medium;

public class FindMinimumRotatedSortedArray {

    public static int findMin(int[] nums) { // 3,4,5,1,2

        int start = 0;
        int end = nums.length -1;

        while(start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid + 1] < nums[mid]){
                return nums[mid +1];
            }
            if(mid > 0 && nums[mid] < nums[mid -1]) {
                return nums[mid];
            }
            if(nums[end] > nums[mid]){
                end = mid -1;
            } else  {
                start = mid + 1;
            }
        }

        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] {11,13,15,17}));
    }
}
