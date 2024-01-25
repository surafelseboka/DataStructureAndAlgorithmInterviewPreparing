package LinkedList.LeetCode;

public class Main {

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();


     // 9,9,9,9,9,9,9
        list1.insertAtBegin(9);
        list1.insertAtBegin(9);
        list1.insertAtBegin(9);
        list1.insertAtBegin(9);
        list1.insertAtBegin(9);
        list1.insertAtBegin(9);
        list1.insertAtBegin(9);

//        list1.insertAtBegin(7);

        //9,9,9,9
        LinkedList list2 = new LinkedList();
        list2.insertAtBegin(9);
        list2.insertAtBegin(9);
        list2.insertAtBegin(9);
        list2.insertAtBegin(9);

      //  ListNode result = new ListNode(list1, list2);

        //result.addTwoNumbers(list1,list2);

        list1.printLinkedList();
        System.out.println();
        list2.printLinkedList();

     //  list1.printLinkedList();
      // System.out.println();
//        list2.printLinkedList(list2.head);
//        System.out.println();
//        System.out.println(list2.countNode());
//       ListNode result =  list1.findTheMiddle();
//       list1.printLinkedList(result);


        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);





//      LinkedList result = new LinkedList();
//        result.addTwoNumbers(l1,l2);

//        System.out.println(result);

        //list1.reorderList();
        //printLinkedList(result);



    }

}
