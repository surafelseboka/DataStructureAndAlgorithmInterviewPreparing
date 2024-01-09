package Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3;
        int n=3;

        // Use Arrays.copyOf() to copy elements
        int[] newArray = Arrays.copyOf(sourceArray, sourceArray.length);

        // Print the contents of the new array
        System.out.println("Original Array: " + Arrays.toString(sourceArray));
        System.out.println("Copied Array: " + Arrays.toString(newArray));

        merge(nums1,m,nums2,n);
        System.out.println();
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0, i=m; j < n ; j++) {
            nums1[i] = nums2[j];
            i++;
        }

            Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
//        while (nums1.length <= m && nums2.length <= n) {
//            int[] newArray = new int[2*n + m];
//            if ( m <= nums1.length)
//                System.arraycopy(nums1, 0, newArray, 0, m);
//
//            if (n <= nums2.length)
//            System.arraycopy(nums2, 0, newArray, nums1.length, n);
//
//            Arrays.sort(newArray);
//            System.out.println(Arrays.toString(newArray));
        }
    }
//}
