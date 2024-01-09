package Medium;

import java.util.Arrays;

public class ContainerWithMostWater {

    public static int maxArea(int[] height){

        int result = 0;
        int left_pointer = 0;
        int right_pointer = height.length-1;

        while (left_pointer < right_pointer) {

            int h = Math.min(height[left_pointer], height[right_pointer]);
            int w = right_pointer - left_pointer;
            int area = h * w;

            result = Math.max(result, area);

            if (height[left_pointer] < height[right_pointer]) {
                left_pointer++;
            } else {
                right_pointer--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
       int[] heights = {1,8,6,2,5,4,8,3,7};
       int maxAreaResult = maxArea(heights);
        System.out.println(maxAreaResult);

    }
}
