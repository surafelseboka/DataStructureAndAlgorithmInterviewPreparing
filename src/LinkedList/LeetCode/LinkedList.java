package LinkedList.LeetCode;

import LinkedList.Practice.Node;

public class LinkedList {
    ListNode head;
    public void insertAtBegin(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }
    public void reorderList(){
//Find the middle value
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second list - right from the middle
        ListNode second = slow.next;
        ListNode prev = slow.next = null;

        while(second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        // Merging the first and second lists

        ListNode first = head;
        second = prev;

        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 !=null || l2 != null || carry !=0){
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;

    }

    public ListNode reverseList(ListNode head){

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    /*
        Counting number of nodes in the linked list
     */
    public int countNode(){
        int count = 0;

        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            count++;
        }

        return count;
    }

    /*
         Reversing all the linked list in place
     */

    public ListNode reverseTheList(){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

        public ListNode findTheMiddle(){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow  = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public int findDuplicate(int[] nums) {

        // int nums = [1,3,4,2,2]




        return 0;
    }



}
