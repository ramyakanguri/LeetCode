package ProblemSolving;

public class LinkedList {
    Node head; // head of list
  
    /* Linked list Node.  This inner class is made static so
       that main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
      
    }
  
    /* This function prints contents of linked list starting
     * from head */
    public void countList()
    {
        Node cur = head;
        int count = 1;
        while(cur.next!=null){
            count += 1;
            cur = cur.next;
        }
        System.out.println("The number of nodes present in the Linked List are : " +count);

    }

    public void printList(){
        Node cur = head;
        while(cur != null){
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }
  
    // Driver's code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList ll = new LinkedList();
        ll.head = new Node(10);
        Node B = new Node(20);
        Node C = new Node(30);

       ll.head.next = B;
       B.next = C;

       ll.countList();
       ll.printList();
    }
}
