public class L1 {
    // Node banane ki ninja technique ding ding 
    public class Node {
        int data;
        Node next;

        public Node (int data){
            // yaha ka data liye hai
            this.data= data;
            this.next = null;
        }
    }
    // ab head aur tail baat dete hai
        public static Node head;
        public static Node tail;

        pubic void addFirst(int data){
            Node newNode = new Node(data);

            if(head == null ){
                head = tail =newNode;
                return;
            }
            // step 2 = newNode 
            newNode.next = head; // link 
            // ab head me daalo value
            head = newNode;
        }
        void addLast(int data) {
            Node newNode = new Node(data);
            if (head== null) {
            head=tail=newNode;
            return;
            }
            tail.next = newNode;
            tail =newNode;
        }

        void addMiddle(int idx,int data){
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (i<idx-1) {
                temp=temp.next;
                i++;
            }

            newNode.next=temp.next ;
            temp.next = newNode; 
        }
        void add(int idx,int data){
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;

            while (i<idx-1) {
                temp=temp.next;
                i++;
            }
            newNode.next = temp;
            temp.next= newNode;
        }

        public static void main(String[] args) {
            L1 ll =new L1();
            ll.addFirst(3);
            ll.addFirst(4);
        }
}
