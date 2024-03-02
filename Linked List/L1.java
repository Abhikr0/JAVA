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
        public static int  size; //to get size form any function 

        void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
        }
        void addFirst(int data){
            Node newNode = new Node(data);
            size++; 
            if(head == null ){
                head = tail =newNode;
                return;
            }
            
            // step 2 = newNode 
            newNode.next = head; // link 
            // ab head me daalo value
            head = newNode;
        }
        public void addLast(int data) {
            Node newNode = new Node(data);
            size++; 
            if (head==null) {
            head=tail=newNode;
            return;
            }
            tail.next = newNode;
            tail =newNode;
        }
        public void add(int idx,int data){
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++; 
            Node temp = head;
            int i = 0;

            while (i< idx-1) {
                temp=temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next= newNode;
        }

        public static void main(String[] args) {
            L1 ll =new L1();
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            ll.addFirst(6);
            ll.addFirst(7);
            ll.addLast(8);
            ll.add(2, 9);
            ll.print();
            System.out.println(size);
        }
}
