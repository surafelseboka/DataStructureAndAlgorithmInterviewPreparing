package LinkedList.Practice;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //Adding element at the beginning of an element

        list.insertAtBegin(0);
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtPosition(10,3);
        list.insertAtPosition(2,3);
        list.insertAtPosition(20,5);
        list.deleteFromBeginning();
        list.deleteFromEnd();
        list.deleteAtPosition(1);
        list.deleteAtPosition(4);

       list.sortNode();
//       list.reverseList();

      list.printLinkedList();
    }
}
