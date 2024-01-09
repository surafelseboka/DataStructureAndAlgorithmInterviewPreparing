package LinkedList.PalindromeLinkedList;

public class Main {

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        // Creating an instance of PalindromeLinkedList
        isPalindrome palindromeLinkedList = new isPalindrome();

        // Checking if the linked list is a palindrome
        boolean isPalindrome = palindromeLinkedList.isPalindrome(head);

        // Displaying the result
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
