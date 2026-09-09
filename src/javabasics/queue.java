package javabasics;

public class queue {
    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

    public static class Queue{

        public static boolean isEmpty(){
            return head == null & tail == null;
        }
        public static void add(int data){
            Node newnode = new Node(data);
            if(tail == null)
                tail = head = newnode;
            tail.next = newnode;
            tail = newnode;
        }


        public static void remove(){
            if(isEmpty())
                System.out.println("queue is empty bro ");

            int head_data = head.data;
            head = head.next;
            System.out.println("the removed element is "+ head_data);
        }

        public static void print(){
            Node val = head;
            while(val != null){
                System.out.print("|" + val.data);
                val = val.next;
            }


        }


        public static void peek(){
            if(isEmpty())
                System.out.println("queue is empty bro ");

            int val = head.data;
            System.out.println("\npeeked value is "+ val);
        }

    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

       q.print();



        q.peek();
        q.remove();
        q.peek();
//        q.remove();
//        q.peek();
//        q.remove();
//        q.peek();
//        q.remove();
//        q.peek();
    }

}
