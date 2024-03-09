package LinkedList.AddTwoNumbers;

import LinkedList.LeetCode.ListNode;

public class LinkedList {

    private Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Adding two numbers
    public Node addTwoNumbers(Node l1, Node l2){
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        int carry = 0;

        while (l1 !=null || l2 != null || carry !=0){
            int digit1 = (l1 != null) ? l1.data : 0;
            int digit2 = (l2 != null) ? l2.data : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        Node result = dummyHead.next;
        dummyHead.next = null;
        return result;

    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Create l1: 2 -> 4 -> 3
        list.insert(2);
        list.insert(4);
        list.insert(3);

        // Create l2: 5 -> 6 -> 4
        LinkedList list2 = new LinkedList();
        list2.insert(5);
        list2.insert(6);
        list2.insert(4);

        // Add the numbers
        Node result = list.addTwoNumbers(list.head, list2.head);

        // Print the result
        LinkedList resultList = new LinkedList();
        resultList.head = result;
        resultList.printList(); // Output: 7 0 8
    }
}
