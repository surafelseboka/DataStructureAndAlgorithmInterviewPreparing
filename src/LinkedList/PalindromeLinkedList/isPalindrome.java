package LinkedList.PalindromeLinkedList;

public class isPalindrome {

    public boolean isPalindrome(ListNode head){

        if (head == null || head.next == null){
            return true;  // An empty list or a list with one node is a palindrome
        }

        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        slow = reverseList(slow);

        //compare the first and reversed second halves
        while (slow != null ){
            if (head.val != slow.val){
                return false; // Mismatch found, not a palindrome
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
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


}
