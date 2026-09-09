package examrevision;

public class linkedlist {
    public static class Node{
       int data;
       Node next;

        public Node(int d){
           this.data = d;
           this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node prev;
    public static int size;
    public static void addFirst(int data){
        Node n = new Node(data);
        size++;
        if(head == null){
            head=tail=n;
        }
        n.next = head;
      head = n;
    }

    public static void addLast(int data){

        Node n= new Node(data);
        size++;
        if(head == null){
            head = tail= n;
            return;
        }
        tail.next = n;
        tail = n;
    }
    public static int deleteFirst(){

        if(size == 0){
            System.out.print("the linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
        head = tail = null;
        return val;
        }
        size--;
       int val = head.data;
        head = head.next;
        return val;

    }
    public void printll() {
        if (head == null) {
            System.out.println("empty linkedlist");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(" null ");
    }
    public static int deleteLast(){

        if(size == 0){
            System.out.print("the linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
        }
      Node prev = head;
        for(int i =0;i<size-1;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;




    }
public static void addMiddle(int idx,int data) {
       if(head == null){
           addLast(data);
       }
       Node n = new Node(data);
       Node temp = head;
       int i = 0;
       while(i < idx-1){
           i++;
           temp = temp.next;
       }
       n.next =temp.next;
       temp.next = n;
       size++;
}


    public static void main(String[] args){
        linkedlist ll = new linkedlist();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addLast(9);
        ll.addLast(6);
        ll.addLast(1);
        ll.printll();
        System.out.println((ll.size));
        addMiddle(3,12);
        ll.printll();
        System.out.println((ll.size));
        int r =ll.deleteFirst();
        System.out.println("after removing the node "+r+ " the updated linked list is ");
        ll.printll();
        ll.deleteLast();
        ll.printll();
    }
}
