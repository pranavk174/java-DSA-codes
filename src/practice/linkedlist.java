package practice;

public class linkedlist {
    public static class Node {
        int data ;
        Node next;

                public Node(int data){
                   this.data  = data;
                    this.next = null ;
                }
    }

    public static Node head ;
    public static Node tail ;
    public static int size ;


    public  void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode ;
            return;
        }
        newnode.next = head;
        head = newnode ;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        size++;

        if(head == null){
            head = tail = newnode;
            return;
        }

         tail.next = newnode ;
         tail = newnode ;

    }


    public void addMiddle(int data , int index){
       Node newnode = new Node(data);
       if(index == 0){
           addFirst(data);
           return;
       }

       Node temp = head;
       int i = 0;

       while(i < index-1){
           temp = temp.next;
           i++;
       }
       newnode.next = temp.next;
       temp.next = newnode;

    }

    public int deleteFirst(){
        if(size== 0){
            System.out.println("The Linkedlist is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int value = head.data;
            head = tail = null ;
            return value;
        }

        int value = head.data;
        head = head.next ;
        size -- ;

        return value;
    }

    public int removeLast(){
        if(size== 0){
            System.out.println("The Linkedlist is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int value = head.data;
            head = tail= null ;
            return value;
        }

        int value = tail.data ;
        tail.next = null ;
        return value;
    }

}
