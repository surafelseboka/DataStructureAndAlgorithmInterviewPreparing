package LinkedList.Practice;

public class LinkedList {

       Node head;
       Node tail;
       //
//    public LinkedList(){
//        this.head = new Node(-1);
//        this.tail = this.head;
//    }

    public int get(int index){
        Node curr = head.next;
        int i=0;

        while(curr != null){
            if(i == index){
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertAtBegin(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        newNode.next = null;

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int val, int position){

        Node newNode = new Node(val);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position -1 && temp != null ; i++) {
             temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFromBeginning(){
        head = head.next;
    }

    public void deleteFromEnd(){
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int position){

        Node temp = head;

        if(position == 1) {
            head = head.next;
            return;
        }
        for (int i = 2; i < position; i++) {
            if (temp.next != null){
                temp = temp.next;
            }
        }
            temp.next = temp.next.next;
    }
    public boolean searchNode(int val){
        Node curr = head;

        while(curr != null){
            if(curr.val == val)
                return true;

            curr = curr.next;
        }
        return false;
    }

    public void sortNode() {
        Node curr = head;
        Node index = null;
        int temp;

        if(curr == null){
            return;
        } else {
            while(curr.next != null){
                index = curr.next;

                while(index != null){
                    if(curr.val > index.val){
                        temp = curr.val;
                        curr.val = index.val;
                        index.val = temp;
                    }
                    index = index.next;
                }
                curr = curr.next;
            }
        }
    }

    public Node reverseList(){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr = temp;
        }
        return prev;
    }

    public void printLinkedList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }

}
