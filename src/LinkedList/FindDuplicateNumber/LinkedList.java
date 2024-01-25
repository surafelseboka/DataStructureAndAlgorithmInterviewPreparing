package LinkedList.FindDuplicateNumber;

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

    public int findDuplicate(int[] nums){

        for (int i=0; i < nums.length; i++){
            insert(nums[i]);
        }

        Node curr = head;
        while(curr != null){

        }

        return nums[3];
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
        int[] nums = {1,3,4,2,2};
        System.out.println(list.findDuplicate(nums));

    }
}
