package javabasics;


public class stack {
    public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next = null;
    }
    }

    public static class Stack{
        public static  Node head;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
            head = newnode;
            return;
            }
            newnode.next = head;
            head = newnode;

        }

        public static int pop(){
            if(isEmpty()){

                return -1;
            }
            int top = head.data;
            head = head.next;

            System.out.println("the poped element is "+ top);
            return top;

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
           System.out.println("the peeked element is "+ s.peek());
           s.pop();
        }
    }

}
