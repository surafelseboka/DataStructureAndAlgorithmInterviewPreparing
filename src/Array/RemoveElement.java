package Array;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int[] newNum = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                newNum[count] = nums[i];
                count++;
            }
        }
         return count;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(nums, val));
        System.out.println(removeElementUsingPointer(nums,val));
    }

    public static int removeElementUsingPointer(int[] nums, int val){

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
       return i;
    }

}
