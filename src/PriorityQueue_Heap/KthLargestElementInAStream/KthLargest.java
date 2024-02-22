package PriorityQueue_Heap.KthLargestElementInAStream;

import java.util.PriorityQueue;

public class KthLargest {

    private static int k;
    private static PriorityQueue<Integer> minHeap;

    public KthLargest (int k, int[] nums){

     this.k = k;
     this.minHeap = new PriorityQueue<>();

     for (int num: nums){
         add(num);
     }
    }

    public void add(int val){

        if (minHeap.size() < k){
            minHeap.offer(val);
        } else if (val > minHeap.peek()){
            minHeap.poll();
            minHeap.offer(val);
        }
    }

    public int kthLargest() {
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int k =3;
        int[] nums = {4,5,8,2};

        KthLargest kthLargest = new KthLargest(k, nums);
        System.out.println(kthLargest.kthLargest());

//        nums = new int[]{3, 1, 4, 2};
//        kthLargest = new KthLargest(k, nums);
//        System.out.println(kthLargest.kthLargest()); // Output: 3
//
//        nums = new int[]{1, 2, 3, 4, 5};
//        kthLargest = new KthLargest(k, nums);
//        System.out.println(kthLargest.kthLargest()); // Output: 4


    }
}
