package LinkedList.Implmentation;

import java.util.ArrayList;

public class LinkedList {

    private ListNode head;
    private ListNode tail;


    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        int i = 0;
        while (curr != null){
            if(i == index){
                return curr.val;
            }
            i++;
            curr= curr.next;
        } return -1;
    }

    public void insertedHead(int val){

       ListNode newNode = new ListNode(1);
        newNode.next = head.next;
        head.next = newNode;

        if (newNode.next == null){
            tail = newNode;
        }
    }

    public void insertTail(int val){
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
       if(index < 0 || this.head == null ){
           return false;
       }

        // Case: Remove the first node (index == 0)
       if (index == 0){
           this.head = this.head.next;  // Update the head to the next node
           if(this.head == null){
               this.tail= null; // If the list becomes empty, update the tail to null
           } return true;
       }
        // Traverse the list to find the node before the one to be removed
       ListNode curr = this.head;
        for (int i = 0; curr != null && i < index; i++) {
            curr = curr.next;
        }

        // Check if the index is out of bounds
        if (curr == null || curr.next == null) {
            return false;
        }

        // Update the tail if the node to be removed is the current tail
        if (curr.next == this.tail) {
            this.tail = curr;
        }

        // Remove the node by updating pointers
        curr.next = curr.next.next;
        return true;

    }

    // Method to get values of the linked list
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }


}
