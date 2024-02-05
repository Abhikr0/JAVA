public class LinkedList {
    public static class Node{
        int data;// value 
        Node next;// address of next node

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

        System.out.println(a.next);
    }
}