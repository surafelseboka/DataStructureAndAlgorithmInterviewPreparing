package PriorityQueue_Heap.KClosestPoints;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {

    public static void main(String[] args) {

        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        KClosestPoints solver = new KClosestPoints();
        int[][] closestPoints = solver.kClosest(points, k);

        System.out.println("Closest " + k + " points to the origin");
        for (int[] point : closestPoints){
            System.out.println(Arrays.toString(point));
        }
    }

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a,b) -> (calculateDistance(b) - calculateDistance(a))
        );

        for(int[] point: points){
            maxHeap.offer(point);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for(int i=0; i<k; i++ ){
            result[i] = maxHeap.poll();
        }
        return result;
    }
    public static int calculateDistance(int[] point){
        int x = point[0];
        int y = point[1];
        return x * x + y * y;
    }
}
