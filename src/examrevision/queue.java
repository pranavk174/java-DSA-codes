package examrevision;

public class queue {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static boolean isEmpty(){
        return false;
    }
    public static void enque(int data){
        Node n= new Node(data);
        if(tail == null){
             head = tail = n;
        }

        tail.next = n;
        tail = n;
        size++;
    }

    public static int dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
        }
       int val = head.data;
        head.next = head;
        return val;
    }

    public static void printq(){
        Node temp = head;
        if(isEmpty()){
            System.out.println("empty queue");

        }
        while(temp != null){
            System.out.print(" | "+temp.data);
            temp = temp.next;

        }
    }

    public static void peek(){
        if(isEmpty()){
            System.out.println("empty queue");
        }
        System.out.println("\nthe peeked element is "+head.data);
    }
    public static void main (String[] args){
        queue q = new queue();
        q.enque(8);
        q.enque(1);
        q.enque(3);
        q.enque(6);
        q.enque(9);
        q.printq();
        q.peek();

    }
}
