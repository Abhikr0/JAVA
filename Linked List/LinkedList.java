public class LinkedList {
    public static void displayr(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data);//to reverse print we have to interchange the line with
        displayr(head.next);// this one 
    }

    public static void display(Node head) {
        // if we use the head as a pointer the change in a 
        // will make head null
        while (head!= null) {
            System.out.println(head.data+"");
            head = head.next;
        }
    }
    // make temp node to not loose the head value
    public static class Node{
        int data; // value 
        Node next; // address of next node

        Node(int data){
            this.data = data;// update of the new 
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);  
        Node d = new Node(8);
        Node e = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayr(a);
    }
}